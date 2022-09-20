DROP DATABASE IF EXISTS EOKIACAKE;
CREATE DATABASE IF NOT EXISTS  EOKIACAKE;
USE EOKIACAKE;
CREATE TABLE  IF NOT EXISTS  Cliente
(
Identificacion varchar(30) primary key,
Nombre varchar(100),
Apellido varchar(100),
Correo varchar(100),
Telefono varchar(50)
);
CREATE TABLE  IF NOT EXISTS  Producto
(
IdProducto BIGINT AUTO_INCREMENT primary key,
Nombre varchar(100),
Descripcion varchar(100),
Precio bigint
);
CREATE TABLE IF NOT EXISTS Venta
(
IdVenta BIGINT AUTO_INCREMENT primary key,
IdProducto Bigint,
FOREIGN KEY(IdProducto) REFERENCES Producto(IdProducto),
Identificacion varchar(30),
FOREIGN KEY(Identificacion) REFERENCES Cliente(Identificacion),
FechaVenta timestamp,
TotalVenta varchar(1000),
Cantidad integer,
Subtotal varchar(1000)
);
CREATE TABLE IF NOT EXISTS Factura
(
IdFactura BIGINT AUTO_INCREMENT primary key,
IdVenta bigint, 
FOREIGN KEY(IdVenta) REFERENCES Venta(IdVenta)  
);