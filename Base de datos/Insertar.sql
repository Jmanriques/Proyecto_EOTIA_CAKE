use eokiacake;
INSERT INTO cliente (Identificacion, Nombre, Apellido, Correo, Telefono)
values ('10123566', 'Franklin', 'Garcia','frangar@gmail.com', '3165343109');

INSERT INTO cliente (Identificacion, Nombre, Apellido, Correo, Telefono)
values ('21325698', 'Edison', 'Meneces','edimen@gmail.com', '3175343259');

INSERT INTO cliente (Identificacion, Nombre, Apellido, Correo, Telefono)
values ('2588445', 'Daniel', 'Castro','dani2987@gmail.com', '3155343132');

INSERT INTO cliente (Identificacion, Nombre, Apellido, Correo, Telefono)
values ('16585855', 'Samuel', 'Alvarez','samuel29@gmail.com', '3145348877');

INSERT INTO cliente (Identificacion, Nombre, Apellido, Correo, Telefono)
values ('77559555', 'Camilo', 'Espinosa','camiespi@gmail.com', '31153458279');

INSERT INTO producto (Idproducto, Nombre, Descripcion, Precio)values ('253421', 'Pastel Morado', 'Para eventos especiales','60.000');
INSERT INTO producto (Idproducto, Nombre, Descripcion, Precio)values ('312568', 'Cupcakes', 'pequeña porción de tarta para una persona','40.000');
INSERT INTO producto (Idproducto, Nombre, Descripcion, Precio)values ('452456', 'Pastel Chocolete', 'Torta para personas amantes al chocolate','50.000');
INSERT INTO producto (Idproducto, Nombre, Descripcion, Precio)values ('552831', 'Pastel Harry', 'Pastel para niños','40.000');

INSERT INTO venta (Idventa, Idproducto, Identificacion, FechaVenta, TotalVenta, Cantidad, Subtotal)values ('10123566', 'Franklin', 'Garcia','frangar@gmail.com', '3165343109');

INSERT INTO Factura (IdFactura, IdVenta)values ('10123566', 'Franklin', 'Garcia','frangar@gmail.com', '3165343109');