package com.salesianostriana.dam.p07manytomany.service;

import org.springframework.stereotype.Service;

import com.salesianostriana.dam.p07manytomany.model.Alumno;
import com.salesianostriana.dam.p07manytomany.repository.AlumnoRepositorio;
import com.salesianostriana.dam.p07manytomany.service.base.BaseServiceImpl;



@Service
public class AlumnoServicio
	extends BaseServiceImpl<Alumno, Long, AlumnoRepositorio>{

}