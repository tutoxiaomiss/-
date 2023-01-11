/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 50626
 Source Host           : localhost:3306
 Source Schema         : pms

 Target Server Type    : MySQL
 Target Server Version : 50626
 File Encoding         : 65001

 Date: 20/12/2022 14:28:44
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for wages
-- ----------------------------
DROP TABLE IF EXISTS `wages`;
CREATE TABLE `wages`  (
  `w_id` int(12) NOT NULL,
  `w_position` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `w_basic` int(12) NULL DEFAULT NULL,
  `w_attendance` int(12) NULL DEFAULT NULL,
  `w_welfare` int(12) NULL DEFAULT NULL,
  `w_sum` int(12) NULL DEFAULT NULL,
  `w_date` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`w_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of wages
-- ----------------------------
INSERT INTO `wages` VALUES (1, '开发', 4000, 2000, 1500, 7500, '2022-12-20 13:26:27');
INSERT INTO `wages` VALUES (2, '程序员', 4000, 1000, 5020, 10020, '2022-12-20 13:27:05');

SET FOREIGN_KEY_CHECKS = 1;
