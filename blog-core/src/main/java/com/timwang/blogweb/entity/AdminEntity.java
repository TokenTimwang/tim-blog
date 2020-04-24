package com.timwang.blogweb.entity;

import com.timwang.blogweb.entity.basic.AbsEntity;

import javax.persistence.*;

/**
 * @ Author  : Tim Wang
 * @ FileName: AdminEntity.java
 * @ Time    : 2020/4/21 19:12
 */

@Entity
@Table(name = "TIM_BLOG_ADMIN")
public class AdminEntity extends AbsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true, columnDefinition = "integer(11)")
    private Integer id;

    @Column(name = "username", nullable = false, unique = true, columnDefinition = "varchar(64) comment '管理员登录名'")
    private String username;

    @Column(name = "password", nullable = false, unique = true, columnDefinition = "varchar(64) comment '管理员登录密码'")
    private String password;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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
