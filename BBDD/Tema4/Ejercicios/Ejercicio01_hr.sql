-- 1. Seleccionar el nombre, apellidos y email de los empleados que pertenecen a un departamento que tenga sede en United Kingdom.

SELECT employees.first_name, employees.last_name, employees.email
FROM countries JOIN locations USING (country_id)
				JOIN departments USING (location_id)
				JOIN employees USING (department_id)
WHERE country_name = 'United Kingdom';

-- 2. Seleccionar el nombre de aquellos departamentos en los que trabaja un empleado que fue 
-- contratado a lo largo del año 1993.

SELECT departments.department_name
FROM departments JOIN employees USING (department_id)
WHERE employees.hire_date::text like '1993%';

-- 3. Seleccionar la región de los empleados con un salario inferior a 10000$

SELECT DISTINCT(regions.region_name)
FROM regions JOIN countries USING (region_id)
 				JOIN locations USING (country_id)
				JOIN departments USING (location_id)
				JOIN employees USING (department_id)
WHERE employees.salary < 10000;

-- 4. Seleccionar el nombre de aquellos empleados cuyo jefe directo tenga un apellido que 
-- empiece por D, H o S.

SELECT first_name
FROM employees
WHERE manager_id IS NOT NULL AND (last_name LIKE 'D%' OR 
								  last_name LIKE 'H%' OR 
								  last_name LIKE 'S%');

-- 5. Seleccionar el número de familiares (dependents) que son hijos de algún miembro de los 
-- departamentos de Marketing, Administration e IT.

SELECT *
FROM dependents JOIN employees USING (employee_id)
				JOIN departments USING(department_id)
WHERE relationship = 'Child' AND (departments.department_name = 'Marketing' 
								OR departments.department_name = 'Administration' 
								OR departments.department_name = 'IT');