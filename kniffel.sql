-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Erstellungszeit: 04. Nov 2022 um 09:07
-- Server-Version: 10.4.17-MariaDB
-- PHP-Version: 8.0.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Datenbank: `kniffel`
--
CREATE DATABASE IF NOT EXISTS `kniffel` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `kniffel`;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `highscore`
--

CREATE TABLE `highscore` (
  `spielername` varchar(20) NOT NULL,
  `punktzahl` int(11) NOT NULL,
  `id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Daten für Tabelle `highscore`
--

INSERT INTO `highscore` (`spielername`, `punktzahl`, `id`) VALUES
('Björn', 280, 1),
('bill', 50, 2),
('Willy', 68, 5),
('Lotti Huber', 107, 7),
('Erni', 61, 8),
('Bert', 71, 9),
('Nataya', 60, 12),
('Julez', 89, 13),
('Hallo', 93, 22),
('gfsa', 0, 23),
('Herr Reiche', 39, 24);

--
-- Indizes der exportierten Tabellen
--

--
-- Indizes für die Tabelle `highscore`
--
ALTER TABLE `highscore`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT für exportierte Tabellen
--

--
-- AUTO_INCREMENT für Tabelle `highscore`
--
ALTER TABLE `highscore`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
