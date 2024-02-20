-- 1. Seleccionar el COMPANY_NAME y CONTACT_NAME de aquellos CUSTOMERS que hayan hecho pedidos (ORDERS).

SELECT company_name, contact_name
FROM customers cu JOIN orders ord ON (cu.customer_id = ord.customer_id)
WHERE order_id IS NOT NULL;

------------------CORREGIDO CLASE---------------------------

SELECT DISTINCT company_name, contact_name
FROM orders JOIN customers USING(customer_id);

-- 2. Seleccionar el número de pedidos que hemos enviado en la década de los 90 con las empresas Federal Shipping o United Package.

SELECT COUNT(*)
FROM orders o JOIN shippers sh ON (sh.shipper_id = o.ship_via)
WHERE sh.company_name IN ('Federal Shipping','United Package') 
				AND (date_part('year',o.shipped_date) BETWEEN 1990::integer AND 1999::integer);
				

-- 3. Seleccionar el nombre de aquellos productos que han sido solicitados en algún pedido.

SELECT DISTINCT product_name
FROM order_details od JOIN products USING (product_id)
WHERE od.order_id IS NOT NULL;

-----------CORREGIDA CLASE------------------------------

SELECT DISTINCT product_name
FROM order_details od JOIN products USING (product_id);

-- 4. Seleccionar la suma de los importes "cobrados" en todos los pedidos realizados en el año 96.

SELECT ROUND(SUM(od.unit_price*od.quantity*(1-od.discount))::numeric,2)
FROM orders o JOIN order_details od ON (o.order_id = od.order_id)
WHERE date_part('year', o.order_date) = 1996;

-----------ESTA PERFECT-----------------------------------------------

-- 5. Seleccionar el nombre de contacto del cliente y el del empleado para aquellos clientes y 
-- empleados que han participado en pedidos donde la diferencia entre la fecha de envío y la 
-- fecha de requisito sea menos de 20 días

SELECT DISTINCT cu.contact_name, CONCAT(e.first_name,' ', e.last_name)::varchar 
			--, o.order_date, o.required_date
FROM customers cu JOIN orders o USING(customer_id)
					JOIN employees e USING (employee_id)
WHERE age(o.required_date,o.order_date) < '20 days'::interval;

----------------------------------------------------------------------
SELECT DISTINCT cu.contact_name, CONCAT(e.first_name,' ', e.last_name)::varchar AS "Nombre_Apellido"
			--, o.order_date, o.shipped_date
FROM customers cu JOIN orders o USING(customer_id)
					JOIN employees e USING (employee_id)
WHERE age(o.required_date,o.shipped_date) < '20 days'::interval;


-- 6. Diseña una consulta (incluyendo su solución) para la base de datos NORTHWIND 
-- que contenga los siguientes elementos.
-- La salida del select no será SELECT *
-- Debe realizar el JOIN de al menos 4 tablas.
-- Uno de los JOINs debe, obligatoriamente, ser un JOIN ON
-- Al menos, tendrá cuatro condiciones en el WHERE (conectadas con AND u OR)
-- Debe ordenar la salida por algún criterio.


SELECT p.product_name, p.unit_price, cu.country, cu.company_name, o.order_date
FROM customers cu JOIN orders o ON (cu.customer_id = o.customer_id)
					JOIN order_details od ON(o.order_id = od.order_id)
					JOIN products p USING(product_id)
					JOIN categories ca USING(category_id)
WHERE ca.category_name = 'Confections' AND p.unit_price > 9
					AND (cu.company_name ILIKE '%and' OR cu.company_name ILIKE '%markt')
ORDER BY cu.country, p.unit_price;

/*Selecciona el nombre del producto con su precio, el país y la compañìa que se usó 
y la fecha del pedido donde la categoría es Confections, el precio del producto es mayor 
a 9 y que el nombre de la compañía termine en “markt” o “and”. Ordénalo por país y por precio.*/