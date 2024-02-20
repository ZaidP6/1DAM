-- 1. (HR) Selecciona el número de empleados que fueron contratados en el año 1997 en 
-- la que trabajen en una oficina situada en Bélgica.

SELECT COUNT(*)
FROM employees e JOIN departments USING (department_id)
				JOIN locations USING(location_id)
				JOIN countries c USING(country_id)
WHERE date_part('Year',e.hire_date) = 1997 AND c.country_name = 'Belgium';

-------------------------CORREGIDA EN CLASE-----------------------------------------------

SELECT COUNT(*)
FROM employees e RIGHT JOIN departments USING (department_id)
				RIGHT JOIN locations USING(location_id)
				RIGHT JOIN countries c USING(country_id)
WHERE date_part('Year',e.hire_date) = 1997 AND c.country_name = 'Belgium';

-- 2. (HR) Selecciona la media de salario máximo de los trabajadores de Administration 
-- en Asia.

select AVG(e.salary) --MAX?
FROM regions r JOIN countries USING(region_id)
				JOIN locations USING(country_id)
				JOIN departments d USING(location_id)
				JOIN employees e USING (department_id)
WHERE d.department_name = 'Administration' AND r.region_name = 'Asia';

----------------------CORREGIDO EN CLASE----------------------------------------

SELECT COALESCE(AVG(max_salary),0)
FROM regions r JOIN countries USING(region_id)
				JOIN locations USING(country_id)
				JOIN departments d USING(location_id)
				JOIN employees e USING (department_id)
				JOIN jobs USING (job_id)
WHERE d.department_name = 'Administration' AND r.region_name = 'Asia';


-- 3. (INMO) Selecciona el nombre del comprador, el nombre del vendedor, la provincia 
-- y la fecha de operación de las viviendas (casa y piso) alquiladas en el tercer 
-- trimestre de año en las provincias de Huelva, Sevilla y Almería. Ordena la 
-- salida por fecha de operación descendentemente.

SELECT c.nombre AS "nombre_comprador", v.nombre AS "nombre_vendedor", 
				i.provincia, o.fecha_operacion
FROM comprador c JOIN operacion o USING(id_cliente)
				JOIN vendedor v USING(id_vendedor)
				JOIN inmueble i USING (id_inmueble)
				JOIN tipo t ON(i.tipo_inmueble = id_tipo)
WHERE t.nombre IN('Casa', 'Piso') AND tipo_operacion = 'Alquiler' 
				AND i.provincia IN('Huelva', 'Sevilla', 'Almería')
				AND to_char(o.fecha_operacion,'q') = '3'
ORDER BY o.fecha_operacion DESC;

-- 4. (INMO) Modifica la consulta anterior para que las viviendas que fueran vendidas 
-- en un plazo de entre 35 y 45 días desde que se dieron de alta en la inmobiliaria.

SELECT c.nombre AS "nombre_comprador", v.nombre AS "nombre_vendedor", 
				i.provincia, o.fecha_operacion, age(o.fecha_operacion, i.fecha_alta)
FROM comprador c JOIN operacion o USING(id_cliente)
				JOIN vendedor v USING(id_vendedor)
				JOIN inmueble i USING (id_inmueble)
				JOIN tipo t ON(i.tipo_inmueble = id_tipo)
WHERE t.nombre IN('Casa', 'Piso') AND tipo_operacion = 'Venta' 
				AND (i.provincia IN('Huelva', 'Sevilla', 'Almería'))
				AND age(o.fecha_operacion, i.fecha_alta) BETWEEN '35 days' AND '45 days'
ORDER BY o.fecha_operacion DESC;

--------------------------------CORREGIDO BIEN + OTRAS OPCIONES---------------------
WHERE o.fecha_operacion - fecha_alta BETWEEN 35 AND 45
	age(o.fecha_operacion, i.fecha_alta) BETWEEN '35 days'::interval AND '45 days'::interval
	fecha_operacion BETWEEN fecha_alta + 35 AND fecha_alta + 5

-- 5. (INMO) Calcula el precio máximo y precio mínimo por metro cuadrado de venta 
-- de inmuebles que no sean viviendas (no sean Piso o Casa) en provincias que 
-- contengan una n (mayúscula o minúscula), siempre que los inmuebles se hayan 
-- vendido en un mes que escrito de forma completa en inglés tenga entre 5 y 7 caracteres.

SELECT ROUND(MAX(i.precio/i.superficie),2), ROUND(MIN(i.precio/i.superficie),2)
FROM operacion o JOIN inmueble i USING (id_inmueble)
				JOIN tipo t ON(i.tipo_inmueble = id_tipo)
WHERE t.nombre NOT IN('Casa', 'Piso') AND tipo_operacion = 'Venta' 
				AND (i.provincia ILIKE '%n%');
				--AND EXTRACT(o.fecha_operacion, 'Month')  BETWEEN (5 AND 7)::varchar
------------------------------------------------------------------------------------
SELECT ROUND(MAX(i.precio/i.superficie),2), ROUND(MIN(i.precio/i.superficie),2)
FROM operacion o JOIN inmueble i USING (id_inmueble)
				JOIN tipo t ON(i.tipo_inmueble = id_tipo)
WHERE t.nombre NOT IN('Casa', 'Piso') AND tipo_operacion = 'Venta' 
				AND (i.provincia ILIKE '%n%')
				AND length(to_char(o.fecha_operacion, 'FMmonth')) BETWEEN 5 AND 7
				
-- 6. (VUELOS) ¿Cuál es el descuento medio obtenido en vuelos donde el origen sea España 
-- y el destino fuera de España, siempre que estos vuelos no se hayan realizado en fin 
-- de semana (contaremos como fin de semana los Viernes a partir de las 15:00)?


SELECT *
FROM vuelo v JOIN aeropuerto a1 ON(a1.id_aeropuerto = desde)
			JOIN aeropuerto a2 ON(a2.id_aeropuerto = hasta)
WHERE a1.ciudad IN ('Sevilla', 'Bilbao', 'Madrid', 'Málaga', 'Barcelona')
			AND a2.ciudad NOT IN ('Sevilla', 'Bilbao', 'Madrid', 'Málaga', 'Barcelona');
			--AND EXTRACT('D' from v.salida) IN(6,7,1)
			
--------------------------------------------------------------------------------------

SELECT AVG(COALESCE(descuento,0))
FROM vuelo v JOIN aeropuerto a1 ON (v.desde = a1.id_aeropuerto)
      		JOIN aeropuerto a2 ON (v.hasta = a2.id_aeropuerto)
WHERE a1.ciudad IN ('Sevilla', 'Bilbao', 'Madrid', 'Málaga', 'Barcelona')
			AND a2.ciudad NOT IN ('Sevilla', 'Bilbao', 'Madrid', 'Málaga', 'Barcelona')
			AND (EXTRACT(isodow from v.salida) BETWEEN 1 AND 4
			OR (EXTRACT(isodow from v.salida) = 5 AND EXTRACT(hour from v.salida) < 15))
			
