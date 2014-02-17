package com.jiangjianan.wemediaserver.manager.impl;

import com.jiangjianan.wemediaserver.common.manager.BaseManager;
import com.jiangjianan.wemediaserver.dao.ArticleDAO;
import com.jiangjianan.wemediaserver.dao.AuthorDAO;
import com.jiangjianan.wemediaserver.manager.ArticleManager;
import com.jiangjianan.wemediaserver.object.ArticleDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by johnny on 14-2-17.
 */
@Component
public class ArticleManagerImpl extends BaseManager implements ArticleManager {

    @Autowired
    private AuthorDAO authorDAO;
    @Autowired
    private ArticleDAO articleDAO;

    public List<ArticleDO> getArticles() {
        return null;
    }
}
