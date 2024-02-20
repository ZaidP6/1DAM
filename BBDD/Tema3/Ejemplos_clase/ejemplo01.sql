SELECT *
FROM climatologia
WHERE temperatura_media < 20;

SELECT *
FROM climatologia
WHERE estacion = 'San Juan de Aznalfarache';

SELECT *
FROM climatologia
WHERE estacion ILIKE '%tabla%';

SELECT *
FROM climatologia
WHERE estacion ILIKE '_____';

SELECT *
FROM climatologia
WHERE estacion ILIKE '%ar' AND provincia = 'Granada';

SELECT *
FROM climatologia
WHERE temperatura_media BETWEEN 30 AND 40;

SELECT *
FROM climatologia
WHERE provincia IN ('Sevilla','Cádiz','Huelva','Almaría','Granada','Málaga', 'Jaén','Códoba');


