-- Probando la funcion CASE como ejemplo

SELECT provincia, estacion, temperatura_maxima,
		CASE
			WHEN temperatura_maxima > 40 THEN 'Pa derretirse'
			WHEN temperatura_maxima BETWEEN 30 AND 39 THEN 'Uff..Esto empieza a ser insoportable...'
			WHEN temperatura_maxima BETWEEN 25 AND 29 THEN 'Psss... Se está bien'
			ELSE 'Esto ya tiene la palabra frío'
		END AS "Expresion_Temperatura"
FROM climatologia
ORDER BY temperatura_maxima DESC;