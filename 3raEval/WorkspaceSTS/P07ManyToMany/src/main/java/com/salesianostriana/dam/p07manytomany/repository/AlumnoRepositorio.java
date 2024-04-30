package com.salesianostriana.dam.p07manytomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salesianostriana.dam.p07manytomany.model.Alumno;

public interface AlumnoRepositorio
	extends JpaRepository<Alumno, Long>{

}