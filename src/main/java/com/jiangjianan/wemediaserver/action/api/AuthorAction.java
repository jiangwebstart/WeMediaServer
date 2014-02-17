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
public class AuthorAction extends BaseAction {

    private Long authorId;
    private AuthorDO author;

    public String execute() throws Exception {
        return SUCCESS;
    }

    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    public AuthorDO getAuthor() {
        return author;
    }

    public void setAuthor(AuthorDO author) {
        this.author = author;
    }
}
