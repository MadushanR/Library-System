-- MySQL dump 10.13  Distrib 8.0.23, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: librarysystem
-- ------------------------------------------------------
-- Server version	8.0.23

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
-- Table structure for table `tlog`
--

DROP TABLE IF EXISTS `tlog`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tlog` (
  `Type` varchar(1000) DEFAULT NULL,
  `Date` varchar(10000) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tlog`
--

LOCK TABLES `tlog` WRITE;
/*!40000 ALTER TABLE `tlog` DISABLE KEYS */;
INSERT INTO `tlog` VALUES (NULL,NULL),(NULL,NULL),('Add Item','Tue May 25 11:09:51 IST 2021'),('Add Item','Thu Jun 03 19:52:53 IST 2021'),('Report','Thu Jun 03 19:59:20 IST 2021'),('Report','Thu Jun 03 20:03:54 IST 2021'),('Find Item','Thu Jun 03 20:05:16 IST 2021'),('Report','Thu Jun 03 20:06:12 IST 2021'),('Report','Thu Jun 03 20:14:09 IST 2021'),('Report','Thu Jun 03 20:15:25 IST 2021'),('Find Item','Thu Jun 03 20:16:50 IST 2021'),('Find Item','Thu Jun 03 20:18:36 IST 2021'),('Find Item','Thu Jun 03 20:20:23 IST 2021'),('Find Item','Thu Jun 03 20:22:38 IST 2021'),('Find Item','Thu Jun 03 20:25:02 IST 2021'),('Find Item','Thu Jun 03 20:25:33 IST 2021'),('Report','Thu Jun 03 20:25:49 IST 2021'),('Report','Thu Jun 03 20:25:57 IST 2021'),('Report','Thu Jun 03 20:26:36 IST 2021'),('Borrow','Thu Jun 03 20:28:52 IST 2021'),('Return','Thu Jun 03 20:28:58 IST 2021'),('Report','Thu Jun 03 20:29:57 IST 2021'),('Report','Thu Jun 03 20:30:06 IST 2021'),('Borrow','Thu Jun 03 20:31:11 IST 2021'),('Report','Thu Jun 03 20:34:11 IST 2021'),('Report','Thu Jun 03 20:34:22 IST 2021'),('Report','Thu Jun 03 20:35:26 IST 2021'),('Report','Thu Jun 03 20:41:33 IST 2021'),('Report','Thu Jun 03 20:45:29 IST 2021'),('Find Member','Thu Jun 03 20:45:31 IST 2021'),('Add Member','Thu Jun 03 20:45:47 IST 2021'),('Report','Thu Jun 03 20:46:34 IST 2021'),('Find Member','Thu Jun 03 20:46:36 IST 2021'),('Add Item','Thu Jun 03 20:51:36 IST 2021'),('Add Item','Thu Jun 03 20:52:28 IST 2021'),('Financial Report','Thu Jun 03 21:00:05 IST 2021'),('Report','Thu Jun 03 21:00:16 IST 2021'),('Inventory Report','Thu Jun 03 21:00:26 IST 2021');
/*!40000 ALTER TABLE `tlog` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-08-03 20:34:56
