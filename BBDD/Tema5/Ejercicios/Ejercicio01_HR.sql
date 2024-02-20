
-- 1. Seleccionar el salario máximo de cada departamento, mostrando el nombre del 
-- departamento y dicha cantidad.

SELECT  d.department_name,j.max_salary
FROM departments d JOIN employees e USING(department_id)
					JOIN jobs j USING(job_id)
GROUP BY d.department_name, j.max_salary;

----------------CORREGIDO EN CLASE--------------------
SELECT  COALESCE(d.department_name,'Sin departamento'),MAX(salary)
FROM departments d RIGHT JOIN employees e USING(department_id)
GROUP BY d.department_name;

-- 2. Seleccionar el salario mínimo de cada departamento, para aquellos departamentos 
-- cuyo salario mínimo sea menor que 5000$.

SELECT d.department_name, MIN(salary)
FROM departments d JOIN employees e USING(department_id)
GROUP BY department_id
HAVING MIN(salary) < 5000;

-- 3. Seleccionar el número de empleados que trabajan en cada oficina, mostrando el 
-- STREET_ADDRESS y dicho número; hay que ordenar la salida de mayor a menor.

SELECT l.street_address, COUNT(e.*) AS "cantidad_empleados"
FROM locations l JOIN departments d USING(location_id)
			JOIN employees e USING(department_id)
GROUP BY l.street_address
ORDER BY cantidad_empleados DESC;

---------------------- MOSTRANDO TODOS LOS EMPLEADOS POR LOCALIZACION -----------------------------
SELECT COALESCE(l.street_address,'Remoto'), COUNT(e.*) AS "cantidad_empleados"
FROM locations l RIGHT JOIN departments d USING(location_id)
			RIGHT JOIN employees e USING(department_id)
GROUP BY l.street_address
ORDER BY cantidad_empleados DESC;

---------------------MOSTRANDO TODOS LOS DATOS -----------------------------------------

SELECT COALESCE(l.street_address,'Remoto'), COUNT(e.*) AS "cantidad_empleados"
FROM locations l FULL JOIN departments d USING(location_id)
			FULL JOIN employees e USING(department_id)
GROUP BY l.street_address
ORDER BY cantidad_empleados DESC;

-- 4. Modificar la consulta anterior para que muestre las localizaciones que no 
-- tienen ningún empleado.

SELECT l.street_address
FROM locations l  LEFT JOIN departments d USING(location_id)
			LEFT JOIN employees e USING(department_id)
GROUP BY l.street_address, e.department_id;


-- 5. Seleccionar el salario que es cobrado a la vez por más personas. Mostrar 
-- dicho salario y el número de personas.

SELECT salary, COUNT(*)
FROM employees
GROUP BY salary
ORDER BY COUNT(*) DESC
LIMIT 1;

--------------POSIBILIDAD DE COGER LOS QUE TENGAN EL SALRIO REPETIDO CON MÁS DE UN RESULTADO---------

SELECT salary, COUNT(*)
FROM employees
GROUP BY salary --SUBCONSULTA--
ORDER BY COUNT(*) DESC


-- 6. Seleccionar el número de empleados que empezaron a trabajar cada año, ordenando 
-- la salida por el año.

SELECT date_part('Year', hire_date), COUNT(*)
FROM employees
GROUP BY date_part('Year', hire_date)
ORDER BY date_part('Year', hire_date);

