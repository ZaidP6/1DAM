-- 1. Seleccionar el número de vuelos que salen desde Berlín y llegan a Londres en el último trimestre de 2020.

SELECT COUNT(*)
FROM vuelos
WHERE desde = 'Berlín' AND hasta = 'Londres' AND salida::text ILIKE '2020-1%';

-- 2. El precio final de un vuelo se obtiene aplicando el descuento al precio. Selecciona, 
	-- mostrando todos los datos del vuelo, incluido el precio con descuento, redondeado a dos 
	-- decimales, aquellos vuelos que salen en el mes de Diciembre de 2020 desde Sevilla o Málaga 
	-- y llegan a Madrid o Barcelona.
	

SELECT *, ROUND(precio-(COALESCE(descuento,0)*precio/100),2) AS "precio_final"
FROM vuelos
WHERE salida::text ilike '2020-12%' AND desde IN('Sevilla', 'Málaga') 
									AND hasta IN('Madrid', 'Barcelona');
									

-- 3. Seleccionar, de entre los vuelos que no tienen descuento, aquellos que la fecha de llegada 
-- esté en la primera quincena de Octubre, y hayan llegado al aeropuerto de Nueva York.

SELECT *
FROM vuelos
WHERE llegada BETWEEN '2020-10-01'::date AND '2020-10-15'::date 
					AND hasta = 'Nueva York' AND (descuento IS NULL OR descuento = 0);
					
					
-- 4. Selecciona los vuelos que salieron en el mes de Enero de 2021 desde Ámsterdam y llegaron entre 
-- las 09:00 y 09:59 de la mañana. PISTA: puedes comparar la fecha de llegada como texto.

SELECT *
FROM vuelos
WHERE salida::text ilike '2021-01%' AND desde = 'Ámsterdam' 
							AND llegada::text ilike '%09:%';
							
							
-- 5. Selecciona, mostrando todos los datos del vuelo, mostrando el precio final, todos los vuelos que salieron de Sevilla en 2021.
-- Además, debes mostrar este mensaje según el precio del vuelo
-- PRECIO < 60 - ¡OFERTÓN!
-- 60 <= PRECIO < 120 ECONÓMICO
-- 120 <= PRECIO < 200 NORMAL
-- 200 <= PRECIO < 300 CARO
-- PRECIO >= 300 MUY CARO

SELECT *, ROUND(precio-(COALESCE(descuento,0)*precio/100),2) AS "precio_final", 
			CASE 
				WHEN (precio-(COALESCE(descuento,0)*precio/100)) < 60 THEN '¡OFERTÓN!'
				WHEN 60 <= (precio-(COALESCE(descuento,0)*precio/100)) 
					AND (precio-(COALESCE(descuento,0)*precio/100)) < 120 THEN 'ECONÓMICO'
				WHEN 120 <= (precio-(COALESCE(descuento,0)*precio/100)) 
					AND (precio-(COALESCE(descuento,0)*precio/100)) < 200 THEN 'NORMAL'
				WHEN 200 <= (precio-(COALESCE(descuento,0)*precio/100)) 
					AND (precio-(COALESCE(descuento,0)*precio/100)) < 300 THEN 'CARO'
				WHEN (precio-(COALESCE(descuento,0)*precio/100)) >= 300 THEN 'MUY CARO'
			END
FROM vuelos
WHERE desde = 'Sevilla' AND salida::text ilike '2021%';