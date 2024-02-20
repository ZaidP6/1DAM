DROP TABLE IF EXISTS empleado;
DROP TABLE IF EXISTS cliente;
DROP TABLE IF EXISTS producto;
DROP TABLE IF EXISTS categoria;
DROP TABLE IF EXISTS venta CASCADE;
DROP TABLE IF EXISTS linea_venta CASCADE;


CREATE TABLE empleado(
	num_empleado serial,
	nombre varchar NOT NULL,
	apellidos varchar NOT NULL,
	email varchar(320), 
	cuenta_corriente varchar(24),
	pass varchar(8),
	CONSTRAINT pk_empleado PRIMARY KEY (num_empleado),
	CONSTRAINT ck_empleado_email CHECK (email LIKE '%@%'),
	CONSTRAINT ck_empleado_cuenta_corriente CHECK cuenta_corriente LIKE 'ES%',
	CONSTRAINT ck_empleado_pass CHECK ((LENGTH(pass)) BETWEEN 1 AND 8) AND (pass NOT LIKE '% %')
);

CREATE TABLE cliente(
	dni varchar,
	nombre varchar NOT NULL,
	apellidos varchar NOT NULL,
	email varchar(320),
	direccion varchar(100),
	CONSTRAINT pk_cliente PRIMARY KEY (dni),
	CONSTRAINT ck_cliente_email CHECK (email LIKE '%@%')
);

CREATE TABLE venta (
	id_venta serial, 
	fecha date NOT NULL,
	empleado int NOT NULL, 
	cliente varchar NOT NULL,
	CONSTRAINT pk_venta PRIMARY KEY (id_venta)
);

CREATE TABLE linea_venta(
	id_venta integer,
	id_linea integer,
	cantidad integer,
	producto varchar,
	precio numeric(10,2) NOT NULL,
	CONSTRAINT pk_linea_venta PRIMARY KEY (id_venta, id_linea),
	CONSTRAINT ck_linea_venta_cantidad CHECK (cantidad > 0),
	CONSTRAINT ck_linea_venta_precio CHECK precio SET DEFAULT precio = 9.99
);

CREATE TABLE producto (
	cup varchar,
	nombre varchar NOT NULL,
	descripcion text,
	pvp numeric NOT NULL,
	categoria integer,
	CONSTRAINT pk_producto PRIMARY KEY (cup)
);

CREATE TABLE categoria (
	id_categoria serial, 
	nombre varchar NOT NULL,
	descripcion text,
	CONSTRAINT pk_categoria PRIMARY KEY (id_categoria)
);

ALTER TABLE venta
ADD CONSTRAINT fk_venta_empleado FOREIGN KEY (empleado)
REFERENCES empleado(num_empleado);

ALTER TABLE venta
ADD CONSTRAINT fk_venta_cliente FOREIGN KEY (cliente)
REFERENCES cliente(dni);


ALTER TABLE linea_venta
ADD CONSTRAINT fk_linea_venta_producto FOREIGN KEY (producto)
REFERENCES producto(cup)
ON DELETE SET DEFAULT;

ALTER TABLE linea_venta
ADD CONSTRAINT fk_linea_venta_venta FOREIGN KEY (id_venta)
REFERENCES venta(id_venta)
ON DELETE CASCADE;

ALTER TABLE producto
ADD CONSTRAINT fk_producto_categoria FOREIGN KEY (categoria)
REFERENCES categoria(id_categoria)
ON DELETE SET NULL;


INSERT INTO categoria (nombre, descripcion)
VALUES('Apple', 'Productos de la marca Apple')
RETURNING id_categoria;

ALTER TABLE producto ALTER COLUMN categoria SET DEFAULT 1;

INSERT INTO cliente (dni, nombre, apellidos, email, direccion)
VALUES ('58964718H', 'Jesus', 'Casanova', 'jesus.casanova@mitienda.com', 'Los campos verdes 56'),
		('85413958F', 'Rafael', 'Villar', 'rafael.villar@correo.com',)

INSERT INTO producto (cup, nombre, descripcion, pvp)
VALUES ('GCYHBKUBYV', 'Mac Mini', 'Mac Mini M2 de 256GB de disco duro', 799.00);

INSERT INTO empleado (nombre, apellidos, email, cuenta_corriente, pass)
VALUES ('Miguel', 'Campos', 'mcampos@mitienda.com', 'ES1200000000000012345678', 'ikdtjcr')
RETURNING num_empleado;

INSERT INTO venta (cliente,empleado,fecha)
VALUES ('58964718H', 1, CURRENT_DATE);

INSERT INTO linea_venta (id_venta,id_linea,cantidad,producto,precio)
VALUES(1, 1, 1, 'GCYHBKUBYV', 799.00);



-- ACTUALIZACION DE PRECIO POR EL DIA DEL PADRE
UPDATE producto SET pvp = pvp*0.9
RETURNING nombre, pvp AS pvp_dia_del_padre;

ALTER TABLE cliente DROP