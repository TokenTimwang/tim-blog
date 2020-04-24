package com.timwang.blogweb.service.impl;

import com.timwang.blogweb.constants.ErrorCodeEnum;
import com.timwang.blogweb.dao.IAdminDao;
import com.timwang.blogweb.entity.AdminEntity;
import com.timwang.blogweb.exceptions.FormException;
import com.timwang.blogweb.model.AdminVO;
import com.timwang.blogweb.service.IAdminService;
import com.timwang.blogweb.utils.CopyPropertiesUtil;
import com.timwang.blogweb.utils.MD5Util;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @ Author  : Tim Wang
 * @ FileName: IAdminServiceImpl.java
 * @ Time    : 2020/4/21 18:52
 */
/*
    管理员数据处理service层实现
 */

@Service
public class IAdminServiceImpl implements IAdminService {

    @Autowired
    private IAdminDao iAdminDao;

    /**
     * 将持久化层PO对象转换成视图层VO对象
     *
     * @param adminEntity
     * @return
     */
    private AdminVO getVO(AdminEntity adminEntity) {
        if (adminEntity != null && !StringUtils.isEmpty(adminEntity.getId())) {
            AdminVO adminVO = new AdminVO();
            BeanUtils.copyProperties(adminEntity, adminVO);
            return adminVO;
        }
        return null;
    }

    /**
     * 将视图层VO对象转换成持久化层PO对象
     *
     * @param adminVO
     * @return
     */
    private AdminEntity getEntity(AdminVO adminVO) {
        if (adminVO != null) {
            AdminEntity adminEntity = new AdminEntity();
            BeanUtils.copyProperties(adminVO, adminEntity, CopyPropertiesUtil.getNullPropertyNames(adminVO));
            return adminEntity;
        }
        return null;
    }

    private List<AdminVO> getVOList(List<AdminEntity> adminEntityList) {
        List<AdminVO> voList = new ArrayList<>();
        if (adminEntityList != null && !adminEntityList.isEmpty()) {
            for (AdminEntity entity : adminEntityList) {
                AdminVO adminVO = this.getVO(entity);
                voList.add(adminVO);
            }
        }
        return voList;
    }

    @Override
    public AdminVO login(String username, String password) throws FormException {
        if (StringUtils.isEmpty(username)) {
            throw new FormException(ErrorCodeEnum.ADMIN_NAME_MUST_BE_NOT_NULL);
        }
        if (StringUtils.isEmpty(password)) {
            throw new FormException(ErrorCodeEnum.ADMIN_PASSWORD_MUST_BE_NOT_NULL);
        }
        AdminEntity entity = this.iAdminDao.findByUsernameAndPassword(username, MD5Util.encode(password));
        if (StringUtils.isEmpty(entity)) {
            throw new FormException(ErrorCodeEnum.ADMIN_PWD_NAME_MUST_BE_NOT_NULL);
        } else {
            return this.getVO(entity);
        }
    }
}
