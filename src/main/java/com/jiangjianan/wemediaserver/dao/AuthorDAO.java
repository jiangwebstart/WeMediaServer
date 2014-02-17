package com.jiangjianan.wemediaserver.dao;

import com.jiangjianan.wemediaserver.object.AuthorDO;

/**
 * Created by johnny on 14-2-17.
 */
public interface AuthorDAO {

    public AuthorDO get(Long id);

    public Long insert(AuthorDO authorDO);

    public void update(AuthorDO authorDO);

    public void delete(Long id);

}

