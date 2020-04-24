package com.timwang.blogweb.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @ Author  : Tim Wang
 * @ FileName: MD5Util.java
 * @ Time    : 2020/4/21 23:46
 */
public class MD5Util {
    private static final String STRING = "tim-wang";

    public static String encode(String password) {
        password = password + STRING;
        return processEncode(password);
    }

    public static String processEncode(String password) {
        MessageDigest MD5 = null;
        try {
            MD5 = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }

        char[] chars = password.toCharArray();
        byte[] bytes = new byte[chars.length];

        for (int i = 0; i < chars.length; i++) {
            bytes[i] = (byte) chars[i];
        }
        byte[] md5Bytes = MD5.digest(bytes);
        StringBuilder timStr = new StringBuilder();
        for (byte md5Byte : md5Bytes) {
            int val = ((int) md5Byte) & 0xff;
            if (val < 16) {
                timStr.append("0");
            }
            timStr.append(Integer.toHexString(val));
        }
        return timStr.toString();
    }

}
