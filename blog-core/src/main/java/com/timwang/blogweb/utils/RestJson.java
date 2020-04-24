package com.timwang.blogweb.utils;

import com.timwang.blogweb.constants.ErrorCodeEnum;

import java.io.Serializable;

/**
 * @ Author  : Tim Wang
 * @ FileName: RestJson.java
 * @ Time    : 2020/4/21 16:35
 */

public class RestJson implements Serializable {

    private static final long serialVersionUID = -833111467849009338L;

    private String code = ErrorCodeEnum.SUCCESS.getCode();

    private String msg;

    private Object data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
