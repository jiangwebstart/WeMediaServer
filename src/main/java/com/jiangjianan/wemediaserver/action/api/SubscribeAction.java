package com.jiangjianan.wemediaserver.action.api;

import com.jiangjianan.wemediaserver.common.action.BaseAction;
import com.jiangjianan.wemediaserver.object.ArticleDO;
import com.jiangjianan.wemediaserver.object.AuthorDO;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

import java.util.List;

/**
 * Created by johnny on 14-2-17.
 */
@ParentPackage("json-default")
@Result(type = "json")
public class SubscribeAction extends BaseAction {

    private Long userId;
    private List<AuthorDO> authors;

    public String execute() throws Exception {
        return SUCCESS;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public List<AuthorDO> getAuthors() {
        return authors;
    }

    public void setAuthors(List<AuthorDO> authors) {
        this.authors = authors;
    }
}
