-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Apr 23, 2023 at 01:38 PM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbms`
--

-- --------------------------------------------------------

--
-- Table structure for table `donor`
--

CREATE TABLE `donor` (
  `ID` int(100) NOT NULL,
  `username` varchar(100) NOT NULL,
  `Email` varchar(100) NOT NULL,
  `Contact` varchar(100) NOT NULL,
  `Address` varchar(100) NOT NULL,
  `BloodGroup` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `donor`
--

INSERT INTO `donor` (`ID`, `username`, `Email`, `Contact`, `Address`, `BloodGroup`) VALUES
(2, 'asdfadsf', 'asdfasdf', 'asdfadsf', 'asdfasfd', 'A+'),
(3, 'adsf', 'asddf', 'asdf', 'asdf', 'A+'),
(4, 'asdf', 'asdf', 'asdf', 'asdf', 'A+'),
(5, 'asdfdsf', 'sdfgsfdg', 'sdfgsdfg', 'sdfgsdfg', 'A+'),
(6, 'sfdgsf', 'sdfgsdfg', 'sdfgsdfg', 'sfgf', 'A+');

-- --------------------------------------------------------

--
-- Table structure for table `receiver`
--

CREATE TABLE `receiver` (
  `ID` int(15) NOT NULL,
  `username` varchar(100) NOT NULL,
  `Email` varchar(100) NOT NULL,
  `Contact` varchar(100) NOT NULL,
  `Address` varchar(100) NOT NULL,
  `BloodGroup` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `receiver`
--

INSERT INTO `receiver` (`ID`, `username`, `Email`, `Contact`, `Address`, `BloodGroup`) VALUES
(1, 'asdfadf', 'asdfasdf', 'asdfasdf', 'asdfasdf', 'A+'),
(2, 'asdfasdf', 'asdfasdf', 'asdfasdf', 'asddfasdf', 'A+');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `ID` int(15) NOT NULL,
  `Username` varchar(100) NOT NULL,
  `Password` varchar(100) NOT NULL,
  `BloodGroup` varchar(10) NOT NULL,
  `Email` varchar(100) NOT NULL,
  `ContactNumber` varchar(100) NOT NULL,
  `Address` varchar(100) NOT NULL,
  `UserType` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`ID`, `Username`, `Password`, `BloodGroup`, `Email`, `ContactNumber`, `Address`, `UserType`) VALUES
(1, 'seezan', 'seezan', 'A+', 'seezan@gmail.com', '9876543210', 'damauli', 'admin'),
(2, 'yuvraj', 'yuvraj', '', 'yuvraj@gmail.com', '9807654321', 'damauli', 'donor'),
(3, 'receiver', 'receiver', 'AB+', 'receiver@gmail.com', '9870654321', 'damauli', 'receiver'),
(4, 'asdfadsf', 'asdfasdf', 'A+', 'asdfasdf', 'asdfadsf', 'asdfasfd', 'donor'),
(5, 'asdfadsf', 'sdfgsg', 'A+', 'asdfsd', 'asdfasdf', 'asdfasdf', 'receiver'),
(6, 'asdfadf', 'asdfadsfa', 'A+', 'asdfasdf', 'asdfasdf', 'asdfasdf', 'receiver'),
(7, 'asdfadsfa', 'asdfadsf', 'A+', 'adsfadsfasdfaf', 'asdfasdf', 'asdfadsfadsf', 'donor'),
(8, 'adsf', 'asdf', 'A+', 'asddf', 'asdf', 'asdf', 'donor'),
(9, 'asdf', 'asdf', 'A+', 'asdf', 'asdf', 'asdf', 'donor'),
(10, 'asdfdsf', 'sdfgsf', 'A+', 'sdfgsfdg', 'sdfgsdfg', 'sdfgsdfg', 'donor'),
(11, 'sfdgsf', 'sdfgsdfg', 'A+', 'sdfgsdfg', 'sdfgsdfg', 'sfgf', 'donor'),
(12, 'asdfasdf', 'manoj', 'A+', 'asdfasdf', 'asdfasdf', 'asddfasdf', 'receiver');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `donor`
--
ALTER TABLE `donor`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `receiver`
--
ALTER TABLE `receiver`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `donor`
--
ALTER TABLE `donor`
  MODIFY `ID` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `receiver`
--
ALTER TABLE `receiver`
  MODIFY `ID` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `ID` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
