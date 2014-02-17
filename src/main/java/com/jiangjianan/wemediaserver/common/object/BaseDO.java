package com.jiangjianan.wemediaserver.common.object;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * Created by johnny on 14-2-17.
 */
public class BaseDO implements Serializable {

    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}

