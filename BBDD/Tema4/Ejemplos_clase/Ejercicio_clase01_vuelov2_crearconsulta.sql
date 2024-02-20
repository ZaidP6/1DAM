SELECT v1.desde, v2.hasta, r1.fecha_reserva,v1.salida, v1.llegada
FROM vuelo v1 JOIN aeropuerto a1 ON(v1.desde = a1.id_aeropuerto)
					JOIN vuelo v2 ON( a1.id_aeropuerto = v2.hasta)
					JOIN reserva r1 USING(id_vuelo)
WHERE a1.ciudad = 'Sevilla' AND v1.salida::text BETWEEN '2023-09'::text AND '2023-11'::text 
							AND r1.fecha_reserva::text BETWEEN '2023-07'::text AND '2023-09'::text
ORDER BY v1.salida;

-- Seleciona los vuelos que salgan desde Sevilla en los meses de septiembre a noviembre de este año, 
-- cuya reserva se hayan hecho entre julio y septiembre. Mostrando las fechas, desde dónde salen y a 
-- dónde llegaron. Ordénalos por fecha de salida.


SELECT *
FROM vuelo