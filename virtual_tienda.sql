-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 24-08-2022 a las 00:42:53
-- Versión del servidor: 10.4.14-MariaDB
-- Versión de PHP: 7.4.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `virtual_tienda`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientesjuridicos`
--

CREATE TABLE `clientesjuridicos` (
  `id` int(11) NOT NULL,
  `direccion` varchar(150) NOT NULL,
  `telefono` int(11) NOT NULL,
  `correo` varchar(200) NOT NULL,
  `razonsocial` varchar(100) NOT NULL,
  `nit` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `clientesjuridicos`
--

INSERT INTO `clientesjuridicos` (`id`, `direccion`, `telefono`, `correo`, `razonsocial`, `nit`) VALUES
(1, 'Peru 708', 7376767, 'michi@gamil.com', 'michellina', 122189),
(2, 'kfkgkf', 954682, 'kkf@gmail.com', 'ldlkg', 546988),
(3, 'kk', 55, '@.', 'kk', 44),
(4, 'kk', 99, '@.', 'kk', 44),
(5, 'kk', 0, '@.', 'kk', 44),
(6, 'kk', 99, 'kk@.', 'kk', 44),
(7, 'kk', 99, '@.', 'kk', 44),
(8, 'k', 99, '@.', 'kk', 4),
(9, 'kk', 99, '@.', 'kk', 4),
(10, 'kk', 44, '@.', 'kk', 44),
(11, 'll', 44, '@.', 'kk', 111),
(12, 'll', 444, '@.', 'll', 11),
(13, 'kk', 5454, 'm@.', 'kk', 2),
(14, 'jj', 44, '@.', 'kk', 5),
(15, 'k', 4, '@.', 'k', 8),
(16, 'k', 4, '@.', 'jj', 447),
(17, 'kk', 44, '@.', 'oi', 95),
(18, 'l', 4, '@.', 'll', 85),
(19, 'll', 44, '@.', 'llll', 888),
(20, 'peru 708', 44, 'mi@.', 'lll', 444),
(21, 'll', 444, '@.', 'll', 99),
(22, 'kkkk', 5555, 'kdkf@.', 'kk', 55);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientesnaturales`
--

CREATE TABLE `clientesnaturales` (
  `id` int(11) NOT NULL,
  `direccion` varchar(150) NOT NULL,
  `telefono` int(11) NOT NULL,
  `correo` varchar(150) NOT NULL,
  `pNombre` varchar(50) NOT NULL,
  `sNombre` varchar(50) DEFAULT NULL,
  `pApellido` varchar(50) NOT NULL,
  `sApellido` varchar(50) DEFAULT NULL,
  `documento` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `clientesnaturales`
--

INSERT INTO `clientesnaturales` (`id`, `direccion`, `telefono`, `correo`, `pNombre`, `sNombre`, `pApellido`, `sApellido`, `documento`) VALUES
(1, 'las brisas', 9548541, '9548541', 'Steven', '', 'Taborda', 'Restrepo', 1224567851),
(2, 'jjjjjj', 555, '555', 'kk', '', 'kkk', '', 555),
(3, 'kk', 99, '99', 'kk', '', 'kk', 'k', 4),
(4, 'kk', 99, '99', 'kk', 'kk', '', 'k', 4),
(5, 'peru708', 4444, '4444', 'mimi', '', 'mimi', '', 123),
(6, 'peru708', 4444, '4444', 'mimi', '', 'mimi', '', 123),
(7, 'll', 123, '123', 'q', 'q', 'q', 'q', 123),
(8, 'll', 123, '123', 'q', 'q', 'q', 'q', 123),
(9, 'kk', 99, '99', 'kk', 'kk', 'kk', 'kk', 456),
(10, 'lll', 111, '111', 'll', 'll', 'll', 'll', 111),
(11, 'lll', 111, '111', 'll', 'll', 'll', 'll', 111),
(12, 'venezuela 1541', 78627745, 'mic@.gmal.co', 'll', '', 'll', '', 1234),
(13, 'miramar 2023', 4564567, 'danis@gmail.com', 'danis', '', 'quintero', '', 7071971),
(14, 'kra 45', 9877564, 'michi@gmail.com', 'miimi', '', 'riri', '', 122046);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `envios`
--

CREATE TABLE `envios` (
  `id` int(11) NOT NULL,
  `idPago` int(11) NOT NULL,
  `direccion` varchar(100) NOT NULL,
  `fecha` date NOT NULL,
  `compania` varchar(20) NOT NULL,
  `estado` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `envios`
--

INSERT INTO `envios` (`id`, `idPago`, `direccion`, `fecha`, `compania`, `estado`) VALUES
(1, 4, 'peru 708', '2022-08-22', 'INTERRAPIDISIMO', 'FINALIZADO'),
(2, 10, 'casalinda', '2022-08-22', 'PEDIDOSYA', 'FINALIZADO'),
(3, 10, 'las brisas', '2022-08-22', 'RAPPI', 'FINALIZADO'),
(4, 10, 'miramar', '2022-08-22', 'SERVIENTREGA', 'FINALIZADO'),
(5, 13, 'usa', '2022-08-22', 'INTERRAPIDISIMO', 'FINALIZADO'),
(6, 10, 'miimi', '2022-08-22', 'ENVIA', 'NOFINALIZADO'),
(7, 9, '', '2022-08-22', 'INTERRAPIDISIMO', 'NOFINALIZADO');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pagos`
--

CREATE TABLE `pagos` (
  `id` int(11) NOT NULL,
  `idPedido` int(11) NOT NULL,
  `idCliente` int(11) NOT NULL,
  `fecha` date NOT NULL,
  `total` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `pagos`
--

INSERT INTO `pagos` (`id`, `idPedido`, `idCliente`, `fecha`, `total`) VALUES
(1, 5, 20, '2022-08-19', 13700),
(2, 8, 13, '2022-08-19', 5000),
(3, 9, 22, '2022-08-20', 1500),
(4, 1, 8, '2022-08-20', 9000),
(5, 3, 8, '2022-08-20', 4700),
(6, 2, 13, '2022-08-20', 11500),
(7, 6, 12, '2022-08-20', 10200),
(8, 5, 20, '2022-08-20', 13700),
(9, 4, 18, '2022-08-20', 14100),
(10, 7, 21, '2022-08-20', 5900),
(11, 9, 22, '2022-08-20', 1500),
(12, 8, 13, '2022-08-20', 5000),
(13, 10, 14, '2022-08-20', 8000);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedidos`
--

CREATE TABLE `pedidos` (
  `id` int(11) NOT NULL,
  `idCliente` int(11) NOT NULL,
  `fecha` date NOT NULL,
  `total` float NOT NULL,
  `estado` varchar(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `pedidos`
--

INSERT INTO `pedidos` (`id`, `idCliente`, `fecha`, `total`, `estado`) VALUES
(1, 8, '2022-08-20', 9000, 'PAGADO'),
(2, 13, '2022-08-20', 11500, 'PAGADO'),
(3, 8, '2022-08-20', 4700, 'PAGADO'),
(4, 18, '2022-08-20', 14100, 'PAGADO'),
(5, 20, '2022-08-20', 13700, 'PAGADO'),
(7, 21, '2022-08-20', 5900, 'PAGADO'),
(8, 13, '2022-08-20', 5000, 'PAGADO'),
(9, 22, '2022-08-20', 1500, 'PAGADO'),
(10, 14, '2022-08-20', 8000, 'PAGADO'),
(11, 8, '2022-08-20', 24200, 'PENDIENTE');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--

CREATE TABLE `productos` (
  `id` int(11) NOT NULL,
  `denominacion` varchar(100) NOT NULL,
  `proveedor` varchar(50) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `precio` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `productos`
--

INSERT INTO `productos` (`id`, `denominacion`, `proveedor`, `cantidad`, `precio`) VALUES
(1, 'Oreo', 'Festival', 7, 900),
(2, 'Saltinas', 'Noe', 6, 4500),
(4, 'Ducales', 'Noe', 15, 4800),
(5, 'Ponquesito', 'Bimbo', 11, 4000),
(6, 'Milk chocolate', 'Dove', 17, 500),
(7, 'Cocosette', 'Colombina', 10, 1200),
(8, 'Minichips', 'Colombina', 9, 1100),
(9, 'Chocorramo', 'Ramo', 20, 1900),
(10, 'Almendras', 'Italy', 20, 6800),
(11, 'Coronita', 'Bavaria', 30, 2000),
(12, 'Masmellow', 'Colombina', 20, 3000),
(14, 'Mr. Brownie', 'Bimbo', 13, 2600);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `clientesjuridicos`
--
ALTER TABLE `clientesjuridicos`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `clientesnaturales`
--
ALTER TABLE `clientesnaturales`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `envios`
--
ALTER TABLE `envios`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `pagos`
--
ALTER TABLE `pagos`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `pedidos`
--
ALTER TABLE `pedidos`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `productos`
--
ALTER TABLE `productos`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `clientesjuridicos`
--
ALTER TABLE `clientesjuridicos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- AUTO_INCREMENT de la tabla `clientesnaturales`
--
ALTER TABLE `clientesnaturales`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT de la tabla `envios`
--
ALTER TABLE `envios`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `pagos`
--
ALTER TABLE `pagos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT de la tabla `pedidos`
--
ALTER TABLE `pedidos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT de la tabla `productos`
--
ALTER TABLE `productos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
