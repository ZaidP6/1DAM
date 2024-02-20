-- 1. Seleccionar el vuelo más largo (con mayor duración) de cada día de la semana. 
-- Debe aparecer el nombre del aeropuerto de salida, el de llegada, la fecha y hora 
-- de salida y llegada y la duración.

SELECT to_char(salida, 'id') AS "dia", origen.nombre, destino.nombre, 
		salida, llegada, (llegada-salida)::interval AS "duracion"
FROM vuelo v JOIN aeropuerto origen ON(origen.id_aeropuerto = v.desde)
	JOIN aeropuerto destino ON (destino.id_aeropuerto = v.hasta)
WHERE age(llegada,salida) >= ALL (
								SELECT age(llegada, salida)
								FROM vuelo v2
								WHERE to_char(v.salida,'ID')= to_char(v2.salida, 'ID')
								)
GROUP BY to_char(salida, 'id'), origen.nombre, destino.nombre, 
		salida, llegada
ORDER BY dia;

------------------------- CORREGIDA EN CLASE -------------------------------------------

SELECT to_char(salida, 'id') AS "dia", origen.nombre, destino.nombre, 
		salida, llegada, (llegada-salida)::interval AS "duracion"
FROM vuelo v JOIN aeropuerto origen ON(origen.id_aeropuerto = v.desde)
	JOIN aeropuerto destino ON (destino.id_aeropuerto = v.hasta)
WHERE age(llegada,salida) >= ALL (
								SELECT age(llegada, salida)
								FROM vuelo v2
								WHERE to_char(v.salida,'ID')= to_char(v2.salida, 'ID')
								)
ORDER BY dia;

-- 2. Seleccionar el cliente que más ha gastado en vuelos que salen del mismo aeropuerto. 
-- Debe aparecer el nombre del cliente, el nombre y la ciudad del aeropuerto y la cuantía 
-- de dinero que ha gastado.

SELECT r.id_cliente,origen.nombre,SUM(precio-(COALESCE(descuento,0)/100*precio))
FROM cliente c JOIN reserva r USING (id_cliente)
			JOIN vuelo v USING(id_vuelo)
			JOIN aeropuerto origen ON(origen.id_aeropuerto = v.desde)
			JOIN aeropuerto destino ON (destino.id_aeropuerto = v.hasta)
GROUP BY r.id_cliente, c.nombre, c.apellido1, c.apellido2,origen.nombre			-- SE COLOCAN MAS ATRIBUTOS, c.nombre, c.apellido1, c.apellido2
HAVING SUM(precio-(COALESCE(descuento,0)/100*precio)) >= ALL
				(SELECT SUM(precio-(COALESCE(descuento,0)/100*precio))
				FROM vuelo v1 JOIN aeropuerto o ON(o.id_aeropuerto = v1.desde) -- SOBRA AEROPUERTO, NO HACE FALTA
				 				JOIN reserva USING (id_vuelo)
				WHERE o.nombre = origen.nombre 									-- NO HACE FALTA
				GROUP BY id_cliente, v1.desde)
ORDER BY r.id_cliente;

-- 3. Seleccionar el piso que se ha vendido más caro de cada provincia. Debe aparecer la 
-- provincia, el nombre del comprador, la fecha de la operación y la cuantía.

SELECT provincia, co.nombre, operacion.fecha_operacion, MAX(precio_final)
FROM comprador co JOIN operacion USING(id_cliente)
				JOIN inmueble USING(id_inmueble)
				JOIN tipo ON(tipo_inmueble = id_tipo)
GROUP BY provincia, co.nombre, operacion.fecha_operacion
HAVING MAX(precio_final) >= (SELECT MAX(o.precio_final)
							FROM operacion o JOIN inmueble USING(id_inmueble)
											JOIN tipo ON(tipo_inmueble = id_tipo)
							WHERE tipo.nombre = 'Piso' AND tipo_operacion = 'Venta'
							AND inmueble.provincia = provincia
							GROUP BY provincia
							);
							
-----------------------------------------------------------------------------------------
SELECT provincia, co.nombre, operacion.fecha_operacion, precio_final
FROM comprador co JOIN operacion USING(id_cliente)
				JOIN inmueble USING(id_inmueble)
				JOIN tipo ON(tipo_inmueble = id_tipo)
WHERE precio_final >= (SELECT o.precio_final
						FROM operacion o JOIN inmueble USING(id_inmueble)
										JOIN tipo ON(tipo_inmueble = id_tipo)
						WHERE tipo.nombre = 'Piso' AND tipo_operacion = 'Venta'
						AND inmueble.provincia = provincia
						GROUP BY provincia
							)
GROUP BY provincia, co.nombre, operacion.fecha_operacion
;

-- 4. Seleccionar los alquileres más baratos de cada provincia y mes (da igual el día y el año). 
-- Debe aparecer el nombre de la provincia, el nombre del mes, el resto de atributos de la tabla 
-- inmueble y el precio final del alquiler.

SELECT inm.provincia, to_char(fecha_alta,'TMMonth') AS "mes", MIN(precio)
FROM operacion o JOIN inmueble inm USING(id_inmueble)
				JOIN tipo t ON(tipo_inmueble = id_tipo)
WHERE inm.tipo_operacion = 'Alquiler'
GROUP BY provincia,to_char(fecha_alta,'TMMonth')
ORDER BY provincia;

----------------------------CORREGIDO EN LCASE-----------------------------------------------

SELECT provincia, TO_CHAR(fecha_operacion, 'Month'),
 precio_final,
 id_inmueble, fecha_alta, tipo_inmueble, tipo_operacion,
 superficie, precio
FROM inmueble i1 JOIN operacion o1 USING (id_inmueble)
WHERE tipo_operacion = 'Alquiler'
  AND precio_final <= ALL (
      SELECT precio_final
    FROM inmueble i2 JOIN operacion o2 USING (id_inmueble)
    WHERE tipo_operacion = 'Alquiler'
      AND i1.provincia = i2.provincia
      AND EXTRACT(month from o1.fecha_operacion) =
          (TO_CHAR(fecha_operacion, 'Month'));


