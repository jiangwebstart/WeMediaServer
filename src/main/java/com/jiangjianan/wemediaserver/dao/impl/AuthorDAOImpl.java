package com.jiangjianan.wemediaserver.dao.impl;

import com.jiangjianan.wemediaserver.common.BaseDAO;
import com.jiangjianan.wemediaserver.dao.AuthorDAO;
import com.jiangjianan.wemediaserver.object.AuthorDO;

/**
 * Created by johnny on 14-2-17.
 */
public class AuthorDAOImpl extends BaseDAO implements AuthorDAO {

    @Override
    public AuthorDO get(Long id) {
        return (AuthorDO) this.getSqlMapClientTemplate().queryForObject("authorDAO.get", id);
    }

    @Override
    public Long insert(AuthorDO authorDO) {
        return (Long) this.getSqlMapClientTemplate().insert("authorDAO.insert", authorDO);
    }

    @Override
    public void update(AuthorDO authorDO) {
        this.getSqlMapClientTemplate().update("authorDAO.update", authorDO);
    }

    @Override
    public void delete(Long id) {
        this.getSqlMapClientTemplate().delete("authorDAO.delete", id);
    }

}

