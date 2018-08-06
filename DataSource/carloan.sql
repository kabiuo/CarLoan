/*
 Navicat Premium Data Transfer

 Source Server         : kabiuo
 Source Server Type    : MySQL
 Source Server Version : 50718
 Source Host           : localhost:3306
 Source Schema         : carloan

 Target Server Type    : MySQL
 Target Server Version : 50718
 File Encoding         : 65001

 Date: 06/08/2018 21:04:47
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin`  (
  `adminnumber` varchar(50) CHARACTER SET gb2312 COLLATE gb2312_chinese_ci NOT NULL,
  `adminpassword` varchar(50) CHARACTER SET gb2312 COLLATE gb2312_chinese_ci NOT NULL,
  `adminID` int(20) NOT NULL,
  PRIMARY KEY (`adminID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = gb2312 COLLATE = gb2312_chinese_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('admin', '21232f297a57a5a743894a0e4a801fc3', 1);

-- ----------------------------
-- Table structure for carinfo
-- ----------------------------
DROP TABLE IF EXISTS `carinfo`;
CREATE TABLE `carinfo`  (
  `userID` int(11) NOT NULL,
  `licenseplate` varchar(50) CHARACTER SET gb2312 COLLATE gb2312_chinese_ci NOT NULL,
  `engineno` varchar(50) CHARACTER SET gb2312 COLLATE gb2312_chinese_ci NOT NULL,
  `color` varchar(50) CHARACTER SET gb2312 COLLATE gb2312_chinese_ci NOT NULL,
  `brandmodel` varchar(50) CHARACTER SET gb2312 COLLATE gb2312_chinese_ci NOT NULL,
  `fristdate` date NOT NULL,
  `deadline` date NOT NULL,
  `chassisnumber` varchar(20) CHARACTER SET gb2312 COLLATE gb2312_chinese_ci NOT NULL,
  `price` varchar(20) CHARACTER SET gbk COLLATE gbk_chinese_ci NOT NULL,
  `mileage` varchar(20) CHARACTER SET gb2312 COLLATE gb2312_chinese_ci NOT NULL,
  `IDcard` varchar(50) CHARACTER SET gb2312 COLLATE gb2312_chinese_ci NOT NULL,
  `nvoice` varchar(50) CHARACTER SET gb2312 COLLATE gb2312_chinese_ci NOT NULL,
  `openpolicy` varchar(50) CHARACTER SET gb2312 COLLATE gb2312_chinese_ci NOT NULL,
  `carkey` varchar(50) CHARACTER SET gb2312 COLLATE gb2312_chinese_ci NOT NULL,
  `certificate` varchar(50) CHARACTER SET gb2312 COLLATE gb2312_chinese_ci NOT NULL,
  `compolicy` varchar(50) CHARACTER SET gb2312 COLLATE gb2312_chinese_ci NOT NULL,
  `license` varchar(50) CHARACTER SET gb2312 COLLATE gb2312_chinese_ci NOT NULL,
  `originalinvoice` varchar(50) CHARACTER SET gb2312 COLLATE gb2312_chinese_ci NOT NULL,
  `taxcertificate` varchar(50) CHARACTER SET gb2312 COLLATE gb2312_chinese_ci NOT NULL,
  `carimport` varchar(50) CHARACTER SET gb2312 COLLATE gb2312_chinese_ci NOT NULL,
  PRIMARY KEY (`userID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = gb2312 COLLATE = gb2312_chinese_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of carinfo
-- ----------------------------
INSERT INTO `carinfo` VALUES (1, '川A55555', 'sd1234567890', '黑色', 'sdfasdfad', '2018-04-28', '2018-04-28', 'fadsfad', '34567', '234', '交付', '交付', '交付', '交付', '交付', '交付', '交付', '交付', '交付', '交付');

-- ----------------------------
-- Table structure for creditinfo
-- ----------------------------
DROP TABLE IF EXISTS `creditinfo`;
CREATE TABLE `creditinfo`  (
  `userID` int(11) NOT NULL,
  `IDcard` varchar(50) CHARACTER SET gb2312 COLLATE gb2312_chinese_ci NOT NULL,
  `username` varchar(10) CHARACTER SET gb2312 COLLATE gb2312_chinese_ci NOT NULL,
  `estate` varchar(10) CHARACTER SET gb2312 COLLATE gb2312_chinese_ci NOT NULL,
  `mortgage` varchar(10) CHARACTER SET gb2312 COLLATE gb2312_chinese_ci NOT NULL,
  `carproduction` varchar(10) CHARACTER SET gb2312 COLLATE gb2312_chinese_ci NOT NULL,
  `carloans` varchar(10) CHARACTER SET gb2312 COLLATE gb2312_chinese_ci NOT NULL,
  `creditcard` int(10) NOT NULL,
  PRIMARY KEY (`IDcard`, `userID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = gb2312 COLLATE = gb2312_chinese_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of creditinfo
-- ----------------------------
INSERT INTO `creditinfo` VALUES (1, '513209199809095678', 'admin', '有', '有', '有', '有', 5);

-- ----------------------------
-- Table structure for cusser
-- ----------------------------
DROP TABLE IF EXISTS `cusser`;
CREATE TABLE `cusser`  (
  `cussernumber` varchar(20) CHARACTER SET gb2312 COLLATE gb2312_chinese_ci NOT NULL,
  `cusserpassword` varchar(20) CHARACTER SET gb2312 COLLATE gb2312_chinese_ci NOT NULL,
  `cusserID` int(20) NOT NULL,
  PRIMARY KEY (`cusserID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = gb2312 COLLATE = gb2312_chinese_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for customerinfo
-- ----------------------------
DROP TABLE IF EXISTS `customerinfo`;
CREATE TABLE `customerinfo`  (
  `userID` int(11) NOT NULL,
  `username` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `IDcard` varchar(50) CHARACTER SET gb2312 COLLATE gb2312_chinese_ci NOT NULL,
  `usertel` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `peraddress` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `unit` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `unitaddress` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `unittel` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `unitpro` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `salary` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `salesman` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `commissioner` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`userID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of customerinfo
-- ----------------------------
INSERT INTO `customerinfo` VALUES (1, 'admin', '513209199809095678', '12345678901', '中华人民共和国某省某市', 'hello', '中华人民共和国某省某市', '8907896', '个体户', '4000', 'hhhh', 'lllll');

-- ----------------------------
-- Table structure for idcardinfo
-- ----------------------------
DROP TABLE IF EXISTS `idcardinfo`;
CREATE TABLE `idcardinfo`  (
  `userID` int(20) NOT NULL AUTO_INCREMENT,
  `usernumber` varchar(20) CHARACTER SET gb2312 COLLATE gb2312_chinese_ci NOT NULL,
  `company` varchar(50) CHARACTER SET gb2312 COLLATE gb2312_chinese_ci NOT NULL,
  `username` varchar(20) CHARACTER SET gb2312 COLLATE gb2312_chinese_ci NOT NULL,
  `sex` varchar(20) CHARACTER SET gb2312 COLLATE gb2312_chinese_ci NOT NULL,
  `nation` varchar(10) CHARACTER SET gb2312 COLLATE gb2312_chinese_ci NOT NULL,
  `birthday` varchar(50) CHARACTER SET gb2312 COLLATE gb2312_chinese_ci NOT NULL,
  `address` varchar(50) CHARACTER SET gb2312 COLLATE gb2312_chinese_ci NOT NULL,
  `IDcard` varchar(50) CHARACTER SET gb2312 COLLATE gb2312_chinese_ci NOT NULL,
  `issuingorgan` varchar(50) CHARACTER SET gb2312 COLLATE gb2312_chinese_ci NOT NULL,
  `starttime` date NOT NULL,
  `stoptime` date NOT NULL,
  `producttype` varchar(50) CHARACTER SET gb2312 COLLATE gb2312_chinese_ci NOT NULL,
  PRIMARY KEY (`userID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = gb2312 COLLATE = gb2312_chinese_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of idcardinfo
-- ----------------------------
INSERT INTO `idcardinfo` VALUES (1, '5201315', '能力有限公司', 'admin', '男', '汉', '2018-04-28', '中华人民共和国', '513209199809095678', '中华人民共和国', '2018-04-02', '2018-04-28', '未知');
INSERT INTO `idcardinfo` VALUES (2, '5201234', '能力有限公司                            ', 'asdf', '男', '汉', '2018-08-02                            ', '中华人民共和国', '513798188719872213', '中国人民政府', '2018-08-01', '2018-08-30', '未知');

SET FOREIGN_KEY_CHECKS = 1;
