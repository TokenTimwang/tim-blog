package com.timwang.blogweb.constants;

/**
 * @ Author  : Tim Wang
 * @ FileName: ErrorCodeEnum.java
 * @ Time    : 2020/4/21 16:36
 */

public enum ErrorCodeEnum {
    SUCCESS("200", "操作成功."),
    ADMIN_NAME_MUST_BE_NOT_NULL("505-01-03007", "管理员登录名必填."),
    ADMIN_PASSWORD_MUST_BE_NOT_NULL("505-01-03008", "管理员密码必填."),
    ADMIN_PWD_NAME_MUST_BE_NOT_NULL("505-01-03008", "账号或者密码错误."),
    ;

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    private String code;

    private String message;

    ErrorCodeEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

}
