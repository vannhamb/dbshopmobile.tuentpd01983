-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 10, 2017 at 07:54 PM
-- Server version: 10.1.28-MariaDB
-- PHP Version: 5.6.32

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbshopmobile`
--

-- --------------------------------------------------------

--
-- Table structure for table `danhmuc`
--

CREATE TABLE `danhmuc` (
  `hangsx` varchar(255) NOT NULL,
  `loaisp` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `danhmuc`
--

INSERT INTO `danhmuc` (`hangsx`, `loaisp`) VALUES
('Abali', 'SmartPhone'),
('Aburtus', 'SmartPhone'),
('Apple', 'SmartPhone'),
('Bphone', 'SmartPhone'),
('FPT', 'SmartPhone'),
('Huawie', 'SmartPhone'),
('LG', 'SmartPhone'),
('Microsoft', 'SmartPhone'),
('Mobistar', 'SmartPhone'),
('Oppo', 'SmartPhone'),
('SamSung', 'SmartPhone'),
('Wiko', 'SmartPhone'),
('Xiaomi', 'SmartPhone');

-- --------------------------------------------------------

--
-- Table structure for table `giohang`
--

CREATE TABLE `giohang` (
  `maspmua` varchar(255) NOT NULL,
  `tenspmua` varchar(255) NOT NULL,
  `giatiensp` float NOT NULL,
  `soluongmua` int(11) NOT NULL,
  `hinhanh` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `sanpham`
--

CREATE TABLE `sanpham` (
  `masp` varchar(255) CHARACTER SET utf8 NOT NULL,
  `tensp` varchar(255) NOT NULL,
  `giatien` varchar(255) NOT NULL,
  `soluong` int(11) NOT NULL,
  `hangsx` varchar(255) NOT NULL,
  `hinhanh` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sanpham`
--

INSERT INTO `sanpham` (`masp`, `tensp`, `giatien`, `soluong`, `hangsx`, `hinhanh`) VALUES
('SP1', 'SamSung Note 7', '7990000.0', 32, 'Oppo', 'pageshop/support/images/iphone.png'),
('SP11', 'OPPO F1S', '6500000', 35, 'Oppo', 'pageshop/support/images/galaxy-note-3.jpg'),
('SP12', 'Iphone 6s', '6350000', 15, 'Apple', 'pageshop/support/images/galaxy-s4.jpg'),
('SP13', 'Mobistar Zumbo ', '2350000', 15, 'Mobistart', 'pageshop/support/images/mobiistarprime.jpg'),
('SP14', 'Lumia 630', '2000000', 10, 'Microsoft', 'pageshop/support/images/lumia630.jpeg'),
('SP15', 'Iphone SE', '6550000.0', 25, 'Apple', 'pageshop/support/images/galaxy-note-1.jpg');

-- --------------------------------------------------------

--
-- Table structure for table `taikhoan`
--

CREATE TABLE `taikhoan` (
  `userName` varchar(100) CHARACTER SET utf8 NOT NULL,
  `passWord` varchar(100) CHARACTER SET utf8 COLLATE utf8_vietnamese_ci NOT NULL,
  `role` varchar(2) CHARACTER SET utf8 COLLATE utf8_vietnamese_ci NOT NULL,
  `hoTen` varchar(100) CHARACTER SET utf8 COLLATE utf8_vietnamese_ci NOT NULL,
  `sdt` varchar(11) CHARACTER SET utf8 COLLATE utf8_vietnamese_ci NOT NULL,
  `diachi` varchar(255) CHARACTER SET utf8 COLLATE utf8_vietnamese_ci DEFAULT NULL,
  `gioitinh` varchar(3) CHARACTER SET utf8 COLLATE utf8_vietnamese_ci NOT NULL,
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_vietnamese_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `taikhoan`
--

INSERT INTO `taikhoan` (`userName`, `passWord`, `role`, `hoTen`, `sdt`, `diachi`, `gioitinh`, `email`) VALUES
('admin', 'admin', 'AD', 'acsaca', '01652847979', 'caodan,trantien', 'Nu', 'nullsdcsacas@gmail.com'),
('nhanvien1', 'nhanvien', 'NV', 'van nguyen chien', '0905543348', '0905543348', 'Nu', 'nhanvien@gmail.com');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `danhmuc`
--
ALTER TABLE `danhmuc`
  ADD PRIMARY KEY (`hangsx`);

--
-- Indexes for table `giohang`
--
ALTER TABLE `giohang`
  ADD PRIMARY KEY (`maspmua`);

--
-- Indexes for table `sanpham`
--
ALTER TABLE `sanpham`
  ADD PRIMARY KEY (`masp`),
  ADD KEY `hangsx` (`hangsx`);

--
-- Indexes for table `taikhoan`
--
ALTER TABLE `taikhoan`
  ADD PRIMARY KEY (`userName`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
