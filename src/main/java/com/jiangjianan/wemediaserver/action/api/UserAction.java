package com.jiangjianan.wemediaserver.action.api;

import com.jiangjianan.wemediaserver.common.action.BaseAction;
import com.jiangjianan.wemediaserver.object.ArticleDO;
import com.jiangjianan.wemediaserver.object.UserDO;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

import java.util.List;

/**
 * Created by johnny on 14-2-17.
 */
@ParentPackage("json-default")
@Result(type = "json")
public class UserAction extends BaseAction {

    private Long userId;
    private UserDO user;

    public String execute() throws Exception {
        return SUCCESS;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public UserDO getUser() {
        return user;
    }

    public void setUser(UserDO user) {
        this.user = user;
    }
}
