-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 29, 2024 at 03:14 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `kuesionerskd`
--

-- --------------------------------------------------------

--
-- Table structure for table `keterangan_pencacah`
--

CREATE TABLE `keterangan_pencacah` (
  `no_responden` varchar(7) NOT NULL,
  `nama_pemeriksa` varchar(100) NOT NULL,
  `nama_pencacah` varchar(100) NOT NULL,
  `tanggal` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `keterangan_pencacah`
--

INSERT INTO `keterangan_pencacah` (`no_responden`, `nama_pemeriksa`, `nama_pencacah`, `tanggal`) VALUES
('0001', 'Juan', 'Amir', '2024-06-08'),
('0002', 'Amir', 'Juan', '2024-06-08'),
('0003', 'Shinta', 'Namira', '2024-06-22'),
('0004', 'Namira', 'Shinta', '2024-06-22');

-- --------------------------------------------------------

--
-- Table structure for table `keterangan_responden`
--

CREATE TABLE `keterangan_responden` (
  `no_responden` varchar(7) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `tahun_lahir` int(11) NOT NULL,
  `email` varchar(100) NOT NULL,
  `no_hp` varchar(13) NOT NULL,
  `jenis_kelamin` varchar(10) NOT NULL,
  `pendidikan_tertinggi` varchar(100) NOT NULL,
  `pekerjaan` varchar(50) NOT NULL,
  `instansi` varchar(100) NOT NULL,
  `kat_instansi` varchar(100) NOT NULL,
  `pemanfaatan` varchar(50) NOT NULL,
  `jenis_layanan` varchar(500) NOT NULL,
  `fasilitas` varchar(500) NOT NULL,
  `rujukan_utama` varchar(5) NOT NULL,
  `pengaduan` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `keterangan_responden`
--

INSERT INTO `keterangan_responden` (`no_responden`, `nama`, `tahun_lahir`, `email`, `no_hp`, `jenis_kelamin`, `pendidikan_tertinggi`, `pekerjaan`, `instansi`, `kat_instansi`, `pemanfaatan`, `jenis_layanan`, `fasilitas`, `rujukan_utama`, `pengaduan`) VALUES
('0001', 'Shinta Namira', 2004, 'shinta@gmail.com', '0812345678', 'Perempuan', 'D4/S1', 'Pelajar/Mahasiswa', 'STIS', 'Lembaga Pendidikan & Penelitian Dalam Negeri', 'Tugas Sekolah/Tugas Kuliah', 'Perpustakaan,Pembelian Publikasi BPS,Pembelian Data Mikro/Peta Wilayah Kerja Statistik,Akses Produk Statistik pada Website BPS,Konsultasi Statistik,Rekomendasi Kegiatan Statistik', 'Datang Langsung ke Unit Pelayanan Statistik terpadu(PST),Aplikasi Pelayanan Statistik Terpadu Online(pst.bps.go.id),Website BPS(bps.go.id),Aplikasi AllStats BPS(berbasis android dan ios),Lainnya', 'Tidak', 'Tidak'),
('0002', 'Namira Shinta', 2004, 'namira@gmail.com', '0812345678', 'Laki-Laki', 'D4/S1', 'Pelajar/Mahasiswa', 'STIS', 'Lembaga Pendidikan & Penelitian Dalam Negeri', 'Tugas Sekolah/Tugas Kuliah', 'Perpustakaan,Pembelian Publikasi BPS,Rekomendasi Kegiatan Statistik', 'Aplikasi AllStats BPS(berbasis android dan ios),Lainnya', 'Ya', 'Ya'),
('0003', 'Amir Juan', 2004, 'amir@gmail.com', '08123456789', 'Laki-Laki', 'D4/S1', 'Pelajar/Mahasiswa', 'STIS', 'Lembaga Pendidikan & Penelitian Dalam Negeri', 'Tugas Sekolah/Tugas Kuliah', 'Perpustakaan,Rekomendasi Kegiatan Statistik', 'Datang Langsung ke Unit Pelayanan Statistik terpadu(PST),Lainnya', 'Tidak', 'Tidak'),
('0004', 'Juan Amir', 2001, 'juan@gmail.com', '0812345678', 'Laki-Laki', 'D4/S1', 'Pelajar/Mahasiswa', 'STIS', 'Lembaga Pendidikan & Penelitian Dalam Negeri', 'Tugas Sekolah/Tugas Kuliah', 'Konsultasi Statistik,Rekomendasi Kegiatan Statistik', 'Aplikasi AllStats BPS(berbasis android dan ios),Lainnya', 'Ya', 'Ya');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `role_user` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `name`, `email`, `password`, `role_user`) VALUES
(1, 'Admin', 'admin@gmail.com', 'admin', 'admin');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `keterangan_pencacah`
--
ALTER TABLE `keterangan_pencacah`
  ADD PRIMARY KEY (`no_responden`);

--
-- Indexes for table `keterangan_responden`
--
ALTER TABLE `keterangan_responden`
  ADD PRIMARY KEY (`no_responden`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `email` (`email`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
