/* 1. Selecciona la media, agrupada por nombre de aeropuerto de salida, del % de 
ocupación de los vuelos. PISTA: tendrás que incluir una subconsulta dentro de otra 
y, en la interior, usar una subconsulta en el select :S (o bien usar WITH)*/

WITH porcentaje_ocupacion AS (SELECT id_vuelo,  -- max_pasajeros, COUNT(id_reserva)::numeric AS "ocupacion", 
								COUNT(id_reserva)*100/av.max_pasajeros AS "porcentaje"
				FROM vuelo JOIN avion av USING(id_avion)
							JOIN reserva USING(id_vuelo)
				GROUP BY id_vuelo, max_pasajeros
)

SELECT desde, AVG(porcentaje_ocupacion)
FROM aeropuerto JOIN vuelo ON(id_aeropuerto=desde)
 				JOIN avion av USING(id_avion)
				JOIN reserva USING(id_vuelo)
GROUP BY desde;

/* 2. Selecciona el tráfico de pasajeros (es decir, personas que han llegado en un 
vuelo o personas que han salido en un vuelo) agrupado por mes (independiente del año) 
y aeropuerto.
INVESTIGA: Tienes que hacer uso de la cláusula UNION, y piensa en hacer primero 
el tráfico de salida, después el de llegada (en consultas diferentes pero casi 
idénticas) y posteriormente en sumarlo.*/

WITH personas_llegadas AS (
			SELECT llegada.nombre,to_char(llegada,'mon'),COUNT(id_reserva)
			FROM reserva JOIN vuelo v USING(id_vuelo)
						JOIN aeropuerto llegada ON(llegada.id_aeropuerto = v.hasta)
			GROUP BY llegada.nombre,to_char(llegada,'mon')
			), personas_salidas AS (
			SELECT origen.nombre,to_char(salida,'mon'),COUNT(id_reserva)
			FROM reserva JOIN vuelo v USING(id_vuelo)
						JOIN aeropuerto origen ON(origen.id_aeropuerto = v.desde)
			GROUP BY origen.nombre,to_char(salida,'mon')
			), personas_aeropuerto AS (
			SELECT *
			FROM  personas_llegadas JOIN personas_salidas USING (id_vuelo)
			GROUP BY ae.nombre,to_char(llegada,'mon')
			)

/* 3. Suponiendo que el 30% del precio de cada billete son beneficios (y el 70% son 
gastos), ¿cuál es el trayecto que más rendimiento económico da? Es decir, ¿en qué 
trayecto estamos ganando más dinero? ¿Y con el que menos? Lo puedes hacer en consultas 
diferentes usando WITH.*/

WITH beneficiosMax AS (
			SELECT ROUND(precio * (1 - COALESCE(descuento/100, 0))*30/100, 2) 
									AS "beneficio"
			FROM vuelo
			GROUP BY id_vuelo
			ORDER BY beneficio DESC
		), beneficiosMin AS (
			SELECT ROUND(precio * (1 - COALESCE(descuento/100, 0))*30/100, 2) 
									AS "beneficio"
			FROM vuelo
			GROUP BY id_vuelo
			ORDER BY beneficio
		)
		SELECT vuelo.*, beneficiosMax, beneficiosMin
		FROM vuelo;

/* 4. Seleccionar el nombre y apellidos de los clientes que no han hecho ninguna 
reserva para un vuelo que salga en el tercer trimestre desde Sevilla.*/

SELECT cliente.nombre, apellido1, apellido2, ciudad, salida
FROM cliente LEFT JOIN reserva USING(id_cliente)
				LEFT JOIN vuelo USING(id_vuelo)
				LEFT JOIN aeropuerto ON(desde = id_aeropuerto)
WHERE aeropuerto.ciudad != 'Sevilla' AND to_char(salida, 'q') != '3';
									
/* 5. Selecciona el nombre y apellidos de aquellos clientes cuyo gasto en reservas 
de vuelos con origen en España (Sevilla, Málaga, Madrid, Bilbao y Barcelona) ha sido 
superior a la media total de gasto de vuelos con origen fuera de España.*/


SELECT DISTINCT(desde), ciudad
FROM aeropuerto JOIN vuelo ON(id_aeropuerto=desde)
ORDER BY desde;
-- Conocer los aeropuertos fuera de España

SELECT id_vuelo, COUNT(id_reserva)::numeric * round((precio -precio*COALESCE(descuento, 0)/100),2)
FROM aeropuerto JOIN vuelo ON(id_aeropuerto=desde)
				JOIN reserva USING(id_vuelo)
				JOIN cliente USING(id_cliente)
WHERE desde BETWEEN 5 AND 10
GROUP BY id_vuelo;

--subconsulta en having
-- Conocer el gasto total de cada vuelos fuera de España.
-- A esto se le haría la suma de esta operación para saber el total gastado fuera de España.
-- Luego habría que hacerle la media a ese resultado y comparar con la consulta siguiente.
	
SELECT id_cliente, COUNT(id_reserva)::numeric * round((precio -precio*COALESCE(descuento, 0)/100),2)
FROM aeropuerto JOIN vuelo ON(id_aeropuerto=desde)
				JOIN reserva USING(id_vuelo)
				JOIN cliente USING(id_cliente)
WHERE desde BETWEEN 1 AND 4 OR desde ='11'
GROUP BY id_cliente, precio, descuento;
-- A esto habría que sacarle el total con sum y tendría que ser mayor que lo explicado en la consulta anterior.	
