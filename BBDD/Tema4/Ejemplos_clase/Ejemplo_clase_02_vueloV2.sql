SELECT *
FROM aeropuerto JOIN vuelo ON (id_aeropuerto = desde);

SELECT *
FROM aeropuerto a1 JOIN vuelo ON (desde = a1.id_aeropuerto) JOIN aeropuerto a2 ON (hasta = a2.id_aeropuerto) 
WHERE desde = a1.ciudad = 'Sevilla' AND hasta = a2.ciudad = 'Madrid';


SELECT *
FROM aeropuerto;
