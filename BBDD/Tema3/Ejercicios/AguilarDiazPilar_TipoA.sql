-- Pilar Aguilar Díaz Exam BBDD T-3 --

-------------- EJERCICIO 1 -------------------------
SELECT ROUND(AVG(precipitacion_total),2)
FROM climatologia
WHERE provincia IN ('Huesca', 'Zaragoza', 'Teruel') AND fecha::text like '2019-06%' AND precipitacion_total < 20;

------------- EJERCICIO 4 -----------------------

SELECT estacion,provincia,fecha,racha_viento,
			CASE
				WHEN racha_viento > 25 AND racha_viento <= 40 THEN 'Ventoso'
				WHEN racha_viento > 40 AND racha_viento <= 60 THEN 'Muy ventoso'
				WHEN racha_viento > 60 THEN 'Huracanado'
			END
FROM climatologia
WHERE racha_viento > 25 AND hora_racha_viento = '15:00' 
						AND fecha BETWEEN '2019-03-01' AND '2019-04-30' 
						AND temperatura_maxima > 23
ORDER BY racha_viento DESC;

--------------EJERCICIO 3 ----------------------------

SELECT estaciones
FROM climatologia
WHERE LEFT(estacion, 2) = 'Ba' AND (temperatura_maxima BETWEEN 25 AND 30) AND (temperatura_minima < 15) AND substr(fecha,6, 2) IN(09, 10)
ORDER BY Random('temperatura_maxima');

------------- EJERCICIO 2 ---------------------------

SELECT *	--, SUM(precipitacion_0_a_6+precipitacion_6_a_12+precipitacion_12_a_18+precipitacion_18_a_24) NO lo pongo porque la suma de las 
				-- columnas de los tramos horarios es realmnte la precipitacion total de ese día
FROM climatologia
WHERE (estacion ILIKE '%t%' OR estacion ILIKE '%x%' OR estacion ILIKE '%f%') AND fecha::text ilike '2019-02%';


------------- EJERCICIO 5 ------------------------

SELECT provincia, estacion, fecha, velocidad_maxima_viento, racha_viento, ((temperatura_maxima-temperatura_minima)*100/temperatura_maxima) AS "%_diferencia"
FROM climatologia
WHERE temperatura_minima >10 AND (((temperatura_maxima-temperatura_minima)*100/temperatura_maxima) BETWEEN 20 AND 30)
ORDER BY provincia DESC, estacion DESC, fecha;