-- 1. Selecciona cuál ha sido el porcentaje de hombres en las provincias de Extremadura (Cáceres y Badajoz) 
-- entre los años 2000 y 2010 (demografía_básica). Debe aparecer el año, el nombre de la provincia, el número 
-- de hombres, el % de hombres, y la población total de la provincia.

SELECT anio,DISTINCT(provincia), hombres, (hombres*100/SUM(hombres+mujeres)) AS "porcentaje_hombres", SUM(hombres+mujeres) AS "total_poblacion"
FROM demografia_basica
WHERE provincia IN ('Cáceres', 'Badajoz') AND (anio BETWEEN 2000 AND 2010);



-- 2. Modifica (copia y pega) la consulta anterior para mostrar el promedio del % de hombres 
-- (que cumpla la condición de la consulta anterior). 

SELECT AVG(hombres*100/SUM(hombres+mujeres)) AS "promedio"
FROM demografia_basica
WHERE provincia IN ('Cáceres', 'Badajoz') AND (anio BETWEEN 2000 AND 2010);

