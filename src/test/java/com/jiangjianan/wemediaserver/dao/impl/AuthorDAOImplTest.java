package com.jiangjianan.wemediaserver.dao.impl;

import com.jiangjianan.wemediaserver.dao.AuthorDAO;
import com.jiangjianan.wemediaserver.object.AuthorDO;
import com.jiangjianan.wemediaserver.object.UserDO;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionTemplate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

/**
 * Created by johnny on 14-2-17.
 */
public class AuthorDAOImplTest {
    protected TransactionTemplate transactionTemplate;
    protected TransactionStatus status;
    private AuthorDAO authorDAO;
    private AuthorDO author1;

    @Before
    public void setUp() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
        transactionTemplate = (TransactionTemplate) ctx.getBean("transactionTemplate");
        status = transactionTemplate.getTransactionManager().getTransaction(transactionTemplate);
        authorDAO = (AuthorDAO) ctx.getBean("authorDAO");

        author1 = new AuthorDO();
        author1.setName("name");
        author1.setArticleCount(0);
    }

    @After
    public void tearDown() {
        status.setRollbackOnly();
    }

    @Test
    public void crud() {
        Long id = authorDAO.insert(author1);
        AuthorDO author = authorDAO.get(id);
        assertNotNull(author);
        author.setName("new name");
        authorDAO.update(author);
        assertEquals("new name", authorDAO.get(id).getName());
        authorDAO.delete(id);
        assertNull(authorDAO.get(id));
    }

}
