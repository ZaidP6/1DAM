SELECT e.*
FROM employees e LEFT JOIN  dependents USING(employee_id)
WHERE dependent_id IS NULL;

