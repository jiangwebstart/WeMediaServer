package com.jiangjianan.wemediaserver.dao.impl;

import com.jiangjianan.wemediaserver.dao.ArticleDAO;
import com.jiangjianan.wemediaserver.dao.AuthorDAO;
import com.jiangjianan.wemediaserver.object.ArticleDO;
import com.jiangjianan.wemediaserver.object.AuthorDO;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionTemplate;

import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

/**
 * Created by johnny on 14-2-17.
 */
public class ArticleDAOImplTest {
    protected TransactionTemplate transactionTemplate;
    protected TransactionStatus status;
    private ArticleDAO articleDAO;
    private ArticleDO article1;

    @Before
    public void setUp() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
        transactionTemplate = (TransactionTemplate) ctx.getBean("transactionTemplate");
        status = transactionTemplate.getTransactionManager().getTransaction(transactionTemplate);
        articleDAO = (ArticleDAO) ctx.getBean("articleDAO");

        article1 = new ArticleDO();
        article1.setTitle("title");
        article1.setUrl("url");
        article1.setAuthorName("authorName");
        article1.setAuthorId(0L);
        article1.setDate(new Date());
    }

    @After
    public void tearDown() {
        status.setRollbackOnly();
    }

    @Test
    public void crud() {
        Long id = articleDAO.insert(article1);
        ArticleDO article = articleDAO.get(id);
        assertNotNull(article);
        article.setTitle("new title");
        articleDAO.update(article);
        assertEquals("new title", articleDAO.get(id).getTitle());
        articleDAO.delete(id);
        assertNull(articleDAO.get(id));
    }

}
