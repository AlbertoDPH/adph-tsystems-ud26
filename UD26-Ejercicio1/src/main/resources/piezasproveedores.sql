-- drop database if exists piezasproveedores;
-- create database piezasproveedores;
-- use piezasproveedores;

DROP table IF EXISTS piezas;
DROP table IF EXISTS proveedores;
DROP table IF EXISTS suministra;


/*Creamos la primera tabla que no tiene ninguna clave foránea*/
CREATE TABLE proveedores(
id INT auto_increment,
nombre nvarchar(100),
primary key(id)
);

/*Creamos la segunda tabla que no tiene ninguna clave foránea*/
CREATE TABLE piezas(
codigo INT auto_increment,
nombre nvarchar(100),
primary key(codigo)
);

/*Creamos la tercera tabla que tiene clave foránea que no deje eliminar
pero que si actualizada en cascata*/
CREATE TABLE suministra(
id INT auto_increment,
codigo_pieza int,
id_proveedor int,
precio int,
primary key (id),

CONSTRAINT pieza_fk foreign key(codigo_pieza) references piezas(codigo) on delete cascade on update cascade,
CONSTRAINT proveedor_fk foreign key(id_proveedor) references proveedores(id) on delete cascade on update cascade
);

-- registros tabla proveedores
INSERT INTO proveedores (nombre) VALUES ('Proveedor 1');
INSERT INTO proveedores (nombre) VALUES ('Proveedor 2');
INSERT INTO proveedores (nombre) VALUES ('Proveedor 3');

-- registros tabla piezas
INSERT INTO piezas (nombre) VALUES ('Tornillo');
INSERT INTO piezas (nombre) VALUES ('Tuerca');
INSERT INTO piezas (nombre) VALUES ('Arandela');
INSERT INTO piezas (nombre) VALUES ('Clavo');

-- registros tabla suministra
INSERT INTO suministra (codigo_pieza, id_proveedor, precio) VALUES (3, 2, 10);
INSERT INTO suministra (codigo_pieza, id_proveedor, precio) VALUES (2, 3, 8);
INSERT INTO suministra (codigo_pieza, id_proveedor, precio) VALUES (3, 1, 5);
