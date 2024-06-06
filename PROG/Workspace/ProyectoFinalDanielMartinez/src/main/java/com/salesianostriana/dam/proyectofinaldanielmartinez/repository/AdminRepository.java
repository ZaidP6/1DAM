package com.salesianostriana.dam.proyectofinaldanielmartinez.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salesianostriana.dam.proyectofinaldanielmartinez.model.Admin;

public interface AdminRepository extends JpaRepository <Admin, Long>{

	Optional<Admin> findByUsername(String username);
}