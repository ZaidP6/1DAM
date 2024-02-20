SELECT *
FROM employees e, departments d
WHERE e.department_id = d.department_id;

SELECT first_name, last_name, department_name
FROM employees e, departments d
WHERE e.department_id = d.department_id;

SELECT e.first_name, e.last_name, department_name, dd.first_name, dd.last_name, relationship
FROM employees e, departments d, dependents dd
WHERE dd.employee_id = e.employee_id AND e.department_id = d.department_id;

SELECT employees.employee_id, dependents.employee_id
FROM employees, dependents;


SELECT *
FROM employees e, departments d, locations l, countries c
WHERE e.department_id = d.department_id 
										AND d.location_id = l.location_id 
										AND l.country_id = c.country_id
										AND c.country_name = 'United States of America';
										
-- No se puede hacer JOIN de 2 tablas uq eno tengan una referencia (FK-PK)

SELECT *
FROM employees CROSS JOIN departments;


SELECT *
FROM employees JOIN departments USING (department_id);