package com.salesianostriana.dam.p07manytomany.service;

import org.springframework.stereotype.Service;

import com.salesianostriana.dam.p07manytomany.model.Asignatura;
import com.salesianostriana.dam.p07manytomany.repository.AsignaturaRepositorio;
import com.salesianostriana.dam.p07manytomany.service.base.BaseServiceImpl;


@Service
public class AsignaturaServicio 
	extends BaseServiceImpl<Asignatura, Long, AsignaturaRepositorio>{

}