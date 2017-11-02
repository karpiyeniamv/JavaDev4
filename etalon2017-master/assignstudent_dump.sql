-- --------------------------------------------------------
-- Хост:                         127.0.0.1
-- Версия сервера:               5.7.19-log - MySQL Community Server (GPL)
-- Операционная система:         Win64
-- HeidiSQL Версия:              9.4.0.5125
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Дамп структуры базы данных assignstudent
CREATE DATABASE IF NOT EXISTS `assignstudent` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `assignstudent`;

-- Дамп структуры для таблица assignstudent.assignrequest
CREATE TABLE IF NOT EXISTS `assignrequest` (
  `id` int(11) NOT NULL,
  `requestId` int(11) NOT NULL,
  `studentId` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_assignrequest_request` (`requestId`),
  KEY `FK_assignrequest_student` (`studentId`),
  CONSTRAINT `FK_assignrequest_request` FOREIGN KEY (`requestId`) REFERENCES `request` (`id`),
  CONSTRAINT `FK_assignrequest_student` FOREIGN KEY (`studentId`) REFERENCES `student` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Дамп данных таблицы assignstudent.assignrequest: ~2 rows (приблизительно)
/*!40000 ALTER TABLE `assignrequest` DISABLE KEYS */;
INSERT INTO `assignrequest` (`id`, `requestId`, `studentId`) VALUES
	(1, 1, 3),
	(2, 2, 1),
	(3, 2, 2);
/*!40000 ALTER TABLE `assignrequest` ENABLE KEYS */;

-- Дамп структуры для таблица assignstudent.company
CREATE TABLE IF NOT EXISTS `company` (
  `id` int(11) NOT NULL,
  `companyName` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Дамп данных таблицы assignstudent.company: ~5 rows (приблизительно)
/*!40000 ALTER TABLE `company` DISABLE KEYS */;
INSERT INTO `company` (`id`, `companyName`) VALUES
	(1, 'IBA'),
	(2, 'Google'),
	(3, 'Netcracker'),
	(4, 'Integral'),
	(5, 'Radar');
/*!40000 ALTER TABLE `company` ENABLE KEYS */;

-- Дамп структуры для таблица assignstudent.faculty
CREATE TABLE IF NOT EXISTS `faculty` (
  `id` int(11) NOT NULL,
  `facultyName` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Дамп данных таблицы assignstudent.faculty: ~4 rows (приблизительно)
/*!40000 ALTER TABLE `faculty` DISABLE KEYS */;
INSERT INTO `faculty` (`id`, `facultyName`) VALUES
	(1, 'mmf'),
	(2, 'fpmi'),
	(3, 'fiz'),
	(4, 'bio');
/*!40000 ALTER TABLE `faculty` ENABLE KEYS */;

-- Дамп структуры для таблица assignstudent.request
CREATE TABLE IF NOT EXISTS `request` (
  `id` int(11) NOT NULL,
  `companyId` int(11) NOT NULL,
  `dateFrom` date NOT NULL,
  `dateTo` date NOT NULL,
  `quantity` int(11) NOT NULL,
  `facultyId` int(11) DEFAULT NULL,
  `specialtyId` int(11) DEFAULT NULL,
  `score` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_request_company` (`companyId`),
  KEY `FK_request_faculty` (`facultyId`),
  KEY `FK_request_specialty` (`specialtyId`),
  CONSTRAINT `FK_request_company` FOREIGN KEY (`companyId`) REFERENCES `company` (`id`),
  CONSTRAINT `FK_request_faculty` FOREIGN KEY (`facultyId`) REFERENCES `faculty` (`id`),
  CONSTRAINT `FK_request_specialty` FOREIGN KEY (`specialtyId`) REFERENCES `specialty` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Дамп данных таблицы assignstudent.request: ~3 rows (приблизительно)
/*!40000 ALTER TABLE `request` DISABLE KEYS */;
INSERT INTO `request` (`id`, `companyId`, `dateFrom`, `dateTo`, `quantity`, `facultyId`, `specialtyId`, `score`) VALUES
	(1, 2, '2017-10-15', '2017-12-30', 2, 2, NULL, 5),
	(2, 1, '2017-06-30', '2018-04-28', 3, 1, NULL, 7),
	(3, 4, '2017-11-28', '2018-03-28', 5, 1, 1, 8);
/*!40000 ALTER TABLE `request` ENABLE KEYS */;

-- Дамп структуры для таблица assignstudent.specialty
CREATE TABLE IF NOT EXISTS `specialty` (
  `id` int(11) NOT NULL,
  `specialtyName` varchar(45) NOT NULL,
  `facultyId` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_specialty_faculty` (`facultyId`),
  CONSTRAINT `FK_specialty_faculty` FOREIGN KEY (`facultyId`) REFERENCES `faculty` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Дамп данных таблицы assignstudent.specialty: ~2 rows (приблизительно)
/*!40000 ALTER TABLE `specialty` DISABLE KEYS */;
INSERT INTO `specialty` (`id`, `specialtyName`, `facultyId`) VALUES
	(1, 'applied math', 2),
	(2, 'nano', 3);
/*!40000 ALTER TABLE `specialty` ENABLE KEYS */;

-- Дамп структуры для таблица assignstudent.student
CREATE TABLE IF NOT EXISTS `student` (
  `id` int(11) NOT NULL,
  `firstName` varchar(45) NOT NULL,
  `lastName` varchar(45) NOT NULL,
  `facultyId` int(11) DEFAULT NULL,
  `specialtyId` int(11) DEFAULT NULL,
  `score` int(11) DEFAULT NULL,
  `status` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_student_faculty` (`facultyId`),
  KEY `FK_student_specialty` (`specialtyId`),
  CONSTRAINT `FK_student_faculty` FOREIGN KEY (`facultyId`) REFERENCES `faculty` (`id`),
  CONSTRAINT `FK_student_specialty` FOREIGN KEY (`specialtyId`) REFERENCES `specialty` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Дамп данных таблицы assignstudent.student: ~3 rows (приблизительно)
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` (`id`, `firstName`, `lastName`, `facultyId`, `specialtyId`, `score`, `status`) VALUES
	(1, 'Ivan', 'Ivanov', 1, NULL, 8, 1),
	(2, 'Petr', 'Petrov', 3, 2, 7, 1),
	(3, 'Inna', 'Rudaya', 4, NULL, 7, 2);
/*!40000 ALTER TABLE `student` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
