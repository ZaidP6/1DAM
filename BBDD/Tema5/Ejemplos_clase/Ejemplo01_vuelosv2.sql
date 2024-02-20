-- Seleccionar la cantidad de vuelos por mes.
SELECT DISTINCT date_part('Month', salida) AS "mes", COUNT(*)
FROM vuelo
GROUP BY date_part('Month', salida) -- mes
ORDER BY mes;


-- Seleccionar la cantidad de vuelos por mes y día.
SELECT date_part('Month', salida) AS "mes", 
				date_part('Day', salida) AS "dia", COUNT(*)
FROM vuelo
GROUP BY  mes, dia
ORDER BY mes, dia;
---------------------------------
SELECT TO_CHAR(salida, 'MM-DD') AS "fecha", COUNT(*)
FROM vuelo
GROUP BY  fecha
ORDER BY fecha;



-- por dia de la semana
SELECT date_part('Month', salida) AS "mes", COUNT (*)
FROM vuelo
WHERE date_part(salida, 'q') IN (1,2)
GROUP BY mes;
----------------------------------
SELECT TO_CHAR(salida, 'dy') AS "dia", COUNT (*)
FROM vuelo
WHERE TO_CHAR(salida, 'q') IN ('1','2')
GROUP BY dia;


-- de la anterior, añadir que siempre que el numero de vuelos sea mayor o igual a 10
SELECT TO_CHAR(salida, 'Dy') AS "dia", COUNT (*)
FROM vuelo
WHERE TO_CHAR(salida, 'q') IN ('1','2')
GROUP BY dia
HAVING COUNT(*) >= 10