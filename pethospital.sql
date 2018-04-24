/*
Navicat MySQL Data Transfer

Source Server         : test
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : pethospital

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2017-04-18 00:51:25
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for case_entity
-- ----------------------------
DROP TABLE IF EXISTS `case_entity`;
CREATE TABLE `case_entity` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `case_name` varchar(255) DEFAULT NULL,
  `symptom` int(11) DEFAULT NULL,
  `exam` int(11) DEFAULT NULL,
  `result` int(11) DEFAULT NULL,
  `method` int(11) DEFAULT NULL,
  `classification` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
)
  ENGINE = InnoDB
  AUTO_INCREMENT = 40
  DEFAULT CHARSET = utf8
  ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of case_entity
-- ----------------------------
INSERT INTO `case_entity` VALUES ('1', '皮炎', '3', '8', '12', '16', '外产科病例');
INSERT INTO `case_entity` VALUES ('2', '蛔虫病', '2', '7', '11', '15', '寄生虫病');
INSERT INTO `case_entity` VALUES ('3', '狗癫痫', '1', '5', '9', '13', '内科病例');
INSERT INTO `case_entity` VALUES ('4', '外伤', '3', '6', '10', '16', '外产科病例');
INSERT INTO `case_entity` VALUES ('5', '绝育', '1', '7', '11', '14', '常用手术');
INSERT INTO `case_entity` VALUES ('6', '犬免疫程序', '2', '8', '10', '15', '免疫');
INSERT INTO `case_entity` VALUES ('7', '犬瘟热', '1', '6', '10', '16', '传染病');
INSERT INTO `case_entity` VALUES ('8', '犬细小病毒', '4', '6', '9', '15', '传染病');
INSERT INTO `case_entity` VALUES ('9', '犬传染性肝炎', '4', '7', '9', '16', '传染病');
INSERT INTO `case_entity` VALUES ('10', '犬冠状病毒', '4', '6', '9', '14', '传染病');
INSERT INTO `case_entity` VALUES ('11', '猫泛白细胞减少症', '1', '5', '10', '16', '传染病');
INSERT INTO `case_entity` VALUES ('12', '猫病毒性病气管炎', '2', '7', '10', '14', '传染病');
INSERT INTO `case_entity` VALUES ('13', '皮肤真菌感染', '1', '6', '12', '16', '传染病');
INSERT INTO `case_entity` VALUES ('14', '钩虫病', '3', '8', '9', '15', '寄生虫病');
INSERT INTO `case_entity` VALUES ('15', '绦虫病', '2', '8', '12', '16', '寄生虫病');
INSERT INTO `case_entity` VALUES ('16', '球虫病', '4', '8', '10', '16', '寄生虫病');
INSERT INTO `case_entity` VALUES ('17', '疥螨虫病', '3', '7', '11', '16', '寄生虫病');
INSERT INTO `case_entity` VALUES ('18', '蚤病', '3', '5', '12', '14', '寄生虫病');
INSERT INTO `case_entity` VALUES ('19', '肠炎', '2', '7', '10', '13', '内科病例');
INSERT INTO `case_entity` VALUES ('20', '肠便秘', '3', '6', '9', '16', '内科病例');
INSERT INTO `case_entity` VALUES ('21', '胰腺炎', '3', '5', '11', '13', '内科病例');
INSERT INTO `case_entity` VALUES ('22', '肝炎', '3', '6', '12', '16', '内科病例');
INSERT INTO `case_entity` VALUES ('23', '腹膜炎', '3', '8', '10', '13', '内科病例');
INSERT INTO `case_entity` VALUES ('24', '肛门腺炎', '3', '7', '11', '14', '内科病例');
INSERT INTO `case_entity` VALUES ('25', '感冒', '3', '8', '10', '16', '内科病例');
INSERT INTO `case_entity` VALUES ('26', '外科感染', '4', '5', '11', '15', '外产科病例');
INSERT INTO `case_entity` VALUES ('27', '骨折', '3', '5', '12', '14', '外产科病例');
INSERT INTO `case_entity` VALUES ('28', '关节脱位', '4', '7', '10', '14', '外产科病例');
INSERT INTO `case_entity` VALUES ('29', '湿疹', '3', '6', '11', '15', '外产科病例');
INSERT INTO `case_entity` VALUES ('30', '趾间囊肿', '2', '7', '9', '16', '外产科病例');
INSERT INTO `case_entity` VALUES ('31', '脓皮病', '3', '8', '12', '13', '外产科病例');
INSERT INTO `case_entity` VALUES ('32', '脱毛症', '3', '6', '9', '15', '外产科病例');
INSERT INTO `case_entity` VALUES ('33', '疝', '3', '7', '12', '16', '外产科病例');
INSERT INTO `case_entity` VALUES ('34', '剖腹产', '1', '7', '9', '13', '常用手术');
INSERT INTO `case_entity` VALUES ('35', '瞬膜腺增生物切除', '3', '8', '11', '15', '常用手术');
INSERT INTO `case_entity` VALUES ('36', '眼球摘除', '1', '5', '12', '16', '常用手术');
INSERT INTO `case_entity` VALUES ('37', '断尾术', '1', '6', '12', '16', '常用手术');
INSERT INTO `case_entity` VALUES ('38', '立耳术', '1', '7', '9', '13', '常用手术');
INSERT INTO `case_entity` VALUES ('39', '猫免疫程序', '2', '8', '10', '13', '免疫');

-- ----------------------------
-- Table structure for case_resource
-- ----------------------------
DROP TABLE IF EXISTS `case_resource`;
CREATE TABLE `case_resource` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `description` varchar(255) DEFAULT NULL,
  `picture` varchar(255) DEFAULT NULL,
  `video` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
)
  ENGINE = InnoDB
  AUTO_INCREMENT = 20
  DEFAULT CHARSET = utf8;

-- ----------------------------
-- Records of case_resource
-- ----------------------------
INSERT INTO `case_resource` VALUES ('1',
                                    '癫痫发作是“一个短暂的迹象，由于大脑中过度或同步的神经元活动异常” 这可能通过不同的方式体现，可以通过各种潜在病因引起。癫痫的主要症状是意识丧失和强直性痉挛。临床可分为大发作和小发作两种。大发作型。病犬突然倒地、惊厥，发生强直性或阵发性痉挛，全身僵硬、四肢伸展、头颈向背侧或一侧弯曲，有时四肢划动呈游泳状。小发作型。突然发生一过性的意识障碍，呆立不动，反应迟钝或无反应，痉挛抽搐症状轻微并且短暂，大多表现在局部，如眼睑颤动、眼球旋动、口唇震颤等。',
                                    '[\'/assets/pet/pet8.jpg\']', '/assets/pet/video1.mp4');
INSERT INTO `case_resource` VALUES ('2',
                                    '主要症状大致为渐进性消瘦、可视粘膜发白、营养不良、被毛粗乱无光、食欲不振、呕吐，偶见呕吐物中有虫体；异嗜，消化功能障碍、触诊、隔腹触压肠管，大量虫体寄生时可感到肠管套迭界线。有腹痛症状，患犬不时的叫唤。出现套迭或梗阻时，患犬全身情况恶化、不排便。',
                                    '[\'/assets/pet/pet5.jpg\']', 'https://media.w3.org/2010/05/sintel/trailer.mp4');
INSERT INTO `case_resource` VALUES
  ('3', '患处一般是椭圆或圆形的，与健康皮肤界限明显。有结痂容易剥离，剥后皮肤光滑，皮肤不会增厚，而是形成大面积的癣斑(如蜂窝状)痒感不强烈。可能细小皮屑，像鳞一样。',
   '[\'/assets/pet/pet1.jpg\', \'/assets/pet/pet2.jpg\']', '/assets/pet/video2.mp4');
INSERT INTO `case_resource` VALUES ('4',
                                    '患犬表现眼鼻水样分泌物，体温高达40摄氏度以上，持续2-3天左右，稍有进食，接近常温，病犬似是好转。紧接着又第二次体温升高，病情恶化，各类细菌继发感染更为严重，畏寒颤抖，精神时好时坏，鼻眼分泌物增多转为脓性，口角糜烂。这种情形一般持续1月以上。后转为湿咳，呼吸困难。呕吐、腹泻、肠套迭，最终以严重脱水和衰弱死亡。',
                                    '[\'/assets/pet/pet2.jpg\', \'/assets/pet/pet5.jpg\', \'/assets/pet/pet8.jpg\']',
                                    'https://media.w3.org/2010/05/sintel/trailer.mp4');
INSERT INTO `case_resource` VALUES
  ('5', '首先，临床医生需要确定是否狗确实有癫痫发作。一个详细而准确的历史是对癫痫发作患者进行调查的基础。其次，可以对狗做脑电图、心电图等检查，从病源上确认狗是否有癫痫病发作。',
   '[\'/assets/pet/pet9.jpg\', \'/assets/pet/pet10.jpg\']', 'https://media.w3.org/2010/05/sintel/trailer.mp4');
INSERT INTO `case_resource` VALUES ('6',
                                    '狗狗抽血正常是在前脚，在前脚尺骨中间，（类似于人类小臂那个位置）因为那里可以找到血管而且不会弯曲。\r\n先用剃刀将毛剃掉一小块，然后寻找血管，找到后擦上酒精，然后就和人抽血没什么两样了，扎针，将血导入塑料小管内，然后拔针用医用棉花压住就OK了。',
                                    '[\'/assets/pet/pet5.jpg\', \'/assets/pet/pet13.jpg\']',
                                    'https://media.w3.org/2010/05/sintel/trailer.mp4');
INSERT INTO `case_resource` VALUES
  ('7', '观察狗发病症状，检测狗的呕吐物或粪便中是否有虫卵。', '[\'/assets/pet/pet5.jpg\']', 'https://media.w3.org/2010/05/sintel/trailer.mp4');
INSERT INTO `case_resource` VALUES ('8', '观察狗发病区域状态，与皮肤病发病现象进行对比，并进行病原体检查。',
                                    '[\'/assets/pet/pet1.jpg\', \'/assets/pet/pet2.jpg\', \'/assets/pet/pet3.jpg\']',
                                    'https://media.w3.org/2010/05/sintel/trailer.mp4');
INSERT INTO `case_resource`
VALUES ('9', '脑电图波动异常。', '[\'/assets/pet/pet11.jpg\']', 'https://media.w3.org/2010/05/sintel/trailer.mp4');
INSERT INTO `case_resource` VALUES
  ('10', '血液指标中某指标浓度超过标准指标范围则有问题。', '[\'/assets/pet/pet13.jpg\', \'/assets/pet/pet14.jpg\']',
   'https://media.w3.org/2010/05/sintel/trailer.mp4');
INSERT INTO `case_resource` VALUES
  ('11', '狗发病症状符合蛔虫病对应症状，粪便中有虫卵。', '[\'/assets/pet/pet6.jpg\']', 'https://media.w3.org/2010/05/sintel/trailer.mp4');
INSERT INTO `case_resource` VALUES
  ('12', '发病现象符合皮肤病症状，病原体检测显示存在皮肤病。', '[\'/assets/pet/pet3.jpg\']', 'https://media.w3.org/2010/05/sintel/trailer.mp4');
INSERT INTO `case_resource` VALUES
  ('13', '手术摘除脑补病灶体，并通过长期用药以及营养保健进行控制。根据狗狗的体重适量给温顺片，每日一次。如果狗狗病情较重，发作频率较高，可遵医嘱给予癫安舒或抗癫口服液，或其它癫痫类药物对症治疗。',
   '[\'/assets/pet/pet12.jpg\']', 'https://media.w3.org/2010/05/sintel/trailer.mp4');
INSERT INTO `case_resource` VALUES ('14', '疫苗皮下注射或者肌肉注射。注射方法为：提起脖子的皮肤，斜着扎入或者对着大腿内侧扎入。',
                                    '[\'/assets/pet/pet5.jpg\', \'/assets/pet/pet9.jpg\', \'/assets/pet/pet10.jpg\']',
                                    'https://media.w3.org/2010/05/sintel/trailer.mp4');
INSERT INTO `case_resource` VALUES ('15',
                                    '定期检查与驱虫：幼犬每月检查1次，成年犬每季检查1次，发现病犬，立即进行驱虫。可用左咪唑，每千克体重10毫克内服。或用甲苯咪唑，每千克体重10毫克，每天服两次，连服两天。或用噻嘧啶(抗虫灵)每千克体重5-10毫克，内服。或用驱蛔灵每千克体重100毫克，内服。',
                                    '[\'/assets/pet/pet7.jpg\']', 'https://media.w3.org/2010/05/sintel/trailer.mp4');
INSERT INTO `case_resource` VALUES
  ('16', '皮特芬喷剂(盐酸特比奈芬喷剂)，每天3-4次，全身外用 。真菌极端严重的，可口服癣净(请看清成份也是盐酸特比奈芬)。口服抗真菌要对肝肾损伤较大，极量是3天。', '[\'/assets/pet/pet4.jpg\']',
   'https://media.w3.org/2010/05/sintel/trailer.mp4');

-- ----------------------------
-- Table structure for examination
-- ----------------------------
DROP TABLE IF EXISTS `examination`;
CREATE TABLE `examination` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `examination_name` varchar(255) DEFAULT NULL,
  `examination_price` float DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of examination
-- ----------------------------
INSERT INTO `examination` VALUES ('1', 'CT', '200', 'CT');
INSERT INTO `examination` VALUES ('2', 'B ultrasound', '400', 'B ultrasound');
INSERT INTO `examination` VALUES ('3', 'NMR', '300', 'NMR');

-- ----------------------------
-- Table structure for hospital_record
-- ----------------------------
DROP TABLE IF EXISTS `hospital_record`;
CREATE TABLE `hospital_record` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `patient` varchar(255) DEFAULT NULL,
  `start_time` date DEFAULT NULL,
  `end_time` date DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of hospital_record
-- ----------------------------
INSERT INTO `hospital_record` VALUES ('1', 'shiro', '2017-02-28', '2017-03-01', 'flu');
INSERT INTO `hospital_record` VALUES ('2', 'kuro', '2017-03-24', '2017-03-24', 'cough');
INSERT INTO `hospital_record` VALUES ('3', 'sora', '2017-03-25', '2017-03-28', 'pregnant');

-- ----------------------------
-- Table structure for medicine
-- ----------------------------
DROP TABLE IF EXISTS `medicine`;
CREATE TABLE `medicine` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `medicine_name` varchar(255) DEFAULT NULL,
  `medicine_price` float DEFAULT NULL,
  `medicine_type` int(11) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
)
  ENGINE = InnoDB
  AUTO_INCREMENT = 7
  DEFAULT CHARSET = utf8;

-- ----------------------------
-- Records of medicine
-- ----------------------------
INSERT INTO `medicine` VALUES ('1', '皮肤病药癣螨净887浴液', '80', '1', '杀菌除螨皮肤病克星1000ml');
INSERT INTO `medicine` VALUES ('2', '宠康真菌康喷剂', '9', '1', '真菌性皮肤病药');
INSERT INTO `medicine` VALUES ('3', 'dogstory护心康口服液', '13', '2', '治疗狗狗心脏病');
INSERT INTO `medicine` VALUES ('4', '西门斯蚤不到', '23', '1', '防治跳蚤、蜱、耳螨等');
INSERT INTO `medicine` VALUES ('5', '波波洁足液', '7.5', '1', '脚部清洁护理液，狗狗预防干燥开裂');
INSERT INTO `medicine` VALUES ('6', '盐酸林克霉素注射液', '10', '2', '用于呕泻犬瘟热');

-- ----------------------------
-- Table structure for record
-- ----------------------------
DROP TABLE IF EXISTS `record`;
CREATE TABLE `record` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `time` date DEFAULT NULL,
  `patient` varchar(255) DEFAULT NULL,
  `pet_type` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `price` float DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of record
-- ----------------------------
INSERT INTO `record` VALUES ('1', '2017-03-21', 'shiro', 'neko', 'flu', '500');
INSERT INTO `record` VALUES ('2', '2017-02-28', 'kuro', 'inu', 'cough', '200');
INSERT INTO `record` VALUES ('3', '2017-03-23', 'sora', 'tori', 'pregnant', '300');
INSERT INTO `record` VALUES ('4', '2017-04-03', 'abc', 'dog', 'what', '400');

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `room_access` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('1', '1 4');
INSERT INTO `role` VALUES ('2', '5 6 7 8 9 10 11 12 13 14');
INSERT INTO `role` VALUES ('3', '2 3 6 7 8 10 13 14');

-- ----------------------------
-- Table structure for room
-- ----------------------------
DROP TABLE IF EXISTS `room`;
CREATE TABLE `room` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `room_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `room_type` (`id`)
)
  ENGINE = InnoDB
  AUTO_INCREMENT = 15
  DEFAULT CHARSET = utf8;

-- ----------------------------
-- Records of room
-- ----------------------------
INSERT INTO `room` VALUES ('1', '前台');
INSERT INTO `room` VALUES ('2', '注射室');
INSERT INTO `room` VALUES ('3', '药房');
INSERT INTO `room` VALUES ('4', '档案室');
INSERT INTO `room` VALUES ('5', '诊室');
INSERT INTO `room` VALUES ('6', '化验室');
INSERT INTO `room` VALUES ('7', '免疫室');
INSERT INTO `room` VALUES ('8', '影像室');
INSERT INTO `room` VALUES ('9', '专科检查室');
INSERT INTO `room` VALUES ('10', '手术准备室');
INSERT INTO `room` VALUES ('11', '手术室');
INSERT INTO `room` VALUES ('12', '病理解剖室');
INSERT INTO `room` VALUES ('13', '处置室');
INSERT INTO `room` VALUES ('14', '病房');

-- ----------------------------
-- Table structure for staff
-- ----------------------------
DROP TABLE IF EXISTS `staff`;
CREATE TABLE `staff` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `staff_name` varchar(255) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `room_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of staff
-- ----------------------------
INSERT INTO `staff` VALUES ('1', 'kumamon', 'professor', '9');
INSERT INTO `staff` VALUES ('2', 'konan', 'professor', '12');
INSERT INTO `staff` VALUES ('3', 'pikacyu', 'associate professor', '5');
INSERT INTO `staff` VALUES ('4', 'pudin', 'doctor', '7');
INSERT INTO `staff` VALUES ('5', 'guradon', 'doctor', '11');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) NOT NULL,
  `user_pwd` varchar(255) DEFAULT NULL,
  `user_type` int(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'zhu', 'zhu', '1');
INSERT INTO `user` VALUES ('2', 'yang', 'yang', '0');
INSERT INTO `user` VALUES ('3', 'xu', 'xu', '1');
INSERT INTO `user` VALUES ('4', 'james', 'james', '0');
INSERT INTO `user` VALUES ('5', 'harden', 'harden', '1');
INSERT INTO `user` VALUES ('6', 'kobe', 'kobe', '0');
INSERT INTO `user` VALUES ('7', 'curry', 'curry', '1');
INSERT INTO `user` VALUES ('8', 'capela', 'capela', '0');
INSERT INTO `user` VALUES ('9', 'messi', 'messi', '1');
INSERT INTO `user` VALUES ('10', 'xavi', 'xavi', '0');
INSERT INTO `user` VALUES ('11', 'neymar', 'neymar', '1');
INSERT INTO `user` VALUES ('12', 'pique', 'pique', '0');
INSERT INTO `user` VALUES ('13', 'pogba', 'pogba', '1');
INSERT INTO `user` VALUES ('14', 'rooney', 'rooney', '0');
INSERT INTO `user` VALUES ('15', 'kante', 'kante', '1');
INSERT INTO `user` VALUES ('16', '朱', 'zhu', '0');
