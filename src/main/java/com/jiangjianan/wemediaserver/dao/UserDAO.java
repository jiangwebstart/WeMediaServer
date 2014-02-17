package com.jiangjianan.wemediaserver.dao;

import com.jiangjianan.wemediaserver.object.UserDO;

/**
 * Created by johnny on 14-2-17.
 */
public interface UserDAO {

    public UserDO get(Long id);

    public Long insert(UserDO userDO);

    public void update(UserDO userDO);

    public void delete(Long id);

}

