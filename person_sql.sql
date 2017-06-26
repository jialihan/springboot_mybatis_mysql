/*
Navicat MySQL Data Transfer

Source Server         : 本地
Source Server Version : 50505
Source Host           : localhost:3306
Source Database       : test1

Target Server Type    : MYSQL
Target Server Version : 50505
File Encoding         : 65001

Date: 2016-11-05 21:17:33
*/

SET FOREIGN_KEY_CHECKS=0;

DROP TABLE IF EXISTS persons;
CREATE TABLE persons
(
  id INT(11) NOT NULL AUTO_INCREMENT,
  name VARCHAR(30) DEFAULT NULL,
  password VARCHAR(30) DEFAULT NULL,
  person_sex VARCHAR(30) DEFAULT NULL
    PRIMARY KEY(id)
)ENGINE=InnoDB

