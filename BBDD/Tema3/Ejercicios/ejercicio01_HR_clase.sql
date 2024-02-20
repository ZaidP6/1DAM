--1. Seleccionar aquellos empleados cuyo número de departamento esté entre el 8 y el 12 (ambos excluidos).--

SELECT *
FROM employees
WHERE department_id BETWEEN 9 AND 11;

--2. Seleccionar todos los países que contengan una letra a en la segunda posición.
SELECT *
FROM countries
WHERE country_name ilike '_a%';

--3. Seleccionar el nombre y apellidos de los empleados cuyo salario bruto anual sea mayor o igual que 100000$, y que no sean contables (job_id = 6).
SELECT first_name, last_name, salary*14 AS "Salario Anual" --Se corrije el salario, puesto que loq que muestra es el salario mensual
FROM employees
WHERE salary*14 >= 100000 AND job_id != 6;

--4. Seleccionar aquellos departamentos cuyo nombre contenga dos letras t.
SELECT *
FROM departments
WHERE department_name ilike '%t%t%';

--5. Seleccionar las localizaciones que estén en las ciudades de Toronto u Oxford, o bien en el estado de California.
SELECT *
FROM locations
WHERE city IN ('Toronto', 'Oxford') OR state_province = 'California';