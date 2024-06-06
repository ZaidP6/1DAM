package com.salesianostriana.dam.proyectofinaldanielmartinez.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.salesianostriana.dam.proyectofinaldanielmartinez.model.Cliente;


public interface ClienteRepository extends JpaRepository<Cliente, Long>{
	
	Optional<Cliente> findFirstByUsername(String username);
	
	List<Cliente> findByNombreContainsIgnoreCase(String nombre);
	
	
}
