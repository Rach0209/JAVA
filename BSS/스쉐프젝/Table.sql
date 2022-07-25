-- MySQL dump 10.13  Distrib 8.0.20, for Win64 (x86_64)
--
-- Host: 192.168.0.98    Database: teamproject
-- ------------------------------------------------------
-- Server version	8.0.20

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
-- Table structure for table `acc`
--

DROP TABLE IF EXISTS `acc`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `acc` (
  `id` int NOT NULL DEFAULT '0',
  `acc_Name` varchar(45) DEFAULT NULL,
  `acc_Size` varchar(45) NOT NULL,
  `acc_Color` varchar(45) NOT NULL,
  `acc_Category` varchar(45) NOT NULL,
  `acc_Image` blob,
  `acc_Season` varchar(45) DEFAULT NULL,
  `record_Data` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `acc`
--

LOCK TABLES `acc` WRITE;
/*!40000 ALTER TABLE `acc` DISABLE KEYS */;
INSERT INTO `acc` VALUES (1,'나이키티','100','빨강','반팔',NULL,'22/ss','2022-07-25 00:20:30'),(2,'청바지','100','파랑','청바지',NULL,'22/fw','2022-07-25 00:22:54');
/*!40000 ALTER TABLE `acc` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bag`
--

DROP TABLE IF EXISTS `bag`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bag` (
  `id` int NOT NULL DEFAULT '0',
  `bag_Name` varchar(45) DEFAULT NULL,
  `bag_Size` varchar(45) NOT NULL,
  `bag_Color` varchar(45) NOT NULL,
  `bag_Category` varchar(45) NOT NULL,
  `bag_Image` blob,
  `bag_Season` varchar(45) DEFAULT NULL,
  `record_Data` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bag`
--

LOCK TABLES `bag` WRITE;
/*!40000 ALTER TABLE `bag` DISABLE KEYS */;
INSERT INTO `bag` VALUES (1,'나이키티','100','빨강','반팔',NULL,'22/ss','2022-07-25 00:20:30'),(2,'청바지','100','파랑','청바지',NULL,'22/fw','2022-07-25 00:22:54');
/*!40000 ALTER TABLE `bag` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bottom`
--

DROP TABLE IF EXISTS `bottom`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bottom` (
  `id` int NOT NULL AUTO_INCREMENT,
  `bottom_Name` varchar(45) DEFAULT NULL,
  `bottom_Size` varchar(45) NOT NULL,
  `bottom_Color` varchar(45) NOT NULL,
  `bottom_Category` varchar(45) NOT NULL,
  `bottom_Image` varchar(45) DEFAULT NULL,
  `bottom_Season` varchar(45) DEFAULT NULL,
  `record_Data` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  UNIQUE KEY `bottom_Name_UNIQUE` (`bottom_Name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bottom`
--

LOCK TABLES `bottom` WRITE;
/*!40000 ALTER TABLE `bottom` DISABLE KEYS */;
/*!40000 ALTER TABLE `bottom` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `codiset`
--

DROP TABLE IF EXISTS `codiset`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `codiset` (
  `id` int NOT NULL AUTO_INCREMENT,
  `top` int DEFAULT NULL,
  `top2` int DEFAULT NULL,
  `bottom` int DEFAULT NULL,
  `shoes` int DEFAULT NULL,
  `bag` int DEFAULT NULL,
  `acc1` int DEFAULT NULL,
  `acc2` int DEFAULT NULL,
  `acc3` int DEFAULT NULL,
  `user_Id` int DEFAULT NULL,
  `tag_theme` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `codiset_ibfk_1` (`tag_theme`),
  KEY `user_Id` (`user_Id`),
  KEY `codiset_ibfk_2_idx` (`bottom`),
  KEY `codiset_ibfk_5` (`acc1`),
  KEY `codiset_ibfk_6` (`acc2`),
  KEY `codiset_ibfk_7` (`acc3`),
  KEY `codiset_ibfk_8` (`top2`),
  KEY `top` (`top`),
  KEY `bag` (`bag`),
  KEY `codiset_ibfk_4_idx` (`shoes`),
  CONSTRAINT `codiset_ibfk_1` FOREIGN KEY (`tag_theme`) REFERENCES `tag_theme` (`id`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `codiset_ibfk_10` FOREIGN KEY (`bag`) REFERENCES `bag` (`id`) ON DELETE SET NULL,
  CONSTRAINT `codiset_ibfk_2` FOREIGN KEY (`user_Id`) REFERENCES `user` (`id`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `codiset_ibfk_3` FOREIGN KEY (`bottom`) REFERENCES `bottom` (`id`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `codiset_ibfk_4` FOREIGN KEY (`shoes`) REFERENCES `shoes` (`id`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `codiset_ibfk_5` FOREIGN KEY (`acc1`) REFERENCES `acc` (`id`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `codiset_ibfk_6` FOREIGN KEY (`acc2`) REFERENCES `acc` (`id`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `codiset_ibfk_7` FOREIGN KEY (`acc3`) REFERENCES `acc` (`id`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `codiset_ibfk_8` FOREIGN KEY (`top2`) REFERENCES `top` (`id`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `codiset_ibfk_9` FOREIGN KEY (`top`) REFERENCES `top` (`id`) ON DELETE SET NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `codiset`
--

LOCK TABLES `codiset` WRITE;
/*!40000 ALTER TABLE `codiset` DISABLE KEYS */;
/*!40000 ALTER TABLE `codiset` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `like`
--

DROP TABLE IF EXISTS `like`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `like` (
  `user_id` int DEFAULT NULL,
  `codiSet_id` int DEFAULT NULL,
  `record_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  KEY `user_id` (`user_id`),
  KEY `codiSet_id` (`codiSet_id`),
  CONSTRAINT `like_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`) ON DELETE SET NULL,
  CONSTRAINT `like_ibfk_2` FOREIGN KEY (`codiSet_id`) REFERENCES `codiset` (`id`) ON DELETE SET NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `like`
--

LOCK TABLES `like` WRITE;
/*!40000 ALTER TABLE `like` DISABLE KEYS */;
/*!40000 ALTER TABLE `like` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shoes`
--

DROP TABLE IF EXISTS `shoes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `shoes` (
  `id` int NOT NULL DEFAULT '0',
  `shoes_Name` varchar(45) DEFAULT NULL,
  `shoes_Size` varchar(45) NOT NULL,
  `shoes_Color` varchar(45) NOT NULL,
  `shoes_Category` varchar(45) NOT NULL,
  `shoes_Image` blob,
  `shoes_Season` varchar(45) DEFAULT NULL,
  `record_Data` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shoes`
--

LOCK TABLES `shoes` WRITE;
/*!40000 ALTER TABLE `shoes` DISABLE KEYS */;
INSERT INTO `shoes` VALUES (1,'나이키티','100','빨강','반팔',NULL,'22/ss','2022-07-25 00:20:30'),(2,'청바지','100','파랑','청바지',NULL,'22/fw','2022-07-25 00:22:54');
/*!40000 ALTER TABLE `shoes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tag_theme`
--

DROP TABLE IF EXISTS `tag_theme`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tag_theme` (
  `id` int NOT NULL AUTO_INCREMENT,
  `codi` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tag_theme`
--

LOCK TABLES `tag_theme` WRITE;
/*!40000 ALTER TABLE `tag_theme` DISABLE KEYS */;
INSERT INTO `tag_theme` VALUES (1,'데이트룩');
/*!40000 ALTER TABLE `tag_theme` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `top`
--

DROP TABLE IF EXISTS `top`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `top` (
  `id` int NOT NULL AUTO_INCREMENT,
  `top_Name` varchar(45) DEFAULT NULL,
  `top_Size` varchar(45) NOT NULL,
  `top_Color` varchar(45) NOT NULL,
  `top_Category` varchar(45) NOT NULL,
  `top_Image` blob,
  `top_Season` varchar(45) DEFAULT NULL,
  `record_Data` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  UNIQUE KEY `top_Name_UNIQUE` (`top_Name`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `top`
--

LOCK TABLES `top` WRITE;
/*!40000 ALTER TABLE `top` DISABLE KEYS */;
INSERT INTO `top` VALUES (1,'나이키티','100','빨강','반팔',NULL,'22/ss','2022-07-25 00:20:30'),(2,'청바지','100','파랑','청바지',NULL,'22/fw','2022-07-25 00:22:54');
/*!40000 ALTER TABLE `top` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `id` int NOT NULL,
  `user_email` varchar(45) NOT NULL,
  `user_Name` varchar(45) NOT NULL,
  `user_Password` varchar(45) NOT NULL,
  `user_NickName` varchar(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `user_email_UNIQUE` (`user_email`),
  UNIQUE KEY `user_NickName_UNIQUE` (`user_NickName`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'teamproject'
--

--
-- Dumping routines for database 'teamproject'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-07-25 14:33:06
