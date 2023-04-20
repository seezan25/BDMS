-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 20, 2023 at 10:26 AM
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
  `Name` varchar(100) NOT NULL,
  `username` varchar(100) NOT NULL,
  `Email` varchar(100) NOT NULL,
  `Contact` varchar(11) NOT NULL,
  `Address` varchar(11) NOT NULL,
  `BloodGroup` varchar(100) NOT NULL,
  `Disease` varchar(100) NOT NULL,
  `BloodAmount` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `receiver`
--

CREATE TABLE `receiver` (
  `ID` int(15) NOT NULL,
  `Name` varchar(100) NOT NULL,
  `username` varchar(100) NOT NULL,
  `Email` varchar(100) NOT NULL,
  `Contact` varchar(100) NOT NULL,
  `Address` varchar(100) NOT NULL,
  `BloodGroup` varchar(25) NOT NULL,
  `BloodAmount` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `ID` int(15) NOT NULL,
  `Name` varchar(100) NOT NULL,
  `Username` varchar(100) NOT NULL,
  `Password` varchar(100) NOT NULL,
  `BloodGroup` varchar(10) NOT NULL,
  `Email` varchar(100) NOT NULL,
  `ContactNumber` varchar(100) NOT NULL,
  `Disease` varchar(100) NOT NULL,
  `Address` varchar(100) NOT NULL,
  `BloodAmount` int(15) NOT NULL,
  `UserType` varchar(100) NOT NULL,
  `Action` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`ID`, `Name`, `Username`, `Password`, `BloodGroup`, `Email`, `ContactNumber`, `Disease`, `Address`, `BloodAmount`, `UserType`, `Action`) VALUES
(1, 'Seezan', 'seezan', 'seezan', 'A+', 'seezan@gmail.com', '9876543210', 'Nothing', 'damauli', 10, 'admin', 1),
(2, 'yuvraj', 'yuvraj', 'yuvraj', '', 'yuvraj@gmail.com', '9807654321', 'Nothing', 'damauli', 20, 'donor', 0),
(3, 'receiver', 'receiver', 'receiver', 'AB+', 'receiver@gmail.com', '9870654321', 'Nothing', 'damauli', 30, 'receiver', 0);

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
  MODIFY `ID` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `ID` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
