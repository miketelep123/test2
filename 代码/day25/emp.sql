/*
 Navicat Premium Data Transfer

 Source Server         : 本地root用户数据库
 Source Server Type    : MySQL
 Source Server Version : 80030
 Source Host           : localhost:3306
 Source Schema         : emp

 Target Server Type    : MySQL
 Target Server Version : 80030
 File Encoding         : 65001

 Date: 11/04/2023 17:26:04
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for emp
-- ----------------------------
DROP TABLE IF EXISTS `emp`;
CREATE TABLE `emp`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `type` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `sex` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `entry_time` datetime(0) NULL DEFAULT NULL,
  `description` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 22 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of emp
-- ----------------------------
INSERT INTO `emp` VALUES (1, '全职', '小明', '男', '2023-02-01 00:00:00', '好员工');
INSERT INTO `emp` VALUES (2, '兼职', '小李', '女', '2023-03-16 00:00:00', '厉害');
INSERT INTO `emp` VALUES (3, '全职', '小明', '男', '2023-03-21 00:00:00', '哈哈');
INSERT INTO `emp` VALUES (4, '兼职', '小明', '女', '2020-03-30 00:00:00', 'hihi');
INSERT INTO `emp` VALUES (25, '全部', 'xx', '22', NULL, 'xx');

SET FOREIGN_KEY_CHECKS = 1;
