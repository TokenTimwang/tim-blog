package com.timwang.blogweb.model;

import com.timwang.blogweb.model.basic.AbsModel;

import java.io.Serializable;

/**
 * @ Author  : Tim Wang
 * @ FileName: AdminVO.java
 * @ Time    : 2020/4/21 17:54
 */


public class AdminVO extends AbsModel implements Serializable {

    private static final long serialVersionUID = 776103650391687270L;

    private String username;

    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
