/*Seleccionar el nombre, apellidos y número de vuelos por aeropuerto de salida, 
para el cliente que más vuelos de salida ha usado en cada aeropuerto.*/


SELECT id_cliente,origen.nombre, COUNT(v.id_vuelo)
FROM vuelo v JOIN aeropuerto origen ON (origen.id_aeropuerto = v.desde)
				JOIN reserva USING(id_vuelo)
				JOIN cliente c USING(id_cliente)
GROUP BY id_cliente,origen.nombre
--HAVING MAX(COUNT(v.id_vuelo))

-------------------------------------------

SELECT c.nombre, c.apellido1, c.apellido2, origen.ciudad,
            v.desde, COUNT(v.id_vuelo) AS "cantidad"
FROM vuelo v JOIN aeropuerto origen ON (origen.id_aeropuerto = v.desde)
				JOIN reserva USING(id_vuelo)
				JOIN cliente c USING(id_cliente)
GROUP BY c.nombre, apellido1, apellido2, origen.ciudad,
            desde
HAVING COUNT(id_vuelo)>= ALL (SELECT COUNT(*)
					  FROM vuelo v2 JOIN reserva USING (id_vuelo)
					  WHERE v.desde = v2.desde
					  GROUP BY id_cliente)
ORDER BY cantidad DESC, origen.ciudad;