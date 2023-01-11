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

 Date: 20/12/2022 14:28:14
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for pmss
-- ----------------------------
DROP TABLE IF EXISTS `pmss`;
CREATE TABLE `pmss`  (
  `p_id` int(11) NOT NULL,
  `p_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `p_j` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `p_c` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `p_k` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`p_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of pmss
-- ----------------------------
INSERT INTO `pmss` VALUES (1, '张三', '有突出贡献奖励100元', '迟到罚100', '该员工勤奋上进');
INSERT INTO `pmss` VALUES (2, '王麻子', '优秀员工奖励500', '无', '该员工业务完成优秀');

SET FOREIGN_KEY_CHECKS = 1;
