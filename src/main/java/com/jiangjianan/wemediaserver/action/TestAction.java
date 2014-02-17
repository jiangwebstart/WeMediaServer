package com.jiangjianan.wemediaserver.action;

import com.jiangjianan.wemediaserver.common.action.BaseAction;

/**
 * Created by johnny on 14-2-17.
 */
public class TestAction extends BaseAction {

    private String message;

    public String execute() throws Exception {
        message = "Hello World";
        return SUCCESS;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
