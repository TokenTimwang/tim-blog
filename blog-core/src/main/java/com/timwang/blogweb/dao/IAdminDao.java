package com.timwang.blogweb.dao;

import com.timwang.blogweb.entity.AdminEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @ Author  : Tim Wang
 * @ FileName: IAdminDao.java
 * @ Time    : 2020/4/21 18:54
 */
public interface IAdminDao extends JpaRepository<AdminEntity, Integer> {

    /**
     *
     * @param username
     * @param password
     * @return
     */
    AdminEntity findByUsernameAndPassword (String username, String password);
}
