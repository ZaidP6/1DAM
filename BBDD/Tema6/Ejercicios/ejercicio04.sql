DROP TABLE IF EXISTS uso CASCADE;
DROP TABLE IF EXISTS bicicleta CASCADE;
DROP TABLE IF EXISTS estacion CASCADE;
DROP TABLE IF EXISTS usuario CASCADE;

CREATE TABLE usuario(
	dni varchar,
	nombre varchar NOT NULL,
	apellidos varchar NOT NULL,
	direccion text,
	telefono varchar NOT NULL,
	email varchar NOT NULL,
	passw varchar,
	saldo_disponible numeric NOT NULL,
	CONSTRAINT pk_usuario PRIMARY KEY (dni),
	CONSTRAINT ck_usuario_passw1 CHECK (length (passw)  BETWEEN 4 AND 8),
	CONSTRAINT ck_usuario_passw2 CHECK (passw NOT LIKE '[ ]_')
	
);

CREATE TABLE estacion(
	cod_estacion varchar,
	num_estacion serial NOT NULL,
	direccion text NOT NULL,
	latitud numeric NOT NULL,
	longitud numeric NOT NULL,
	CONSTRAINT pk_estacion PRIMARY KEY (cod_estacion)
);

CREATE TABLE bicicleta(
	cod_bicicleta serial,
	marca varchar NOT NULL,
	modelo varchar NOT NULL,
	fecha_alta date NOT NULL,
	CONSTRAINT pk_bicicleta PRIMARY KEY (cod_bicicleta)
);

CREATE TABLE uso(
	estacion_salida varchar,
	fecha_salida timestamp,
	dni_usuario varchar,
	cod_bicicleta integer,
	estacion_llegada varchar,
	fecha_llegada timestamp NOT NULL,
	CONSTRAINT pk_uso PRIMARY KEY (estacion_salida,
	fecha_salida,dni_usuario,cod_bicicleta,estacion_llegada)
);

ALTER TABLE usuario
ALTER COLUMN saldo_disponible SET DEFAULT 0;

ALTER TABLE uso
ADD CONSTRAINT fk_uso_estacion_sallida FOREIGN KEY(estacion_salida) 
REFERENCES estacion (cod_estacion)
ON DELETE CASCADE;

ALTER TABLE uso
ADD CONSTRAINT fk_uso_usuario FOREIGN KEY (dni_usuario) 
REFERENCES usuario(dni)
ON DELETE CASCADE;

ALTER TABLE uso
ADD CONSTRAINT fk_uso_bicicleta FOREIGN KEY (cod_bicicleta)
REFERENCES bicicleta (cod_bicicleta)
ON DELETE CASCADE;

ALTER TABLE uso
ADD CONSTRAINT fk_uso_estacion_llegada FOREIGN KEY (estacion_llegada)
REFERENCES estacion (cod_estacion)
ON DELETE CASCADE;

ALTER TABLE usuario
ADD COLUMN fecha_baja timestamp;


--------------------------CONSULTA-----------
SELECT usuario.dni, SUM(EXTRACT(MINUTE FROM(uso.fecha_llegada -uso.fecha_salida))) AS "tiempo_min",
			SUM(EXTRACT(MINUTE FROM(uso.fecha_llegada -uso.fecha_salida))) * 0.001 AS "acumulado_precio"
FROM uso JOIN usuario ON (uso.dni_usuario = usuario.dni)
GROUP BY usuario.dni, usuario.nombre, usuario.apellidos
ORDER BY dni;