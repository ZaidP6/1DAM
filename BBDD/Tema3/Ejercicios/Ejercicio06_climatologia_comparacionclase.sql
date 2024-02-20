----EJERCICIO 1 ---------------------------
------------------------1-------------------------------------------------
SELECT AVG(temperatura_media), estacion
FROM climatologia
WHERE provincia IN('Sevilla', 'Cádiz', 'Huelva', 'Almería', 'Málaga', 'Granada', 'Jaén', 'Córdoba') 
				AND fecha BETWEEN '2019-05-01'::date AND '2019-05-31'::date
				AND start_with('AL');
				
-----------------------2-----------------------------------------------------
SELECT AVG(temperatura_media)
FROM climatologia
WHERE provincia IN('Sevilla', 'Cádiz', 'Huelva', 'Almería', 'Málaga', 'Granada', 'Jaén', 'Córdoba') 
				AND fecha BETWEEN '2019-05-01'::date AND '2019-05-31'::date
				AND estacion STARTS_WITH(estacion, 'AL');
				
-----------------------6-------------------------------------------------

SELECT AVG(temperatura_media)
FROM climatologia
WHERE provincia IN('Sevilla', 'Cádiz', 'Huelva', 'Almería', 'Málaga', 'Granada', 'Jaén', 'Córdoba') 
				AND fecha BETWEEN '2019-05-01'::date AND '2019-05-31'::date
				AND starts_with(estacion, 'Al');
				
				
----------EJERCICIO 2 --------------------------------------------
----------------------1--------------------------
SELECT fecha, estacion, temperatura_media, 
				CASE
					WHEN precipitacion_total >= 50
					THEN 'CHUZOS DE PUNTA'
					WHEN precipitacion_total BETWEEN 40 AND  49
					THEN 'A CÁNTAROS'
					WHEN precipitacion_total BETWEEN 25 AND  39
					THEN 'MUCHA LLUVIA'
					WHEN precipitacion_total BETWEEN 10 AND  24
					THEN 'FALTA LE HACÍA AL CAMPO'
					WHEN precipitacion_total < 10
					THEN 'HA LLOVIDO POCO'
					ELSE 'NO HA LLOVIDO'
				END
				
FROM climatologia
WHERE provincia = 'Jaén' AND fecha::text LIKE '2019-11%'


----------------2 -----------------------------------
SELECT fecha, estacion, temperatura_media,
				CASE
					WHEN precipitacion_total >= 50
					THEN 'CHUZOS DE PUNTA'
					WHEN precipitacion_total BETWEEN 40 AND  49
					THEN 'A CÁNTAROS'
					WHEN precipitacion_total BETWEEN 25 AND  39
					THEN 'MUCHA LLUVIA'
					WHEN precipitacion_total BETWEEN 10 AND  24
					THEN 'FALTA LE HACÍA AL CAMPO'
					WHEN precipitacion_total < 10
					THEN 'HA LLOVIDO POCO'
					ELSE 'NO HA LLOVIDO'
				END
				
FROM climatologia
WHERE provincia = 'Jaén' AND fecha::text LIKE '2019-11%'

--------------6 ---------------------------------
SELECT fecha, estacion, temperatura_media,
				CASE
					WHEN precipitacion_total >= 50
					THEN 'CHUZOS DE PUNTA'
					WHEN precipitacion_total BETWEEN 40 AND  49
					THEN 'A CÁNTAROS'
					WHEN precipitacion_total BETWEEN 25 AND  39
					THEN 'MUCHA LLUVIA'
					WHEN precipitacion_total BETWEEN 10 AND  24
					THEN 'FALTA LE HACÍA AL CAMPO'
					WHEN precipitacion_total < 10
					THEN 'HA LLOVIDO POCO'
					ELSE 'NO HA LLOVIDO'
				END
				
FROM climatologia
WHERE provincia = 'Jaén' AND fecha::text LIKE '2019-11%'

----------EJERCICIO 3------------------------------ç
-------1-------------------------

SELECT fecha,upper(estacion),upper(provincia),temperatura_maxima,hora_temperatura_maxima,
			temperatura_minima,hora_temperatura_minima,temperatura_media,racha_viento,hora_racha_viento,velocidad_maxima_viento,hora_velocidad_maxima_viento,
			hora_velocidad_maxima_viento,precipitacion_total,precipitacion_0_a_6,precipitacion_6_a_12,precipitacion_12_a_18,precipitacion_18_a_24
FROM climatologia
WHERE hora_temperatura_maxima = '14:00' AND fecha::text ILIKE '2019-03%' AND provincia IN('Cantabria', 'Asturias');