-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 13, 2023 at 09:31 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.0.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `onlinestudy`
--

-- --------------------------------------------------------

--
-- Table structure for table `loginadmin`
--

CREATE TABLE `loginadmin` (
  `username` varchar(255) NOT NULL,
  `password` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `loginadmin`
--

INSERT INTO `loginadmin` (`username`, `password`) VALUES
('AIA', '123456'),
('SystemTest1', 'SystemTest1'),
('SystemTest2', 'SystemTest2');

-- --------------------------------------------------------

--
-- Table structure for table `login_user`
--

CREATE TABLE `login_user` (
  `username` varchar(255) NOT NULL,
  `password` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `login_user`
--

INSERT INTO `login_user` (`username`, `password`) VALUES
('pc1', 'pc1'),
('student1', 'student1'),
('student2', 'student2');

-- --------------------------------------------------------

--
-- Table structure for table `questions`
--

CREATE TABLE `questions` (
  `id` bigint(20) NOT NULL,
  `question` text NOT NULL,
  `subjects` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `questions`
--

INSERT INTO `questions` (`id`, `question`, `subjects`) VALUES
(1, 'Is bangla the most hard subject?', 'Bangla'),
(2, 'How Does Pain Starts?', 'Biology'),
(3, 'What is the chemical symbol for gold?', 'Chemistry'),
(4, 'Define a chemical reaction.', 'Chemistry'),
(5, 'List the first five elements of the periodic table.', 'Chemistry'),
(6, 'Explain the concept of pH.', 'Chemistry'),
(7, 'What is the formula for water?', 'Chemistry'),
(8, 'Describe the structure of an atom.', 'Chemistry'),
(9, 'How many elements are there', 'Chemistry'),
(10, 'What is carbon?', 'Chemistry'),
(11, 'What is N2O?', 'Chemistry'),
(12, 'Why chemistry exits?', 'Chemistry'),
(13, 'What Was the Most Hard Question about Bangla?', 'Bangla');

-- --------------------------------------------------------

--
-- Table structure for table `subjectadded`
--

CREATE TABLE `subjectadded` (
  `subjects` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `subjectadded`
--

INSERT INTO `subjectadded` (`subjects`) VALUES
('Bangla'),
('Biology'),
('Chemistry'),
('Higher Math');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `loginadmin`
--
ALTER TABLE `loginadmin`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `login_user`
--
ALTER TABLE `login_user`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `questions`
--
ALTER TABLE `questions`
  ADD PRIMARY KEY (`id`),
  ADD KEY `subjects` (`subjects`);

--
-- Indexes for table `subjectadded`
--
ALTER TABLE `subjectadded`
  ADD PRIMARY KEY (`subjects`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `questions`
--
ALTER TABLE `questions`
  ADD CONSTRAINT `questions_ibfk_1` FOREIGN KEY (`subjects`) REFERENCES `subjectadded` (`subjects`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
