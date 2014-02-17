package com.jiangjianan.wemediaserver.dao;

import com.jiangjianan.wemediaserver.object.ArticleDO;

/**
 * Created by johnny on 14-2-17.
 */
public interface ArticleDAO {

    public ArticleDO get(Long id);

    public Long insert(ArticleDO articleDO);

    public void update(ArticleDO articleDO);

    public void delete(Long id);

}

