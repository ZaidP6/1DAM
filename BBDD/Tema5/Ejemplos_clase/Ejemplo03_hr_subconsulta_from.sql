SELECT ROUND(AVG(maximo),2)
FROM (
		SELECT department_name, MAX(salary) AS "maximo"
		FROM departments JOIN employees USING (department_id)
		GROUP BY department_name
		)datos;


-- Selelcionar el n medio de empleados que tiene cada departamento.

SELECT AVG(cant)
FROM (
		SELECT department_name, COUNT(employee_id) AS "cant"
		FROM employees JOIN departments USING (department_id)
		GROUP BY department_name
		)datos;
		
-------------CORREGIDO -----------------------

SELECT AVG(cant)
FROM (
		SELECT COUNT(employee_id) AS "cant"
		FROM employees
		GROUP BY department_id
		)datos;
		
		
		
--Seleccionar aquellos empleados que cobran mas que todos 
-- los empleados del departamento de purchasing

SELECT *
FROM employees
WHERE salary > ALL (SELECT salary
					FROM employees JOIN departments USING (department_id)
					WHERE department_name = 'Purchasing'
				)
	
------------------------------------------------------------------------------------VUELOS V2

--Selecionar la media de vuelos que sale cada día independientemente 
-- del aeropuerto del que salga el vuelo

 
SELECT dia, AVG(cant)
FROM (	SELECT TO_CHAR(salida,'Day') AS "dia", salida::date, COUNT(id_vuelo) AS "cant"
		FROM vuelo
		GROUP BY TO_CHAR(salida,'Day'), salida::date
	 )
GROUP BY dia

---------------------------------------------------------------------------DEMOGRAFIA

-- Selelcionar para cada provincia, el año en el que han tenido más habitantes

SELECT *, hombres + mujeres as "nHabitantes"
FROM demografia_basica db1
WHERE hombres + mujeres >= ALL (
					SELECT hombres + mujeres
					FROM demografia_basica db2
					WHERE db1.provincia = db2.provincia
					)
ORDER BY provincia;