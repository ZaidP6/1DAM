-- 1. Selecciona los datos del inmueble sobre el que se ha realizado una operación un lunes de febrero o un viernes 
-- de marzo, que tenga más de 200 metros cuadrados y donde el nombre del vendedor contenga una A mayúscula o minúscula.


-- 2. Selecciona el precio medio por metro cuadrado de los alquileres de viviendas en los meses de marzo y abril 
-- de cualquier año para las provincias costeras de Andalucía.

SELECT ROUND(AVG(inmueble.precio/inmueble.superficie),2) AS "precio_medio_m2"
FROM inmueble JOIN tipo ON(tipo_inmueble = id_tipo)
WHERE tipo_operacion = 'Alquiler' AND date_part('month', fecha_alta) IN (3,4) 
			AND provincia IN ('Huelva', 'Cádiz', 'Málaga', 'Granada', 'Almería') 
			AND tipo.nombre IN ('Piso', 'Casa');

-- 3. ¿Cuál es la media del porcentaje de diferencia entre el precio inicial (en la tabla inmueble) y el precio final 
-- (en la tabla operación) para aquellas operaciones de alquiler realizadas en enero de cualquier año, donde el tipo del 
-- inmueble es Oficina, Local o Suelo?

SELECT *
FROM 
WHERE

-- 4. Seleccionar el nombre de aquellos compradores de Casa o Piso en las provincias de Jaén o Córdoba, donde el precio 
-- final de inmueble esté entre 150.000 y 200.000€, para aquellos inmuebles que han tardado entre 3 y 4 meses en venderse.


-- 5. Selecciona la media del precio inicial (en la tabla inmueble), del precio final (en la tabla operación) y de la diferencia 
-- en porcentaje entre ellas de aquellas viviendas (Casa o Piso) en alquiler que tengan menos de 100 metros cuadrados y que hayan 
-- tardado un año o más en alquilarse.


-- 6. Selecciona el alquiler de vivienda (Casa o Piso) más caro realizado en Julio o Agosto de cualquier año en la provincia de Huelva.
