DROP TABLE IF EXISTS invitado CASCADE;
DROP TABLE IF EXISTS teatro CASCADE;
DROP TABLE IF EXISTS obra CASCADE;
DROP TABLE IF EXISTS tipo_asiento CASCADE;
DROP TABLE IF EXISTS exhibe CASCADE;
DROP TABLE IF EXISTS asiento_tipo CASCADE;
DROP TABLE IF EXISTS precio;
DROP TABLE IF EXISTS entrada CASCADE;

CREATE TABLE invitado(
	NroInvitado serial,
	Nombre varchar, 
	Categoria varchar,
	Origen varchar,
	CONSTRAINT pk_invitado PRIMARY KEY (NroInvitado)
);

CREATE TABLE teatro(
	CodTeat serial,
	Nombre varchar,
	Direccion text,
	CantAsientos integer,
	CONSTRAINT pk_teatro PRIMARY KEY (CodTeat)
);

CREATE TABLE obra(
	CodObra serial,
	NombreObra text,
	Autor text,
	CONSTRAINT pk_obra PRIMARY KEY(CodObra)
);

CREATE TABLE exhibe(
	CodTeat integer,
	Fecha date,
	CodObra integer,
	CONSTRAINT pk_exhibe PRIMARY KEY (CodTeat,Fecha)
);

CREATE TABLE tipo_asiento(
	Tipo integer,
	Nombre varchar,
	Descripcion text,
	CONSTRAINT pk_tipo_asiento PRIMARY KEY (Tipo)
);

CREATE TABLE asiento_tipo(
	NroAsiento integer,
	Tipo integer,
	CONSTRAINT pk_asiento_tipo PRIMARY KEY (NroAsiento)
);

CREATE TABLE precio(
	CodTeat integer,
	Fecha date,
	Tipo integer,
	NroInvit integer,
	CONSTRAINT pk_precio PRIMARY KEY (CodTeat, Fecha,Tipo)
);

CREATE TABLE entrada(
	CodTeat integer,
	Fecha date,
	NroAsiento integer,
	NroInvitado integer,
	CONSTRAINT pk_entrada PRIMARY KEY (CodTeat, Fecha,NroAsiento)
);

ALTER TABLE exhibe
ADD CONSTRAINT fk_exhibe_teatro FOREIGN KEY (CodTeat) 
REFERENCES teatro (CodTeat)
ON DELETE CASCADE;

ALTER TABLE exhibe
ADD CONSTRAINT fk_exhibe_obra FOREIGN KEY (CodObra)
REFERENCES obra (CodObra)
ON DELETE CASCADE;

ALTER TABLE asiento_tipo
ADD CONSTRAINT fk_asiento_tipo_tipo_asiento FOREIGN KEY (Tipo)
REFERENCES tipo_asiento (Tipo);

ALTER TABLE precio
ADD CONSTRAINT fk_precio_exhibe FOREIGN KEY (CodTeat, Fecha)
REFERENCES exhibe (CodTeat, Fecha);

ALTER TABLE entrada
ADD CONSTRAINT fk_entrada_exhibe FOREIGN KEY (CodTeat,Fecha)
REFERENCES exhibe (CodTeat,Fecha)
ON DELETE CASCADE;

ALTER TABLE entrada
ADD CONSTRAINT fk_entrada_asiento_tipo FOREIGN KEY (NroAsiento)
REFERENCES asiento_tipo (NroAsiento)
ON DELETE CASCADE;

ALTER TABLE entrada
ADD CONSTRAINT fk_entrada_invitado FOREIGN KEY (NroInvitado)
REFERENCES invitado (NroInvitado)
ON DELETE CASCADE;