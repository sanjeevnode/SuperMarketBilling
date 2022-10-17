-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: localhost    Database: supermarketbilling
-- ------------------------------------------------------
-- Server version	8.0.29

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `categorytable`
--

DROP TABLE IF EXISTS `categorytable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `categorytable` (
  `CategoryID` int NOT NULL,
  `CategoryName` varchar(45) NOT NULL,
  `Description` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`CategoryID`),
  UNIQUE KEY `CategoryID_UNIQUE` (`CategoryID`),
  UNIQUE KEY `CategoryName_UNIQUE` (`CategoryName`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categorytable`
--

LOCK TABLES `categorytable` WRITE;
/*!40000 ALTER TABLE `categorytable` DISABLE KEYS */;
INSERT INTO `categorytable` VALUES (1,'Bathing','Suitable for your skin'),(2,'snacks','yummy '),(3,'meat','good meat');
/*!40000 ALTER TABLE `categorytable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `producttable`
--

DROP TABLE IF EXISTS `producttable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `producttable` (
  `ProductId` int NOT NULL,
  `ProductName` varchar(45) NOT NULL,
  `Quantity` int NOT NULL,
  `Price` double NOT NULL,
  `Category` varchar(45) NOT NULL,
  PRIMARY KEY (`ProductId`),
  UNIQUE KEY `ProductId_UNIQUE` (`ProductId`),
  UNIQUE KEY `ProductName_UNIQUE` (`ProductName`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `producttable`
--

LOCK TABLES `producttable` WRITE;
/*!40000 ALTER TABLE `producttable` DISABLE KEYS */;
INSERT INTO `producttable` VALUES (100,'Shampoo',999,150,'Bathing'),(101,'soap',998,30,'Bathing'),(102,'conditioner',991,120,'Bathing'),(103,'Biscuit',1000,25,'snacks'),(104,'Chips',998,10,'snacks'),(105,'Cold Drinks',996,20,'snacks'),(106,'Chicken',999,240,'meat'),(107,'Goat meat',998,450,'meat');
/*!40000 ALTER TABLE `producttable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `salestable`
--

DROP TABLE IF EXISTS `salestable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `salestable` (
  `SNO` int NOT NULL AUTO_INCREMENT,
  `SellerName` varchar(45) DEFAULT NULL,
  `CustomerName` varchar(45) DEFAULT NULL,
  `CustomerPhone` varchar(45) DEFAULT NULL,
  `PurchaseAmount` double DEFAULT NULL,
  PRIMARY KEY (`SNO`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `salestable`
--

LOCK TABLES `salestable` WRITE;
/*!40000 ALTER TABLE `salestable` DISABLE KEYS */;
INSERT INTO `salestable` VALUES (1,'jhon@123','sanjeev','3241568790',590),(2,'jhon@123','vijay','9087654321',940),(3,'kelly@91','sunny','9087654321',280),(4,'jhon@123','sanku','781234560',360);
/*!40000 ALTER TABLE `salestable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sellertable`
--

DROP TABLE IF EXISTS `sellertable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sellertable` (
  `SellerID` int NOT NULL,
  `Username` varchar(45) NOT NULL,
  `Name` varchar(45) NOT NULL,
  `Password` varchar(45) NOT NULL,
  `Gender` varchar(45) NOT NULL,
  `Phone` varchar(45) NOT NULL,
  PRIMARY KEY (`SellerID`),
  UNIQUE KEY `SellerID_UNIQUE` (`SellerID`),
  UNIQUE KEY `Username_UNIQUE` (`Username`),
  UNIQUE KEY `Phone_UNIQUE` (`Phone`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sellertable`
--

LOCK TABLES `sellertable` WRITE;
/*!40000 ALTER TABLE `sellertable` DISABLE KEYS */;
INSERT INTO `sellertable` VALUES (1,'jhon@123','jhon','1234','male','9876543210'),(2,'kelly@91','kelly','1234','Female','9087651234');
/*!40000 ALTER TABLE `sellertable` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-10-18  1:25:19
