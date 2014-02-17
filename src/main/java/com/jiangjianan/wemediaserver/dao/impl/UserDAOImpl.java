package com.jiangjianan.wemediaserver.dao.impl;

import com.jiangjianan.wemediaserver.common.BaseDAO;
import com.jiangjianan.wemediaserver.dao.UserDAO;
import com.jiangjianan.wemediaserver.object.UserDO;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

/**
 * Created by johnny on 14-2-17.
 */
public class UserDAOImpl extends BaseDAO implements UserDAO {

    @Override
    public UserDO get(Long id) {
        return (UserDO) this.getSqlMapClientTemplate().queryForObject("userDAO.get", id);
    }

    @Override
    public Long insert(UserDO userDO) {
        return (Long) this.getSqlMapClientTemplate().insert("userDAO.insert", userDO);
    }

    @Override
    public void update(UserDO userDO) {
        this.getSqlMapClientTemplate().update("userDAO.update", userDO);
    }

    @Override
    public void delete(Long id) {
        this.getSqlMapClientTemplate().delete("userDAO.delete", id);
    }

}

