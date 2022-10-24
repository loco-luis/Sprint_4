-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 24-10-2022 a las 03:44:47
-- Versión del servidor: 10.4.25-MariaDB
-- Versión de PHP: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `votapp`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `votante`
--

CREATE TABLE `votante` (
  `codVotante` int(6) NOT NULL,
  `identificacion` int(12) NOT NULL,
  `nombres` varchar(30) NOT NULL,
  `apellidos` varchar(30) NOT NULL,
  `sexo` int(1) NOT NULL,
  `fechaNac` date NOT NULL,
  `fechaExp` date NOT NULL,
  `lugNac` int(4) NOT NULL,
  `lugRes` int(4) NOT NULL,
  `telefono` int(10) NOT NULL,
  `correo` varchar(60) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `votante`
--

INSERT INTO `votante` (`codVotante`, `identificacion`, `nombres`, `apellidos`, `sexo`, `fechaNac`, `fechaExp`, `lugNac`, `lugRes`, `telefono`, `correo`) VALUES
(1, 56456453, 'Jose', 'Lizarazo', 2, '1978-02-02', '1998-04-04', 0, 0, 312568545, 'a@a.a'),
(2, 45456, 'Edwar', 'Roa', 2, '2000-04-06', '2018-05-03', 0, 0, 3216547, 'a@a.a'),
(3, 623215, 'Camilo', 'Ortiz', 2, '1980-04-03', '1998-08-02', 0, 0, 343543, 'sga@gfdsd.cd'),
(4, 656548, 'Ana Maria', 'Pineda', 1, '2005-04-04', '2020-06-02', 0, 0, 343543, 'asfda@sd.ds');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `votante`
--
ALTER TABLE `votante`
  ADD PRIMARY KEY (`codVotante`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `votante`
--
ALTER TABLE `votante`
  MODIFY `codVotante` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
