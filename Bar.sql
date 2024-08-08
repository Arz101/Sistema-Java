SELECT * FROM COCTELES
SELECT * FROM CERVEZAS
SELECT * FROM BOTELLAS

drop table BEBIDAS
drop table PRODUCTOS

select * from ORDENES order by fecha 
select * from CERVEZAS

SELECT C.NOMBRE, C.PRECIO
FROM COCTELES C
UNION ALL
SELECT B.NOMBRE, B.PRECIO
FROM BOTELLAS B
UNION ALL
SELECT S.NOMBRE, S.PRECIO
FROM CERVEZAS S
UNION ALL
SELECT E.NOMBRE, E.PRECIO
FROM ENTRADAS E
UNION ALL 
SELECT P.NOMBRE, P.PRECIO
FROM PLATOS P

SELECT * FROM ORDENES ORDER BY FECHA ASC

SELECT * FROM ORDENES WHERE FECHA = NULL

SELECT * FROM ORDENES

ALTER TABLE ORDENES

SELECT * FROM BOTELLAS

SELECT * FROM BOTELLAS
WHERE PRECIO > 100

CREATE TABLE USERS(
	userName varchar(10) primary key,
	pass varchar(10)
);

SELECT * FROM USERS
INSERT INTO USERS(userName, pass) VALUES ('admin', '12345')
SELECT userName, pass from users where userName = 'admin' AND pass = ''

select * from BOTELLAS
select * from CERVEZAS
select * from COCTELES
select * from ENTRADAS
select * from PLATOS

CREATE TABLE DETALLE(
	CodDetalle int identity(1,1) primary key,
	idBotellas int,
	idCerveza int,
	idCocteles int,
	idEntradas int,
	idPlatos int,
	Cantidad int,
	constraint fk_Botellas foreign key (idBotellas) references BOTELLAS (ID_BOTELLA),
	constraint fk_Cervezas foreign key (idCerveza) references CERVEZAS (ID_CERVEZA),
	constraint fk_Cocteles foreign key (idCocteles) references COCTELES (ID_COCTELES),
	constraint fk_Entradas foreign key (idEntradas) references ENTRADAS (ID_ENTRADA),
	constraint fk_Platos foreign key (idPlatos) references PLATOS (ID_PLATO)
)

CREATE TABLE CATEGORIA(
	idCategoria int identity(1,1) primary key,
	nombreCategoria varchar(50)
)


INSERT INTO CATEGORIA(nombreCategoria) values ('BOTELLAS')
INSERT INTO CATEGORIA(nombreCategoria) values ('COCTELES')
INSERT INTO CATEGORIA(nombreCategoria) values ('CERVEZAS')
INSERT INTO CATEGORIA(nombreCategoria) values ('ENTRADAS')
INSERT INTO CATEGORIA(nombreCategoria) values ('BOTELLAS')
INSERT INTO CATEGORIA(nombreCategoria) values ('PLATOS')

delete from CATEGORIA where idCategoria = 5

select * from CATEGORIA


CREATE TABLE PRODUCTOS(
	idProducto int identity(1,1) primary key,
	idCategoria int,
	nombre varchar(100),
	constraint fk_idCategorias foreign key (idCategoria) references CATEGORIA(idCategoria)
)

alter table PRODUCTOS
add precio decimal(5,2)

select * from PRODUCTOS
select * from CATEGORIA

insert into PRODUCTOS(idCategoria, nombre, precio)
Select 1 ,NOMBRE, PRECIO from BOTELLAS

insert into PRODUCTOS(idCategoria, nombre, precio)
Select 2 ,NOMBRE, PRECIO from COCTELES

insert into PRODUCTOS(idCategoria, nombre, precio)
Select 3 ,NOMBRE, PRECIO from CERVEZAS

insert into PRODUCTOS(idCategoria, nombre, precio)
Select 4 ,NOMBRE, PRECIO from ENTRADAS

insert into PRODUCTOS(idCategoria, nombre, precio)
Select 6 ,NOMBRE, PRECIO from PLATOS

CREATE TABLE VENTA(
	idVenta int identity(1,1) primary key,
	fecha date,
	ticket int,
	devuelto decimal(5,2),
	total decimal(5,2),
)

truncate table venta
drop table venta

alter table VENTA
add ticket int 
alter table VENTA
drop column devuelto 

alter table VENTA
drop column idDetalle

drop table DETALLE
drop table BOTELLAS
drop table CERVEZAS
drop table COCTELES
drop table ENTRADAS
drop table PLATOS
drop table ORDENES


select * from VENTA

select * from PRODUCTOS

CREATE TABLE VENTA_DETALLE(
	idDetalle int identity(1,1) primary key,
	idVenta int,
	idProducto int,
	cantidad int,
	precio decimal(5,2),
	total decimal(5,2),

	constraint fk_idProducto foreign key (idProducto) references PRODUCTOS(idProducto),
	constraint fk_idVenta foreign key (idVenta) references VENTA(idVenta)
)

drop table VENTA_DETALLE

select * from VENTA_DETALLE
select * from VENTA
select * from PRODUCTOS

INSERT INTO VENTA(fecha, ticket, total) values ('07/08/2024', 1 ,80.00)

insert into VENTA_DETALLE(idDetalle ,idVenta, idProducto, cantidad, precio, total)
values (1, 1, 1, 2 , 40.00, 80.00)

insert into VENTA_DETALLE(idDetalle,idVenta, idProducto, cantidad, precio, total)
values (1, 1, 2, 2 , 38.00, 76.00)

drop table VENTA_DETALLE


select * from PRODUCTOS

Select P.idCategoria,  C.nombreCategoria, P.idProducto, P.nombre, P.precio
from PRODUCTOS P
join CATEGORIA C on P.idCategoria = C.idCategoria
where nombreCategoria = 'PLATOS'

select * from VENTA_DETALLE
SELECT * FROM VENTA


select P.nombre, P.idProducto, P.precio from PRODUCTOS P

select * from VENTA

drop table venta
drop table venta_detalle

truncate table venta
truncate table venta_detalle
delete from venta

select * from venta_detalle

select * from venta_detalle D
join PRODUCTOS P on D.idProducto = P.idProducto

select * from venta
where idVenta = 6

select * from venta_detalle 
where idVenta = 6


select V.idVenta, V.idProducto, P.nombre, V.precio, V.cantidad,V.total,A.total, A.fecha from venta_detalle V
inner join venta A on V.idVenta = A.idVenta 
inner join PRODUCTOS P on V.idProducto = P.idProducto


select * from venta


alter table VENTA
drop column ticket

alter table venta_detalle
add ticket int 


select D.idVenta, D.idProducto, P.nombre, D.cantidad, P.precio,D.total, V.totalVenta, V.fecha, D.ticket from venta_detalle D
join Productos P on D.idProducto = P.idProducto
join venta V on V.idVenta = D.idVenta
where V.idVenta = 7


select P.nombre, D.cantidad, P.precio, D.total from PRODUCTOS P
join venta_detalle D on P.idProducto = D.idProducto
where D.idVenta = 6

select * from venta
select * from venta_detalle

delete from venta 
where idVenta = 8

delete from venta 
where idVenta = 9

delete from venta 
where idVenta = 10


select * from venta

select * from USERS

select username from users where userName = 'admin' 


create table users(
	userN varchar(50) primary key,
	pass varchar(50),
	permisos varchar(10)
)

insert into users(userN, pass, permisos) values('admin', '12345', 'SI')
insert into users(userN, pass, permisos) values('public', '', 'NO')

select * from users



select * from PRODUCTOS
where PRECIO > 30 AND idCategoria = 3

SELECT * FROM PRODUCTOS
WHERE idCategoria = 3

UPDATE PRODUCTOS
SET nombre = 'BALDE_PILSENER'
WHERE idProducto = 50

UPDATE PRODUCTOS
SET nombre = 'BALDE_GOLDEN'
WHERE idProducto = 51

UPDATE PRODUCTOS
SET nombre = 'BALDE_GOLDEN_X'
WHERE idProducto = 52

UPDATE PRODUCTOS
SET nombre = 'BALDE_CORONA'
WHERE idProducto = 53
