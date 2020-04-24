package com.timwang.blogweb.controller;

import com.timwang.blogweb.exceptions.FormException;
import com.timwang.blogweb.model.AdminVO;
import com.timwang.blogweb.service.impl.IAdminServiceImpl;
import com.timwang.blogweb.utils.RestJson;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ Author  : Tim Wang
 * @ FileName: AdminController.java
 * @ Time    : 2020/4/21 17:08
 */

@Api("管理员接口")
@RestController
@RequestMapping(value = "/1.0/admin", produces = "application/json;charset=utf-8")
public class AdminController {

    protected Logger logger = LoggerFactory.getLogger(AdminController.class);

    private final IAdminServiceImpl iAdminServiceIml;

    @Autowired
    public AdminController(IAdminServiceImpl iAdminServiceIml) {
        this.iAdminServiceIml = iAdminServiceIml;
    }

    @PostMapping("/login")
    @ApiOperation(value = "管理员登录", notes = "管理员登录")
    public RestJson login(@RequestParam("username") String username, @RequestParam("password") String password) {
        RestJson json = new RestJson();
        try {
            AdminVO res = this.iAdminServiceIml.login(username, password);
            json.setData(res);
        } catch (FormException e) {
            logger.error(e.getErrorCodeEnum().getMessage(), e);
            json.setCode(e.getErrorCodeEnum().getCode());
            json.setMsg(e.getErrorCodeEnum().getMessage());
        }
        return json;
    }
}
