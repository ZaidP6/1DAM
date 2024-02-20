-- Seleccionar el producto de cada categoria del que mas unidades se 
-- han vendido. Debe aparecer nombre, categoria, ntotal de unidades.
--


SELECT pr.product_name, ord.quantity, SUM(quantity)
FROM order_details ord JOIN products pr USING (product_id)
						JOIN categories c1 USING(category_id)
GROUP BY c1.category_name,  pr.product_name
HAVING SUM(ord.quantity)>= ALL (
				SELECT pr.product_name, ord.quantity, SUM(quantity)
				FROM order_details ord JOIN products pr USING (product_id)
										JOIN categories c2 USING(category_id)
				WHERE c1.category_name = c2.category_name
				GROUP BY c2.category_name, pr.product_name
)

---------------------------------------------------------------------------CLIMATOLOGIA


-- Seleccionar para cada estacio meteorologica la fecha en la que ha tenido una 
-- temperatura_maxima menor. Debe aparecer la provincia, estacion, fecha y 
-- temperatura maxima.

SELECT c1.provincia, c1.estacion, c1.fecha ,c1.temperatura_maxima
FROM climatologia c1
WHERE c1.temperatura_maxima <= ALL (
									SELECT c2.temperatura_maxima
									FROM climatologia c2
									WHERE c1.estacion = c2.estacion
									);