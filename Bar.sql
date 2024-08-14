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




alter table venta
alter column fecha Datetime;

alter table venta
add pago decimal(5,2)

select * from venta

select * from venta where idVenta = 6
select * from venta_detalle where idVenta = 6

delete from venta where idVenta = 6

alter table venta
add estado varchar(10)
alter table venta
add nota varchar(250) null


create table reporte(
	idReporte int identity(1,1) primary key,
	fechaV datetime,
	fechaInicio Datetime,
	fechaFinalizacion Datetime,
	fondo int,
	ventaDelTotal decimal(5,2),
	totalDeTickets int,
	totalDevoluciones decimal(5,2),
	totalOrdenesAnuladas int,
)

select D.idVenta, D.idProducto, P.nombre , C.nombreCategoria from venta_detalle D 
join PRODUCTOS P on D.idProducto = P.idProducto 
join CATEGORIA C on P.idCategoria = C.idCategoria
where idVenta = 


update venta 
set estado = 'CANCELADA'
where estado = null

select * from venta
where estado = 'ANULADA'

select * from reporte

select count(estado) from venta
where fecha between '20240808 00:00:00' and '20240809 23:59:59' 


select C.nombreCategoria as 'TOTAL DE COCTELES EN ORDEN 7' from CATEGORIA C
join PRODUCTOS P on P.idCategoria = C.idCategoria
join venta_detalle D on D.idProducto = P.idProducto
where D.idVenta = 7 and C.nombreCategoria ='COCTELES'


DECLARE @condition INT;
SET @condition = 0;
WHILE @condition < 20
BEGIN
	select D.idVenta, Count( C.nombreCategoria)as 'TOTAL DE COCTELES EN ORDENES' from CATEGORIA C
	join PRODUCTOS P on P.idCategoria = C.idCategoria
	join venta_detalle D on D.idProducto = P.idProducto
	where D.idVenta = @condition and C.nombreCategoria ='COCTELES'
	group by D.idVenta
	SET @condition = @condition + 1
END

select 
V.idVenta, P.nombre, P.precio, C.nombreCategoria
from 
venta_detalle D 
inner join PRODUCTOS P
on P.idProducto = D.idProducto
inner join CATEGORIA C
on P.idCategoria = C.idCategoria
and C.nombreCategoria = 'BOTELLAS'
inner join venta V
on V.idVenta = D.idVenta
where V.fecha between '2024-08-08 00:00:00' and '2024-08-12 23:59:59' and V.estado = 'CANCELADA'



DECLARE @TOTALPRODUCT AS TABLE
(TOTAL INT)

insert into @TOTALPRODUCT(TOTAL)
select 
Count(C.nombreCategoria)
from 
venta_detalle D 
inner join PRODUCTOS P
on P.idProducto = D.idProducto
inner join CATEGORIA C
on P.idCategoria = C.idCategoria
and C.nombreCategoria = 'COCTELES'
inner join venta V
on V.idVenta = D.idVenta
where V.fecha between '2024-08-08 00:00:00' and '2024-08-9 23:59:59'

SELECT SUM(TOTAL) as 'i' FROM @TOTALPRODUCT

select nombreCategoria from CATEGORIA
select  * from venta_detalle

select distinct
C.nombreCategoria as 'count ', sum(P.precio)
from 
venta_detalle D 
inner join PRODUCTOS P
on P.idProducto = D.idProducto
inner join CATEGORIA C
on P.idCategoria = C.idCategoria
inner join venta V
on V.idVenta = D.idVenta
where V.fecha between '2024-08-12 00:00:00' and '2024-08-12 23:59:59' and V.estado = 'CANCELADA'


select * from venta
where fecha between '2024-08-12 00:00:00' and '2024-08-12 23:59:59' and estado = 'CANCELADA'

select V.idVenta, D.idProducto, P.nombre ,D.precio, D.total, V.totalVenta from venta V
join venta_detalle D
on v.idVenta = d.idVenta
join PRODUCTOS P on P.idProducto = D.idProducto
where fecha between '2024-08-12 00:00:00' and '2024-08-12 23:59:59' and estado = 'CANCELADA'



select distinct sum(P.precio) from venta V
inner join venta_detalle D
on v.idVenta = d.idVenta
inner join PRODUCTOS P on P.idProducto = D.idProducto
where fecha between '2024-08-12 00:00:00' and '2024-08-12 23:59:59' and estado = 'CANCELADA'


select * from venta


select V.idVenta,V.fecha, D.idProducto, P.nombre, P.precio, V.totalVenta from venta V
inner join venta_detalle D on D.idVenta = V.idVenta
inner join PRODUCTOS P on P.idProducto = D.idProducto 
where V.fecha between '2024-08-12 00:00:00' and '2024-08-12 23:59:59'


select D.idVenta, C.nombreCategoria, D.idProducto, P.nombre, D.cantidad, P.precio,D.total, V.totalVenta, V.fecha, D.ticket 
from venta_detalle D
join Productos P on D.idProducto = P.idProducto
join venta V on V.idVenta = D.idVenta
join CATEGORIA C on P.idCategoria = C.idCategoria
where V.fecha between '2024-08-12 00:00:00' and '2024-08-12 23:59:59' and V.estado = 'CANCELADA'

select * from venta V
where V.fecha between '2024-08-12 00:00:00' and '2024-08-12 23:59:59' and V.estado = 'CANCELADA'

SELECT V.idVenta, V.totalVenta as TotalRegistrado, SUM(P.precio * D.cantidad) as total_calc
FROM venta V
JOIN venta_detalle D on V.idVenta = D.idVenta
JOIN PRODUCTOS P on D.idProducto = P.idProducto
GROUP BY V.idVenta
HAVING SUM(D.precio * D.cantidad) != V.totalVenta

SELECT * FROM VENTA

ALTER TABLE VENTA_DETALLE 
ADD pago decimal(5,2)


CREATE TRIGGER AGREGAR_VENTA
	ON VENTA
	FOR INSERT
	AS 
		INSERT INTO VENTA(fecha, totalVenta, pago, devuelto, estado, nota)
		SELECT GETDATE(), SUM(precio * cantidad), pago, SUM(precio * cantidad) - pago, 'CANCELADA', NULL 
		FROM VENTA_DETALLE 
		GROUP BY idVenta
GO

SELECT * FROM VENTA_DETALLE


drop table venta
drop table venta_detalle


CREATE TABLE DETALLE_VENTA(
	idDetalle int identity(1,1) primary key,
	idVenta int,
	idProducto int,
	cantidad int,
	precio decimal(5,2),
	total decimal(5,2),
	pago decimal(5,2),
	Devuelto Decimal(5,2),
	Estado varchar(10),
	Nota varchar(250) null,

	CONSTRAINT FK_PRODUCTOSID FOREIGN KEY (idProducto) REFERENCES PRODUCTOS (idProducto),
	CONSTRAINT FK_IDVENTA FOREIGN KEY (idVenta) REFERENCES VENTA(idVenta)
)

CREATE TABLE VENTA(
	idVenta int identity(1,1) primary key,
	Total decimal(5,2),
	Fecha Datetime
)

--insert into VENTA_DETALLE(idVenta, idProducto, cantidad, precio, total, ticket, pago)"

select * from venta
select * from DETALLE_VENTA

--CALCULAR TOTAL DE TICKETS
SELECT COUNT(DISTINCT V.idVenta) from VENTA V
JOIN DETALLE_VENTA D ON D.idVenta = V.idVenta
WHERE V.Fecha between '2024-08-13 00:00:00' and '2024-08-13 23:59:59' and D.Estado = 'CANCELADA'
-
--CALCULAR PROMEDIO
SELECT SUM(Total) / (
	SELECT count(DISTINCT V.idVenta) from VENTA V
	JOIN DETALLE_VENTA D ON D.idVenta = V.idVenta
	WHERE V.Fecha between '2024-08-13 00:00:00' and '2024-08-13 23:59:59' and D.Estado = 'CANCELADA'
) AS 'PROM'
FROM VENTA 

--CALCULAR VENTA TOTAL
SELECT SUM(DISTINCT V.TOTAL) AS 'SUM' FROM VENTA V
JOIN DETALLE_VENTA D ON D.idVenta = V.idVenta
WHERE V.Fecha BETWEEN '2024-08-13 00:00:00' and '2024-08-13 23:59:59' and D.Estado = 'CANCELADA'

--TOTAL VENTA DE PRODUCTOS AGRUPADO POR CATEGORIA
SELECT D.cantidad*(
	SELECT SUM(P.PRECIO)
	FROM CATEGORIA C
	JOIN PRODUCTOS P ON P.idCategoria = C.idCategoria AND C.nombreCategoria = 'COCTELES'
	JOIN DETALLE_VENTA D ON D.idProducto = P.idProducto 
	JOIN VENTA V ON V.idVenta = D.idVenta
	WHERE V.Fecha BETWEEN '2024-08-13 00:00:00' and '2024-08-13 23:59:59' and D.Estado = 'CANCELADA'
) AS TOTAL
FROM DETALLE_VENTA D

SELECT SUM(P.PRECIO)
FROM CATEGORIA C
JOIN PRODUCTOS P ON P.idCategoria = C.idCategoria AND C.nombreCategoria = 'COCTELES'
JOIN DETALLE_VENTA D ON D.idProducto = P.idProducto 
JOIN VENTA V ON V.idVenta = D.idVenta
WHERE V.Fecha BETWEEN '2024-08-13 00:00:00' and '2024-08-13 23:59:59' and D.Estado = 'CANCELADA'



DECLARE @NUM1 DECIMAL(10,2)
DECLARE @NUM2 DECIMAL(10,2)
DECLARE @NUM3 DECIMAL(10,2)
SET @NUM1 = (SELECT SUM(distinct V.TOTAL) AS 'SUM' FROM VENTA V
				JOIN DETALLE_VENTA D ON D.idVenta = V.idVenta
				WHERE V.Fecha BETWEEN '2024-08-13 00:00:00' and '2024-08-13 23:59:59' and D.Estado = 'CANCELADA')

SET @NUM3 = (SELECT SUM(TOTAL) FROM VENTA)
SET @NUM2 = (SELECT SUM(P.PRECIO)
			FROM CATEGORIA C
			JOIN PRODUCTOS P ON P.idCategoria = C.idCategoria
			JOIN DETALLE_VENTA D ON D.idProducto = P.idProducto 
			JOIN VENTA V ON V.idVenta = D.idVenta
			WHERE V.Fecha BETWEEN '2024-08-13 00:00:00' and '2024-08-13 23:59:59' and D.Estado = 'CANCELADA')
			
SELECT @NUM2 - @NUM3 AS 'FALTA'

SELECT C.nombreCategoria,* FROM PRODUCTOS P
JOIN CATEGORIA C
ON P.idCategoria = C.idCategoria 
WHERE PRECIO = 3.50


SELECT * FROM DETALLE_VENTA

SELECT * FROM VENTA

SELECT D.idVenta, C.nombreCategoria, D.idProducto, p.nombre,D.cantidad, D.precio, D.total ,D.pago, D.Devuelto, V.Total, D.Estado, V.Fecha
FROM DETALLE_VENTA D
JOIN VENTA V ON V.idVenta = D.idVenta
JOIN PRODUCTOS P ON P.idProducto = D.idProducto
JOIN CATEGORIA C ON C.idCategoria = P.idCategoria
WHERE V.Fecha BETWEEN '2024-08-13 00:00:00' and '2024-08-13 23:59:59' and D.Estado = 'CANCELADA'

SELECT SUM(TOTAL) FROM VENTA

SELECT * FROM DETALLE_VENTA
SELECT * FROM VENTA

TRUNCATE TABLE DETALLE_VENTA
DELETE FROM VENTA

UPDATE DETALLE_VENTA
SET CANTIDAD = 11
WHERE idProducto = 23

UPDATE DETALLE_VENTA
SET total = 74.25
WHERE idProductO = 23
 
SELECT * FROM VENTA
SELECT * FROM DETALLE_VENTA

--CONSULTA DEFINITIVA 

SELECT C.nombreCategoria, SUM(D.CANTIDAD)
FROM DETALLE_VENTA D
JOIN PRODUCTOS P ON D.idProducto = P.idProducto
JOIN CATEGORIA C ON P.idProducto = C.idCategoria AND C.nombreCategoria = 'COCTELES'
GROUP BY C.nombreCategoria

SELECT SUM(D.cantidad) 
FROM CATEGORIA C
JOIN PRODUCTOS P ON P.idCategoria = C.idCategoria
JOIN DETALLE_VENTA D ON D.idProducto = P.idProducto 
JOIN VENTA V ON V.idVenta = D.idVenta
WHERE V.Fecha BETWEEN '2024-08-13 00:00:00' and '2024-08-13 23:59:59' and D.Estado = 'CANCELADA'


--QUERY DEFINITIVO :
SELECT C.nombreCategoria, SUM(D.total) 
FROM DETALLE_VENTA D
JOIN PRODUCTOS P ON P.idProducto = D.idProducto
JOIN CATEGORIA C ON P.idCategoria = C.idCategoria
GROUP BY C.nombreCategoria
-------------------------------------------------------

SELECT C.nombreCategoria, * FROM DETALLE_VENTA D
JOIN PRODUCTOS P ON P.idProducto = D.idProducto
JOIN CATEGORIA C ON C.idCategoria = P.idCategoria

WHERE idVenta = 32
SELECT SUM(TOTAL) AS HOLA FROM VENTA
