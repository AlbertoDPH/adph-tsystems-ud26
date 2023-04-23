DROP table IF EXISTS piezas;
DROP table IF EXISTS proveedores;
DROP table IF EXISTS suministra;


/*Creamos la primera tabla que no tiene ninguna clave foránea*/
CREATE TABLE proveedores(
id char(4),
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
id_proveedor char(4),
precio int,
primary key (id),

CONSTRAINT pieza_fk foreign key(codigo_pieza) references piezas(codigo) on delete cascade on update cascade,
CONSTRAINT proveedore_fk foreign key(id_proveedor) references proveedores(id) on delete cascade on update cascade
);

-- registros tabla proveedores
INSERT INTO proveedores (id, nombre) VALUES ('P001', 'Proveedor 1');
INSERT INTO proveedores (id, nombre) VALUES ('P002', 'Proveedor 2');
INSERT INTO proveedores (id, nombre) VALUES ('P003', 'Proveedor 3');

-- registros tabla piezas
INSERT INTO piezas (nombre) VALUES ('Tornillo');
INSERT INTO piezas (nombre) VALUES ('Tuerca');
INSERT INTO piezas (nombre) VALUES ('Arandela');
INSERT INTO piezas (nombre) VALUES ('Clavo');

-- registros tabla suministra
INSERT INTO suministra (codigo_pieza, id_proveedor, precio) VALUES (1, 'P001', 10);
INSERT INTO suministra (codigo_pieza, id_proveedor, precio) VALUES (2, 'P002', 8);
INSERT INTO suministra (codigo_pieza, id_proveedor, precio) VALUES (3, 'P003', 5);
