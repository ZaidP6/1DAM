SELECT * --salida, llegada, fecha_reserva, a1.ciudad, a2.ciudad
FROM vuelo v JOIN aeropuerto a1 ON(v.desde = a1.id_aeropuerto)
			JOIN aeropuerto a2 ON(v.hasta = a2.id_aeropuerto)	
				JOIN reserva USING(id_vuelo)
WHERE a1.ciudad = 'Berlín' AND (date_part(v.salida, 'Mon') IN ('Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun')
							AND date_part(v.salida, 'Year') = '2023')
ORDER BY fecha_reserva;

--------------------------------------------------------------------------------

SELECT * --salida, llegada, fecha_reserva, a1.ciudad, a2.ciudad
FROM vuelo v JOIN aeropuerto a1 ON(v.desde = a1.id_aeropuerto)
			JOIN aeropuerto a2 ON(v.hasta = a2.id_aeropuerto)	
				JOIN reserva USING(id_vuelo)
WHERE a1.ciudad = 'Berlín' AND (EXTRACT(month FROM v.salida) BETWEEN 1 AND 6
							AND 
ORDER BY fecha_reserva;


-- Seleciona los vuelos que salgan desde Berlín en los 6 primeros meses del año, 
-- cuya reserva se hayan hecho al menos 1 mes antes.
-- Muestra las fechas de salida y llegada, la fecha de reserva, desde dónde salen y a dónde llegaron.
-- Ordénalos por fecha de reserva.