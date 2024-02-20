-- 1. Selecciona los datos del inmueble sobre el que se ha realizado una operación un lunes de febrero o un viernes de marzo, 
-- que tenga más de 200 metros cuadrados y donde el nombre del vendedor contenga una A mayúscula o minúscula.

SELECT DISTINCT(i.*)
FROM comprador c JOIN operacion o USING (id_cliente)
				JOIN vendedor v USING(id_vendedor)
				JOIN inmueble i  USING(id_inmueble)
WHERE ((date_part('Day', o.fecha_operacion) = 2 AND date_part('Month', o.fecha_operacion) = 2 )
		OR (date_part('Day', o.fecha_operacion) = 6 AND date_part('Month', o.fecha_operacion) = 3))
		AND (v.nombre ilike '%a%') AND (superficie > 200);

-- 2. Selecciona el precio medio por metro cuadrado de los alquileres de viviendas en los meses de marzo y abril de cualquier 
-- año para las provincias costeras de Andalucía.

SELECT AVG(i.precio/superficie) AS "mediaPm2"
FROM operacion o JOIN inmueble i USING(id_inmueble)
WHERE (date_part('Month', o.fecha_operacion) IN (3,4)) 
			AND (i.provincia IN ('Cádiz', 'Huelva', 'Málaga', 'Granada', 'Almería'))
			AND (tipo_operacion = 'Alquiler');
			
---------------------------CORREGIDO--------------------------------------------

SELECT ROUND(AVG(inmueble.precio/inmueble.superficie),2) AS "precio_medio_m2"
FROM inmueble JOIN tipo ON(tipo_inmueble = id_tipo)
WHERE tipo_operacion = 'Alquiler' AND date_part('month', fecha_alta) IN (3,4) 
			AND provincia IN ('Huelva', 'Cádiz', 'Málaga', 'Granada', 'Almería') 
			AND tipo.nombre IN ('Piso', 'Casa');

-- 3 .¿Cuál es la media del porcentaje de diferencia entre el precio inicial (en la tabla inmueble) y el precio 
-- final (en la tabla operación) para aquellas operaciones de alquiler realizadas en enero de cualquier año, donde el tipo del 
-- inmueble es Oficina, Local o Suelo?

SELECT AVG(ROUND((100-(o.precio_final*100/i.precio)),2)) AS "Media%"
FROM operacion o JOIN inmueble i USING(id_inmueble) 
				JOIN tipo ti ON (i.tipo_inmueble=ti.id_tipo)
WHERE (date_part('Month', o.fecha_operacion) = 1) AND (ti.nombre IN('Oficina', 'Local', 'Suelo'))
			AND (i.tipo_operacion = 'Alquiler');
			
-----------------------------------------------------------------------------------

SELECT ROUND(AVG(100-(o.precio_final*100/i.precio)),2) AS "Media%"
FROM operacion o JOIN inmueble i USING(id_inmueble) 
				JOIN tipo ti ON (i.tipo_inmueble=ti.id_tipo)
WHERE (date_part('Month', o.fecha_operacion) = 1) AND (ti.nombre IN('Oficina', 'Local', 'Suelo'))
			AND (i.tipo_operacion = 'Alquiler');

-- 4. Seleccionar el nombre de aquellos compradores de Casa o Piso en las provincias de Jaén o Córdoba, donde el precio final 
-- de inmueble esté entre 150.000 y 200.000€, para aquellos inmuebles que han tardado entre 3 y 4 meses en venderse.

SELECT c.nombre
FROM comprador c JOIN operacion o USING(id_cliente)
				JOIN inmueble i USING(id_inmueble)
				JOIN tipo ti ON (tipo_inmueble =id_tipo)
WHERE (i.provincia IN('Jaén', 'Córdoba')) AND ti.nombre IN('Casa', 'Piso') 
					AND (o.precio_final BETWEEN 150000 AND 200000)
					AND tipo_operacion = 'Venta'
					AND (age(fecha_operacion, fecha_alta) BETWEEN '3 mon'::interval and '4 mon'::interval);
					
---------------------------OTRA OPCION CORREGIDO EN CLASE--------------------------

					AND fecha_operacion BETWEEN fecha_alta + '3 mon'::interval AND fecha_alta + '4 mon'::interval;

-- 5. Selecciona la media del precio inicial (en la tabla inmueble), del precio final (en la tabla operación) y de la diferencia 
-- en porcentaje entre ellas de aquellas viviendas (Casa o Piso) en alquiler que tengan menos de 100 metros cuadrados y que hayan 
-- tardado un año o más en alquilarse. Se modifica de un año a un mes.

SELECT AVG(i.precio) AS "media_pInicial", AVG(o.precio_final) AS "mediaPfinal", avg((precio)/(precio_final)*100) AS "difPrecio%"
FROM operacion o JOIN inmueble i USING(id_inmueble)
				JOIN tipo ti ON (tipo_inmueble = id_tipo)
WHERE ti.nombre IN('Casa','Piso')  AND (i.superficie < 100)
					AND tipo_operacion = 'Alquiler'
					AND (age(fecha_operacion, fecha_alta)>= '1 month'::interval);
					
----------------------------------------CORREGIDO CLASE-----------------------------------------------------

SELECT AVG(i.precio) AS "media_pInicial", AVG(o.precio_final) AS "mediaPfinal", ROUND(((AVG(i.precio)-AVG(o.precio_final))/AVG(i.precio)*100),2) AS "difPrecio%"
FROM operacion o JOIN inmueble i USING(id_inmueble)
				JOIN tipo ti ON (tipo_inmueble = id_tipo)
WHERE ti.nombre IN('Casa','Piso')  AND (i.superficie < 100)
					AND tipo_operacion = 'Alquiler'
					AND (age(fecha_operacion, fecha_alta)>= '1 month'::interval);


-- 6. Selecciona el alquiler de vivienda (Casa o Piso) más caro realizado en Julio o Agosto de cualquier año en la provincia de Huelva.

SELECT MAX (precio_final)
FROM inmueble i JOIN operacion o USING (id_inmueble)
				JOIN tipo ti ON (i.tipo_inmueble = ti.id_tipo)
WHERE i.tipo_operacion = 'Alquiler' AND i.provincia = 'Huelva' 
		AND ti.nombre IN ('Casa','Piso')
		AND date_part ('month', o.fecha_operacion) IN (7,8);
		-- to_char( o.fecha_operacion,'MM') IN('07', '08')
		-- to_char( o.fecha_operacion,'FMMonth') IN('August', 'July')
		-- to_char( o.fecha_operacion,'Mon') IN('Aug', 'Jul')
		

-- 7. Diseña una consulta (incluyendo su solución) para la base de datos INMO que contenga los siguientes elementos.
	-- La salida del select no será SELECT *
	-- Debe realizar el JOIN de al menos 3 tablas.
	-- Uno de los JOINs debe, obligatoriamente, ser un JOIN ON
	-- Al menos, tendrá dos condiciones en el WHERE (conectadas con AND u OR). Una de las condiciones debe de utilizar, de alguna forma, fechas. Y la solución debe de utilizar las funciones o expresiones de fechas trabajadas en esta unidad didáctica.
	-- Debe ordenar la salida por algún criterio.

-- Selecciona el id del inmueble, la fecha de alta, la fecha de la operación, el tiempo que ha tardado en venderse, el tipo de inmueble, 
-- la provincia, los metros cuadrados, el precio inicial, el precio final y la diferencia del precio al que estaba y luego se ah vendido.
-- Donde los m2 sean más de 200, el tiempo que se haya tardado en vender esté entre los 2 y 6 meses en las provincias de Sevilla y Huelva.
-- Ordénalos por el tiempo que tardó en venderse.

SELECT i.id_inmueble, i.fecha_alta, o.fecha_operacion, AGE(o.fecha_operacion, i.fecha_alta) AS "tiempo_operacion" , 
		ti.nombre, i.provincia, i.superficie, i.precio, o.precio_final, (i.precio - o.precio_final) AS "diferencia precio"
FROM operacion o JOIN inmueble i  USING(id_inmueble)
				JOIN tipo ti ON (tipo_inmueble = id_tipo)	
WHERE (superficie > 200) AND (age(fecha_operacion, fecha_alta) BETWEEN '2 mon'::interval and '6 mon'::interval)
					AND tipo_operacion = 'Venta' AND i.provincia IN ('Huelva', 'Sevilla')
ORDER BY tiempo_operacion;