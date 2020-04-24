package com.timwang.blogweb.exceptions;

import com.timwang.blogweb.constants.ErrorCodeEnum;

/**
 * @ Author  : Tim Wang
 * @ FileName: FormException.java
 * @ Time    : 2020/4/21 23:30
 */
public class FormException extends Exception {

    private static final long serialVersionUID = -8557741189977829063L;


    private String code;

    private ErrorCodeEnum errorCodeEnum;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public FormException(String msg) {
        super(msg);
    }

    public FormException(ErrorCodeEnum errorCodeEnum) {
        this.errorCodeEnum = errorCodeEnum;
    }

    public ErrorCodeEnum getErrorCodeEnum() {
        return errorCodeEnum;
    }
}
