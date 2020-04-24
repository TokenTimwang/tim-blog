package com.timwang.blogweb.service;

import com.timwang.blogweb.exceptions.FormException;
import com.timwang.blogweb.model.AdminVO;

/**
 * @ Author  : Tim Wang
 * @ FileName: IAdminService.java
 * @ Time    : 2020/4/21 17:45
 */
public interface IAdminService extends IBaseService<AdminVO> {
    /**
     * @param username
     * @param password
     * @return
     * @throws FormException
     */
    AdminVO login(String username, String password) throws FormException;
}
