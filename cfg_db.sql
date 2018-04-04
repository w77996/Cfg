/*
Navicat MySQL Data Transfer

Source Server         : hishopweb
Source Server Version : 50528
Source Host           : localhost:3306
Source Database       : cfg_db

Target Server Type    : MYSQL
Target Server Version : 50528
File Encoding         : 65001

Date: 2018-04-04 17:55:24
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for auth_code
-- ----------------------------
DROP TABLE IF EXISTS `auth_code`;
CREATE TABLE `auth_code` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `phone` varchar(13) NOT NULL,
  `auth_code` varchar(10) NOT NULL,
  `createtime` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `key_idx_tel` (`phone`),
  KEY `key_idx_code` (`auth_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of auth_code
-- ----------------------------

-- ----------------------------
-- Table structure for blog
-- ----------------------------
DROP TABLE IF EXISTS `blog`;
CREATE TABLE `blog` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` int(11) unsigned NOT NULL COMMENT '用户ID',
  `blog_description` text COMMENT '文章描述',
  `blog_content` text NOT NULL COMMENT '文章内容',
  `blog_title` text NOT NULL COMMENT '文章标题',
  `blog_type` tinyint(5) unsigned NOT NULL COMMENT '文章类型',
  `blog_create_time` int(15) unsigned NOT NULL COMMENT '发布时间',
  `blog_view` int(10) unsigned DEFAULT '0' COMMENT '阅读人数',
  `blog_image_url` varchar(250) DEFAULT NULL COMMENT '图片地址',
  `blog_video_url` varchar(150) DEFAULT NULL COMMENT '视频地址',
  `blog_reward_num` int(5) unsigned DEFAULT '0' COMMENT '文章被打赏的次数',
  `blog_reward` int(5) unsigned DEFAULT '0' COMMENT '文章被打赏的金额',
  PRIMARY KEY (`id`),
  KEY `key_idx_blog_type` (`blog_type`),
  KEY `key_idx_user_id` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of blog
-- ----------------------------

-- ----------------------------
-- Table structure for collection
-- ----------------------------
DROP TABLE IF EXISTS `collection`;
CREATE TABLE `collection` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` int(11) unsigned NOT NULL COMMENT '用户ID',
  `blog_id` int(11) unsigned NOT NULL COMMENT '博客ID',
  `collection_create_time` int(15) unsigned NOT NULL COMMENT '收藏时间',
  PRIMARY KEY (`id`),
  KEY `key_idx_user_id` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of collection
-- ----------------------------

-- ----------------------------
-- Table structure for comment
-- ----------------------------
DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `comment_blog_id` int(11) unsigned NOT NULL COMMENT '文章ID',
  `comment_content` text NOT NULL COMMENT '评论内容',
  `comment_from_uid` int(11) unsigned DEFAULT NULL COMMENT '评论者ID',
  `comment_nickname` varchar(60) DEFAULT NULL COMMENT '评论者昵称',
  `comment_thumb_img` varchar(150) DEFAULT NULL COMMENT '评论者头像',
  `comment_like_num` int(5) unsigned DEFAULT '0' COMMENT '评论被点赞的次数',
  `comment_reply_num` int(5) unsigned DEFAULT '0' COMMENT '评论被回复的次数',
  `comment_reward_num` int(5) unsigned DEFAULT '0' COMMENT '评论被打赏的次数',
  `comment_reward` int(5) unsigned DEFAULT '0' COMMENT '评论被打赏的金额',
  `comment_create_time` int(15) unsigned DEFAULT NULL COMMENT '评论创建时间',
  PRIMARY KEY (`id`),
  KEY `key_idx_comment_from_uid` (`comment_from_uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of comment
-- ----------------------------

-- ----------------------------
-- Table structure for comment_reply
-- ----------------------------
DROP TABLE IF EXISTS `comment_reply`;
CREATE TABLE `comment_reply` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `comment_id` int(11) unsigned NOT NULL COMMENT '评论id',
  `comment_reply_type` tinyint(2) unsigned DEFAULT '1' COMMENT '1为回复评论，2为回复别人的回复',
  `comment_reply_id` int(10) unsigned NOT NULL COMMENT '回复目标id，reply_type为1时，是comment_id，reply_type为2时为回复表的id',
  `comment_reply_content` text NOT NULL COMMENT '回复内容',
  `comment_to_uid` int(10) unsigned DEFAULT NULL COMMENT '回复目标id',
  `comment_from_uid` int(10) unsigned DEFAULT NULL COMMENT '回复用户id',
  `comment_from_thumb_img` varchar(150) DEFAULT NULL COMMENT '回复者的头像',
  `comment_from_nickname` varchar(50) DEFAULT NULL COMMENT '回复者的昵称',
  `comment_create_time` int(11) unsigned DEFAULT NULL COMMENT '回复评论时间',
  `comment_to_nickname` varchar(50) DEFAULT NULL COMMENT '回复对象的昵称',
  `comment_reply_reward_num` int(5) unsigned DEFAULT '0' COMMENT '评论被打赏的次数',
  `comment_reply_reward` int(5) unsigned DEFAULT '0' COMMENT '评论被打赏的金额',
  PRIMARY KEY (`id`),
  KEY `key_idx_comment_id` (`comment_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of comment_reply
-- ----------------------------

-- ----------------------------
-- Table structure for private_message
-- ----------------------------
DROP TABLE IF EXISTS `private_message`;
CREATE TABLE `private_message` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键Id',
  `user_id` bigint(20) NOT NULL COMMENT '发送者Id',
  `friend_id` bigint(20) NOT NULL COMMENT '接受者Id',
  `sender_id` bigint(20) NOT NULL COMMENT '发送者id',
  `receiver_id` bigint(20) NOT NULL COMMENT '接受者Id',
  `message_type` tinyint(4) NOT NULL COMMENT '消息类型,1：普通消息 2：系统消息',
  `message_content` varchar(500) NOT NULL COMMENT '消息内容',
  `send_time` datetime NOT NULL COMMENT '消息发送时间',
  `status` tinyint(4) NOT NULL DEFAULT '1' COMMENT '消息状态 1：未读 2：已读 3：删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of private_message
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `user_name` varchar(60) DEFAULT NULL COMMENT '用户昵称',
  `user_pwd` varchar(50) DEFAULT NULL COMMENT '用户密码',
  `user_nickname` varchar(50) DEFAULT NULL COMMENT '微信名称',
  `user_phone` varchar(100) DEFAULT NULL COMMENT '手机号码',
  `user_sex` tinyint(5) unsigned DEFAULT NULL COMMENT '用户性别',
  `user_qq` varchar(20) DEFAULT NULL COMMENT '用户QQ',
  `user_email` varchar(50) DEFAULT NULL COMMENT '用户邮箱',
  `user_address` text COMMENT '用户地址',
  `user_mark` mediumint(9) unsigned DEFAULT NULL COMMENT '用户积分',
  `user_last_login_ip` varchar(15) DEFAULT NULL COMMENT '用户上一次登录IP地址',
  `user_birthday` int(15) DEFAULT NULL COMMENT '用户生日',
  `user_description` text COMMENT '自我描述',
  `user_thumb_img` varchar(150) NOT NULL COMMENT '用户头像存储路径',
  `user_register_time` int(15) unsigned NOT NULL COMMENT '用户注册时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `unique_idx_username` (`user_name`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1');

-- ----------------------------
-- Table structure for user_follow
-- ----------------------------
DROP TABLE IF EXISTS `user_follow`;
CREATE TABLE `user_follow` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` int(11) unsigned NOT NULL COMMENT '用户ID',
  `follow_id` int(11) unsigned NOT NULL COMMENT '关注用户ID',
  PRIMARY KEY (`id`),
  KEY `key_idx_user_id` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_follow
-- ----------------------------

-- ----------------------------
-- Table structure for wallet_log
-- ----------------------------
DROP TABLE IF EXISTS `wallet_log`;
CREATE TABLE `wallet_log` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `record_sn` varchar(50) NOT NULL COMMENT '交易流水sn，关联wallet_record表',
  `user_id` int(10) unsigned NOT NULL COMMENT '用户UID',
  `open_id` varchar(60) DEFAULT NULL COMMENT '微信号ID',
  `change_money` int(10) NOT NULL COMMENT '变动金额 增+ 减-',
  `money` int(5) unsigned NOT NULL DEFAULT '0' COMMENT '变动后的金额',
  `remark` char(100) DEFAULT NULL COMMENT '备注',
  `create_time` int(10) unsigned NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`),
  KEY `key_idx_record_sn` (`record_sn`),
  KEY `key_idx_user_id` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of wallet_log
-- ----------------------------
