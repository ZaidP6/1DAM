-- 1. Seleccionar el número de pedidos atendidos por cada empleado, 
-- sí y sólo si dicho número está entre 100 y 150.

SELECT e.last_name, e.first_name, COUNT(o.order_id)
FROM orders o JOIN employees e USING (employee_id)
GROUP BY e.last_name, e.first_name
HAVING COUNT(o.*) BETWEEN 100 AND 150;

-- 2. Seleccionar el nombre de las empresas que no han realizado ningún pedido.

SELECT customers.company_name, orders.order_id
FROM customers LEFT JOIN orders USING(customer_id)
WHERE order_id IS NULL;

-- 3. Seleccionar la categoría que tiene más productos diferentes solicitados 
-- en pedidos. Mostrar el nombre de la categoría y dicho número.

SELECT category_name, COUNT(product_id) AS "cantidad"
FROM categories JOIN products USING(category_id)
GROUP BY category_name
ORDER BY cantidad DESC
LIMIT 1;

-- 4. Si suponemos que nuestro margen de beneficio con los productos es de un 
-- 25% (es decir, el 25% de su precio, son beneficios, y el 75% son costes), 
-- calcular la cantidad de beneficio que hemos obtenido, agrupado por categoría 
-- y producto. Las cantidades deben redondearse a dos decimales.

SELECT c.category_name, p.product_name,(p.unit_price*25/100) AS "beneficios", (p.unit_price*75/100) AS "costes"
FROM categories c JOIN products p USING (category_id)
GROUP BY c.category_name, p.product_name, p.unit_price
ORDER BY c.category_name, p.product_name;

-- 5. Selecciona aquellos clientes (CUSTOMERS) para los que todos los envíos que ha recibido 
-- (sí, todos) los haya transportado (SHIPPERS) la empresa United Package.

SELECT DISTINCT cu.company_name --, s.company_name, COUNT(order_id)
FROM customers cu  JOIN orders USING(customer_id)
				JOIN shippers s ON (ship_via=shipper_id)
GROUP BY cu.company_name, s.company_name
HAVING COUNT(DISTINCT s.company_name) = 1 AND MAX(s.company_name) = 'United Package'
ORDER BY cu.company_name;
----------------------------------CORREGIDA EN CLASE ---------------------------
SELECT DISTINCT c.company_name
FROM customers c JOIN orders USING (customer_id)
        JOIN shippers ON (shipper_id=ship_via)
WHERE customer_id NOT IN (
            SELECT customer_id
            FROM orders JOIN shippers
                ON (shipper_id=ship_via)
            WHERE company_name != 'United Package'
   			);
