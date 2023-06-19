-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Jun 19, 2023 at 02:25 PM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 8.1.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `Phone_DB`
--

-- --------------------------------------------------------

--
-- Table structure for table `Phone`
--

CREATE TABLE `Phone` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `trademark` varchar(255) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `painted` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `Phone`
--

INSERT INTO `Phone` (`id`, `name`, `trademark`, `price`, `painted`) VALUES
(11, 'Phone 1', 'Apple', 1000.5, 'Red'),
(12, 'Phone 2', 'Nokia', 800.75, 'Blue'),
(13, 'Phone 3', 'Samsung', 1200, 'Black'),
(14, 'Phone 4', 'Khác', 950.25, 'Silver'),
(15, 'Phone 5', 'Nokia', 1100.5, 'Gold'),
(16, 'Phone 6', 'Samsung', 850, 'Green'),
(17, 'Phone 7', 'Khác', 900.75, 'Pink'),
(18, 'Phone 8', 'Apple', 1300, 'White'),
(19, 'Phone 9', 'Apple', 950.25, 'Purple'),
(20, 'Phone 10', 'Nokia', 1050.5, 'Orange'),
(21, 'e', 'e', 2, 'e'),
(22, 'a', 'a', 1, 'a'),
(23, 'iphone 13 pto max', 'Apple', 100000, 'mau xanh'),
(24, 'iphone 14 pro max', 'apple', 200000, 'mau den');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `Phone`
--
ALTER TABLE `Phone`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `Phone`
--
ALTER TABLE `Phone`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
