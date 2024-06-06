package com.salesianostriana.dam.proyectofinaldanielmartinez.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.salesianostriana.dam.proyectofinaldanielmartinez.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long>{
	
	@Query("select distinct p from Producto p where p.categoria.id = 1")
	List<Producto> productosMelee();
	
	@Query("select distinct p from Producto p where p.categoria.id = 2")
	List<Producto> productosDistancia();
	
	@Query("select distinct p from Producto p where p.categoria.id = 3")
	List<Producto> productosCuero();
	
	@Query("select distinct p from Producto p where p.categoria.id = 4")
	List<Producto> productosMetal();
	
	@Query("select distinct p from Producto p where p.categoria.id = 5")
	List<Producto> productosOtros();
	
	List<Producto> findAllByCategoriaIdOrderByNombreAsc(Long categoriaId);
	
	List<Producto> findAllByCategoriaIdOrderByPrecioAsc(Long categoriaId);
	
	List<Producto> findAllByCategoriaIdOrderByPrecioDesc(Long categoriaId);
	
	List<Producto> findByNombreContainingIgnoreCase (String titulo);	
}
