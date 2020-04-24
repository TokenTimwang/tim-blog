package com.timwang.blogweb.utils;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

import java.beans.PropertyDescriptor;
import java.util.HashSet;
import java.util.Set;

/**
 * @ Author  : Tim Wang
 * @ FileName: CopyPropertiesUtil.java
 * @ Time    : 2020/4/21 22:26
 */
public class CopyPropertiesUtil {
    private CopyPropertiesUtil() {

    }

    public static String[] getNullPropertyNames(Object source) {
        final BeanWrapper src = new BeanWrapperImpl(source);
        PropertyDescriptor[] propertyDescriptors = src.getPropertyDescriptors();
        Set<String> stringSet = new HashSet<>();
        for (PropertyDescriptor propertyDescriptor : propertyDescriptors) {
            Object srcValue = src.getPropertyValue(propertyDescriptor.getName());
            if (srcValue == null) {
                stringSet.add(propertyDescriptor.getName());
            }
        }
        String[] strings = new String[stringSet.size()];
        return stringSet.toArray(strings);
    }
}
