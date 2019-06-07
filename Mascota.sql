/*
SQLyog Community v8.71 
MySQL - 5.6.22-log : Database - mascotas
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`mascotas` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `mascotas`;

/*Table structure for table `mascota` */

DROP TABLE IF EXISTS `mascota`;

CREATE TABLE `mascota` (
  `idMascota` int(11) NOT NULL,
  `nombreMascota` varchar(45) NOT NULL,
  `nombreCliente` varchar(45) NOT NULL,
  `raza` varchar(45) NOT NULL,
  PRIMARY KEY (`idMascota`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `mascota` */

insert  into `mascota`(`idMascota`,`nombreMascota`,`nombreCliente`,`raza`) values (1,'ZORRO','ZORRO','ZORRO'),(2,'ZORRO','ZORRO','ZORRO'),(3,'Akira','Pedro','Chihuahua'),(4,'Bruno','Juana','Bulldog'),(5,'Paco','Yessica','Bulldog'),(6,'Sandor','Jerson','Bulldog'),(7,'Brunooo','Jesus','Chihuahua'),(8,'Tony','Alexander','Pastor Aleman'),(9,'Axel','Mario','Pastor Aleman'),(10,'Pablito','Adan','Chihuahua'),(11,'DF','DF','DF'),(12,'ZORRO','ZORRO','ZORRO');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
