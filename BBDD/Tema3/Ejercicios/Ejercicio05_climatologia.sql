-- 1. Selecciona la precipitación total media para todas las estaciones meteorológicas de la provincia de Sevilla 
-- para el mes de Abril de 2019. Redondea el resultado con 2 decimales.


SELECT ROUND(AVG(precipitacion_total),2)
FROM climatologia
WHERE provincia = 'Sevilla' AND fecha::text ilike '2019-04%';
--CORREGIDA Y ESTA BIEN

-- 2. Selecciona los datos meteorológicos para aquellas estaciones cuyo nombre contenga la letra E, 
-- en los últimos días del mes de Febrero, Marzo y Abril de 2019. Ordena los resultados por provincia 
-- ascendentemente, estación ascendentemente y fecha, descendentemente.

SELECT *
FROM climatologia
WHERE estacion ilike '%e%' AND (fecha::text ilike '2019-02-2%' 
								OR fecha::text ilike '2019-03%' 
								OR fecha::text ilike '2019-02%')
ORDER BY provincia ASC, estacion ASC, fecha DESC;

------------------------------------------------CREO QUE LA CORRECTA ES LA SEGUNDA OPCIÓN---------------------------------------------------------------------

SELECT *
FROM climatologia
WHERE estacion ilike '%e%' AND (fecha::text ilike '2019-02-2%' 
								OR fecha::date BETWEEN '2019-03-25' AND '2019-03-31'
								OR fecha::date BETWEEN '2019-04-25' AND '2019-04-30')
ORDER BY provincia ASC, estacion ASC, fecha DESC;

-----------------------------------------CORREGIDO EN CLASE------------------------------------

SELECT *
FROM climatologia
WHERE estacion ilike '%e%' AND (left(fecha::text, 4)::integer = 2019
								AND fecha::text ILIKE '%-02-28'
								OR (fecha::text ILIKE '%-03-31'
								OR fecha::text ILIKE '%-02-30'))
ORDER BY provincia ASC, estacion ASC, fecha DESC;


-- 3. Selecciona la suma de la precipitación total acumulada en Galicia durante el mes de Septiembre de 2019.

SELECT SUM(precipitacion_total)
FROM climatologia
WHERE provincia IN ('A Coruña', 'Lugo', 'Orense', 'Pontevedra') AND fecha::date BETWEEN '2019-09-01' AND '2019-09-30';

-------------CORREGIDA EN CLASE-----------------------------------------------------------

SELECT SUM(precipitacion_total)
FROM climatologia
WHERE provincia IN ('A Coruña', 'Lugo', 'Orense', 'Pontevedra') AND fecha::text ILIKE '2019-09%';

-- 4. Selecciona el porcentaje de precipitación de cada tramo de horas (0 a 6, 6 a 12, 12 a 18, 18 a 24) con respecto 
-- de la precipitación total para las estaciones de Castilla La Mancha en la primavera de 2019 (21 Marzo a 20 de Junio). 
-- Como resultado de la consulta debe aparecer la fecha, estación, provincia, precipitación total y los porcentajes de cada 
-- tramo horario. Redondea los porcentajes con 2 decimales.

SELECT fecha, estacion, provincia, precipitacion_total, precipitacion_0_a_6 *100/precipitacion_total AS "por_preci_0_6",
														precipitacion_6_a_12 *100/precipitacion_total AS "por_preci_6_12",
														precipitacion_12_a_18 *100/precipitacion_total AS "por_preci_12_18",
														precipitacion_18_a_24 *100/precipitacion_total AS "por_preci_18_24"
FROM climatologia
WHERE provincia IN ('Ciudad Real', 'Toledo', 'Albacete', 'Guadalajara', 'Cuenca') AND fecha::date BETWEEN '2019-03-21' AND '2019-06-20';

---------------CORREGIDO EN CLASE--------------------------------

SELECT fecha, estacion, provincia, precipitacion_total, ROUND(precipitacion_0_a_6 *100/precipitacion_total,2) AS "por_preci_0_6",
														ROUND(precipitacion_6_a_12 *100/precipitacion_total, 2) AS "por_preci_6_12",
														ROUND(precipitacion_12_a_18 *100/precipitacion_total, 2) AS "por_preci_12_18",
														ROUND(precipitacion_18_a_24 *100/precipitacion_total,2) AS "por_preci_18_24"
FROM climatologia
WHERE precipitacion_total != 0 AND provincia IN ('Ciudad Real', 'Toledo', 'Albacete', 'Guadalajara', 'Cuenca') AND fecha BETWEEN '2019-03-21'::date AND '2019-06-20'::date;


SELECT *
FROM climatologia
order by precipitacion_total DESC

-- 5. Selecciona todos los datos de aquellas estaciones que han tenido algún día  con una precipitación total de más de 
-- 50 litros por metro cuadrado, y donde el % de la precipitación caída de 6 a 12 horas sea entre el 60 y el 80%. Ordena 
-- la salida por precipitación total descendente, y fecha ascendente.

SELECT *
FROM climatologia
WHERE precipitacion_total > 50 AND ((precipitacion_6_a_12*100)/ precipitacion_total) BETWEEN 60 AND 80
ORDER BY precipitacion_total DESC, fecha ASC;

-----------------CORREGIDO (MEJOR CON REDONDEO)----------------------------

SELECT *, ROUND((precipitacion_6_a_12*100)/ precipitacion_total, 2) AS "porcentaje"
FROM climatologia
WHERE precipitacion_total > 50 AND ((precipitacion_6_a_12*100)/ precipitacion_total) BETWEEN 60 AND 80
ORDER BY precipitacion_total DESC, fecha ASC;