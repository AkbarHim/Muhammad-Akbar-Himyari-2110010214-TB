-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 07 Jan 2024 pada 14.16
-- Versi server: 10.4.27-MariaDB
-- Versi PHP: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `penjualan`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `tiketpesawat`
--

CREATE TABLE `tiketpesawat` (
  `nama` varchar(40) NOT NULL,
  `alamat` varchar(40) NOT NULL,
  `tujuan` varchar(50) NOT NULL,
  `no_kursi` varchar(20) NOT NULL,
  `class` varchar(30) NOT NULL,
  `namapesawat` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `tiketpesawat`
--

INSERT INTO `tiketpesawat` (`nama`, `alamat`, `tujuan`, `no_kursi`, `class`, `namapesawat`) VALUES
('Akbar', 'Hadariah', 'Banjarmasin', '11', 'A', 'Garuda'),
('Himyari', 'Kencana', 'Jakarta', '11', 'A', 'Citilink'),
('Putra', 'Sudirman', 'Surabaya', '11', 'A', 'Lion');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `tiketpesawat`
--
ALTER TABLE `tiketpesawat`
  ADD PRIMARY KEY (`nama`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
