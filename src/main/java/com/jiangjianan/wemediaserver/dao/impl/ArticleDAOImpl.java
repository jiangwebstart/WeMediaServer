package com.jiangjianan.wemediaserver.dao.impl;

import com.jiangjianan.wemediaserver.common.BaseDAO;
import com.jiangjianan.wemediaserver.dao.ArticleDAO;
import com.jiangjianan.wemediaserver.object.ArticleDO;

/**
 * Created by johnny on 14-2-17.
 */
public class ArticleDAOImpl extends BaseDAO implements ArticleDAO {

    @Override
    public ArticleDO get(Long id) {
        return (ArticleDO) this.getSqlMapClientTemplate().queryForObject("articleDAO.get", id);
    }

    @Override
    public Long insert(ArticleDO articleDO) {
        return (Long) this.getSqlMapClientTemplate().insert("articleDAO.insert", articleDO);
    }

    @Override
    public void update(ArticleDO articleDO) {
        this.getSqlMapClientTemplate().update("articleDAO.update", articleDO);
    }

    @Override
    public void delete(Long id) {
        this.getSqlMapClientTemplate().delete("articleDAO.delete", id);
    }

}

