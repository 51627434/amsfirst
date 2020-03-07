/*
SQLyog Ultimate v12.2.6 (64 bit)
MySQL - 5.7.27-log : Database - dong
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`dong` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `dong`;

/*Table structure for table `csprequestservice` */

DROP TABLE IF EXISTS `csprequestservice`;

CREATE TABLE `csprequestservice` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cspId` varchar(32) DEFAULT NULL,
  `lspId` varchar(32) DEFAULT NULL,
  `correlateId` varchar(32) DEFAULT NULL,
  `cmdFileUrl` varchar(128) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `csprequestservice` */

insert  into `csprequestservice`(`id`,`cspId`,`lspId`,`correlateId`,`cmdFileUrl`) values 
(1,'11','333','1233444443','aaaaaaaa');

/*Table structure for table `cspresponseservice` */

DROP TABLE IF EXISTS `cspresponseservice`;

CREATE TABLE `cspresponseservice` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cspId` varchar(32) DEFAULT NULL,
  `lspId` varchar(32) DEFAULT NULL,
  `correlateId` varchar(32) DEFAULT NULL,
  `cmdResult` int(11) DEFAULT NULL,
  `resultFileURL` varchar(128) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8;

/*Data for the table `cspresponseservice` */

insert  into `cspresponseservice`(`id`,`cspId`,`lspId`,`correlateId`,`cmdResult`,`resultFileURL`) values 
(1,'1','3','53338888',-2147483648,'fffff'),
(2,'1','3','53337777',-2147483648,'fffff'),
(3,'1','3','1200000',-2147483648,'http://localhost:8080/axis2/services/CSPRequestService?wsdl'),
(4,'1','3','1200001',-2147483648,'http://localhost:8080/axis2/services/CSPRequestService?wsdl'),
(5,'1','3','1200002',-2147483648,'http://localhost:8080/axis2/services/CSPRequestService?wsdl'),
(6,'1','3','1200002',-2147483648,'http://localhost:8080/axis2/services/CSPRequestService?wsdl'),
(7,'1','3','1200003',-2147483648,'http://localhost:8080/axis2/services/CSPRequestService?wsdl'),
(8,'1','3','1200004',-2147483648,'http://localhost:8080/axis2/services/CSPRequestService?wsdl'),
(9,'1','3','1200005',-2147483648,'http://localhost:8080/axis2/services/CSPRequestService?wsdl'),
(10,'1','3','1200005',-2147483648,'http://localhost:8080/axis2/services/CSPRequestService?wsdl'),
(11,'1','3','1200006',0,'http://localhost:8080/axis2/services/CSPRequestService?wsdl'),
(12,'1','3','1200006',0,'http://localhost:8080/axis2/services/CSPRequestService?wsdl'),
(13,'1','3','1200008',-2147483648,'http://localhost:8080/axis2/services/CSPRequestService?wsdl'),
(14,'1','3','1200008',-2147483648,'http://localhost:8080/axis2/services/CSPRequestService?wsdl'),
(15,'1','3','1200008',-2147483648,'http://localhost:8080/axis2/services/CSPRequestService?wsdl'),
(16,'1','3','1200008',-2147483648,'http://localhost:8080/axis2/services/CSPRequestService?wsdl'),
(17,'1','3','1200009',-2147483648,'http://localhost:8080/axis2/services/CSPRequestService?wsdl'),
(18,'1','3','1',-2147483648,'http://localhost:8080/axis2/services/CSPRequestService?wsdl'),
(19,'1','3','1',-2147483648,'http://localhost:8080/axis2/services/CSPRequestService?wsdl'),
(20,'1','3','1',-2147483648,'http://localhost:8080/axis2/services/CSPRequestService?wsdl'),
(21,'1','3','12',-2147483648,'http://localhost:8080/axis2/services/CSPRequestService?wsdl'),
(22,'1','3','12',-2147483648,'http://localhost:8080/axis2/services/CSPRequestService?wsdl'),
(23,'1','3','13',-2147483648,'http://localhost:8080/axis2/services/CSPRequestService?wsdl'),
(24,'1','3','13',-2147483648,'http://localhost:8080/axis2/services/CSPRequestService?wsdl'),
(25,'1','3','136666',-2147483648,'http://localhost:8080/axis2/services/CSPRequestService?wsdl'),
(26,'1','3','136666',-2147483648,'http://localhost:8080/axis2/services/CSPRequestService?wsdl'),
(27,'1','3','136666',-2147483648,'http://localhost:8080/axis2/services/CSPRequestService?wsdl'),
(28,'1','3','136677777',-2147483648,'http://localhost:8080/axis2/services/CSPRequestService?wsdl'),
(29,'1','3','136677778',-2147483648,'http://localhost:8080/axis2/services/CSPRequestService?wsdl'),
(30,'1','3','136677779',-2147483648,'http://localhost:8080/axis2/services/CSPRequestService?wsdl'),
(31,'12','22','33',0,'eeefffff'),
(32,'12','22','3222223',100,'eeefffff'),
(33,'1','3','136678',-2147483648,'http://localhost:8080/axis2/services/CSPRequestService?wsdl'),
(34,'12','22','3222223',100,'eeefffff'),
(35,'12','22','3222223',100,'eeefffff'),
(36,'aaaaa','aaaaa','aaaaa',101,'aaaaa');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
