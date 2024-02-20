-- 1. Seleccionar el FIRST_NAME y LAST_NAME de los empleados del departamento 
-- de IT o Finance cuya fecha de alta (HIRE_DATE) fuera un día cualquiera de Abril o Junio.

SELECT e.first_name, e.last_name
FROM employees e JOIN departments d USING (department_id)
WHERE department_name IN('IT', 'Finance') AND (hire_date::text like '____-04-%' OR hire_date::text like '____-06-%');

-- substr(hire_date::text, 6, 2)::int IN(4,6);

-- 2. Seleccionar el FIRST_NAME y LAST_NAME de los managers de los empleados del departamento de Administration.

SELECT m.first_name, m.last_name
FROM employees m JOIN departments d USING(department_id)
				LEFT JOIN employees e USING(employee_id)
WHERE d.department_name = 'Administration' AND e.manager_id IS NOT NULL;
--------------------------CORREGIDA-------------------------------------
SELECT m.first_name, m.last_name
FROM employees m JOIN employees e ON(m.employee_id=e.manager_id)
				JOIN departments d ON(e.department_id=d.d.department_id)
WHERE department_name = 'Administration';

-- 3. Seleccionar el COUNTRY_NAME donde tiene localización el departamento de Public Relations

SELECT c.country_name
FROM departments d LEFT JOIN locations l USING(location_id)
				JOIN countries c USING (country_id)
WHERE d.department_name = 'Public Relations';
-----------CORREGIDO--NO HACE FALTA LEFT------------------------
SELECT c.country_name
FROM departments d JOIN locations l USING(location_id)
				JOIN countries c USING (country_id)
WHERE d.department_name = 'Public Relations';

-- 4. Seleccionar aquellos empleados que trabajen en oficinas de América.

SELECT e.*
FROM employees e LEFT JOIN departments USING (department_id)
					LEFT JOIN locations USING (location_id)
					JOIN countries USING (country_id)
					JOIN regions r USING (region_id)
WHERE r.region_name = 'Americas';
-----------CORREGIDO--NO HACE FALTA LEFT------------------------
SELECT e.*
FROM employees e JOIN departments USING (department_id)
					JOIN locations USING (location_id)
					JOIN countries USING (country_id)
					JOIN regions r USING (region_id)
WHERE r.region_name = 'Americas';

-- 5. Seleccionar el nombre y apellidos de los hijos, así como el nombre y apellidos de sus padres, 
-- para aquellos empleados que trabajen en oficinas de América. Ordena la salida por orden 
-- alfabético del país :)

SELECT d.first_name, d.last_name, e.first_name, e.last_name
FROM dependents d JOIN employees e USING(employee_id)
				JOIN departments USING (department_id)
				JOIN locations USING (location_id)
				JOIN countries USING (country_id)
				JOIN regions  USING (region_id)
WHERE region_name = 'Americas'
ORDER BY country_name;

----------------CORREGIDO---------------------------

SELECT d.first_name, d.last_name, e.first_name, e.last_name
FROM dependents d JOIN employees e USING(employee_id)
				JOIN departments USING (department_id)
				JOIN locations USING (location_id)
				JOIN countries USING (country_id)
				JOIN regions  USING (region_id)
WHERE region_name = 'Americas' AND d.relationship = 'Child'
ORDER BY country_name;

-- 6. Diseña una consulta (incluyendo su solución) para la base de datos HR que contenga 
-- los siguientes elementos.
-- La salida del select no será SELECT *
-- Debe realizar el JOIN de al menos 3 tablas.
-- Uno de los JOINs debe, obligatoriamente, ser un JOIN ON
-- Al menos, tendrá dos condiciones en el WHERE (conectadas con AND u OR)
-- Debe ordenar la salida por algún criterio.

SELECT em.first_name, depe.first_name, depa.department_name
FROM dependents depe JOIN employees m USING(employee_id)
				JOIN employees em ON (m.manager_id = em.employee_id)
				JOIN departments depa ON (em.department_id = depa.department_id)
WHERE em.salary > 5000 AND m.last_name ilike '%a%a%'
ORDER BY em.salary DESC;

-- Selecciona el nombre del empleado, el nombre del hijo y el nombre del departamento 
-- donde trabaja. EL salario ha de ser mayor de 5000 y el apellido del manager del 
-- trabajador debe contener 2 ‘a’. Ordénalos por salario descendiente.