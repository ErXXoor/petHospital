-- MySQL dump 10.13  Distrib 5.7.17, for macos10.12 (x86_64)
--
-- Host: 127.0.0.1    Database: pethospital
-- ------------------------------------------------------
-- Server version	5.7.21

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `case_entity`
--

DROP TABLE IF EXISTS `case_entity`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `case_entity` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `case_name` varchar(255) DEFAULT NULL,
  `symptom` int(11) DEFAULT NULL,
  `exam` int(11) DEFAULT NULL,
  `result` int(11) DEFAULT NULL,
  `method` int(11) DEFAULT NULL,
  `classification` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=40 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `case_entity`
--

LOCK TABLES `case_entity` WRITE;
/*!40000 ALTER TABLE `case_entity` DISABLE KEYS */;
INSERT INTO `case_entity` VALUES (1,'皮炎',3,8,12,16,'外产科病例'),(2,'蛔虫病',2,7,11,15,'寄生虫病'),(3,'狗癫痫',1,5,9,13,'内科病例'),(4,'外伤',3,6,10,16,'外产科病例'),(5,'绝育',1,7,11,14,'常用手术'),(6,'犬免疫程序',2,8,10,15,'免疫'),(7,'犬瘟热',1,6,10,16,'传染病'),(8,'犬细小病毒',4,6,9,15,'传染病'),(9,'犬传染性肝炎',4,7,9,16,'传染病'),(10,'犬冠状病毒',4,6,9,14,'传染病'),(11,'猫泛白细胞减少症',1,5,10,16,'传染病'),(12,'猫病毒性病气管炎',2,7,10,14,'传染病'),(13,'皮肤真菌感染',1,6,12,16,'传染病'),(14,'钩虫病',3,8,9,15,'寄生虫病'),(15,'绦虫病',2,8,12,16,'寄生虫病'),(16,'球虫病',4,8,10,16,'寄生虫病'),(17,'疥螨虫病',3,7,11,16,'寄生虫病'),(18,'蚤病',3,5,12,14,'寄生虫病'),(19,'肠炎',2,7,10,13,'内科病例'),(20,'肠便秘',3,6,9,16,'内科病例'),(21,'胰腺炎',3,5,11,13,'内科病例'),(22,'肝炎',3,6,12,16,'内科病例'),(23,'腹膜炎',3,8,10,13,'内科病例'),(24,'肛门腺炎',3,7,11,14,'内科病例'),(25,'感冒',3,8,10,16,'内科病例'),(26,'外科感染',4,5,11,15,'外产科病例'),(27,'骨折',3,5,12,14,'外产科病例'),(28,'关节脱位',4,7,10,14,'外产科病例'),(29,'湿疹',3,6,11,15,'外产科病例'),(30,'趾间囊肿',2,7,9,16,'外产科病例'),(31,'脓皮病',3,8,12,13,'外产科病例'),(32,'脱毛症',3,6,9,15,'外产科病例'),(33,'疝',3,7,12,16,'外产科病例'),(34,'剖腹产',1,7,9,13,'常用手术'),(35,'瞬膜腺增生物切除',3,8,11,15,'常用手术'),(36,'眼球摘除',1,5,12,16,'常用手术'),(37,'断尾术',1,6,12,16,'常用手术'),(38,'立耳术',1,7,9,13,'常用手术'),(39,'猫免疫程序',2,8,10,13,'免疫');
/*!40000 ALTER TABLE `case_entity` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `case_resource`
--

DROP TABLE IF EXISTS `case_resource`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `case_resource` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `description` varchar(255) DEFAULT NULL,
  `picture` varchar(255) DEFAULT NULL,
  `video` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `case_resource`
--

LOCK TABLES `case_resource` WRITE;
/*!40000 ALTER TABLE `case_resource` DISABLE KEYS */;
INSERT INTO `case_resource` VALUES (1,'癫痫发作是“一个短暂的迹象，由于大脑中过度或同步的神经元活动异常” 这可能通过不同的方式体现，可以通过各种潜在病因引起。癫痫的主要症状是意识丧失和强直性痉挛。临床可分为大发作和小发作两种。大发作型。病犬突然倒地、惊厥，发生强直性或阵发性痉挛，全身僵硬、四肢伸展、头颈向背侧或一侧弯曲，有时四肢划动呈游泳状。小发作型。突然发生一过性的意识障碍，呆立不动，反应迟钝或无反应，痉挛抽搐症状轻微并且短暂，大多表现在局部，如眼睑颤动、眼球旋动、口唇震颤等。','[\'/assets/pet/pet8.jpg\']','/assets/pet/video1.mp4'),(2,'主要症状大致为渐进性消瘦、可视粘膜发白、营养不良、被毛粗乱无光、食欲不振、呕吐，偶见呕吐物中有虫体；异嗜，消化功能障碍、触诊、隔腹触压肠管，大量虫体寄生时可感到肠管套迭界线。有腹痛症状，患犬不时的叫唤。出现套迭或梗阻时，患犬全身情况恶化、不排便。','[\'/assets/pet/pet5.jpg\']','https://media.w3.org/2010/05/sintel/trailer.mp4'),(3,'患处一般是椭圆或圆形的，与健康皮肤界限明显。有结痂容易剥离，剥后皮肤光滑，皮肤不会增厚，而是形成大面积的癣斑(如蜂窝状)痒感不强烈。可能细小皮屑，像鳞一样。','[\'/assets/pet/pet1.jpg\', \'/assets/pet/pet2.jpg\']','/assets/pet/video2.mp4'),(4,'患犬表现眼鼻水样分泌物，体温高达40摄氏度以上，持续2-3天左右，稍有进食，接近常温，病犬似是好转。紧接着又第二次体温升高，病情恶化，各类细菌继发感染更为严重，畏寒颤抖，精神时好时坏，鼻眼分泌物增多转为脓性，口角糜烂。这种情形一般持续1月以上。后转为湿咳，呼吸困难。呕吐、腹泻、肠套迭，最终以严重脱水和衰弱死亡。','[\'/assets/pet/pet2.jpg\', \'/assets/pet/pet5.jpg\', \'/assets/pet/pet8.jpg\']','https://media.w3.org/2010/05/sintel/trailer.mp4'),(5,'首先，临床医生需要确定是否狗确实有癫痫发作。一个详细而准确的历史是对癫痫发作患者进行调查的基础。其次，可以对狗做脑电图、心电图等检查，从病源上确认狗是否有癫痫病发作。','[\'/assets/pet/pet9.jpg\', \'/assets/pet/pet10.jpg\']','https://media.w3.org/2010/05/sintel/trailer.mp4'),(6,'狗狗抽血正常是在前脚，在前脚尺骨中间，（类似于人类小臂那个位置）因为那里可以找到血管而且不会弯曲。\r\n先用剃刀将毛剃掉一小块，然后寻找血管，找到后擦上酒精，然后就和人抽血没什么两样了，扎针，将血导入塑料小管内，然后拔针用医用棉花压住就OK了。','[\'/assets/pet/pet5.jpg\', \'/assets/pet/pet13.jpg\']','https://media.w3.org/2010/05/sintel/trailer.mp4'),(7,'观察狗发病症状，检测狗的呕吐物或粪便中是否有虫卵。','[\'/assets/pet/pet5.jpg\']','https://media.w3.org/2010/05/sintel/trailer.mp4'),(8,'观察狗发病区域状态，与皮肤病发病现象进行对比，并进行病原体检查。','[\'/assets/pet/pet1.jpg\', \'/assets/pet/pet2.jpg\', \'/assets/pet/pet3.jpg\']','https://media.w3.org/2010/05/sintel/trailer.mp4'),(9,'脑电图波动异常。','[\'/assets/pet/pet11.jpg\']','https://media.w3.org/2010/05/sintel/trailer.mp4'),(10,'血液指标中某指标浓度超过标准指标范围则有问题。','[\'/assets/pet/pet13.jpg\', \'/assets/pet/pet14.jpg\']','https://media.w3.org/2010/05/sintel/trailer.mp4'),(11,'狗发病症状符合蛔虫病对应症状，粪便中有虫卵。','[\'/assets/pet/pet6.jpg\']','https://media.w3.org/2010/05/sintel/trailer.mp4'),(12,'发病现象符合皮肤病症状，病原体检测显示存在皮肤病。','[\'/assets/pet/pet3.jpg\']','https://media.w3.org/2010/05/sintel/trailer.mp4'),(13,'手术摘除脑补病灶体，并通过长期用药以及营养保健进行控制。根据狗狗的体重适量给温顺片，每日一次。如果狗狗病情较重，发作频率较高，可遵医嘱给予癫安舒或抗癫口服液，或其它癫痫类药物对症治疗。','[\'/assets/pet/pet12.jpg\']','https://media.w3.org/2010/05/sintel/trailer.mp4'),(14,'疫苗皮下注射或者肌肉注射。注射方法为：提起脖子的皮肤，斜着扎入或者对着大腿内侧扎入。','[\'/assets/pet/pet5.jpg\', \'/assets/pet/pet9.jpg\', \'/assets/pet/pet10.jpg\']','https://media.w3.org/2010/05/sintel/trailer.mp4'),(15,'定期检查与驱虫：幼犬每月检查1次，成年犬每季检查1次，发现病犬，立即进行驱虫。可用左咪唑，每千克体重10毫克内服。或用甲苯咪唑，每千克体重10毫克，每天服两次，连服两天。或用噻嘧啶(抗虫灵)每千克体重5-10毫克，内服。或用驱蛔灵每千克体重100毫克，内服。','[\'/assets/pet/pet7.jpg\']','https://media.w3.org/2010/05/sintel/trailer.mp4'),(16,'皮特芬喷剂(盐酸特比奈芬喷剂)，每天3-4次，全身外用 。真菌极端严重的，可口服癣净(请看清成份也是盐酸特比奈芬)。口服抗真菌要对肝肾损伤较大，极量是3天。','[\'/assets/pet/pet4.jpg\']','https://media.w3.org/2010/05/sintel/trailer.mp4');
/*!40000 ALTER TABLE `case_resource` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `examination`
--

DROP TABLE IF EXISTS `examination`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `examination` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `examination_name` varchar(255) DEFAULT NULL,
  `examination_price` float DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `examination`
--

LOCK TABLES `examination` WRITE;
/*!40000 ALTER TABLE `examination` DISABLE KEYS */;
INSERT INTO `examination` VALUES (1,'CT',200,'CT'),(2,'B ultrasound',400,'B ultrasound'),(3,'NMR',300,'NMR');
/*!40000 ALTER TABLE `examination` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hospital_record`
--

DROP TABLE IF EXISTS `hospital_record`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hospital_record` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `patient` varchar(255) DEFAULT NULL,
  `start_time` date DEFAULT NULL,
  `end_time` date DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hospital_record`
--

LOCK TABLES `hospital_record` WRITE;
/*!40000 ALTER TABLE `hospital_record` DISABLE KEYS */;
INSERT INTO `hospital_record` VALUES (2,'kuro','2017-03-24','2017-03-24','cough'),(3,'sora','2017-03-25','2017-03-28','pregnant');
/*!40000 ALTER TABLE `hospital_record` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `medicine`
--

DROP TABLE IF EXISTS `medicine`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `medicine` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `medicine_name` varchar(255) DEFAULT NULL,
  `medicine_price` float DEFAULT NULL,
  `medicine_type` int(11) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `medicine`
--

LOCK TABLES `medicine` WRITE;
/*!40000 ALTER TABLE `medicine` DISABLE KEYS */;
INSERT INTO `medicine` VALUES (1,'皮肤病药癣螨净887浴液',80,1,'杀菌除螨皮肤病克星1000ml'),(2,'宠康真菌康喷剂',9,1,'真菌性皮肤病药'),(3,'dogstory护心康口服液',13,2,'治疗狗狗心脏病'),(4,'西门斯蚤不到',23,1,'防治跳蚤、蜱、耳螨等'),(5,'波波洁足液',7.5,1,'脚部清洁护理液，狗狗预防干燥开裂'),(6,'盐酸林克霉素注射液',10,2,'用于呕泻犬瘟热');
/*!40000 ALTER TABLE `medicine` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `questions`
--

DROP TABLE IF EXISTS `questions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `questions` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `content` varchar(2000) DEFAULT NULL,
  `question_option` varchar(255) DEFAULT NULL,
  `answer` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=61 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `questions`
--

LOCK TABLES `questions` WRITE;
/*!40000 ALTER TABLE `questions` DISABLE KEYS */;
INSERT INTO `questions` VALUES (1,'按体重分中型犬的体重为（    ）。','A．10kg以下       B．11~25kg       C．26~44kg        D．45kg以上','C'),(2,'犬按用途分不属于该分类的是（    ）。','A．狩猎犬          B．腊肠犬        C．军犬           D．导盲犬','B'),(3,'犬表现摇头摆尾、扭动身体，发出甜美的鼻音说明犬（    ）。','A．愤怒            B．喜乐          C．哀伤           D．恐惧','B'),(4,'不属于犬饲喂“五定”要求的是（    ）。','A．定时、定量      B．定温、定质    C．定品牌         D． 定地点','C'),(5,'犬双眼的视力范围达（    ）。','A．150°           B．200°         C．250°          D．300°','D'),(6,'对犬发情特点描述正确的是（    ）。','A．季度发情        B．全年发情      C．春秋季节发情       D．隔年发情','A'),(7,'犬的归向性强主要是由以下哪个特点决定的（     ）。','A．善于制造“嗅迹标识”   B．脾脏发达利于奔跑   C．前列腺发达    D．心肌发达','A'),(8,'对猫的自然习性描述不正确的是（     ）。','A．屈服权威        B．喜欢偷食      C．性情孤僻         D．昼伏夜出','A'),(9,'犬的平均妊娠期为（     ）。','A．60天           B．80天          C．100天            D．120天','C'),(10,'剪耳适宜在（    ）时进行。','A．1月龄内        B．2~3月龄       C．4~5月龄        D．6月龄以上','D'),(11,'下列犬品种中性情最温顺的是（     ）。','A．京巴犬          B．罗威纳犬      C．藏獒犬        D．苏牧犬','B'),(12,'目前国内广泛使用的进口五联苗中，不包括免疫下面那一种疾病（     ）。','A．犬瘟热      B．犬细小病毒感染    C．犬副流感病毒感染     D．狂犬病','A'),(13,'下列那种症状是犬瘟热和犬细小病毒共有的（     ）。','A．神经症状    B．结膜炎      C．肺炎症状    D．体温升高','D'),(14,'犬瘟热早期出现的热型为（     ）。','A．双相热型    B．稽留热型      C．弛张热型       D．不规则热型','B'),(15,'下列哪一种症状不属于犬瘟热的典型症状（    ）。','A．神经症状    B．严重脱水      C．脓性丘疹     D．眼睑肿胀','A'),(16,'预防犬瘟热最有效的方法是（     ）。','A．注射犬瘟热高免血清   B．搞好环境卫生   C．接种犬瘟热疫苗   D．注射免疫球蛋白','C'),(17,'犬细小病毒感染在临床上分为（    ）。','肠炎型和肾炎型   B．肠炎型和肺炎型    C．肺炎型心肌炎型    D．肠炎型和心肌炎型',NULL),(18,'犬瘟热最易感的年龄段是（      ）。','A．1岁以下      B  2~3岁        C  5~8岁       D  10岁以上','C'),(19,'对犬细小病毒无效的药物是（     ）。','A．犬免疫球蛋白    B．头孢噻呋钠        C．犬干扰素       D ．犬细小病毒单克隆抗体','B'),(20,'犬瘟热病毒不可以感染下列那一种动物（     ）。','A．灰狼          B．小熊猫        C．猫头鹰         D．黄鼬','A'),(21,'犬瘟热病毒的英文缩写为（     ）。','A．CDV          B．CPV           C．CUV        D．CRV','C'),(22,'犬细小病毒的英文缩写为（     ）。','A．CDV          B．CPV           C．CUV        D．CRV','A'),(23,'犬细小病毒感染的特征性症状是（     ）。','A．神经症状      B．排算盘珠样便     C．排番茄汁样稀粪       D．结膜炎','D'),(24,'肠炎型细小病毒合理的治疗方案是（     ）。','A．多种抗菌素联合应用    B．大剂量使用抗病毒药物    C．大量补液     D．高免血清、对症治疗和控制继发感染','C'),(25,'心肌炎型细小病毒感染易感年龄为（     ）。','A．50日龄以下       B．2~3月龄       C．4~6月龄       D．1年以上','B'),(26,'使用犬细小病毒快速测试卡测试疑似犬细小病毒感染患犬时，若测试卡上的C线和T线在5分钟内同时显色，其结果表明该犬犬细小病毒呈（     ）。','A．阴性       B．阳性       C．可疑       D．无法判定','B'),(27,'犬细小病毒感染患犬以下那种病料含毒量最高（     ）。','A．眼屎       B．鼻液       C．粪便       D．尿液','D'),(28,'不属于犬瘟热特征性症状的是（     ）。','A．神经症状       B．鼻镱龟裂        C．角垫角化             D．结膜黄染','C'),(29,'犬猫临床基本检查法不包括（     ）。','A．问诊       B．视诊       C．触诊       D．听诊       E．体温检查','C'),(30,'常用的犬五联苗多采用（     ）。','A．皮下注射       B．皮内注射       C．静脉注射       D．腹腔注射','C'),(31,'健康犬猫的结膜颜色为（     ）。','A．粉红色       B．紫红色       C．暗红色       D．深红色','A'),(32,'犬猫结膜黄染提示该犬（     ）。','A．黄疸       B．发热       C．贫血      D．缺氧','C'),(33,'犬猫结膜苍白提示该犬（     ）。','A．发热       B．贫血       C．黄疸       D．缺氧','B'),(34,'犬正常体温范围为（     ）。','A．36~37.5℃       B．37.5~39℃       C．38~39℃       D．38~40℃','C'),(35,'猫正常体温范围为（     ）。','A．36~37.5℃       B．37.5~39℃       C．38~39℃       D．38~40℃','C'),(36,'犬正常呼吸数为（     ）。','A．10~30次/min       B．20~30次/min       C．30~50次/min       D．40~60次/min','B'),(37,'猫正常呼吸数为（     ）。','A．10~30次/min       B．20~30次/min       C．30~50次/min       D．40~60次/min','B'),(38,'猫正常心率为（     ）。','A．40~70次/min       B．70~120次/min       C．120~140次/min       D．140~160次/min','C'),(39,'犬正常心率为（     ）。','A．40~70次/min       B．70~120次/min       C．120~140次/min       D．140~160次/min','C'),(40,'宠物医院广泛使用的“英特威二联苗”可预防（     ）。','A．犬瘟热和结核病  B．犬瘟热和狂犬病  C．结核病和狂犬病  D．犬瘟热和犬细小病毒感染','A'),(41,'体表淋巴结常用什么方法检测（    ）。','A.叩诊   B.视诊      C.触诊    D.嗅诊','C'),(42,'母犬的怀孕期，一般为（    ）多少天。','A.50～58天    B.58～62天      C.62～70天   D.70～75天 ','B'),(43,'犬的正常体温一般为（    ）','A.35℃～36℃   B.36℃～37℃   C.37℃～38℃      D.38℃～39℃ ','B'),(44,'慢性营养不良，衰竭症、慢性传染性疾病时，可视粘膜多表现为（    ）','A.黄染         B.苍白         C.发绀         D.潮红','C'),(45,'犬细小病毒病的临床分型有（    ）。','A.一种     B.二种     C.三种     D.四种','C'),(46,'将药液滴、涂或喷洒于粘膜表面，使粘膜下感觉消失的麻醉属于（    ）','A.浸润麻醉             B.传导麻醉             C.椎管内麻醉          D.表面麻醉','A'),(47,'患传染性肝炎的犬，眼角膜常常呈（    ）。','A.白色       B.黑色    C.蓝色       D.红色 ','D'),(48,'犬巴贝斯虫的终末宿主和传播者是（    ）。','A.犬虱        B.蜱        C.螨        D.蝇 ','C'),(49,'反复呕吐的宠物，应注意纠正酸碱平衡紊乱，常选用（    ）。','A.生理盐水     B. 林格氏液     C.5%碳酸氢钠    D.10%葡萄糖','B'),(50,'警犬在盛夏酷暑、烈日直射的情况下，或气温高、湿度大、风速小的环境中执行任务时，易发（    ）。','A.犬细小病毒病     B.犬瘟热     C.犬传染性肝炎    D.中暑','A'),(51,'犬尿石症准确诊断方法是（    ）。','A.尿道探诊      B.尿液检查      C.X射线和超声波     D. 腹下部扪诊','B'),(52,'当肿胀局部出现波动后使用粗针头穿刺，一旦有脓汁排出即可确诊为（    ）。','A.血肿     B.淋巴外渗    C.脓肿     D.癌肿 ','C'),(53,'刮取患部与健部交界处皮肤至出血的皮屑涂片镜检，是确诊（    ）的方法。','A.犬螨病     B.虱病     C.弓形虫病     D.猫瘟热','C'),(54,'慢性肾衰时，电解质、酸碱平衡失调的主要变化是。','A．高血钠、高血钾、高血钙、高血磷、血清二氧化碳结合力升高　　 B  低血钠、高血钾、高血钙、高血磷、血清二氧化碳结合力降低　　 C．低血钠、高血钾、低血钙、高血磷、血清二氧化碳结合力降低　　 D．高血钠、低血钾、高血钙、低血磷、血清二氧化碳结合力降低','A'),(55,'在犬、猫玩耍、坠落或车撞后常发生（    ），其特征为受伤后患部迅速出现肿胀并逐渐增大,触摸有明显的波动感,且饱满有弹性,患部有轻度痛感。','A.淋巴外渗      B.血肿      C.脓肿       D.癌肿','C'),(56,'由咬伤或当皮肤黏膜损伤时接触病犬的唾液，可感染的疾病是（    ）。','A.犬瘟热　     B.细小病毒病    　C.猫瘟热        D.狂犬病','A'),(57,'患（    ）的宠犬，听诊时常有干性罗音或湿性罗音？','A.感冒        B.肺炎    C.急性气管支气管炎       D.犬瘟热','C'),(58,'糖尿病的病症状是（    ）。','A．消瘦、多饮、少食、多尿    B．消瘦、多饮、多食、多尿\nC．肥胖、多饮、多食、多尿　  D．消瘦、少饮、少食、少尿','A'),(59,'犬狂犬病的攻击行为一般为（    ）。','A.主动性攻击    C.防卫性攻击    D.间断性攻击    D.不攻击 ','A'),(60,'破伤风是由（    ）感染引起的。','A.链球菌     B.霉菌    C.真菌    D.破伤风梭菌 ','D');
/*!40000 ALTER TABLE `questions` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `record`
--

DROP TABLE IF EXISTS `record`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `record` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `time` date DEFAULT NULL,
  `patient` varchar(255) DEFAULT NULL,
  `pet_type` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `price` float DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `record`
--

LOCK TABLES `record` WRITE;
/*!40000 ALTER TABLE `record` DISABLE KEYS */;
INSERT INTO `record` VALUES (1,'2017-03-21','shiro','neko','flu',500),(2,'2017-02-28','kuro','inu','cough',200),(3,'2017-03-23','sora','tori','pregnant',300),(4,'2017-04-03','abc','dog','what',400);
/*!40000 ALTER TABLE `record` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role`
--

DROP TABLE IF EXISTS `role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `room_access` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role`
--

LOCK TABLES `role` WRITE;
/*!40000 ALTER TABLE `role` DISABLE KEYS */;
INSERT INTO `role` VALUES (1,'1 4'),(2,'5 6 7 8 9 10 11 12 13 14'),(3,'2 3 6 7 8 10 13 14');
/*!40000 ALTER TABLE `role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `room`
--

DROP TABLE IF EXISTS `room`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `room` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `room_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `room_type` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `room`
--

LOCK TABLES `room` WRITE;
/*!40000 ALTER TABLE `room` DISABLE KEYS */;
INSERT INTO `room` VALUES (1,'前台'),(2,'注射室'),(3,'药房'),(4,'档案室'),(5,'诊室'),(6,'化验室'),(7,'免疫室'),(8,'影像室'),(9,'专科检查室'),(10,'手术准备室'),(11,'手术室'),(12,'病理解剖室'),(13,'处置室'),(14,'病房');
/*!40000 ALTER TABLE `room` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `staff`
--

DROP TABLE IF EXISTS `staff`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `staff` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `staff_name` varchar(255) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `room_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `staff`
--

LOCK TABLES `staff` WRITE;
/*!40000 ALTER TABLE `staff` DISABLE KEYS */;
INSERT INTO `staff` VALUES (1,'kumamon','professor',9),(2,'konan','professor',12),(3,'pikacyu','associate professor',5),(4,'pudin','doctor',7),(5,'guradon','doctor',11);
/*!40000 ALTER TABLE `staff` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `test`
--

DROP TABLE IF EXISTS `test`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `test` (
  `id` int(11) NOT NULL,
  `question_id` varchar(255) DEFAULT NULL,
  `start_time` varchar(45) DEFAULT NULL,
  `duration` varchar(45) DEFAULT NULL,
  `type` varchar(45) DEFAULT NULL,
  `score` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `test`
--

LOCK TABLES `test` WRITE;
/*!40000 ALTER TABLE `test` DISABLE KEYS */;
INSERT INTO `test` VALUES (1,'1,2,3,4,5','2018-04-30 16:00:00','00:30:00','A','100');
/*!40000 ALTER TABLE `test` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) NOT NULL,
  `user_pwd` varchar(255) DEFAULT NULL,
  `user_type` int(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'zhu','zhu',1),(3,'xu','xu',1),(4,'james','james',0),(5,'harden','harden',1),(6,'kobe','kobe',0),(9,'messi','messi',1),(11,'neymar','neymar',1),(12,'pique','pique',0),(13,'pogba','pogba',1),(14,'rooney','rooney',0),(15,'kante','kante',1),(17,'shuaiqide lhb','123',1),(18,'wanglianjiaofusuxiaochuan','1234',1);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'pethospital'
--

--
-- Dumping routines for database 'pethospital'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-04-25 18:52:50
