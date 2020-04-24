/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50711
Source Host           : localhost:3306
Source Database       : tim

Target Server Type    : MYSQL
Target Server Version : 50711
File Encoding         : 65001

Date: 2020-04-21 12:26:38
*/
SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for tim_blog_admin
-- ----------------------------
DROP TABLE IF EXISTS `tim_blog_admin`;
CREATE TABLE `tim_blog_admin`(
    `id` int(11) NOT NULL AUTO_INCREMENT,
    `password` varchar(64) NOT NULL COMMENT '管理员登录密码',
    `username` varchar(64) NOT NULL COMMENT '管理员登录名',
    PRIMARY KEY (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

INSERT INTO `tim_blog_admin` VALUES ('1','5d38ddf094c29b07f3b7507bdba32275', 'JustFresh');