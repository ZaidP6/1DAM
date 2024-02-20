--------- PILAR AGUILAR DÍAZ ----------16-01-2024-----

DROP TABLE IF EXISTS asignacion_act CASCADE;
DROP TABLE IF EXISTS asistencia_act CASCADE;
DROP TABLE IF EXISTS actividad CASCADE;
DROP TABLE IF EXISTS docente CASCADE;
DROP TABLE IF EXISTS alumno CASCADE;


CREATE TABLE docente(
	dni varchar,
	nombre varchar NOT NULL,
	telefono varchar NOT NULL,
	anio_ingreso date NOT NULL,
	CONSTRAINT pk_docente PRIMARY KEY (dni)
);

CREATE TABLE actividad(
	idAct serial,
	nombre text NOT NULL,
	duracion interval NOT NULL,
	CONSTRAINT pk_actividad PRIMARY KEY(idAct)
);

CREATE TABLE alumno(
	cod_alumno serial,
	nombre text NOT NULL,
	telefono varchar NOT NULL,
	nivel varchar NOT NULL,
	CONSTRAINT pk_alumno PRIMARY KEY (cod_alumno)
);

CREATE TABLE asignacion_act(
	idDoc varchar,
	idAct integer,
	diaSemana date,
	hora timestamp,
	CONSTRAINT pk_asignacion_act PRIMARY KEY (idDoc,idAct,diaSemana,hora)
);

CREATE TABLE asistencia_act(
	idAlum varchar,
	idAct integer,
	idDoc varchar,
	CONSTRAINT pk_asistencia_act PRIMARY KEY (idAlum, idAct)
);

ALTER TABLE asignacion_act
ADD CONSTRAINT fk_asignacion_act_actividad FOREIGN KEY (idAct)
REFERENCES actividad (idAct)
ON DELETE CASCADE;

ALTER TABLE asistencia_act
ADD CONSTRAINT fk_asistencia_act_actividad FOREIGN KEY (idAct)
REFERENCES actividad (idAct)
ON DELETE CASCADE;

ALTER TABLE asistencia_act
ADD CONSTRAINT fk_asistencia_act_docente FOREIGN KEY (idDoc)
REFERENCES docente (dni)
ON DELETE CASCADE;



