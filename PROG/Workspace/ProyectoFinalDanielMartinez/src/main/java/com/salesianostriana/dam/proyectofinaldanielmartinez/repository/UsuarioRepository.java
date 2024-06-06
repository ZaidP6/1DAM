package com.salesianostriana.dam.proyectofinaldanielmartinez.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salesianostriana.dam.proyectofinaldanielmartinez.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	Optional<Usuario> findFirstByUsername(String username);
	
	boolean existsByUsername(String username);

	boolean existsByEmail(String email);
}
