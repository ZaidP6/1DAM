-- 1. Seleccionar los 3 aeropuertos que menos tráfico de llegada (menos personas llegando 
-- a ellos en un vuelo) han registrado en un mes de Enero, Febrero o Marzo.

SELECT nombre, COUNT(llegada)
FROM aeropuerto JOIN vuelo d ON(id_aeropuerto = hasta)
WHERE to_char(llegada,'MM') IN ('01','02','03')
GROUP BY nombre
ORDER BY COUNT(llegada) ASC
LIMIT 3;

--------------------------------CORREGIDA CLASE---------------------------

SELECT nombre, COUNT(id_reserva)
FROM aeropuerto JOIN vuelo d ON(id_aeropuerto = hasta)
				JOIN reserva USING(id_vuelo)
WHERE to_char(llegada,'MM') IN ('01','02','03')
GROUP BY nombre
ORDER BY COUNT(llegada) ASC
LIMIT 3;

-- 2. Selecciona los clientes que han comprado casas en Almería, siendo el precio final 
-- mayor que el precio medio de las casas vendidas en Almería.

SELECT co.id_cliente, co.nombre, op.precio_final
FROM comprador co JOIN operacion op USING(id_cliente)
					JOIN inmueble inm USING(id_inmueble)
					JOIN tipo ti ON(tipo_inmueble = id_tipo)
WHERE op.precio_final > (
			SELECT AVG(op.precio_final)
			FROM operacion op JOIN inmueble inm USING(id_inmueble)
								JOIN tipo ti ON(tipo_inmueble = id_tipo)
			WHERE inm.tipo_operacion = 'Venta' AND inm.provincia = 'Almería'
												AND ti.nombre = 'Casa'
			) AND inm.tipo_operacion = 'Venta' 
			  AND inm.provincia = 'Almería'
			  AND ti.nombre = 'Casa';


-- 3. Selecciona de todos los vendedores a aquellos que solo vendieron inmuebles de tipo Parking.

SELECT DISTINCT id_vendedor, vendedor.nombre, tipo.nombre
FROM vendedor JOIN operacion USING(id_vendedor)
				JOIN inmueble USING (id_inmueble)
				JOIN tipo ON(tipo_inmueble = id_tipo)
WHERE tipo.nombre IN('Parking');

-------------------------CORREGIDA CLASE ----------------------------

SELECT DISTINCT id_vendedor, vendedor.nombre, tipo.nombre
FROM vendedor JOIN operacion USING(id_vendedor)
				JOIN inmueble USING (id_inmueble)
				JOIN tipo ON(tipo_inmueble = id_tipo)
WHERE id_vendedor NOT IN(
		SELECT DISTINCT id_vendedor
		FROM vendedor JOIN operacion USING(id_vendedor)
					JOIN inmueble USING (id_inmueble)
					JOIN tipo ON(tipo_inmueble = id_tipo)
		WHERE tipo.nombre !='Parking'
		);



-- 4. Selecciona el origen y el destino de los 10 vuelos con una duración menor. Debes realizarlo 
-- usando subconsultas.

SELECT desde, hasta
FROM vuelo
WHERE id_vuelo IN (SELECT id_vuelo
				  FROM vuelo
				  ORDER BY llegada-salida
				  LIMIT 10
				  );

-- 5. Selecciona el importe que la aerolínea de la base de datos de vuelos ha ingresado por cada 
-- uno de los vuelos que se han realizado en fin de semana (es decir, que han salido entre viernes 
-- y domingo) en los meses de Julio y Agosto (da igual el año).

SELECT id_vuelo, SUM(precio*(1 - COALESCE(descuento, 0)/100))
FROM vuelo
WHERE (EXTRACT(day from salida) BETWEEN 5 AND 7) AND EXTRACT(month from salida) IN (7,8)
GROUP BY id_vuelo;