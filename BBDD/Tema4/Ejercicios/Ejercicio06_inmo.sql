-- 1. Selecciona el top 3 de pisos vendidos más caros en Sevilla a lo largo del año 
-- 2021 (puedes investigar el uso de LIMIT para hacerlo)

SELECT *
FROM inmueble JOIN operacion USING (id_inmueble)
ORDER BY precio_final DESC
LIMIT 3;

--------------------------------------------------  
SELECT *
FROM inmueble i JOIN operacion o USING (id_inmueble)
				JOIN tipo ti ON (id_tipo = id_inmueble)
WHERE i.provincia = 'Sevilla'
	AND tipo_operacion = 'Venta'
		AND date_part('Year', o.fecha_operacion) = '2021'
ORDER BY precio_final DESC
LIMIT 3;

				


-- 2. Selecciona el precio medio de los alquileres en Málaga en los meses de Julio 
-- y Agosto (da igual de qué año).

SELECT AVG(precio_final)
FROM operacion o JOIN tipo ti ON (id_tipo = id_inmueble)
                JOIN inmueble i USING (id_inmueble)
WHERE TO_CHAR(o.fecha_operacion, 'MM') IN ('07','08')
    AND ti.nombre = 'Alquiler'
    AND i.provincia = 'Málaga';
	
--------------------------------------------------------------------------
SELECT AVG(precio)
FROM inmueble LEFT JOIN o USING id:inmueble
WHERE TO_CHAR(fecha_alta, 'MM') IN ('07','08')
    AND tipo_operacion = 'Alquiler'
    AND provincia = 'Málaga'
	and o.id_imueble NOT

    

-- 3. Selecciona los inmuebles que se han vendido en Jaén y Córdoba en los 
-- últimos 3 meses del año 2019 o 2020.

SELECT *
FROM inmueble i JOIN operacion o USING (id_inmueble)
                JOIN tipo ti ON (id_tipo=tipo_inmueble)
WHERE i.provincia IN ('Jaén','Córdoba')
    AND (TO_CHAR (o.fecha_operacion,'DD/MM/YYY') BETWEEN '01/10/2019'::text AND '31/12/2019'::text
    OR TO_CHAR (fecha_operacion,'DD/MM/YYY') BETWEEN '01/10/2020'::text AND '31/12/2020'::text)
    AND tipo_operacion = 'Venta';
    
-- 4. Selecciona el precio medio de las ventas de Parking en la provincia de Huelva 
-- para aquellas operaciones que se realizaran entre semana (de Lunes a Viernes).

SELECT AVG(precio_final)
FROM operacion o JOIN inmueble i USING (id_inmueble)
                JOIN tipo ti ON (id_tipo=tipo_inmueble)
WHERE i.provincia = 'Huelva'
    AND ti.nombre = 'Parking'
    AND TO_CHAR(o.fecha_operacion,'ID') BETWEEN '01' AND '05';

-- 5. Selecciona aquellos pisos que han tardado en venderse entre 3 y 6 meses en 
-- la provincia de Granada.

SELECT *
FROM inmueble i JOIN operacion o USING (id_inmueble)
                JOIN tipo ti ON (id_tipo=tipo_inmueble)
WHERE ti.nombre = 'Piso' AND i.provincia = 'Granada' 
				AND i.tipo_operacion = 'Venta' 
				AND age(i.fecha_alta, o.fecha_operacion) BETWEEN '3 month'::interval AND '6 month'::interval
				--AND o.fecha_operacion BETWEEN (i.fecha_alta + '3 month' AND i.fecha_alta + '6 month');

-- 7. Selecciona el precio medio de los alquileres en Málaga en los meses de Julio 
-- y Agosto (da igual de qué año) que todavía no se hayan alquilado..

SELECT COALESCE(AVG(precio),0)
FROM inmueble JOIN operacion USING(id_inmueble)
WHERE TO_CHAR(fecha_alta, 'MM') IN ('07','08')
    AND tipo_operacion = 'Alquiler'
    AND provincia = 'Málaga'
	AND precio_final = 0;

-- 8. 

SELECT *
FROM inmueble i JOIN operacion o USING (id_inmueble)
                JOIN tipo ti ON (id_tipo=tipo_inmueble)
WHERE i.provincia = 'Huelva' AND i.tipo_operacion = 'Venta'
				-- AND o.fecha_operacion - i.fecha_alta 
				-- BETWEEN(date_part('Day', o.fecha_operacion) = '15' AND date_part('Month', o.fecha_operacion) = '01' )
				-- AND (date_part('Day', o.fecha_operacion) = '15' AND date_part('Month', o.fecha_operacion) = '03' );
				--