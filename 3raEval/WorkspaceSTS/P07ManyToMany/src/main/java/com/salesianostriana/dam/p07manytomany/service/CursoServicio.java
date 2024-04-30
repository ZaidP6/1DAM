package com.salesianostriana.dam.p07manytomany.service;

import org.springframework.stereotype.Service;

import com.salesianostriana.dam.p07manytomany.model.Curso;
import com.salesianostriana.dam.p07manytomany.repository.CursoRepositorio;
import com.salesianostriana.dam.p07manytomany.service.base.BaseServiceImpl;



@Service
public class CursoServicio 
	extends BaseServiceImpl<Curso, Long, CursoRepositorio>{

}