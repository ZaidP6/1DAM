DROP TABLE IF EXISTS producto;
DROP TABLE IF EXISTS alumno;


CREATE TABLE producto(
	id_producto serial,
	nombre varchar,
	precio real);
	
CREATE TABLE alumno(
	cod alumno serial,
	nombre varchar,
	aprellido1 varchar,
	apellido2 varchar,
	nombre_completo text,
	fecha_nacimiento date,
	edad_31_diciembre smallint, /*Indica que la eda va a ser menor de 200 y por tanto este le abarcará*/
	mail varchar(320));