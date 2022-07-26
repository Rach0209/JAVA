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
-- Table structure for table `all_product`
--

DROP TABLE IF EXISTS `all_product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `all_product` (
  `id` int NOT NULL AUTO_INCREMENT,
  `product_Name` varchar(45) DEFAULT NULL,
  `product_Size` varchar(45) DEFAULT NULL,
  `product_Color` varchar(45) DEFAULT NULL,
  `product_Category` int DEFAULT NULL,
  `product_Sub_Category` varchar(45) DEFAULT NULL,
  `product_Image` varchar(100) DEFAULT NULL,
  `product_Season` varchar(45) DEFAULT NULL,
  `record_Data` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  UNIQUE KEY `top_Name_UNIQUE` (`product_Name`),
  KEY `category_fk_idx` (`product_Category`),
  CONSTRAINT `category_fk` FOREIGN KEY (`product_Category`) REFERENCES `category` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `all_product`
--

LOCK TABLES `all_product` WRITE;
/*!40000 ALTER TABLE `all_product` DISABLE KEYS */;
INSERT INTO `all_product` VALUES (1,'상의_1',NULL,'white',NULL,'반팔셔츠','\\\\GREEN-424\\Java\\Your Codes\\_Free(Team)\\3조\\3조 이미지 파일\\상의\\상의1.jpg','22s/s','2022-07-26 02:40:56'),(2,'상의_2',NULL,'white',NULL,'반팔','\\\\GREEN-424\\Java\\Your Codes\\_Free(Team)\\3조\\3조 이미지 파일\\상의\\상의2.jpg','22s/s','2022-07-26 02:40:56'),(3,'하의_1',NULL,'black',NULL,'데님스커트','\\\\GREEN-424\\Java\\Your Codes\\_Free(Team)\\3조\\3조 이미지 파일\\하의\\하의1.jpg','22s/s','2022-07-26 02:40:25'),(4,'하의_2',NULL,'black',NULL,'데님스커트','\\\\GREEN-424\\Java\\Your Codes\\_Free(Team)\\3조\\3조 이미지 파일\\하의\\하의2.jpg','22s/s','2022-07-26 02:40:25'),(5,'가방_1',NULL,'purple',NULL,NULL,'\\\\GREEN-424\\Java\\Your Codes\\_Free(Team)\\3조\\3조 이미지 파일\\가방\\가방1.jpg','22s/s','2022-07-26 02:43:27'),(6,'가방_2',NULL,'brown',NULL,NULL,'\\\\GREEN-424\\Java\\Your Codes\\_Free(Team)\\3조\\3조 이미지 파일\\가방\\가방2.jpg','22f/w','2022-07-26 02:43:27'),(7,'신발_1',NULL,'아이보리',NULL,NULL,'\\\\GREEN-424\\Java\\Your Codes\\_Free(Team)\\3조\\3조 이미지 파일\\신발\\신발1.jpg','22s/s','2022-07-26 02:41:35'),(8,'신발_2',NULL,'브라운',NULL,NULL,'\\\\GREEN-424\\Java\\Your Codes\\_Free(Team)\\3조\\3조 이미지 파일\\신발\\신발2.jpg','22s/s','2022-07-26 02:41:43'),(9,'악세_1',NULL,'green',NULL,'목걸이','\\\\GREEN-424\\Java\\Your Codes\\_Free(Team)\\3조\\3조 이미지 파일\\악세사리\\목걸이1.jpg','22s/s','2022-07-26 02:40:25'),(10,'악세_2',NULL,'sliver',NULL,'목걸이','\\\\GREEN-424\\Java\\Your Codes\\_Free(Team)\\3조\\3조 이미지 파일\\악세사리\\목걸이2.jpg','22s/s','2022-07-26 02:40:25');
/*!40000 ALTER TABLE `all_product` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cart`
--

DROP TABLE IF EXISTS `cart`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cart` (
  `user_id` int NOT NULL,
  `product` int NOT NULL,
  KEY `user_id.fk_idx` (`user_id`),
  KEY `product_name_fk_idx` (`product`),
  CONSTRAINT `product_id.fk` FOREIGN KEY (`product`) REFERENCES `all_product` (`id`),
  CONSTRAINT `user_id.fk` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cart`
--

LOCK TABLES `cart` WRITE;
/*!40000 ALTER TABLE `cart` DISABLE KEYS */;
/*!40000 ALTER TABLE `cart` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `category`
--

DROP TABLE IF EXISTS `category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `category` (
  `id` int NOT NULL,
  `category_Name` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `category`
--

LOCK TABLES `category` WRITE;
/*!40000 ALTER TABLE `category` DISABLE KEYS */;
INSERT INTO `category` VALUES (1,'top'),(2,'bottom'),(3,'bag'),(4,'shoes'),(5,'acc');
/*!40000 ALTER TABLE `category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `codiset_new`
--

DROP TABLE IF EXISTS `codiset_new`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `codiset_new` (
  `id` int NOT NULL AUTO_INCREMENT,
  `product1` int DEFAULT NULL,
  `product2` int DEFAULT NULL,
  `product3` int DEFAULT NULL,
  `product4` int DEFAULT NULL,
  `product5` int DEFAULT NULL,
  `product6` int DEFAULT NULL,
  `product7` int DEFAULT NULL,
  `product8` int DEFAULT NULL,
  `product9` int DEFAULT NULL,
  `user_id` int DEFAULT NULL,
  `tag_theme` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `product1_fk_idx` (`product1`),
  KEY `product2_fk_idx` (`product2`),
  KEY `product3_fk_idx` (`product3`),
  KEY `product4_fk_idx` (`product4`),
  KEY `product5_fk_idx` (`product5`),
  KEY `product6_fk_idx` (`product6`),
  KEY `product7_fk_idx` (`product7`),
  KEY `product8_fk_idx` (`product8`),
  KEY `product9_fk_idx` (`product9`),
  KEY `user_id_fk_idx` (`user_id`),
  KEY `tag_theme_fk_idx` (`tag_theme`),
  CONSTRAINT `product1_fk` FOREIGN KEY (`product1`) REFERENCES `all_product` (`id`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `product2_fk` FOREIGN KEY (`product2`) REFERENCES `all_product` (`id`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `product3_fk` FOREIGN KEY (`product3`) REFERENCES `all_product` (`id`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `product4_fk` FOREIGN KEY (`product4`) REFERENCES `all_product` (`id`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `product5_fk` FOREIGN KEY (`product5`) REFERENCES `all_product` (`id`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `product6_fk` FOREIGN KEY (`product6`) REFERENCES `all_product` (`id`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `product7_fk` FOREIGN KEY (`product7`) REFERENCES `all_product` (`id`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `product8_fk` FOREIGN KEY (`product8`) REFERENCES `all_product` (`id`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `product9_fk` FOREIGN KEY (`product9`) REFERENCES `all_product` (`id`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `tag_theme_fk` FOREIGN KEY (`tag_theme`) REFERENCES `tag_theme` (`id`),
  CONSTRAINT `user_id_fk` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `codiset_new`
--

LOCK TABLES `codiset_new` WRITE;
/*!40000 ALTER TABLE `codiset_new` DISABLE KEYS */;
/*!40000 ALTER TABLE `codiset_new` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `heart`
--

DROP TABLE IF EXISTS `heart`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `heart` (
  `id` int NOT NULL AUTO_INCREMENT,
  `user_id` int DEFAULT NULL,
  `codiSet_id` int DEFAULT NULL,
  `record_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `user_id` (`user_id`),
  KEY `heart_ibfk_2_idx` (`codiSet_id`),
  CONSTRAINT `heart_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`) ON DELETE SET NULL,
  CONSTRAINT `heart_ibfk_2` FOREIGN KEY (`codiSet_id`) REFERENCES `codiset_new` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `heart`
--

LOCK TABLES `heart` WRITE;
/*!40000 ALTER TABLE `heart` DISABLE KEYS */;
/*!40000 ALTER TABLE `heart` ENABLE KEYS */;
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
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tag_theme`
--

LOCK TABLES `tag_theme` WRITE;
/*!40000 ALTER TABLE `tag_theme` DISABLE KEYS */;
INSERT INTO `tag_theme` VALUES (1,'데이트룩'),(2,'연습');
/*!40000 ALTER TABLE `tag_theme` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `user_ID` varchar(45) NOT NULL,
  `user_Name` varchar(45) NOT NULL,
  `user_Password` varchar(45) NOT NULL,
  `admin` tinyint NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `user_email_UNIQUE` (`user_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'test1','test1','test',0),(2,'test2','test2','test',1),(3,'test3','test3','test',0);
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

-- Dump completed on 2022-07-26 14:07:56
