-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Anamakine: 127.0.0.1
-- Üretim Zamanı: 16 Oca 2022, 16:09:37
-- Sunucu sürümü: 10.4.22-MariaDB
-- PHP Sürümü: 7.4.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `javaprojeveritabani`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `admin_tablosu`
--

CREATE TABLE `admin_tablosu` (
  `username` text COLLATE utf8_turkish_ci NOT NULL,
  `password` text COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `admin_tablosu`
--

INSERT INTO `admin_tablosu` (`username`, `password`) VALUES
('admin', '123');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `musteri_rezervasyonlari`
--

CREATE TABLE `musteri_rezervasyonlari` (
  `no` int(11) NOT NULL,
  `ucus` text COLLATE utf8_turkish_ci NOT NULL,
  `bilet` text COLLATE utf8_turkish_ci NOT NULL,
  `yer` text COLLATE utf8_turkish_ci NOT NULL,
  `yon` text COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `musteri_tablosu`
--

CREATE TABLE `musteri_tablosu` (
  `id` int(11) NOT NULL,
  `username` text COLLATE utf8_turkish_ci NOT NULL,
  `password` text COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `musteri_rezervasyonlari`
--
ALTER TABLE `musteri_rezervasyonlari`
  ADD PRIMARY KEY (`no`);

--
-- Tablo için indeksler `musteri_tablosu`
--
ALTER TABLE `musteri_tablosu`
  ADD PRIMARY KEY (`id`);

--
-- Dökümü yapılmış tablolar için AUTO_INCREMENT değeri
--

--
-- Tablo için AUTO_INCREMENT değeri `musteri_rezervasyonlari`
--
ALTER TABLE `musteri_rezervasyonlari`
  MODIFY `no` int(11) NOT NULL AUTO_INCREMENT;

--
-- Tablo için AUTO_INCREMENT değeri `musteri_tablosu`
--
ALTER TABLE `musteri_tablosu`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
