-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: localhost    Database: camerashop
-- ------------------------------------------------------
-- Server version	8.0.22

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `so_cart`
--

DROP TABLE IF EXISTS `so_cart`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `so_cart` (
  `ID` bigint NOT NULL,
  `userId` bigint DEFAULT NULL,
  `userName` varchar(225) DEFAULT NULL,
  `productId` bigint DEFAULT NULL,
  `pruductName` varchar(225) DEFAULT NULL,
  `quantity` bigint DEFAULT NULL,
  `finalAmount` double DEFAULT NULL,
  `createdBy` varchar(225) DEFAULT NULL,
  `modifiedBy` varchar(225) DEFAULT NULL,
  `createdDatetime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `modifiedDatetime` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  PRIMARY KEY (`ID`),
  KEY `FK_so_cart` (`userId`),
  KEY `productId` (`productId`),
  CONSTRAINT `FK_so_cart` FOREIGN KEY (`userId`) REFERENCES `so_user` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `so_cart_ibfk_1` FOREIGN KEY (`productId`) REFERENCES `so_product` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `so_cart`
--

LOCK TABLES `so_cart` WRITE;
/*!40000 ALTER TABLE `so_cart` DISABLE KEYS */;
/*!40000 ALTER TABLE `so_cart` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `so_category`
--

DROP TABLE IF EXISTS `so_category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `so_category` (
  `ID` bigint NOT NULL,
  `name` varchar(225) DEFAULT NULL,
  `description` varchar(755) DEFAULT NULL,
  `image` varchar(755) DEFAULT NULL,
  `createdBy` varchar(225) DEFAULT NULL,
  `modifiedBy` varchar(225) DEFAULT NULL,
  `createdDatetime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `modifiedDatetime` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `so_category`
--

LOCK TABLES `so_category` WRITE;
/*!40000 ALTER TABLE `so_category` DISABLE KEYS */;
INSERT INTO `so_category` VALUES (2,'Camera IP Wifi','w','camera-ip-wifi.png','duylieu1802','duylieu1802','2021-01-12 14:40:25','2021-01-12 14:40:25'),(3,'Camera Toan Canh','Toan Canh','camera-toan-canh.jpg','duylieu1802','duylieu1802','2021-01-12 14:40:38','2021-01-12 14:40:38'),(4,'Camera Hanh Trinh','Hanh Trinh','camera-hanh-trinh.jpg','duylieu1802','duylieu1802','2021-01-12 14:40:47','2021-01-12 14:40:47'),(5,'Camera Full Color','full color','camera-full-color.jpg','duylieu1802','duylieu1802','2021-01-12 14:40:57','2021-01-12 14:40:57'),(6,'Thiet Bi Dien Thong Minh','thiet bi dien thong minh','thiet-bi-dien-thong-minh.jpg','duylieu1802','duylieu1802','2021-01-12 14:41:30','2021-01-12 14:41:30');
/*!40000 ALTER TABLE `so_category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `so_contect`
--

DROP TABLE IF EXISTS `so_contect`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `so_contect` (
  `ID` bigint NOT NULL,
  `name` varchar(225) DEFAULT NULL,
  `email` varchar(225) DEFAULT NULL,
  `message` varchar(755) DEFAULT NULL,
  `createdBy` varchar(225) DEFAULT NULL,
  `modifiedBy` varchar(225) DEFAULT NULL,
  `createdDatetime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `modifiedDatetime` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `so_contect`
--

LOCK TABLES `so_contect` WRITE;
/*!40000 ALTER TABLE `so_contect` DISABLE KEYS */;
INSERT INTO `so_contect` VALUES (1,'Hariom Mukati','Hariom@gmail.com','dbvisbwdivbeibvb nvob','root','root','2019-07-28 20:40:02','2019-07-28 20:40:02');
/*!40000 ALTER TABLE `so_contect` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `so_invoice`
--

DROP TABLE IF EXISTS `so_invoice`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `so_invoice` (
  `ID` bigint NOT NULL,
  `orderId` bigint DEFAULT NULL,
  `userId` bigint DEFAULT NULL,
  `userName` varchar(225) DEFAULT NULL,
  `productId` bigint DEFAULT NULL,
  `productName` varchar(225) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `amount` double DEFAULT NULL,
  `mobileNo` varchar(225) DEFAULT NULL,
  `shippingAddress` varchar(755) DEFAULT NULL,
  `billingAddress` varchar(755) DEFAULT NULL,
  `emailId` varchar(225) DEFAULT NULL,
  `productDescription` varchar(755) DEFAULT NULL,
  `productImage` varchar(755) DEFAULT NULL,
  `createdBy` varchar(225) DEFAULT NULL,
  `modifiedBy` varchar(225) DEFAULT NULL,
  `createdDatetime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `modifiedDatetime` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `so_invoice`
--

LOCK TABLES `so_invoice` WRITE;
/*!40000 ALTER TABLE `so_invoice` DISABLE KEYS */;
INSERT INTO `so_invoice` VALUES (1,200101,3,'Demo Demo',4,'Games Poro','2019-07-29',155,'9565415598','wwef','wffef','Hariom@gmail.com','H wrfwerf jbwkeguf dochohr9e shvyer soadfher9t .','istockphoto-809275266-612x612.jpg',NULL,NULL,'2019-07-29 08:46:59','2019-07-29 08:46:59');
/*!40000 ALTER TABLE `so_invoice` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `so_product`
--

DROP TABLE IF EXISTS `so_product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `so_product` (
  `ID` bigint NOT NULL,
  `categoryId` bigint DEFAULT NULL,
  `categoryName` varchar(225) DEFAULT NULL,
  `productCode` bigint DEFAULT NULL,
  `name` varchar(225) DEFAULT NULL,
  `description` varchar(755) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `image` varchar(755) DEFAULT NULL,
  `createdBy` varchar(225) DEFAULT NULL,
  `modifiedBy` varchar(225) DEFAULT NULL,
  `createdDatetime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `modifiedDatetime` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  PRIMARY KEY (`ID`),
  KEY `FK_so_product` (`categoryId`),
  CONSTRAINT `FK_so_product` FOREIGN KEY (`categoryId`) REFERENCES `so_category` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `so_product`
--

LOCK TABLES `so_product` WRITE;
/*!40000 ALTER TABLE `so_product` DISABLE KEYS */;
INSERT INTO `so_product` VALUES (1,2,'Camera IP Wifi',100101,'Camera Wifi EZVIZ C6CN 720P','1',20,'ip-wifi-1.jpg','duylieu1802','duylieu1802','2021-01-12 14:41:50','2021-01-12 14:41:50'),(2,2,'Camera IP Wifi',100102,'Camera IP Wifi Fisheye 5.0 megapixel','2',75,'ip-wifi-2.jpg','duylieu1802','duylieu1802','2021-01-12 14:42:08','2021-01-12 14:42:08'),(3,2,'Camera IP Wifi',100103,'Camera IP Wifi EZVIZ C1C 1080P','3',100,'ip-wifi-3.jpg','duylieu1802','duylieu1802','2021-01-12 14:42:23','2021-01-12 14:42:29'),(4,2,'Camera IP Wifi',100104,'Camera IP Wifi Kbvision','4',100,'ip-wifi-4.jpg','duylieu1802','duylieu1802','2021-01-12 14:42:45','2021-01-12 14:42:52'),(5,5,'Camera Full Color',100105,'Camera HDCVI 2MP Full Color DAHUA','full cl',75,'camera-full-color.jpg','duylieu1802','duylieu1802','2021-01-12 14:43:29','2021-01-12 14:43:29'),(6,3,'Camera Toan Canh',100106,'Camera IP Wifi Fisheye 3MP EBITCAM EBF2','toan canh',125,'toan-canh-1.jpg','duylieu1802','duylieu1802','2021-01-12 14:43:57','2021-01-12 14:43:57'),(7,3,'Camera Toan Canh',100107,'Camera Wifi 360 Panoramic 3.0MP VANTECH','toan canh 2',111,'toan-canh-2.jpg','duylieu1802','duylieu1802','2021-01-12 14:44:17','2021-01-12 14:44:17'),(8,3,'Camera Toan Canh',100108,'Camera IP Wifi Fisheye 5.0 megapixel','toan canh 3',1100,'toan-canh-3.jpg','duylieu1802','duylieu1802','2021-01-12 14:44:40','2021-01-12 14:44:40'),(9,6,'Thiet Bi Dien Thong Minh',100109,'Cam Bien Hong Ngoai','tb1',25,'thiet-bi-1.jpg','duylieu1802','duylieu1802','2021-01-12 14:45:18','2021-01-12 14:45:18'),(10,6,'Thiet Bi Dien Thong Minh',100110,'Chuong Goi Cua Khong Day','chuong',32,'thiet-bi-2.jpg','duylieu1802','duylieu1802','2021-01-12 14:45:31','2021-01-12 14:45:31'),(11,4,'Camera Hanh Trinh',100111,'Camera hanh trinh F6S Hikvision','hanh trinh',200,'test-2.jpg','duylieu1802','duylieu1802','2021-01-12 14:46:31','2021-01-12 14:46:31');
/*!40000 ALTER TABLE `so_product` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `so_role`
--

DROP TABLE IF EXISTS `so_role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `so_role` (
  `ID` bigint NOT NULL,
  `name` varchar(225) DEFAULT NULL,
  `description` varchar(225) DEFAULT NULL,
  `createdBy` varchar(225) DEFAULT NULL,
  `modifiedBy` varchar(225) DEFAULT NULL,
  `createdDatetime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `modifiedDatetime` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `so_role`
--

LOCK TABLES `so_role` WRITE;
/*!40000 ALTER TABLE `so_role` DISABLE KEYS */;
/*!40000 ALTER TABLE `so_role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `so_user`
--

DROP TABLE IF EXISTS `so_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `so_user` (
  `ID` bigint NOT NULL,
  `firstName` varchar(225) DEFAULT NULL,
  `lastName` varchar(225) DEFAULT NULL,
  `login` varchar(225) DEFAULT NULL,
  `password` varchar(225) DEFAULT NULL,
  `mobileNo` varchar(225) DEFAULT NULL,
  `roleId` bigint DEFAULT NULL,
  `shippingAddress` varchar(755) DEFAULT NULL,
  `billingAddress` varchar(755) DEFAULT NULL,
  `emailAddress` varchar(225) DEFAULT NULL,
  `createdBy` varchar(225) DEFAULT NULL,
  `modifiedBy` varchar(225) DEFAULT NULL,
  `createdDatetime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `modifiedDatetime` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `so_user`
--

LOCK TABLES `so_user` WRITE;
/*!40000 ALTER TABLE `so_user` DISABLE KEYS */;
INSERT INTO `so_user` VALUES (2,'Admin','Admin','Admin@gmail.com','Admin@321','9165415598',1,NULL,NULL,'Admin@gmail.com','Admin@gmail.com','Admin@gmail.com','2019-07-25 03:35:00','2019-07-24 08:43:15'),(10,'Lieu','Cong Duy','duylieu1802','duylieu2','0379692979',1,NULL,NULL,'lieucongduy182@gmail.com','Admin@gmail.com','Admin@gmail.com','2021-01-12 14:37:14','2021-01-12 14:37:14'),(11,'Lieu','Cong Duy','lieucongduy','duylieu2','0568873875',2,'sdofqoief','fsoivhqefoqef','lieucongduy123@gmail.com','root','root','2021-01-12 14:38:03','2021-01-12 14:38:03');
/*!40000 ALTER TABLE `so_user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-01-12 21:49:54
