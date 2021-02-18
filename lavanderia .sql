-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 15, 2021 at 06:32 AM
-- Server version: 10.4.13-MariaDB
-- PHP Version: 7.4.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `lavanderia`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `USERNAME` varchar(255) NOT NULL,
  `PASSWORD` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`USERNAME`, `PASSWORD`) VALUES
('123', '123'),
('adam', 'adam'),
('qwe', 'qwe'),
('username', 'username');

-- --------------------------------------------------------

--
-- Table structure for table `pelanggan`
--

CREATE TABLE `pelanggan` (
  `NOID` int(11) NOT NULL,
  `TANGGAL` date NOT NULL,
  `NAMA` varchar(255) NOT NULL,
  `ALAMAT` varchar(255) DEFAULT NULL,
  `TELP` varchar(12) DEFAULT NULL,
  `JENIS` varchar(255) DEFAULT NULL,
  `BERAT` double DEFAULT NULL,
  `HARGA` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `pesanan_ambil`
--

CREATE TABLE `pesanan_ambil` (
  `NOID` int(11) DEFAULT NULL,
  `TANGGAL` date NOT NULL,
  `NAMA` varchar(255) NOT NULL,
  `ALAMAT` varchar(255) DEFAULT NULL,
  `TELP` varchar(12) DEFAULT NULL,
  `JENIS` varchar(255) DEFAULT NULL,
  `BERAT` double DEFAULT NULL,
  `HARGA` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pesanan_ambil`
--

INSERT INTO `pesanan_ambil` (`NOID`, `TANGGAL`, `NAMA`, `ALAMAT`, `TELP`, `JENIS`, `BERAT`, `HARGA`) VALUES
(3, '2021-02-14', '123', '123', '123', 'Cuci Kering', 1, 4000),
(9, '2021-02-15', 'ajbhsdkj', '0348', '123', 'Cuci Setrika', 2, 10000),
(4, '2021-02-14', '456', '342', '123', 'Cuci Setrika', 1, 5000),
(10, '2021-02-15', 'AGSD', 'akhsgd', '5123', 'Cuci Kering', 3, 12000),
(7, '2021-02-15', 'asdfas', 'dfgh12', '`12', 'Cuci Kering', 2, 8000),
(6, '2021-02-15', '546', 'sdf', '`123', 'Cuci Setrika', 2, 10000),
(12, '2021-02-15', 'Adam', 'Lembang', '0878', 'Cuci Setrika', 2, 10000),
(11, '2021-02-15', 'asd', 'asd', 'asd', 'Cuci Kering', 2, 8000),
(8, '2021-02-15', 'jsdhf', '1237', '123', 'Cuci Kering', 2, 8000),
(3, '2021-02-14', 'dfg', 'aSD', '123', 'Cuci Kering', 3, 12000),
(2, '2021-02-14', 'ert', 'asd', '123', 'Cuci Setrika', 1, 5000),
(1, '2021-02-14', '345', 'asd', '123', 'Cuci Setrika', 3, 15000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`PASSWORD`);

--
-- Indexes for table `pelanggan`
--
ALTER TABLE `pelanggan`
  ADD PRIMARY KEY (`NOID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `pelanggan`
--
ALTER TABLE `pelanggan`
  MODIFY `NOID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
