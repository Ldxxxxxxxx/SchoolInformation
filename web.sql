/*
 Navicat Premium Data Transfer

 Source Server         : myconnect
 Source Server Type    : MySQL
 Source Server Version : 80300
 Source Host           : localhost:3306
 Source Schema         : web

 Target Server Type    : MySQL
 Target Server Version : 80300
 File Encoding         : 65001

 Date: 02/06/2024 20:40:53
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_courses
-- ----------------------------
DROP TABLE IF EXISTS `t_courses`;
CREATE TABLE `t_courses`  (
  `cid` int NOT NULL,
  `cname` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  `cdesp` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  `tid` int NOT NULL,
  PRIMARY KEY (`cid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_courses
-- ----------------------------

-- ----------------------------
-- Table structure for t_studentms
-- ----------------------------
DROP TABLE IF EXISTS `t_studentms`;
CREATE TABLE `t_studentms`  (
  `sid` int NOT NULL,
  `sname` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  `spassword` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  PRIMARY KEY (`sid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_studentms
-- ----------------------------
INSERT INTO `t_studentms` VALUES (1, '张三', '123456');

-- ----------------------------
-- Table structure for t_students
-- ----------------------------
DROP TABLE IF EXISTS `t_students`;
CREATE TABLE `t_students`  (
  `id` int NOT NULL,
  `name` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  `age` int NULL DEFAULT NULL,
  `gender` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_students
-- ----------------------------
INSERT INTO `t_students` VALUES (1, '康康', 20, '女');
INSERT INTO `t_students` VALUES (2, '威威', 19, '男');
INSERT INTO `t_students` VALUES (3, '火狐', 18, '男');

-- ----------------------------
-- Table structure for t_teachers
-- ----------------------------
DROP TABLE IF EXISTS `t_teachers`;
CREATE TABLE `t_teachers`  (
  `tid` int NOT NULL,
  `tname` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  `tage` int NULL DEFAULT NULL,
  `tgender` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`tid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_teachers
-- ----------------------------
INSERT INTO `t_teachers` VALUES (1, '李四', 42, '男');
INSERT INTO `t_teachers` VALUES (2, '王五', 44, '女');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int NOT NULL,
  `name` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  `pwd` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  `type` enum('student','teacher','admin') CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  `birth` int NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (111, 'admin', '123456', 'admin', 101);
INSERT INTO `user` VALUES (123, '张三', '123456', 'teacher', 618);
INSERT INTO `user` VALUES (1234, '李四', '123456', 'student', 1111);
INSERT INTO `user` VALUES (12345, '娃娃', '123456', 'teacher', 619);

SET FOREIGN_KEY_CHECKS = 1;
