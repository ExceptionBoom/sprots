/*
SQLyog Ultimate v11.22 (64 bit)
MySQL - 5.7.21-log : Database - mydb
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`mydb` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `mydb`;

/*Table structure for table `announcement` */

DROP TABLE IF EXISTS `announcement`;

CREATE TABLE `announcement` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `sports_id` int(11) NOT NULL,
  `title` varchar(100) NOT NULL,
  `content` text,
  `localed` varchar(45) NOT NULL,
  `state` tinyint(1) NOT NULL,
  `sports_manager_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_announcement_sports_manager1_idx` (`sports_manager_id`),
  CONSTRAINT `fk_announcement_sports_manager1` FOREIGN KEY (`sports_manager_id`) REFERENCES `sports_manager` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `announcement` */

/*Table structure for table `athletes_enroll` */

DROP TABLE IF EXISTS `athletes_enroll`;

CREATE TABLE `athletes_enroll` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `participants_id` int(11) NOT NULL,
  `competition_unit_manager_id` int(11) NOT NULL,
  `sports_group_unit_id` int(11) NOT NULL,
  `name` varchar(20) NOT NULL,
  `sex` char(2) NOT NULL,
  `judge_state` tinyint(1) NOT NULL COMMENT 'boolean 类型，表示该报名记录的审核状态，  通过为1 true，否则不通过为‘2’ false\n\n同样用于分组',
  `sports_group_item_id` varchar(45) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_athletes_enroll_participants1_idx` (`participants_id`),
  KEY `fk_athletes_enroll_competition_unit_manager1_idx` (`competition_unit_manager_id`),
  KEY `fk_athletes_enroll_sports_group_unit1_idx` (`sports_group_unit_id`),
  KEY `fk_athletes_enroll_sports_group_item1_idx` (`sports_group_item_id`),
  CONSTRAINT `fk_athletes_enroll_competition_unit_manager1` FOREIGN KEY (`competition_unit_manager_id`) REFERENCES `competition_unit_manager` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_athletes_enroll_participants1` FOREIGN KEY (`participants_id`) REFERENCES `participants` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_athletes_enroll_sports_group_item1` FOREIGN KEY (`sports_group_item_id`) REFERENCES `sports_group_item` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_athletes_enroll_sports_group_unit1` FOREIGN KEY (`sports_group_unit_id`) REFERENCES `sports_group_unit` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `athletes_enroll` */

/*Table structure for table `athletes_result` */

DROP TABLE IF EXISTS `athletes_result`;

CREATE TABLE `athletes_result` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `athletes_enroll_id` int(11) NOT NULL,
  `sports_id` int(11) NOT NULL,
  `item_id` int(11) NOT NULL,
  `result` varchar(20) NOT NULL,
  `competition_time_number` varchar(45) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_athletes_result_athletes_enroll1_idx` (`athletes_enroll_id`),
  KEY `fk_athletes_result_sports_has_sports_item1_idx` (`sports_id`,`item_id`),
  CONSTRAINT `fk_athletes_result_athletes_enroll1` FOREIGN KEY (`athletes_enroll_id`) REFERENCES `athletes_enroll` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_athletes_result_sports_has_sports_item1` FOREIGN KEY (`sports_id`, `item_id`) REFERENCES `sports_has_item` (`sports_id`, `item_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `athletes_result` */

/*Table structure for table `athletes_result_note` */

DROP TABLE IF EXISTS `athletes_result_note`;

CREATE TABLE `athletes_result_note` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `athletes_result_note` */

/*Table structure for table `cloud_manager` */

DROP TABLE IF EXISTS `cloud_manager`;

CREATE TABLE `cloud_manager` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `Account` varchar(20) NOT NULL,
  `password` char(32) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `Account_UNIQUE` (`Account`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `cloud_manager` */

insert  into `cloud_manager`(`id`,`Account`,`password`) values (1,'123456','123456');

/*Table structure for table `competition_unit` */

DROP TABLE IF EXISTS `competition_unit`;

CREATE TABLE `competition_unit` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `sports_manager_id` int(11) NOT NULL,
  `name` varchar(45) NOT NULL,
  `manager_name` varchar(20) NOT NULL,
  `phone` varchar(11) NOT NULL,
  `participants_number` int(11) NOT NULL,
  `volunteer_number` int(11) NOT NULL,
  `start_number` int(11) NOT NULL,
  `end_number` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_sports_competition_unit_sports_manager1_idx` (`sports_manager_id`),
  CONSTRAINT `fk_sports_competition_unit_sports_manager1` FOREIGN KEY (`sports_manager_id`) REFERENCES `sports_manager` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `competition_unit` */

/*Table structure for table `competition_unit_manager` */

DROP TABLE IF EXISTS `competition_unit_manager`;

CREATE TABLE `competition_unit_manager` (
  `id` int(11) NOT NULL,
  `sports_manager_id` int(11) NOT NULL,
  `account` varchar(20) NOT NULL,
  `password` char(32) NOT NULL,
  `registration_time` datetime NOT NULL,
  `sports_has_competition_unit_sports_id` int(11) NOT NULL,
  `sports_has_competition_unit_competition_unit_id` int(11) NOT NULL,
  PRIMARY KEY (`id`,`sports_has_competition_unit_sports_id`,`sports_has_competition_unit_competition_unit_id`),
  UNIQUE KEY `account_UNIQUE` (`account`),
  KEY `fk_competition_unit_manager_sports_manager1_idx` (`sports_manager_id`),
  KEY `fk_competition_unit_manager_sports_has_competition_unit1_idx` (`sports_has_competition_unit_sports_id`,`sports_has_competition_unit_competition_unit_id`),
  CONSTRAINT `fk_competition_unit_manager_sports_has_competition_unit1` FOREIGN KEY (`sports_has_competition_unit_sports_id`, `sports_has_competition_unit_competition_unit_id`) REFERENCES `sports_has_competition_unit` (`sports_id`, `competition_unit_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_competition_unit_manager_sports_manager1` FOREIGN KEY (`sports_manager_id`) REFERENCES `sports_manager` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `competition_unit_manager` */

/*Table structure for table `item` */

DROP TABLE IF EXISTS `item`;

CREATE TABLE `item` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `sports_manager_id` int(11) NOT NULL,
  `name` varchar(45) NOT NULL,
  `sex` varchar(8) NOT NULL COMMENT '男，女，男女混合',
  `property` varchar(10) NOT NULL,
  `category` varchar(10) NOT NULL,
  `spilt_track` tinyint(1) NOT NULL,
  `use_track_number` int(11) NOT NULL,
  `group_participants_number` int(11) NOT NULL,
  `result_format` varchar(30) NOT NULL,
  `sort` varchar(4) NOT NULL COMMENT 'true 升序  false 降序',
  `group_time` varchar(45) NOT NULL COMMENT '单位为分钟 （整数）',
  `save` tinyint(1) NOT NULL COMMENT 'true 保留  ， false 不保留',
  PRIMARY KEY (`id`),
  KEY `fk_sports_item_sports_manager1_idx` (`sports_manager_id`),
  CONSTRAINT `fk_sports_item_sports_manager1` FOREIGN KEY (`sports_manager_id`) REFERENCES `sports_manager` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `item` */

/*Table structure for table `judgement` */

DROP TABLE IF EXISTS `judgement`;

CREATE TABLE `judgement` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `sports_manager_id` int(11) NOT NULL,
  `name` varchar(20) NOT NULL,
  `sex` tinyint(1) NOT NULL,
  `unit` varchar(45) NOT NULL,
  `phone` char(11) NOT NULL,
  `position` varchar(45) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_sports_judge_sports_manager1_idx` (`sports_manager_id`),
  CONSTRAINT `fk_sports_judge_sports_manager1` FOREIGN KEY (`sports_manager_id`) REFERENCES `sports_manager` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `judgement` */

/*Table structure for table `organization_manager` */

DROP TABLE IF EXISTS `organization_manager`;

CREATE TABLE `organization_manager` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `account` varchar(20) NOT NULL,
  `password` varchar(16) NOT NULL,
  `registration_time` datetime NOT NULL,
  `sports_manager_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `account_UNIQUE` (`account`),
  KEY `fk_organization_manager_sports_manager1_idx` (`sports_manager_id`),
  CONSTRAINT `fk_organization_manager_sports_manager1` FOREIGN KEY (`sports_manager_id`) REFERENCES `sports_manager` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `organization_manager` */

/*Table structure for table `participants` */

DROP TABLE IF EXISTS `participants`;

CREATE TABLE `participants` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '运动员可以报名运动会项目和志愿者岗位',
  `account` char(11) NOT NULL,
  `password` varchar(16) NOT NULL,
  `registration_time` datetime NOT NULL,
  `name` varchar(20) NOT NULL,
  `sex` char(2) NOT NULL,
  `qq` varchar(20) NOT NULL,
  `identification_tag` int(11) DEFAULT NULL,
  `sports_group_unit_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `account_UNIQUE` (`account`),
  KEY `fk_participants_sports_group_unit1_idx` (`sports_group_unit_id`),
  CONSTRAINT `fk_participants_sports_group_unit1` FOREIGN KEY (`sports_group_unit_id`) REFERENCES `sports_group_unit` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `participants` */

/*Table structure for table `sports` */

DROP TABLE IF EXISTS `sports`;

CREATE TABLE `sports` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `sports_manager_id` int(11) NOT NULL,
  `space_id` int(11) NOT NULL,
  `sports_organzation_committee_id` int(11) NOT NULL,
  `name` varchar(50) NOT NULL,
  `location` varchar(100) NOT NULL,
  `host_unit` varchar(50) NOT NULL,
  `organize_unit` varchar(50) NOT NULL,
  `start_date` datetime NOT NULL,
  `end_date` datetime NOT NULL,
  `sports_manager_name` varchar(45) NOT NULL,
  `sports_manager_phone` char(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_sports_sports_manager1_idx` (`sports_manager_id`),
  KEY `fk_sports_space1_idx` (`space_id`),
  KEY `fk_sports_sports_organzation_committee1_idx` (`sports_organzation_committee_id`),
  CONSTRAINT `fk_sports_space1` FOREIGN KEY (`space_id`) REFERENCES `sports_space` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_sports_sports_manager1` FOREIGN KEY (`sports_manager_id`) REFERENCES `sports_manager` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_sports_sports_organzation_committee1` FOREIGN KEY (`sports_organzation_committee_id`) REFERENCES `sports_organzation_committee` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `sports` */

/*Table structure for table `sports_competition_schedule` */

DROP TABLE IF EXISTS `sports_competition_schedule`;

CREATE TABLE `sports_competition_schedule` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `sports_id` int(11) NOT NULL,
  `competition_unit_id` int(11) NOT NULL,
  `sports_group_item_id` varchar(45) NOT NULL,
  `sports_item_start_time` datetime NOT NULL,
  `sports_item_end_time` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_sports_competition_schedule_sports_group_item1_idx` (`sports_group_item_id`),
  KEY `fk_sports_competition_schedule_sports1_idx` (`sports_id`),
  KEY `fk_sports_competition_schedule_competition_unit1_idx` (`competition_unit_id`),
  CONSTRAINT `fk_sports_competition_schedule_competition_unit1` FOREIGN KEY (`competition_unit_id`) REFERENCES `competition_unit` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_sports_competition_schedule_sports1` FOREIGN KEY (`sports_id`) REFERENCES `sports` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_sports_competition_schedule_sports_group_item1` FOREIGN KEY (`sports_group_item_id`) REFERENCES `sports_group_item` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `sports_competition_schedule` */

/*Table structure for table `sports_devide_group` */

DROP TABLE IF EXISTS `sports_devide_group`;

CREATE TABLE `sports_devide_group` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `sports_id` int(11) NOT NULL,
  `athletes_enroll_id` int(11) NOT NULL,
  `sports_group_item_id` varchar(45) NOT NULL,
  `track_number` int(11) NOT NULL,
  `item_group_number` int(11) NOT NULL,
  `competition_number` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_sports_devide_group_sports1_idx` (`sports_id`),
  KEY `fk_sports_devide_group_athletes_enroll1_idx` (`athletes_enroll_id`),
  KEY `fk_sports_devide_group_sports_group_item1_idx` (`sports_group_item_id`),
  CONSTRAINT `fk_sports_devide_group_athletes_enroll1` FOREIGN KEY (`athletes_enroll_id`) REFERENCES `athletes_enroll` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_sports_devide_group_sports1` FOREIGN KEY (`sports_id`) REFERENCES `sports` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_sports_devide_group_sports_group_item1` FOREIGN KEY (`sports_group_item_id`) REFERENCES `sports_group_item` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `sports_devide_group` */

/*Table structure for table `sports_group` */

DROP TABLE IF EXISTS `sports_group`;

CREATE TABLE `sports_group` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `sports_manager_id` int(11) NOT NULL,
  `name` varchar(45) NOT NULL,
  `sex` varchar(8) NOT NULL COMMENT '男，女，男女混合',
  `sports_manager_id1` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_sports_group_sports_manager1_idx` (`sports_manager_id1`),
  CONSTRAINT `fk_sports_group_sports_manager1` FOREIGN KEY (`sports_manager_id1`) REFERENCES `sports_manager` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `sports_group` */

/*Table structure for table `sports_group_item` */

DROP TABLE IF EXISTS `sports_group_item`;

CREATE TABLE `sports_group_item` (
  `id` varchar(45) NOT NULL,
  `sports_id` int(11) NOT NULL,
  `sports_group_id` int(11) NOT NULL,
  `sports_item_id` int(11) NOT NULL COMMENT '在设置运动会组别，项目的时候， 同时设置赛次，每个赛次录取的人数',
  `unit_limited_item_number` int(11) NOT NULL,
  `competition_times` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `unit_limited_item_number_UNIQUE` (`unit_limited_item_number`),
  KEY `fk_group_item_sports1_idx` (`sports_id`),
  KEY `fk_sports_group_item_sports_has_sports_group1_idx` (`sports_group_id`),
  KEY `fk_sports_group_item_sports_has_item1_idx` (`sports_item_id`),
  CONSTRAINT `fk_group_item_sports1` FOREIGN KEY (`sports_id`) REFERENCES `sports` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_sports_group_item_sports_has_item1` FOREIGN KEY (`sports_item_id`) REFERENCES `sports_has_item` (`item_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_sports_group_item_sports_has_sports_group1` FOREIGN KEY (`sports_group_id`) REFERENCES `sports_has_sports_group` (`sports_group_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `sports_group_item` */

/*Table structure for table `sports_group_unit` */

DROP TABLE IF EXISTS `sports_group_unit`;

CREATE TABLE `sports_group_unit` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `sports_id` int(11) NOT NULL,
  `sports_group_id` int(11) NOT NULL,
  `sports_competition_unit_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_sports_group_unit_sports1_idx` (`sports_id`),
  KEY `fk_sports_group_unit_sports_has_sports_group1_idx` (`sports_group_id`),
  KEY `fk_sports_group_unit_sports_has_competition_unit1_idx` (`sports_competition_unit_id`),
  CONSTRAINT `fk_sports_group_unit_sports1` FOREIGN KEY (`sports_id`) REFERENCES `sports` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_sports_group_unit_sports_has_competition_unit1` FOREIGN KEY (`sports_competition_unit_id`) REFERENCES `sports_has_competition_unit` (`competition_unit_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_sports_group_unit_sports_has_sports_group1` FOREIGN KEY (`sports_group_id`) REFERENCES `sports_has_sports_group` (`sports_group_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `sports_group_unit` */

/*Table structure for table `sports_has_competition_unit` */

DROP TABLE IF EXISTS `sports_has_competition_unit`;

CREATE TABLE `sports_has_competition_unit` (
  `sports_id` int(11) NOT NULL,
  `competition_unit_id` int(11) NOT NULL,
  PRIMARY KEY (`sports_id`,`competition_unit_id`),
  KEY `fk_sports_has_sports_competition_unit_sports_competition_un_idx` (`competition_unit_id`),
  KEY `fk_sports_has_sports_competition_unit_sports1_idx` (`sports_id`),
  CONSTRAINT `fk_sports_has_sports_competition_unit_sports1` FOREIGN KEY (`sports_id`) REFERENCES `sports` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_sports_has_sports_competition_unit_sports_competition_unit1` FOREIGN KEY (`competition_unit_id`) REFERENCES `competition_unit` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `sports_has_competition_unit` */

/*Table structure for table `sports_has_item` */

DROP TABLE IF EXISTS `sports_has_item`;

CREATE TABLE `sports_has_item` (
  `sports_id` int(11) NOT NULL,
  `item_id` int(11) NOT NULL,
  `rise1` int(11) DEFAULT NULL,
  `rise2` int(11) DEFAULT NULL,
  `rise3` int(11) DEFAULT NULL,
  `rise4` int(11) DEFAULT NULL,
  `rise5` int(11) DEFAULT NULL,
  PRIMARY KEY (`sports_id`,`item_id`),
  KEY `fk_sports_has_sports_item_sports_item1_idx` (`item_id`),
  KEY `fk_sports_has_sports_item_sports1_idx` (`sports_id`),
  CONSTRAINT `fk_sports_has_sports_item_sports1` FOREIGN KEY (`sports_id`) REFERENCES `sports` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_sports_has_sports_item_sports_item1` FOREIGN KEY (`item_id`) REFERENCES `item` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `sports_has_item` */

/*Table structure for table `sports_has_judgement` */

DROP TABLE IF EXISTS `sports_has_judgement`;

CREATE TABLE `sports_has_judgement` (
  `sports_id` int(11) NOT NULL,
  `judgement_id` int(11) NOT NULL,
  PRIMARY KEY (`sports_id`,`judgement_id`),
  KEY `fk_sports_has_sports_judge_sports_judge1_idx` (`judgement_id`),
  KEY `fk_sports_has_sports_judge_sports1_idx` (`sports_id`),
  CONSTRAINT `fk_sports_has_sports_judge_sports1` FOREIGN KEY (`sports_id`) REFERENCES `sports` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_sports_has_sports_judge_sports_judge1` FOREIGN KEY (`judgement_id`) REFERENCES `judgement` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `sports_has_judgement` */

/*Table structure for table `sports_has_sports_group` */

DROP TABLE IF EXISTS `sports_has_sports_group`;

CREATE TABLE `sports_has_sports_group` (
  `sports_id` int(11) NOT NULL,
  `sports_group_id` int(11) NOT NULL,
  PRIMARY KEY (`sports_id`,`sports_group_id`),
  KEY `fk_sports_has_sports_group_sports_group1_idx` (`sports_group_id`),
  KEY `fk_sports_has_sports_group_sports1_idx` (`sports_id`),
  CONSTRAINT `fk_sports_has_sports_group_sports1` FOREIGN KEY (`sports_id`) REFERENCES `sports` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_sports_has_sports_group_sports_group1` FOREIGN KEY (`sports_group_id`) REFERENCES `sports_group` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `sports_has_sports_group` */

/*Table structure for table `sports_has_sports_unit` */

DROP TABLE IF EXISTS `sports_has_sports_unit`;

CREATE TABLE `sports_has_sports_unit` (
  `sports_unit_id` int(11) NOT NULL,
  `sports_id` int(11) NOT NULL,
  PRIMARY KEY (`sports_unit_id`,`sports_id`),
  KEY `fk_sports_unit_has_sports_sports1_idx` (`sports_id`),
  KEY `fk_sports_unit_has_sports_sports_unit1_idx` (`sports_unit_id`),
  CONSTRAINT `fk_sports_unit_has_sports_sports1` FOREIGN KEY (`sports_id`) REFERENCES `sports` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_sports_unit_has_sports_sports_unit1` FOREIGN KEY (`sports_unit_id`) REFERENCES `sports_unit` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `sports_has_sports_unit` */

/*Table structure for table `sports_has_volunteer_position` */

DROP TABLE IF EXISTS `sports_has_volunteer_position`;

CREATE TABLE `sports_has_volunteer_position` (
  `volunteer_position_id` int(11) NOT NULL,
  `sports_id` int(11) NOT NULL,
  PRIMARY KEY (`volunteer_position_id`,`sports_id`),
  KEY `fk_sports_volunteer_position_has_sports_sports1_idx` (`sports_id`),
  KEY `fk_sports_volunteer_position_has_sports_sports_volunteer_po_idx` (`volunteer_position_id`),
  CONSTRAINT `fk_sports_volunteer_position_has_sports_sports1` FOREIGN KEY (`sports_id`) REFERENCES `sports` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_sports_volunteer_position_has_sports_sports_volunteer_posi1` FOREIGN KEY (`volunteer_position_id`) REFERENCES `volunteer_position` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `sports_has_volunteer_position` */

/*Table structure for table `sports_item_template` */

DROP TABLE IF EXISTS `sports_item_template`;

CREATE TABLE `sports_item_template` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `sex` varchar(8) NOT NULL COMMENT '男，女，男女混合',
  `property` varchar(10) NOT NULL,
  `category` varchar(10) NOT NULL,
  `spilt_track` tinyint(1) NOT NULL,
  `use_track_number` int(11) NOT NULL,
  `group_participants_number` int(11) NOT NULL,
  `result_format` varchar(30) NOT NULL,
  `sort` varchar(4) NOT NULL COMMENT 'true 升序  false 降序',
  `group_time` varchar(45) NOT NULL COMMENT '单位为分钟 （整数）',
  `save` tinyint(1) NOT NULL COMMENT 'true 保留  ， false 不保留',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `sports_item_template` */

/*Table structure for table `sports_judgement_position_template` */

DROP TABLE IF EXISTS `sports_judgement_position_template`;

CREATE TABLE `sports_judgement_position_template` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `sports_judgement_position_template` */

/*Table structure for table `sports_manager` */

DROP TABLE IF EXISTS `sports_manager`;

CREATE TABLE `sports_manager` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `account` varchar(20) NOT NULL,
  `password` varchar(32) NOT NULL,
  `registration_time` datetime NOT NULL,
  `cloud_manager_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `account_UNIQUE` (`account`),
  KEY `fk_sports_manager_cloud_manager1_idx` (`cloud_manager_id`),
  CONSTRAINT `fk_sports_manager_cloud_manager1` FOREIGN KEY (`cloud_manager_id`) REFERENCES `cloud_manager` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `sports_manager` */

insert  into `sports_manager`(`id`,`account`,`password`,`registration_time`,`cloud_manager_id`) values (1,'123456','123456','2018-06-05 15:29:14',1);

/*Table structure for table `sports_organzation_committee` */

DROP TABLE IF EXISTS `sports_organzation_committee`;

CREATE TABLE `sports_organzation_committee` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `sports_manager_id` int(11) NOT NULL,
  `name` varchar(20) NOT NULL,
  `sex` tinyint(1) NOT NULL,
  `unit` varchar(45) NOT NULL,
  `phone` char(11) NOT NULL,
  `position` varchar(45) NOT NULL,
  `sports_manager_id1` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_sports_organzation_committee_sports_manager1_idx` (`sports_manager_id1`),
  CONSTRAINT `fk_sports_organzation_committee_sports_manager1` FOREIGN KEY (`sports_manager_id1`) REFERENCES `sports_manager` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `sports_organzation_committee` */

/*Table structure for table `sports_score` */

DROP TABLE IF EXISTS `sports_score`;

CREATE TABLE `sports_score` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `sports_manager_id` int(11) NOT NULL,
  `sports_name` varchar(100) DEFAULT NULL,
  `group_name` varchar(45) DEFAULT NULL,
  `competition_unit_name` varchar(45) DEFAULT NULL,
  `athlete_name` varchar(45) DEFAULT NULL,
  `item_name` varchar(45) DEFAULT NULL,
  `result` varchar(45) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_sports_score_sports_manager1_idx` (`sports_manager_id`),
  CONSTRAINT `fk_sports_score_sports_manager1` FOREIGN KEY (`sports_manager_id`) REFERENCES `sports_manager` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `sports_score` */

/*Table structure for table `sports_score_scheme` */

DROP TABLE IF EXISTS `sports_score_scheme`;

CREATE TABLE `sports_score_scheme` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `sports_id` int(11) NOT NULL,
  `sports_group_item_id` varchar(45) NOT NULL,
  `sports_award_grade1` int(11) DEFAULT NULL,
  `sports_award_grade2` varchar(45) DEFAULT NULL,
  `sports_award_grade3` varchar(45) DEFAULT NULL,
  `sports_award_grade4` varchar(45) DEFAULT NULL,
  `sports_award_grade5` varchar(45) DEFAULT NULL,
  `sports_award_grade6` varchar(45) DEFAULT NULL,
  `sports_award_grade7` varchar(45) DEFAULT NULL,
  `sports_award_grade8` varchar(45) DEFAULT NULL,
  `sports_award_grade9` varchar(45) DEFAULT NULL,
  `sports_award_grade10` varchar(45) DEFAULT NULL,
  `sports_award_grade11` varchar(45) DEFAULT NULL,
  `sports_award_grade12` varchar(45) DEFAULT NULL,
  `sports_award_grade13` varchar(45) DEFAULT NULL,
  `sports_award_grade14` varchar(45) DEFAULT NULL,
  `sports_award_grade15` varchar(45) DEFAULT NULL,
  `sports_award_grade16` varchar(45) DEFAULT NULL,
  `break_score_grade` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_sports_score_scheme_sports_group_item1_idx` (`sports_group_item_id`),
  KEY `fk_sports_score_scheme_sports1_idx` (`sports_id`),
  CONSTRAINT `fk_sports_score_scheme_sports1` FOREIGN KEY (`sports_id`) REFERENCES `sports` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_sports_score_scheme_sports_group_item1` FOREIGN KEY (`sports_group_item_id`) REFERENCES `sports_group_item` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `sports_score_scheme` */

/*Table structure for table `sports_space` */

DROP TABLE IF EXISTS `sports_space`;

CREATE TABLE `sports_space` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `sports_manager_id` int(11) NOT NULL,
  `name` varchar(50) NOT NULL,
  `straight_track_number` int(11) NOT NULL,
  `bend_track_number` int(11) NOT NULL,
  `jumping_area_number` int(11) NOT NULL,
  `high_jumping_area_number` int(11) NOT NULL,
  `short_throw_area_number` int(11) NOT NULL,
  `long_throw_area_number` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_space_sports_manager1_idx` (`sports_manager_id`),
  CONSTRAINT `fk_space_sports_manager1` FOREIGN KEY (`sports_manager_id`) REFERENCES `sports_manager` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `sports_space` */

/*Table structure for table `sports_unit` */

DROP TABLE IF EXISTS `sports_unit`;

CREATE TABLE `sports_unit` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `sports_manager_id` int(11) NOT NULL,
  `name` varchar(20) NOT NULL,
  `start_data` datetime NOT NULL,
  `end_data` datetime NOT NULL,
  PRIMARY KEY (`id`,`sports_manager_id`),
  KEY `fk_sports_unit_sports_manager1_idx` (`sports_manager_id`),
  CONSTRAINT `fk_sports_unit_sports_manager1` FOREIGN KEY (`sports_manager_id`) REFERENCES `sports_manager` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `sports_unit` */

/*Table structure for table `sports_volunteer_position_template` */

DROP TABLE IF EXISTS `sports_volunteer_position_template`;

CREATE TABLE `sports_volunteer_position_template` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL,
  `description` varchar(200) NOT NULL,
  `sex` varchar(8) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `sports_volunteer_position_template` */

/*Table structure for table `volunteer_enroll` */

DROP TABLE IF EXISTS `volunteer_enroll`;

CREATE TABLE `volunteer_enroll` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `participants_id` int(11) NOT NULL,
  `organization_manager_id` int(11) NOT NULL,
  `volunteer_position_id` int(11) NOT NULL,
  `sports_id` int(11) NOT NULL,
  `judge_state` tinyint(1) NOT NULL,
  `describetion` varchar(200) NOT NULL COMMENT '自我介绍',
  `note` varchar(150) DEFAULT NULL COMMENT '在这里记录拒绝原因或恭喜信息。',
  PRIMARY KEY (`id`),
  KEY `fk_volunteer_enroll_organization_manager1_idx` (`organization_manager_id`),
  KEY `fk_volunteer_enroll_participants1_idx` (`participants_id`),
  KEY `fk_volunteer_enroll_sports_volunteer_position_has_sports1_idx` (`volunteer_position_id`,`sports_id`),
  CONSTRAINT `fk_volunteer_enroll_organization_manager1` FOREIGN KEY (`organization_manager_id`) REFERENCES `organization_manager` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_volunteer_enroll_participants1` FOREIGN KEY (`participants_id`) REFERENCES `participants` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_volunteer_enroll_sports_volunteer_position_has_sports1` FOREIGN KEY (`volunteer_position_id`, `sports_id`) REFERENCES `sports_has_volunteer_position` (`volunteer_position_id`, `sports_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `volunteer_enroll` */

/*Table structure for table `volunteer_position` */

DROP TABLE IF EXISTS `volunteer_position`;

CREATE TABLE `volunteer_position` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `sports_manager_id` int(11) NOT NULL,
  `name` varchar(20) NOT NULL,
  `description` varchar(200) NOT NULL,
  `sex` varchar(8) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_sports_volunteer_position_sports_manager1_idx` (`sports_manager_id`),
  CONSTRAINT `fk_sports_volunteer_position_sports_manager1` FOREIGN KEY (`sports_manager_id`) REFERENCES `sports_manager` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `volunteer_position` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
