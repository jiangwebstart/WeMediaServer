package com.jiangjianan.wemediaserver.action.api;

import com.jiangjianan.wemediaserver.common.action.BaseAction;
import com.jiangjianan.wemediaserver.object.ArticleDO;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

import java.util.List;

/**
 * Created by johnny on 14-2-17.
 */
@ParentPackage("json-default")
@Result(type = "json")
public class RecentAction extends BaseAction {

    private Long userId;
    private List<ArticleDO> articles;

    public String execute() throws Exception {
        return SUCCESS;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public List<ArticleDO> getArticles() {
        return articles;
    }

    public void setArticles(List<ArticleDO> articles) {
        this.articles = articles;
    }
}
