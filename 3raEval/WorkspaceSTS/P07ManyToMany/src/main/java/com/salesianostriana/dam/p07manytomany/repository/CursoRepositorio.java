package com.salesianostriana.dam.p07manytomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salesianostriana.dam.p07manytomany.model.Curso;

public interface CursoRepositorio 
	extends JpaRepository<Curso, Long>{

}