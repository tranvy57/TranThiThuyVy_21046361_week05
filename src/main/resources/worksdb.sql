/*M!999999\- enable the sandbox mode */ 
-- MariaDB dump 10.19-11.5.2-MariaDB, for Win64 (AMD64)
--
-- Host: 127.0.0.1    Database: works
-- ------------------------------------------------------
-- Server version	11.5.2-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*M!100616 SET @OLD_NOTE_VERBOSITY=@@NOTE_VERBOSITY, NOTE_VERBOSITY=0 */;

--
-- Table structure for table `address`
--

DROP TABLE IF EXISTS `address`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `address` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `city` varchar(50) DEFAULT NULL,
  `country` smallint(6) DEFAULT NULL CHECK (`country` between 0 and 271),
  `number` varchar(20) DEFAULT NULL,
  `street` varchar(150) DEFAULT NULL,
  `zipcode` varchar(7) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=103 DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `address`
--

LOCK TABLES `address` WRITE;
/*!40000 ALTER TABLE `address` DISABLE KEYS */;
INSERT INTO `address` VALUES
(1,'East Beulahchester',258,'474','Luis Burgs','56705'),
(2,'Langoshside',258,'5556','Dan Lodge','63684'),
(3,'McCulloughshire',258,'0371','Olson Drive','83408'),
(4,'Lake Chu',258,'9639','Damon Walks','95238'),
(5,'New Michale',258,'275','Dusti Branch','56143'),
(6,'Rogahnborough',258,'777','Ailene Knoll','97187'),
(7,'Ivoryfort',258,'1556','Weissnat Manor','43523'),
(8,'Mooreborough',258,'846','Jutta Views','30977'),
(9,'Claudview',258,'839','Considine Point','72757'),
(10,'North Corliss',258,'95336','Randy Stravenue','48939'),
(11,'Go Vap',NULL,'12','12 NVB','123456'),
(22,'Gutmannmouth',258,'181','Huel Turnpike','52106'),
(23,'Deweymouth',258,'45717','Hansen Lights','65373'),
(24,'Deannshire',258,'33185','Mitchell Villages','04189'),
(25,'New Robinfurt',258,'9007','Harley Stream','75613'),
(26,'Port Perla',258,'07671','Stiedemann Islands','95331'),
(27,'Quincyhaven',258,'213','Cristal Pike','20348'),
(28,'West Valencia',258,'7450','Gerhold Drives','70435'),
(29,'Bryanchester',258,'25249','Lesch Alley','17074'),
(30,'South Kenny',258,'51429','Quincy Pine','68976'),
(31,'East Luketown',258,'29259','Breitenberg Square','04292'),
(32,'Port Aleida',258,'3094','Van Mission','51327'),
(33,'South Louieberg',258,'3486','Antony Brook','06760'),
(34,'Lake Brant',258,'624','Al Station','75163'),
(35,'East Eusebioville',258,'392','Mei Stream','88306'),
(36,'Jacelynmouth',258,'90041','Johns Common','79088'),
(37,'Wolfffurt',258,'81995','Larae Mountains','58713'),
(38,'McCulloughton',258,'06807','Zulauf Rapid','42854'),
(39,'Port Mark',258,'888','Collier Rapid','52654'),
(40,'Mitchellshire',258,'6224','Natividad Lodge','16754'),
(41,'East Lyndon',258,'47533','Pfannerstill Springs','59040'),
(42,'Franklinside',258,'6377','Chantal Isle','20134'),
(43,'West Dakota',258,'595','Prosacco Rapids','02679'),
(44,'Croninshire',258,'4484','Funk Cove','91622'),
(45,'South Chaunceybury',258,'51568','Chauncey Brooks','61831'),
(46,'West Chaunceyhaven',258,'637','Hilario Brook','42492'),
(47,'Lake Austin',258,'1813','Rod Village','90829'),
(48,'Blainefurt',258,'06669','Angel Shoals','22774'),
(49,'O\'Konstad',258,'2260','Siu Junction','65155'),
(50,'O\'Keefeside',258,'585','Schroeder Fall','27143'),
(51,'Mayraview',258,'421','Raynor Centers','25635'),
(52,'Lake Oswaldofort',258,'3496','Goodwin Divide','22156'),
(53,'Julioburgh',258,'0431','Francesco Greens','33237'),
(54,'West Vicente',258,'8712','Raynor Branch','32795'),
(55,'Gorczanyport',258,'915','Terry Court','71755'),
(56,'South Lois',258,'01026','Smith Inlet','08355'),
(57,'Quigleyside',258,'52461','Ty Lane','92845'),
(58,'West Tawana',258,'2847','Pfeffer Junction','43312'),
(59,'North Josephine',258,'169','Vandervort Camp','07286'),
(60,'Lavadaberg',258,'32344','Verlie Park','08880'),
(61,'Rhondaton',258,'438','Ruthe Cove','04502'),
(62,'New Whitneybury',258,'268','Gibson Oval','44404'),
(63,'Effiemouth',258,'02997','Ben Well','93834'),
(64,'South Bretthaven',258,'202','Dominga Streets','98166'),
(65,'South Sarifort',258,'929','Karl Locks','76533'),
(66,'Elvinport',258,'66891','Cleopatra Mountain','13141'),
(67,'Paulettetown',258,'19897','Eleonor Rest','09308'),
(68,'Bennyside',258,'343','Faustino Mission','29740'),
(69,'North Herminiabury',258,'8335','Huel Hills','23843'),
(70,'New Mitchel',258,'307','Predovic Mews','36194'),
(71,'Lake Deloras',258,'02420','Jessie Tunnel','76612'),
(72,'West Lucindaberg',258,'09368','Mills Haven','38885'),
(73,'Fatimahland',258,'7666','Smitham Tunnel','00397'),
(74,'Farrellchester',258,'8396','Mckinley Course','48998'),
(75,'Yurifurt',258,'33076','Parisian Loaf','28860'),
(76,'East Cornellland',258,'80818','Li Gardens','92180'),
(77,'West Walterstad',258,'11463','Hyatt Forges','27054'),
(78,'West Shira',258,'512','Joana Mountains','91255'),
(79,'North Man',258,'150','Gutmann Passage','14984'),
(80,'Simonisfurt',258,'837','Christinia Bypass','26535'),
(81,'Gailfort',258,'75834','Prohaska Mall','01410'),
(82,'Lake Robena',258,'069','Hagenes Meadows','46772'),
(83,'Melaniefort',258,'62704','Anderson Trail','62345'),
(84,'New Karinafurt',258,'7627','Blick Path','32926'),
(85,'Christiton',258,'98094','MacGyver Street','78554'),
(86,'Rudolfville',258,'5260','Zieme Bypass','38542'),
(87,'Lake Marion',258,'5411','Mertz Brook','53309'),
(88,'North Pat',258,'047','Elisha Loaf','10153'),
(89,'East Yahaira',258,'2754','Mindi Valleys','75826'),
(90,'Ullrichberg',258,'79457','Yun Brooks','35261'),
(91,'Port Mackview',258,'736','Reichert Creek','61613'),
(92,'New Verniatown',258,'38475','Joseph Oval','65166'),
(93,'Kentborough',258,'999','Sean Glens','01720'),
(94,'Emmerichburgh',258,'601','Carey Port','20484'),
(95,'Gleasontown',258,'3490','Jewell Parkway','96643'),
(96,'Port Orlandostad',258,'8397','Walker Loaf','71909'),
(97,'Kleinstad',258,'26821','O\'Keefe Prairie','87017'),
(98,'Dustyville',258,'85983','Farrell Lakes','15467'),
(99,'South Shaynemouth',258,'677','Haley Well','19285'),
(100,'West Emery',258,'311','Mann Streets','35361'),
(101,'Tillmanport',258,'482','Linnea Falls','78549'),
(102,'Ho Chi Minh',NULL,'100','12 Nguyen Van Bao','123456');
/*!40000 ALTER TABLE `address` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `candidate`
--

DROP TABLE IF EXISTS `candidate`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `candidate` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `dob` date NOT NULL,
  `email` varchar(255) NOT NULL,
  `full_name` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `phone` varchar(15) NOT NULL,
  `role` enum('CANDIDATE','COMPANY') DEFAULT NULL,
  `address` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UKm8qhlm4wu215gr34dhxp0dour` (`address`),
  CONSTRAINT `FKa8gnyyhbb2qnhp94grci1n0o9` FOREIGN KEY (`address`) REFERENCES `address` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=93 DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `candidate`
--

LOCK TABLES `candidate` WRITE;
/*!40000 ALTER TABLE `candidate` DISABLE KEYS */;
INSERT INTO `candidate` VALUES
(1,'2024-12-04','tranvy.art@gmail.com','Thuy Vy','$2a$10$5O0rsMjIuLzfzxjyPX/PZO7GlThZf9SjoSrR.StqOSHAKLq5UbdAO','123456666','CANDIDATE',11),
(82,'2004-11-30','lanie.schmitt@gmail.com','Tammera Durgan','$2a$10$6o9DyIo1SASu10OcHd6zE.AAmlkw1tbh0ajJzLEU42QE9YbRTSyIO','1-229-724-2281','CANDIDATE',92),
(83,'2006-07-08','nicolas.osinski@gmail.com','Jess Conroy DDS','$2a$10$tXldkW4xCulSfYCjcz01rOyysLv3/3lMMU49oz9TYBnFVSn.g/v3.','(409) 470-8464','CANDIDATE',93),
(84,'1989-05-22','parker.schuppe@gmail.com','Sanda Jast','$2a$10$BEE.UtYGNrniSmOddDbyI.DNs4a9vlPdRolBcBqelFdGouotPHlhO','(602) 321-2271','CANDIDATE',94),
(85,'1993-09-02','francisco.schuster@yahoo.com','Trisha Braun','$2a$10$.i9TPdQOFJX5A5i/5N6z5eQhw33krrw/YcXgWi2dNaHTmYmLgXJye','212-276-2018','CANDIDATE',95),
(86,'1971-11-02','clelia.greenholt@hotmail.com','Lilian O\'Kon DVM','$2a$10$uEsahOf85bQVaTbvJEdJM.1iingOxvZe9CYVyTiCm8FEbRJk06WoC','857-551-4386','CANDIDATE',96),
(87,'1979-09-03','booker.bashirian@gmail.com','Bernie Boyer','$2a$10$sxaWRO.v.GZgwqqxDpwGPeLDvgtWwLgMo/tDi9Z16nG71Lwjtd4EK','702.516.4269','CANDIDATE',97),
(88,'1959-12-31','ervin.sawayn@gmail.com','Doloris Bahringer MD','$2a$10$TYWUEUUaOcliBOTf0YVseeRL3de7Il1CL3F7S3FThY.nRkLMzTRk2','207-559-4264','CANDIDATE',98),
(89,'1987-04-09','werner.kovacek@yahoo.com','Mrs. Shena O\'Hara','$2a$10$qaR7NzrsLL0NZzrPHpJWke4duvEpJEfRiCRUE.TC4iVnZeB/kmrCe','660.906.3979','CANDIDATE',99),
(90,'1976-01-04','aldo.douglas@yahoo.com','Werner McGlynn','$2a$10$DHg/ifXAoyY2dHplt9x2jOB/EQaEsvsAOFmLYNk.F6QSr5CSC/Pza','1-956-703-3185','CANDIDATE',100),
(91,'1971-05-07','maricela.mohr@gmail.com','Chi Lind','$2a$10$raK2cekwxhHlu10xDZsqi.NaPztIzphbwDzzVG446wmbY7J./9Da2','(770) 307-4321','CANDIDATE',101),
(92,'2024-12-13','vy@gmail.com','Tran Thi Thuy Vy','$2a$10$Sf.Abv38iuYHIzKy/zMYxuqPI3R6/yPoSTk3JuePdQ7uVjHPNS9OW','0962527550','CANDIDATE',102);
/*!40000 ALTER TABLE `candidate` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `candidate_skill`
--

DROP TABLE IF EXISTS `candidate_skill`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `candidate_skill` (
  `more_infos` varchar(1000) DEFAULT NULL,
  `skill_level` tinyint(4) DEFAULT NULL CHECK (`skill_level` between 0 and 4),
  `skill_id` bigint(20) NOT NULL,
  `can_id` bigint(20) NOT NULL,
  PRIMARY KEY (`can_id`,`skill_id`),
  KEY `FKb7cxhiqhcah7c20a2cdlvr1f8` (`skill_id`),
  CONSTRAINT `FKb0m5tm3fi0upa3b3kjx3vrlxs` FOREIGN KEY (`can_id`) REFERENCES `candidate` (`id`),
  CONSTRAINT `FKb7cxhiqhcah7c20a2cdlvr1f8` FOREIGN KEY (`skill_id`) REFERENCES `skill` (`skill_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `candidate_skill`
--

LOCK TABLES `candidate_skill` WRITE;
/*!40000 ALTER TABLE `candidate_skill` DISABLE KEYS */;
INSERT INTO `candidate_skill` VALUES
('cak',0,1,1),
('jjjj',0,3,1),
('',0,5,1),
('',2,7,1),
('Networking skills',3,10,82),
('Networking skills',3,13,82),
('Work under pressure',3,16,82),
('Technical savvy',3,15,83),
('Fast learner',3,26,83),
('Problem solving',3,28,83),
('Organisation',3,5,84),
('Technical savvy',3,23,84),
('Technical savvy',3,26,84),
('Work under pressure',3,5,85),
('Communication',3,7,85),
('Work under pressure',3,10,85),
('Organisation',3,3,86),
('Problem solving',3,18,86),
('Proactive',3,26,86),
('Leadership',3,16,87),
('Fast learner',3,17,87),
('Fast learner',3,19,87),
('Work under pressure',3,9,88),
('Problem solving',3,17,88),
('Organisation',3,18,88),
('Technical savvy',3,3,89),
('Leadership',3,12,89),
('Teamwork',3,28,89),
('Fast learner',3,13,90),
('Proactive',3,17,90),
('Networking skills',3,14,91),
('Organisation',3,27,91),
('Self-motivated',3,28,91),
('',1,2,92),
('',2,8,92);
/*!40000 ALTER TABLE `candidate_skill` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `company`
--

DROP TABLE IF EXISTS `company`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `company` (
  `comp_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `about` varchar(2000) DEFAULT NULL,
  `comp_name` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `phone` varchar(255) NOT NULL,
  `role` enum('CANDIDATE','COMPANY') DEFAULT NULL,
  `web_url` varchar(255) DEFAULT NULL,
  `address` bigint(20) NOT NULL,
  PRIMARY KEY (`comp_id`),
  UNIQUE KEY `UKrvp2hunsq4sgmpxe3a7i1ym3m` (`address`),
  CONSTRAINT `FKd5occp4cjwihejbxdbpvkp5tv` FOREIGN KEY (`address`) REFERENCES `address` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `company`
--

LOCK TABLES `company` WRITE;
/*!40000 ALTER TABLE `company` DISABLE KEYS */;
INSERT INTO `company` VALUES
(1,'Biotechnology','Beer, Hill and Hessel','leoma.rohan@hotmail.com','$2a$10$Lj4zZ9t/HusAkmnbMi0UJuKGDq2z1YeZk5DP8UDX/PpuOV1ViqJ6G','1-541-712-9384','COMPANY','http://www.grant-daugherty.co/itaque/molestiae?quisquam=adipisci&autem=quia#ex',1),
(2,'Glass, Ceramics & Concrete','Cormier-Thompson','marcos.bartell@gmail.com','$2a$10$ndD2jYzf8qwNxPVWzIFbT.S9Zr47QWn3CfZCXp07Eg28qb2s2/MJO','(260) 843-6919','COMPANY','https://www.elvin-corkery.biz:43453/numquam',2),
(3,'Civic & Social Organization','Kihn and Sons','keiko.tremblay@gmail.com','$2a$10$PjLIzfPlQCi0CIZPlap7XeDeSBcmqZ7MDWg9pb2mxATBBPr5LpwUC','1-917-508-4731','COMPANY','https://www.lane-harris.net/consectetur?officiis=quibusdam&aspernatur=asperiores',3),
(4,'Fund-Raising','Huels-Conn','naomi.bashirian@yahoo.com','$2a$10$rk96Dq2honcqXgk0548cHOefbXVk8tU73b7ZebqkkWbND0AwZVbuS','516.445.6810','COMPANY','https://www.gay-watsica.com:15692/?dolore=consequuntur&quibusdam=neque#ab',4),
(5,'Think Tanks','Considine-Kirlin','hobert.cronin@gmail.com','$2a$10$5HpaOcG558md5Lz0qgAcX.0jwU2ak6A8eeasQob2dV.ixBQrNlXRe','989.662.4052','COMPANY','https://www.damon-herman.io:26799/magnam?quidem=exercitationem&incidunt=nobis',5),
(6,'E-Learning','Block, Hudson and Funk','alonzo.feest@hotmail.com','$2a$10$TWjoJFPYgz4CLpnTTXxI4uhzjE1D4rmsrkQT18N45x4QVycSv8gtm','1-320-228-3965','COMPANY','https://www.annmarie-auer.co/explicabo/delectustenetur?consequuntur=mollitia&assumenda=modi',6),
(7,'Import and Export','Dicki Inc','hye.kozey@gmail.com','$2a$10$1pZ5ZaGCReA1YxCiZPCp5.4bpAVLKgjiy84feJZkAU5zq7K.R9wXS','(906) 479-1896','COMPANY','https://www.brandon-reichert.biz/excepturi/quasivoluptatum',7),
(8,'Music','Hauck-Nolan','cher.conroy@yahoo.com','$2a$10$MCjEzbytaAfTcmzUEo9RGOTsK7EvXAkg04ZK6FOYq5X9a5UtSecpu','517.919.5170','COMPANY','https://www.dudley-pfannerstill.com:27040/et/fugiat#soluta',8),
(9,'Farming','Wilderman-McCullough','corene.donnelly@gmail.com','$2a$10$rM2O/irWJGeLoMlqkatA0OrnMKAZRBTw6q19630L8Lk5bZ0.A0VCK','(410) 435-0944','COMPANY','https://www.wade-nienow.net:24814/facere/atquedicta?perspiciatis=qui&qui=error',9),
(10,'Retail','Simonis Inc','brenton.fay@gmail.com','$2a$10$0AwwPezMVqIu.07VZCy0KuvWgSIT68LHT9aZZergcM75I9Xq6Klpq','612-269-7720','COMPANY','https://www.man-braun.biz:13440/#fuga',10);
/*!40000 ALTER TABLE `company` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `experience`
--

DROP TABLE IF EXISTS `experience`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `experience` (
  `exp_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `company` varchar(120) NOT NULL,
  `from_date` date NOT NULL,
  `role` varchar(100) NOT NULL,
  `to_date` date NOT NULL,
  `work_desc` varchar(400) DEFAULT NULL,
  `can_id` bigint(20) NOT NULL,
  PRIMARY KEY (`exp_id`),
  KEY `FK8d5oqe0wxh52v352i04qnuady` (`can_id`),
  CONSTRAINT `FK8d5oqe0wxh52v352i04qnuady` FOREIGN KEY (`can_id`) REFERENCES `candidate` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `experience`
--

LOCK TABLES `experience` WRITE;
/*!40000 ALTER TABLE `experience` DISABLE KEYS */;
INSERT INTO `experience` VALUES
(9,'Mante','2024-12-18','Developer','2024-12-29','Hon 1 nam kinh nghiem',1),
(10,'Cong ty ABC','2024-12-03','Tester','2024-12-13','Test',1);
/*!40000 ALTER TABLE `experience` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `job`
--

DROP TABLE IF EXISTS `job`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `job` (
  `job_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `created_date` datetime(6) DEFAULT NULL,
  `expired_date` datetime(6) DEFAULT NULL,
  `job_desc` varchar(2000) NOT NULL,
  `job_name` varchar(255) DEFAULT NULL,
  `company` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`job_id`),
  KEY `FKbaqlvluu78phmo9ld89um7wnm` (`company`),
  CONSTRAINT `FKbaqlvluu78phmo9ld89um7wnm` FOREIGN KEY (`company`) REFERENCES `company` (`comp_id`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `job`
--

LOCK TABLES `job` WRITE;
/*!40000 ALTER TABLE `job` DISABLE KEYS */;
INSERT INTO `job` VALUES
(1,'2024-12-08 19:38:51.375500','2025-01-07 19:38:51.372508',' We are seeking a highly motivated and skilled Software Developer to join our growing development team. The ideal candidate will have a strong background in software development and a passion for building innovative and efficient solutions. As a Software Developer, you will collaborate with cross-functional teams to design, develop, test, and maintain software applications that meet the needs of our clients.','Developer',1),
(2,'2024-12-08 19:38:51.451944','2025-01-07 19:38:51.450946',' We are seeking a highly motivated and skilled Software Developer to join our growing development team. The ideal candidate will have a strong background in software development and a passion for building innovative and efficient solutions. As a Software Developer, you will collaborate with cross-functional teams to design, develop, test, and maintain software applications that meet the needs of our clients.','Designer',1),
(3,'2024-12-08 19:38:51.481483','2025-01-07 19:38:51.481483',' We are seeking a highly motivated and skilled Software Developer to join our growing development team. The ideal candidate will have a strong background in software development and a passion for building innovative and efficient solutions. As a Software Developer, you will collaborate with cross-functional teams to design, develop, test, and maintain software applications that meet the needs of our clients.','Developer',1),
(4,'2024-12-08 19:38:51.624392','2025-01-07 19:38:51.623348',' We are seeking a highly motivated and skilled Software Developer to join our growing development team. The ideal candidate will have a strong background in software development and a passion for building innovative and efficient solutions. As a Software Developer, you will collaborate with cross-functional teams to design, develop, test, and maintain software applications that meet the needs of our clients.','Coordinator',2),
(5,'2024-12-08 19:38:51.652328','2025-01-07 19:38:51.652328',' We are seeking a highly motivated and skilled Software Developer to join our growing development team. The ideal candidate will have a strong background in software development and a passion for building innovative and efficient solutions. As a Software Developer, you will collaborate with cross-functional teams to design, develop, test, and maintain software applications that meet the needs of our clients.','Consultant',2),
(6,'2024-12-08 19:38:51.679420','2025-01-07 19:38:51.678379',' We are seeking a highly motivated and skilled Software Developer to join our growing development team. The ideal candidate will have a strong background in software development and a passion for building innovative and efficient solutions. As a Software Developer, you will collaborate with cross-functional teams to design, develop, test, and maintain software applications that meet the needs of our clients.','Designer',2),
(7,'2024-12-08 19:38:51.813239','2025-01-07 19:38:51.813239',' We are seeking a highly motivated and skilled Software Developer to join our growing development team. The ideal candidate will have a strong background in software development and a passion for building innovative and efficient solutions. As a Software Developer, you will collaborate with cross-functional teams to design, develop, test, and maintain software applications that meet the needs of our clients.','Strategist',3),
(8,'2024-12-08 19:38:51.835220','2025-01-07 19:38:51.834943',' We are seeking a highly motivated and skilled Software Developer to join our growing development team. The ideal candidate will have a strong background in software development and a passion for building innovative and efficient solutions. As a Software Developer, you will collaborate with cross-functional teams to design, develop, test, and maintain software applications that meet the needs of our clients.','Producer',3),
(9,'2024-12-08 19:38:51.858811','2025-01-07 19:38:51.857905',' We are seeking a highly motivated and skilled Software Developer to join our growing development team. The ideal candidate will have a strong background in software development and a passion for building innovative and efficient solutions. As a Software Developer, you will collaborate with cross-functional teams to design, develop, test, and maintain software applications that meet the needs of our clients.','Agent',3),
(10,'2024-12-08 19:38:51.979786','2025-01-07 19:38:51.979786',' We are seeking a highly motivated and skilled Software Developer to join our growing development team. The ideal candidate will have a strong background in software development and a passion for building innovative and efficient solutions. As a Software Developer, you will collaborate with cross-functional teams to design, develop, test, and maintain software applications that meet the needs of our clients.','Associate',4),
(11,'2024-12-08 19:38:52.002215','2025-01-07 19:38:52.001297',' We are seeking a highly motivated and skilled Software Developer to join our growing development team. The ideal candidate will have a strong background in software development and a passion for building innovative and efficient solutions. As a Software Developer, you will collaborate with cross-functional teams to design, develop, test, and maintain software applications that meet the needs of our clients.','Engineer',4),
(12,'2024-12-08 19:38:52.023501','2025-01-07 19:38:52.022465',' We are seeking a highly motivated and skilled Software Developer to join our growing development team. The ideal candidate will have a strong background in software development and a passion for building innovative and efficient solutions. As a Software Developer, you will collaborate with cross-functional teams to design, develop, test, and maintain software applications that meet the needs of our clients.','Liaison',4),
(13,'2024-12-08 19:38:52.164778','2025-01-07 19:38:52.163778',' We are seeking a highly motivated and skilled Software Developer to join our growing development team. The ideal candidate will have a strong background in software development and a passion for building innovative and efficient solutions. As a Software Developer, you will collaborate with cross-functional teams to design, develop, test, and maintain software applications that meet the needs of our clients.','Supervisor',5),
(14,'2024-12-08 19:38:52.188196','2025-01-07 19:38:52.188196',' We are seeking a highly motivated and skilled Software Developer to join our growing development team. The ideal candidate will have a strong background in software development and a passion for building innovative and efficient solutions. As a Software Developer, you will collaborate with cross-functional teams to design, develop, test, and maintain software applications that meet the needs of our clients.','Supervisor',5),
(15,'2024-12-08 19:38:52.209757','2025-01-07 19:38:52.208755',' We are seeking a highly motivated and skilled Software Developer to join our growing development team. The ideal candidate will have a strong background in software development and a passion for building innovative and efficient solutions. As a Software Developer, you will collaborate with cross-functional teams to design, develop, test, and maintain software applications that meet the needs of our clients.','Facilitator',5),
(16,'2024-12-08 19:38:52.335084','2025-01-07 19:38:52.334085',' We are seeking a highly motivated and skilled Software Developer to join our growing development team. The ideal candidate will have a strong background in software development and a passion for building innovative and efficient solutions. As a Software Developer, you will collaborate with cross-functional teams to design, develop, test, and maintain software applications that meet the needs of our clients.','Facilitator',6),
(17,'2024-12-08 19:38:52.354860','2025-01-07 19:38:52.353840',' We are seeking a highly motivated and skilled Software Developer to join our growing development team. The ideal candidate will have a strong background in software development and a passion for building innovative and efficient solutions. As a Software Developer, you will collaborate with cross-functional teams to design, develop, test, and maintain software applications that meet the needs of our clients.','Facilitator',6),
(18,'2024-12-08 19:38:52.388683','2025-01-07 19:38:52.385619',' We are seeking a highly motivated and skilled Software Developer to join our growing development team. The ideal candidate will have a strong background in software development and a passion for building innovative and efficient solutions. As a Software Developer, you will collaborate with cross-functional teams to design, develop, test, and maintain software applications that meet the needs of our clients.','Developer',6),
(19,'2024-12-08 19:38:52.582360','2025-01-07 19:38:52.582360',' We are seeking a highly motivated and skilled Software Developer to join our growing development team. The ideal candidate will have a strong background in software development and a passion for building innovative and efficient solutions. As a Software Developer, you will collaborate with cross-functional teams to design, develop, test, and maintain software applications that meet the needs of our clients.','Technician',7),
(20,'2024-12-08 19:38:52.615432','2025-01-07 19:38:52.615432',' We are seeking a highly motivated and skilled Software Developer to join our growing development team. The ideal candidate will have a strong background in software development and a passion for building innovative and efficient solutions. As a Software Developer, you will collaborate with cross-functional teams to design, develop, test, and maintain software applications that meet the needs of our clients.','Associate',7),
(21,'2024-12-08 19:38:52.633429','2025-01-07 19:38:52.633429',' We are seeking a highly motivated and skilled Software Developer to join our growing development team. The ideal candidate will have a strong background in software development and a passion for building innovative and efficient solutions. As a Software Developer, you will collaborate with cross-functional teams to design, develop, test, and maintain software applications that meet the needs of our clients.','Engineer',7),
(22,'2024-12-08 19:38:52.764167','2025-01-07 19:38:52.763576',' We are seeking a highly motivated and skilled Software Developer to join our growing development team. The ideal candidate will have a strong background in software development and a passion for building innovative and efficient solutions. As a Software Developer, you will collaborate with cross-functional teams to design, develop, test, and maintain software applications that meet the needs of our clients.','Officer',8),
(23,'2024-12-08 19:38:52.786017','2025-01-07 19:38:52.784539',' We are seeking a highly motivated and skilled Software Developer to join our growing development team. The ideal candidate will have a strong background in software development and a passion for building innovative and efficient solutions. As a Software Developer, you will collaborate with cross-functional teams to design, develop, test, and maintain software applications that meet the needs of our clients.','Liaison',8),
(24,'2024-12-08 19:38:52.814021','2025-01-07 19:38:52.813001',' We are seeking a highly motivated and skilled Software Developer to join our growing development team. The ideal candidate will have a strong background in software development and a passion for building innovative and efficient solutions. As a Software Developer, you will collaborate with cross-functional teams to design, develop, test, and maintain software applications that meet the needs of our clients.','Liaison',8),
(25,'2024-12-08 19:38:52.963852','2025-01-07 19:38:52.962986',' We are seeking a highly motivated and skilled Software Developer to join our growing development team. The ideal candidate will have a strong background in software development and a passion for building innovative and efficient solutions. As a Software Developer, you will collaborate with cross-functional teams to design, develop, test, and maintain software applications that meet the needs of our clients.','Specialist',9),
(26,'2024-12-08 19:38:52.979338','2025-01-07 19:38:52.979338',' We are seeking a highly motivated and skilled Software Developer to join our growing development team. The ideal candidate will have a strong background in software development and a passion for building innovative and efficient solutions. As a Software Developer, you will collaborate with cross-functional teams to design, develop, test, and maintain software applications that meet the needs of our clients.','Manager',9),
(27,'2024-12-08 19:38:52.994459','2025-01-07 19:38:52.993495',' We are seeking a highly motivated and skilled Software Developer to join our growing development team. The ideal candidate will have a strong background in software development and a passion for building innovative and efficient solutions. As a Software Developer, you will collaborate with cross-functional teams to design, develop, test, and maintain software applications that meet the needs of our clients.','Coordinator',9),
(28,'2024-12-08 19:38:53.107157','2025-01-07 19:38:53.105875',' We are seeking a highly motivated and skilled Software Developer to join our growing development team. The ideal candidate will have a strong background in software development and a passion for building innovative and efficient solutions. As a Software Developer, you will collaborate with cross-functional teams to design, develop, test, and maintain software applications that meet the needs of our clients.','Strategist',10),
(29,'2024-12-08 19:38:53.125855','2025-01-07 19:38:53.124854',' We are seeking a highly motivated and skilled Software Developer to join our growing development team. The ideal candidate will have a strong background in software development and a passion for building innovative and efficient solutions. As a Software Developer, you will collaborate with cross-functional teams to design, develop, test, and maintain software applications that meet the needs of our clients.','Specialist',10),
(30,'2024-12-08 19:38:53.141854','2025-01-07 19:38:53.141854',' We are seeking a highly motivated and skilled Software Developer to join our growing development team. The ideal candidate will have a strong background in software development and a passion for building innovative and efficient solutions. As a Software Developer, you will collaborate with cross-functional teams to design, develop, test, and maintain software applications that meet the needs of our clients.','Designer',10),
(31,'2024-12-14 05:16:35.498598','2024-12-05 16:16:00.000000',' We are seeking a highly motivated and skilled Software Developer to join our growing development team. The ideal candidate will have a strong background in software development and a passion for building innovative and efficient solutions. As a Software Developer, you will collaborate with cross-functional teams to design, develop, test, and maintain software applications that meet the needs of our clients.','Developver',1);
/*!40000 ALTER TABLE `job` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `job_skill`
--

DROP TABLE IF EXISTS `job_skill`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `job_skill` (
  `more_infos` varchar(1000) DEFAULT NULL,
  `skill_level` tinyint(4) DEFAULT NULL CHECK (`skill_level` between 0 and 4),
  `job_id` bigint(20) NOT NULL,
  `skill_id` bigint(20) NOT NULL,
  PRIMARY KEY (`job_id`,`skill_id`),
  KEY `FKj33qbbf3vk1lvhqpcosnh54u1` (`skill_id`),
  CONSTRAINT `FK9ix4wg520ii2gu2felxdhdup6` FOREIGN KEY (`job_id`) REFERENCES `job` (`job_id`),
  CONSTRAINT `FKj33qbbf3vk1lvhqpcosnh54u1` FOREIGN KEY (`skill_id`) REFERENCES `skill` (`skill_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `job_skill`
--

LOCK TABLES `job_skill` WRITE;
/*!40000 ALTER TABLE `job_skill` DISABLE KEYS */;
INSERT INTO `job_skill` VALUES
('Communication',3,1,1),
('Confidence',3,1,2),
('Technical savvy',3,1,3),
('Proactive',3,2,4),
('Fast learner',3,2,5),
('Work under pressure',3,2,6),
('Communication',3,3,7),
('Communication',3,3,8),
('Proactive',3,3,9),
('Leadership',3,4,1),
('Teamwork',3,4,11),
('Proactive',3,4,12),
('Proactive',3,5,10),
('Organisation',3,5,14),
('Communication',3,5,15),
('Communication',3,6,16),
('Technical savvy',3,6,17),
('Self-motivated',3,6,18),
('Work under pressure',3,7,19),
('Technical savvy',3,7,20),
('Networking skills',3,7,21),
('Fast learner',3,8,22),
('Confidence',3,8,23),
('Teamwork',3,8,24),
('Leadership',3,9,25),
('Networking skills',3,9,26),
('Leadership',3,9,27),
('Confidence',3,10,28),
('Teamwork',3,10,29),
('Proactive',3,10,30),
('Teamwork',3,11,31),
('Leadership',3,11,32),
('Technical savvy',3,11,33),
('Proactive',3,12,34),
('Networking skills',3,12,35),
('Self-motivated',3,12,36),
('Problem solving',3,13,37),
('Teamwork',3,13,38),
('Technical savvy',3,13,39),
('Problem solving',3,14,40),
('Self-motivated',3,14,41),
('Leadership',3,14,42),
('Self-motivated',3,15,43),
('Technical savvy',3,15,44),
('Leadership',3,15,45),
('Teamwork',3,16,46),
('Confidence',3,16,47),
('Networking skills',3,16,48),
('Communication',3,17,49),
('Technical savvy',3,17,50),
('Self-motivated',3,17,51),
('Confidence',3,18,52),
('Fast learner',3,18,53),
('Teamwork',3,18,54),
('Fast learner',3,19,55),
('Leadership',3,19,56),
('Networking skills',3,19,57),
('Technical savvy',3,20,58),
('Networking skills',3,20,59),
('Self-motivated',3,20,60),
('Problem solving',3,21,61),
('Teamwork',3,21,62),
('Work under pressure',3,21,63),
('Proactive',3,22,64),
('Organisation',3,22,65),
('Technical savvy',3,22,66),
('Proactive',3,23,67),
('Confidence',3,23,68),
('Teamwork',3,23,69),
('Proactive',3,24,70),
('Networking skills',3,24,71),
('Technical savvy',3,24,72),
('Fast learner',3,25,73),
('Leadership',3,25,74),
('Fast learner',3,25,75),
('Self-motivated',3,26,76),
('Fast learner',3,26,77),
('Fast learner',3,26,78),
('Organisation',3,27,79),
('Fast learner',3,27,80),
('Work under pressure',3,27,81),
('Organisation',3,28,82),
('Networking skills',3,28,83),
('Teamwork',3,28,84),
('Proactive',3,29,85),
('Teamwork',3,29,86),
('Leadership',3,29,87),
('Networking skills',3,30,88),
('Self-motivated',3,30,89),
('Confidence',3,30,90),
(NULL,4,31,7),
(NULL,2,31,15);
/*!40000 ALTER TABLE `job_skill` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `skill`
--

DROP TABLE IF EXISTS `skill`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `skill` (
  `skill_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `skill_description` varchar(255) DEFAULT NULL,
  `skill_name` varchar(255) DEFAULT NULL,
  `type` tinyint(4) DEFAULT NULL CHECK (`type` between 0 and 2),
  PRIMARY KEY (`skill_id`)
) ENGINE=InnoDB AUTO_INCREMENT=91 DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `skill`
--

LOCK TABLES `skill` WRITE;
/*!40000 ALTER TABLE `skill` DISABLE KEYS */;
INSERT INTO `skill` VALUES
(1,'Work under pressure','Organisation',2),
(2,'Teamwork','Work under pressure',2),
(3,'Proactive','Problem solving',2),
(4,'Work under pressure','Confidence',2),
(5,'Communication','Technical savvy',2),
(6,'Work under pressure','Technical savvy',2),
(7,'Fast learner','Self-motivated',2),
(8,'Problem solving','Work under pressure',2),
(9,'Fast learner','Technical savvy',2),
(10,'Communication','Proactive',2),
(11,'Self-motivated','Problem solving',2),
(12,'Self-motivated','Technical savvy',2),
(13,'Work under pressure','Self-motivated',2),
(14,'Proactive','Work under pressure',2),
(15,'Proactive','Technical savvy',2),
(16,'Leadership','Networking skills',2),
(17,'Confidence','Work under pressure',2),
(18,'Organisation','Proactive',2),
(19,'Leadership','Work under pressure',2),
(20,'Technical savvy','Fast learner',2),
(21,'Problem solving','Self-motivated',2),
(22,'Self-motivated','Self-motivated',2),
(23,'Proactive','Technical savvy',2),
(24,'Self-motivated','Proactive',2),
(25,'Confidence','Organisation',2),
(26,'Teamwork','Self-motivated',2),
(27,'Problem solving','Organisation',2),
(28,'Fast learner','Communication',2),
(29,'Self-motivated','Self-motivated',2),
(30,'Proactive','Work under pressure',2),
(31,'Leadership','Proactive',2),
(32,'Teamwork','Self-motivated',2),
(33,'Self-motivated','Teamwork',2),
(34,'Confidence','Confidence',2),
(35,'Communication','Communication',2),
(36,'Fast learner','Technical savvy',2),
(37,'Problem solving','Organisation',2),
(38,'Communication','Technical savvy',2),
(39,'Problem solving','Work under pressure',2),
(40,'Problem solving','Work under pressure',2),
(41,'Leadership','Networking skills',2),
(42,'Self-motivated','Leadership',2),
(43,'Organisation','Organisation',2),
(44,'Teamwork','Problem solving',2),
(45,'Networking skills','Problem solving',2),
(46,'Proactive','Networking skills',2),
(47,'Teamwork','Problem solving',2),
(48,'Work under pressure','Fast learner',2),
(49,'Work under pressure','Teamwork',2),
(50,'Technical savvy','Proactive',2),
(51,'Self-motivated','Self-motivated',2),
(52,'Teamwork','Networking skills',2),
(53,'Organisation','Fast learner',2),
(54,'Problem solving','Teamwork',2),
(55,'Work under pressure','Problem solving',2),
(56,'Proactive','Communication',2),
(57,'Teamwork','Fast learner',2),
(58,'Proactive','Self-motivated',2),
(59,'Work under pressure','Problem solving',2),
(60,'Fast learner','Confidence',2),
(61,'Leadership','Teamwork',2),
(62,'Networking skills','Fast learner',2),
(63,'Communication','Communication',2),
(64,'Organisation','Self-motivated',2),
(65,'Self-motivated','Fast learner',2),
(66,'Organisation','Problem solving',2),
(67,'Organisation','Communication',2),
(68,'Confidence','Problem solving',2),
(69,'Networking skills','Problem solving',2),
(70,'Organisation','Proactive',2),
(71,'Work under pressure','Teamwork',2),
(72,'Organisation','Communication',2),
(73,'Leadership','Self-motivated',2),
(74,'Technical savvy','Self-motivated',2),
(75,'Confidence','Problem solving',2),
(76,'Technical savvy','Networking skills',2),
(77,'Work under pressure','Communication',2),
(78,'Teamwork','Technical savvy',2),
(79,'Networking skills','Confidence',2),
(80,'Problem solving','Networking skills',2),
(81,'Work under pressure','Networking skills',2),
(82,'Fast learner','Organisation',2),
(83,'Technical savvy','Fast learner',2),
(84,'Organisation','Technical savvy',2),
(85,'Work under pressure','Fast learner',2),
(86,'Networking skills','Confidence',2),
(87,'Work under pressure','Teamwork',2),
(88,'Problem solving','Self-motivated',2),
(89,'Proactive','Networking skills',2),
(90,'Work under pressure','Work under pressure',2);
/*!40000 ALTER TABLE `skill` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*M!100616 SET NOTE_VERBOSITY=@OLD_NOTE_VERBOSITY */;

-- Dump completed on 2024-12-14 19:17:45
