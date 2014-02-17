package com.jiangjianan.wemediaserver.dao.impl;

import com.jiangjianan.wemediaserver.dao.UserDAO;
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
public class UserDAOImplTest {
    protected TransactionTemplate transactionTemplate;
    protected TransactionStatus status;
    private UserDAO userDAO;
    private UserDO user1;

    @Before
    public void setUp() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
        transactionTemplate = (TransactionTemplate) ctx.getBean("transactionTemplate");
        status = transactionTemplate.getTransactionManager().getTransaction(transactionTemplate);
        userDAO = (UserDAO) ctx.getBean("userDAO");

        user1 = new UserDO();
        user1.setName("name");
    }

    @After
    public void tearDown() {
        status.setRollbackOnly();
    }

    @Test
    public void crud() {
        Long id = userDAO.insert(user1);
        UserDO user = userDAO.get(id);
        assertNotNull(user);
        user.setName("new name");
        userDAO.update(user);
        assertEquals("new name", userDAO.get(id).getName());
        userDAO.delete(id);
        assertNull(userDAO.get(id));
    }

}
