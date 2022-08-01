-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 19, 2022 at 11:03 AM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 8.0.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bookstore`
--

-- --------------------------------------------------------

--
-- Table structure for table `author`
--

CREATE TABLE `author` (
  `id` int(50) NOT NULL,
  `name` varchar(50) NOT NULL,
  `address` varchar(50) NOT NULL,
  `phone` int(50) NOT NULL,
  `email` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `author`
--

INSERT INTO `author` (`id`, `name`, `address`, `phone`, `email`) VALUES
(1, 'iqra', 'wakana', 939393933, 'zakiyocali206@mgmail.com'),
(2, 'caasha', 'barubax', 616884848, 'casha@gmail.com'),
(3, 'iqro', 'cmcmcm', 93939393, 'zakiyocali2016@mgmail.com'),
(4, 'fartuun', 'soos', 93939393, 'zakiyocali2016@mgmail.com'),
(5, 'faaduma bashir', 'xareed', 329489203, 'fadumo@gmail.com'),
(7, 'iqra', 'wakana', 939393933, 'zakiyocali206@mgmail.com'),
(9, 'iqra', 'wakana', 939393933, 'zakiyocali206@mgmail.com'),
(10, 'seynab', 'xamar', 283983, 'kxjcsdjoids'),
(11, 'iqra', 'wakana', 939393933, 'zakiyocali206@mgmail.com'),
(12, 'iqra', 'wakana', 939393933, 'zakiyocali206@mgmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `book`
--

CREATE TABLE `book` (
  `id` int(50) NOT NULL,
  `title` varchar(50) NOT NULL,
  `version` int(50) NOT NULL,
  `year` date NOT NULL,
  `price` int(11) NOT NULL,
  `authorid` int(50) NOT NULL,
  `publisherid` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `book`
--

INSERT INTO `book` (`id`, `title`, `version`, `year`, `price`, `authorid`, `publisherid`) VALUES
(1, 'Harry ', 5, '2009-04-09', 15, 1, 1),
(2, 'lord of rings', 5, '2008-06-01', 12, 2, 1);

-- --------------------------------------------------------

--
-- Table structure for table `bookorder`
--

CREATE TABLE `bookorder` (
  `id` int(50) NOT NULL,
  `orderid` int(50) NOT NULL,
  `bookid` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `bookorder`
--

INSERT INTO `bookorder` (`id`, `orderid`, `bookid`) VALUES
(1, 1, 1);

-- --------------------------------------------------------

--
-- Table structure for table `category`
--

CREATE TABLE `category` (
  `id` int(50) NOT NULL,
  `name` varchar(50) NOT NULL,
  `version` int(50) NOT NULL,
  `bookid` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `category`
--

INSERT INTO `category` (`id`, `name`, `version`, `bookid`) VALUES
(1, 'historical', 3, 1);

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `id` int(50) NOT NULL,
  `name` varchar(50) NOT NULL,
  `address` varchar(50) NOT NULL,
  `phone` int(50) NOT NULL,
  `email` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`id`, `name`, `address`, `phone`, `email`) VALUES
(1, 'rowda', 'suqaxolaha', 8282828, 'rowda@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `id` int(50) NOT NULL,
  `name` varchar(50) NOT NULL,
  `address` varchar(50) NOT NULL,
  `phone` int(50) NOT NULL,
  `email` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`id`, `name`, `address`, `phone`, `email`) VALUES
(1, 'cusman', 'banadir', 72828222, 'cusman@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `username` varchar(50) NOT NULL,
  `password` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`username`, `password`) VALUES
('iqra', 123);

-- --------------------------------------------------------

--
-- Table structure for table `orderr`
--

CREATE TABLE `orderr` (
  `id` int(50) NOT NULL,
  `items` varchar(50) NOT NULL,
  `customerid` int(50) NOT NULL,
  `employeeid` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `orderr`
--

INSERT INTO `orderr` (`id`, `items`, `customerid`, `employeeid`) VALUES
(1, '33', 1, 1);

-- --------------------------------------------------------

--
-- Table structure for table `payment`
--

CREATE TABLE `payment` (
  `price` int(50) NOT NULL,
  `customerid` int(50) NOT NULL,
  `employeeid` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `payment`
--

INSERT INTO `payment` (`price`, `customerid`, `employeeid`) VALUES
(12, 1, 1);

-- --------------------------------------------------------

--
-- Table structure for table `publisher`
--

CREATE TABLE `publisher` (
  `id` int(50) NOT NULL,
  `name` varchar(50) NOT NULL,
  `address` varchar(50) NOT NULL,
  `phone` int(50) NOT NULL,
  `email` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `publisher`
--

INSERT INTO `publisher` (`id`, `name`, `address`, `phone`, `email`) VALUES
(1, 'nasra burhan ali ', 'xamarjajab', 613705858, 'narsaburhan@gmail.com');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `author`
--
ALTER TABLE `author`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `book`
--
ALTER TABLE `book`
  ADD PRIMARY KEY (`id`),
  ADD KEY `authorid` (`authorid`),
  ADD KEY `publisherid` (`publisherid`);

--
-- Indexes for table `bookorder`
--
ALTER TABLE `bookorder`
  ADD PRIMARY KEY (`id`),
  ADD KEY `bookid` (`bookid`),
  ADD KEY `bookorder_ibfk_1` (`orderid`);

--
-- Indexes for table `category`
--
ALTER TABLE `category`
  ADD PRIMARY KEY (`id`),
  ADD KEY `bookid` (`bookid`);

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `orderr`
--
ALTER TABLE `orderr`
  ADD PRIMARY KEY (`id`),
  ADD KEY `customerid` (`customerid`),
  ADD KEY `employeeid` (`employeeid`);

--
-- Indexes for table `payment`
--
ALTER TABLE `payment`
  ADD PRIMARY KEY (`price`),
  ADD KEY `customerid` (`customerid`),
  ADD KEY `employeeid` (`employeeid`);

--
-- Indexes for table `publisher`
--
ALTER TABLE `publisher`
  ADD PRIMARY KEY (`id`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `book`
--
ALTER TABLE `book`
  ADD CONSTRAINT `book_ibfk_1` FOREIGN KEY (`authorid`) REFERENCES `author` (`id`),
  ADD CONSTRAINT `book_ibfk_2` FOREIGN KEY (`publisherid`) REFERENCES `publisher` (`id`);

--
-- Constraints for table `bookorder`
--
ALTER TABLE `bookorder`
  ADD CONSTRAINT `bookorder_ibfk_1` FOREIGN KEY (`orderid`) REFERENCES `orderr` (`id`),
  ADD CONSTRAINT `bookorder_ibfk_2` FOREIGN KEY (`bookid`) REFERENCES `book` (`id`);

--
-- Constraints for table `category`
--
ALTER TABLE `category`
  ADD CONSTRAINT `category_ibfk_1` FOREIGN KEY (`bookid`) REFERENCES `book` (`id`);

--
-- Constraints for table `orderr`
--
ALTER TABLE `orderr`
  ADD CONSTRAINT `orderr_ibfk_1` FOREIGN KEY (`customerid`) REFERENCES `customer` (`id`),
  ADD CONSTRAINT `orderr_ibfk_2` FOREIGN KEY (`employeeid`) REFERENCES `employee` (`id`);

--
-- Constraints for table `payment`
--
ALTER TABLE `payment`
  ADD CONSTRAINT `payment_ibfk_1` FOREIGN KEY (`customerid`) REFERENCES `customer` (`id`),
  ADD CONSTRAINT `payment_ibfk_2` FOREIGN KEY (`employeeid`) REFERENCES `employee` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
