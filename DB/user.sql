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

 Date: 20/12/2022 14:28:32
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `u_id` int(11) NOT NULL AUTO_INCREMENT,
  `u_username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `u_password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `u_state` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`u_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'admin', 'admin', '启用');
INSERT INTO `user` VALUES (2, '张三', '123456', '启用');
INSERT INTO `user` VALUES (3, '李四', '123456', '启用');
INSERT INTO `user` VALUES (4, 'admin1', 'admin', '启用');
INSERT INTO `user` VALUES (5, '王麻子', '123456', '禁用');
INSERT INTO `user` VALUES (6, 'asdf', 'asdff', '启用');

SET FOREIGN_KEY_CHECKS = 1;
