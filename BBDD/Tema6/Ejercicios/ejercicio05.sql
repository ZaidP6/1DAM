DROP TABLE IF EXISTS matricula_curso_alumno CASCADE;
DROP TABLE IF EXISTS curso CASCADE;
DROP TABLE IF EXISTS tipo_curso CASCADE;
DROP TABLE IF EXISTS alumno CASCADE;
DROP TABLE IF EXISTS empresa CASCADE;
DROP TABLE IF EXISTS profesor CASCADE;


CREATE TABLE alumno(
	dni varchar,
	direccion text,
	nombre varchar,
	telefono varchar,
	fecha_nac date,
	empresa text,
	CONSTRAINT pk_alumno PRIMARY KEY (dni)
);

CREATE TABLE empresa(
	cif varchar(9),
	nombre varchar,
	telefono varchar,
	direccion text,
	CONSTRAINT pk_empresa PRIMARY KEY (cif)
);

CREATE TABLE tipo_curso(
	cod_curso integer,
	duracion interval,
	programa text,
	titulo text,
	CONSTRAINT pk_tipo_curso PRIMARY KEY (cod_curso)
);

CREATE TABLE curso(
	cod_curso serial,
	tipo_curso integer,
	fecha_inicio date,
	fecha_fin date,
	dni_profesor varchar,
	CONSTRAINT pk_curso PRIMARY KEY(cod_curso)
);

CREATE TABLE profesor(
	dni varchar(9),
	nombre varchar,
	apellido varchar,
	telefono varchar,
	direccion text,
	CONSTRAINT pk_profesor PRIMARY KEY (dni)
);

CREATE TABLE matricula_curso_alumno(
	dni varchar(9),
	cod_curso integer,
	CONSTRAINT pk_matricula_curso_alumno PRIMARY KEY (dni, cod_curso)
);

ALTER TABLE alumno
ADD CONSTRAINT fk_alumno_empresa FOREIGN KEY (empresa)
REFERENCES empresa (cif)
ON DELETE CASCADE;

ALTER TABLE curso
ADD CONSTRAINT fk_curso_profesor FOREIGN KEY (dni_profesor)
REFERENCES profesor (dni)
ON DELETE CASCADE;

ALTER TABLE curso
ADD CONSTRAINT fk_curso_tipo_curso FOREIGN KEY (tipo_curso)
REFERENCES tipo_curso (cod_curso)
ON DELETE CASCADE;

ALTER TABLE matricula_curso_alumno
ADD CONSTRAINT fk_matricula_curso_alumno_alumno FOREIGN KEY (dni)
REFERENCES alumno (dni)
ON DELETE CASCADE;

ALTER TABLE matricula_curso_alumno
ADD CONSTRAINT fk_matricula_curso_alumno_curso FOREIGN KEY (cod_curso)
REFERENCES curso (cod_curso)
ON DELETE CASCADE;


INSERT INTO profesor (dni, nombre, apellido, direccion)
VALUES ('79939274Z','JOSE ANDRES','BUENO VILLANUEVA','ENPARANTZA HORNO, 5'),
		('25760566Z','ALEJANDRA', 'HERNANDO LATORRE', 'AVINGUDA HORNO, 95'),
		('69819966Q','JOSE DAVID','ROJO GAMEZ','PLAZUELA PEDRALBES, 81'),
		('17516845E','MANUEL', 'DOMENECH LORENZO', 'RONDA IGLESIA, 94'),
		('76987667C', 'RAMON', 'SALINAS QUESADA', 'CARRER MAYOR, 55'),
		('55995904N', 'VALENTINA', 'NOGUERA CONTRERAS', 'VIA REAL, 0'),
		('04051714B', 'ISIDORO', 'CANO PUENTE', 'PLAZUELA DE ESPAÑA, 83'),
		('38007340R', 'LUIS', 'CANTERO SERRA', 'TRAVESSERA MAYOR, 3'),
		('37963364R', 'CRISTINA', 'APARICIO GRACIA', 'CARRETERA REAL, 62'),
		('70601119C', 'FRANCISCO JAVIER', 'PACHECO FERRER','CUESTA PEDRALBES, 48'),
		('37231505W', 'NATIVIDAD', 'ABAD MENDEZ', 'CARRETERA REAL, 4'),
		('80068534Z', 'ARIADNA', 'SOSA GAMEZ', 'VIA NUEVA, 96'),
		('11990753W', 'ANA ISABEL', 'AMAYA GALLEGO', 'URBANIZACIÓN CATALUNYA, 13'),
		('42398783P', 'MIRIAN', 'GALLEGO SAAVEDRA', 'BULEVAR HORNO, 7'),
		('86632859R', 'JUAN PABLO', 'CASTELLANOS CALERO', 'RONDA NUEVA, 49'),
		('48327172D', 'JULIAN', 'HERNANDEZ VAZQUEZ', 'PLACETA IGLESIA, 30'),
		('78063956R', 'ADELA', 'CABRERA MARQUEZ', 'RÚA NUEVA, 6'),
		('37846820K', 'MARIA JOSE', 'MARTI AGUILAR', 'EDIFICIO MAYOR, 1'),
		('54646339H', 'CLARA', 'DOMINGUEZ RUBIO','POBLADO HORNO, 83'),
		('65362382Q', 'JOSE DANIEL', 'ANDRES GAMEZ', 'URBANIZACIÓN CATALUNYA, 40'),
		('47286005Y', 'ANA ROSA', 'TRUJILLO BOSCH', 'EDIFICIO IGLESIA, 65');
		
INSERT INTO empresa (cif, nombre, direccion, telefono)
VALUES ('W5776230D', 'EXIBAM SL', 'EDIFICIO DE ESPAÑA, 3', '913198225'),
		('N6166984B', 'MONIWARD SL', 'KALEA DE ESPAÑA, 24', '912440975'),
		('A95637344', 'LOCANE SA', 'TRAVESÍA REAL, 88', '918396054'),
		('B75786111', 'PORTABAGE SL', 'CUESTA HORNO, 85', '960754348');
		
INSERT INTO alumno (dni, nombre, direccion, telefono, fecha_nac, empresa)
VALUES ('35653123H', 'JUANA MARIA GRANDE LUCAS', 'RAMBLA DE ESPAÑA, 80', '757049541', '9/10/1964', 'W5776230D'),
		('20579006D', 'ESTEBAN FERREIRO JUAN', 'PLAZA PEDRALBES, 18', '615627676', '4/5/1991', 'W5776230D'),
		('46154025V', 'ISABEL SOLIS CABEZAS', 'CAMPO NUEVA, 72', '698827820', '27/5/1984', 'W5776230D'),
		('01775838P', 'ANA ISABEL ALCAIDE DOMENECH', 'RONDA DE ESPAÑA, 27', '713811127', '13/6/1964', 'W5776230D'),
		('99070112G', 'BERNARDO SALAZAR MEDINA', 'PASEO MAYOR, 52', '779193274', '18/12/1951', 'W5776230D'),
		('45090329W', 'SONIA MUÑIZ CUEVAS', 'ENPARANTZA MAYOR, 99', '790819950', '12/2/1955', 'N6166984B'),
		('96393090K', 'XAVIER SALVADOR GIL', 'PARQUE DE ESPAÑA, 34', '661577817', '30/5/1975', 'N6166984B'),
		('14109970E', 'FIDEL WANG DAVILA','CALLEJA REAL, 98','662636410', '16/8/1955', 'N6166984B'),
		('42675822N', 'ABRIL DOMENECH ALCAIDE', 'POLÍGONO MADRID, 14', '731044342', '17/6/1987', 'N6166984B'), 
		('95487266Y', 'ANGELA SEGURA CASTILLA', 'SECTOR IGLESIA, 74', '749380166', '23/5/1975', 'N6166984B'),
		('08621313Q', 'MARIA REYES ROSADO AGUADO', 'PASSATGE REAL, 75', '646945211', '28/1/1988', 'B75786111'),
		('34728177V', 'FERNANDO DEL POZO MARRERO', 'CUESTA IGLESIA, 51', '735040950', '15/12/2001',  'B75786111'), 
		('49018616G', 'GERMAN CHACON ARRIBAS', 'SECTOR IGLESIA, 87','617429625', '11/8/1997','B75786111'),
		('32556148Q', 'MARIA CRISTINA MATEO MENDOZA','BARRIO CATALUNYA, 99', '723982895', '6/8/1988', 'B75786111'), 
		('43373729F', 'SERAFIN MAS DAVILA', 'BULEVAR REAL, 22', '694575392', '30/4/2002', 'B75786111');
		
INSERT INTO tipo_curso (cod_curso, duracion, programa, titulo)
VALUES (1, '150:00:00', 'Curso de inglés del nivel B1 con una duración de 150 horas', 'Curso inglés B1'),
		(2, '200:00:00', 'Curso de inglés del nivel C1 con una duración de 200 horas', 'Curso inglés C1'),
		(3, '300:00:00', 'Curso de electricidad con una duración de 300 horas', 'Curso electricidad'),
		(4, '500:00:00', 'Curso de ofimática básica con una duración de 500 horas', 'Curso ofimática'),
		(5, '700:00:00', 'Curso de informática con una duración de 700 horas', 'Curso informática');

INSERT INTO curso (cod_curso, tipo_curso, fecha_inicio,fecha_fin, dni_profesor)
VALUES (1, 1, '15-09-2023', '30-05-2024', '79939274Z'),
		(2, 1, '15-09-2024', '30-05-2025', '25760566Z'),
		(3, 2, '15-09-2023', '30-05-2024', '69819966Q'),
		(4, 2, '15-09-2024', '30-05-2025', '17516845E'),
		(5, 3, '15-09-2023', '30-05-2024', '76987667C'),
		(6, 3, '15-09-2024', '30-05-2025', '55995904N'),
		(7, 4, '15-09-2023', '30-05-2024', '04051714B'),
		(8, 4, '15-09-2024', '30-05-2025', '38007340R'),
		(9, 5, '15-09-2023', '30-05-2024', '37963364R'),
		(10, 5, '15-09-2024','30-05-2025', '70601119C'),
		(11, 5, '01-06-2023','08-01-2024', '37231505W'),
		(12, 5, '01-04-2023','08-10-2024', '80068534Z'),
		(13, 4, '01-06-2024','08-01-2025', '42398783P'),
		(14, 4, '01-06-2023','08-01-2024', '86632859R'),
		(15, 3, '01-06-2024','08-01-2025', '37846820K'),
		(16, 3, '01-06-2023','08-01-2024', '54646339H'),
		(17, 2, '01-06-2024','08-01-2025', '65362382Q'),
		(18, 2, '01-06-2023','08-01-2024', '47286005Y'),
		(19, 1, '01-06-2024','08-01-2025', '11990753W'),
		(20, 1, '01-06-2023','08-01-2024', '78063956R');
		
		
--------------------------------------
---------------CONSULTAS

SELECT *
FROM empresa JOIN alumno ON empresa.cif = alumno.empresa
				JOIN matricula_curso_alumno USING dni
				JOIN curso USING (cod_curso)
				JOIN tipo_curso ON tipo_curso.cod_curso = curso.tipo_curso
				JOIN profesor ON profesor.dni = curso.dni_profesor;