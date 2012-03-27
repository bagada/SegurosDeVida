-- phpMyAdmin SQL Dump
-- version 3.4.5
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 27-03-2012 a las 08:40:52
-- Versión del servidor: 5.5.16
-- Versión de PHP: 5.3.8

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `Seguro_Vida_Quality`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Quality_Beneficiario`
--

CREATE TABLE IF NOT EXISTS `Quality_Beneficiario` (
  `Id_Beneficiario` int(5) NOT NULL AUTO_INCREMENT,
  `Id_Formato` int(5) NOT NULL,
  `Nom_Ben` varchar(10) NOT NULL,
  `ApelliP_Ben` varchar(10) NOT NULL,
  `ApelliM_Ben` varchar(10) NOT NULL,
  `Nom_Parentesco` varchar(10) NOT NULL,
  `Obs_Ben` text NOT NULL,
  `Num_Porcentaje` int(5) NOT NULL,
  PRIMARY KEY (`Id_Beneficiario`),
  KEY `fk_Quality_Beneficiario_1` (`Nom_Parentesco`),
  KEY `fk_Quality_Beneficiario_2` (`Num_Porcentaje`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Quality_Campaña`
--

CREATE TABLE IF NOT EXISTS `Quality_Campaña` (
  `Id_Campaña` int(5) NOT NULL AUTO_INCREMENT,
  `Fecha_Inicio_Campaña` date NOT NULL,
  `Fecha_Termina_Campaña` date NOT NULL,
  PRIMARY KEY (`Id_Campaña`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Quality_CAT_Parentesco`
--

CREATE TABLE IF NOT EXISTS `Quality_CAT_Parentesco` (
  `Id_Parentesco` int(5) NOT NULL,
  `Nom_Parentesco` varchar(10) NOT NULL,
  PRIMARY KEY (`Nom_Parentesco`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Quality_CAT_Potenciacion`
--

CREATE TABLE IF NOT EXISTS `Quality_CAT_Potenciacion` (
  `Id_Potenciacion` int(5) NOT NULL,
  `Num_Potenciacion` int(5) NOT NULL,
  `Porcentaje_Potenciacion` varchar(10) NOT NULL,
  `Mes_Potenciacion` varchar(10) NOT NULL,
  PRIMARY KEY (`Num_Potenciacion`,`Porcentaje_Potenciacion`,`Mes_Potenciacion`,`Id_Potenciacion`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Quality_Empleado`
--

CREATE TABLE IF NOT EXISTS `Quality_Empleado` (
  `Id_Emp` int(5) NOT NULL AUTO_INCREMENT,
  `Nom_Emp` varchar(10) NOT NULL,
  `ApeP_Emp` varchar(10) NOT NULL,
  `ApeM_Emp` varchar(10) NOT NULL,
  `RFC_Emp` varchar(10) NOT NULL,
  `Nom_Estado` varchar(10) NOT NULL,
  `Nom_Region` varchar(10) NOT NULL,
  PRIMARY KEY (`Id_Emp`),
  KEY `fk_Quality_Empleado_1` (`Id_Emp`),
  KEY `fk_Quality_Empleado_2` (`Nom_Region`),
  KEY `fk_Quality_Empleado_3` (`Nom_Estado`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Quality_Estado`
--

CREATE TABLE IF NOT EXISTS `Quality_Estado` (
  `Id_Estado` int(5) NOT NULL,
  `Nom_Estado` varchar(10) NOT NULL,
  PRIMARY KEY (`Nom_Estado`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Quality_Formato`
--

CREATE TABLE IF NOT EXISTS `Quality_Formato` (
  `Id_Formato` int(5) NOT NULL,
  `Id_Emp` int(5) NOT NULL,
  `Id_Potenciacion` int(5) NOT NULL,
  `Id_Historico` int(5) NOT NULL,
  `Fecha_Formato` date NOT NULL,
  `Nom_Region` varchar(15) NOT NULL,
  PRIMARY KEY (`Id_Formato`),
  KEY `fk_Quality_Formato_1` (`Id_Emp`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Quality_Region`
--

CREATE TABLE IF NOT EXISTS `Quality_Region` (
  `Id_Region` int(11) NOT NULL,
  `Nom_Region` varchar(15) NOT NULL,
  PRIMARY KEY (`Nom_Region`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `Quality_Beneficiario`
--
ALTER TABLE `Quality_Beneficiario`
  ADD CONSTRAINT `fk_Quality_Beneficiario_2` FOREIGN KEY (`Num_Porcentaje`) REFERENCES `Quality_Potenciacion` (`Num_Potenciacion`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Quality_Beneficiario_1` FOREIGN KEY (`Nom_Parentesco`) REFERENCES `Quality_CAT_Parentesco` (`Nom_Parentesco`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `Quality_Empleado`
--
ALTER TABLE `Quality_Empleado`
  ADD CONSTRAINT `fk_Quality_Empleado_1` FOREIGN KEY (`Id_Emp`) REFERENCES `Quality_Beneficiario` (`Id_Beneficiario`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Quality_Empleado_2` FOREIGN KEY (`Nom_Region`) REFERENCES `Quality_Region` (`Nom_Region`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Quality_Empleado_3` FOREIGN KEY (`Nom_Estado`) REFERENCES `Quality_Estado` (`Nom_Estado`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `Quality_Formato`
--
ALTER TABLE `Quality_Formato`
  ADD CONSTRAINT `fk_Quality_Formato_1` FOREIGN KEY (`Id_Emp`) REFERENCES `Quality_Empleado` (`Id_Emp`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;