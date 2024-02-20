DROP TABLE IF EXISTS libro;
DROP TABLE IF EXISTS autor;
DROP TABLE IF EXISTS editorial;
DROP TABLE IF EXISTS genero;
DROP TABLE IF EXISTS edicion;

CREATE TABLE autor(
	dni varchar(10),
	nombre varchar NOT NULL,
	nacionalidad VARCHAR,
	CONSTRAINT pk_autor PRIMARY KEY (dni)
);

CREATE TABLE editorial(
	cod_editorial serial, 
	nombre varchar NOT NULL,
	direccion text, 
	poblacion VARCHAR,
	CONSTRAINT pk_editorial PRIMARY KEY(cod_editorial)
);

CREATE TABLE genero(
	id_genero serial, 
	nombre varchar NOT NULL,
	descripcion text,
	CONSTRAINT pk_genero PRIMARY KEY(id_genero)
);

CREATE TABLE libro(
	isbn varchar,
	titulo varchar NOT NULL,
	dni_autor varchar(10) NOT NULL,
	cod_genero integer NOT NULL,
	cod_editorial integer NOT NULL,
	CONSTRAINT pk_libro PRIMARY KEY (isbn),
	CONSTRAINT fk_libro_autor FOREIGN KEY (dni_autor) REFERENCES autor,
	CONSTRAINT fk_libro_genero FOREIGN KEY (cod_genero) REFERENCES genero,
	CONSTRAINT fk_libro_editorial FOREIGN KEY (cod_editorial) REFERENCES editorial	
);

CREATE TABLE edicion(
	isbn varchar,
	fecha_publicacion date,
	cantidad integer,
	CONSTRAINT pk_edicion PRIMARY KEY (isbn, fecha_publicacion),
	CONSTRAINT fk_edicion_libro FOREIGN KEY (isbn) REFERENCES libro,
	CONSTRAINT ck_cantidad_positiva CHECK (cantidad>0)
);




