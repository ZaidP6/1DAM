-- EJERCICIO 1 --------------------------------

SELECT origen.ciudad, destino.ciudad, v.salida, v.llegada
FROM vuelo v JOIN aeropuerto origen ON (origen.id_aeropuerto = v.desde)
			JOIN aeropuerto destino ON (destino.id_aeropuerto = v.hasta)
			JOIN avion av USING(id_avion)
WHERE av.nombre ilike 'Boeing%' AND origen.ciudad = 'Londres'
				AND to_char(salida, 'MM-YYYY') = '08-2023';
				
				
-- EJERCICIO 3 --------------------------------

SELECT COUNT(r.id_reserva) AS "Reservas"
FROM reserva r  LEFT JOIN vuelo v USING(id_vuelo)
				JOIN aeropuerto origen ON (origen.id_aeropuerto = v.desde)
				JOIN aeropuerto destino ON (destino.id_aeropuerto = v.hasta)
WHERE origen.nombre = 'Barajas' AND destino.nombre = 'Berlín-Tegel' 
				AND v.descuento IS NOT NULL;

-- EJERCICIO 4 --------------------------------

SELECT c.nombre, c.apellido1, c.apellido2,(COALESCE(descuento,0)/100 * v.precio)
FROM vuelo v JOIN aeropuerto origen ON (origen.id_aeropuerto = v.desde)
			JOIN aeropuerto destino ON (destino.id_aeropuerto = v.hasta)
			JOIN avion av USING(id_avion)
			JOIN reserva r USING(id_vuelo)
			JOIN cliente c USING(id_cliente)
WHERE origen.nombre = 'Pablo Picasso' AND (to_char(salida, 'dy') = 'sat' AND to_char(salida, 'MM') = '04'
										OR to_char(salida, 'dy') = 'fri' AND to_char(salida, 'MM') = '06');
									--AND to_char(salida, 'HH') BETWEEN '12'::text AND '16'::text;
									
-- EJERCICIO 5 --------------------------------

SELECT DISTINCT c.nombre, c.apellido1, c.apellido2, ROUND(v.precio*(1- COALESCE(v.descuento,0)/100),2)
FROM vuelo v JOIN aeropuerto origen ON (origen.id_aeropuerto = v.desde)
			JOIN aeropuerto destino ON (destino.id_aeropuerto = v.hasta)
			JOIN avion av USING(id_avion)
			JOIN reserva r USING(id_vuelo)
			JOIN cliente c USING(id_cliente)
WHERE (to_char(salida, 'dy')= 'fri' OR to_char(salida, 'dy') ='sat' 
	  						OR to_char(salida, 'dy') ='sun') AND destino.ciudad = 'Barcelona'
	  					AND (llegada-salida)::interval > '1h 50min';
						
-- EJERCICIO 2 --------------------------------

SELECT c.nombre, c.apellido1, c.apellido2
FROM vuelo v JOIN aeropuerto origen ON (origen.id_aeropuerto = v.desde)
			JOIN aeropuerto destino ON (destino.id_aeropuerto = v.hasta)
			JOIN avion av USING(id_avion)
			RIGHT JOIN reserva r USING(id_vuelo)
			JOIN cliente c USING(id_cliente)
WHERE (to_char(salida, 'YYYY') = '2023' AND to_char(salida, 'MM') = '09');



									