package com.salesianostriana.dam.proyectofinaldanielmartinez.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salesianostriana.dam.proyectofinaldanielmartinez.model.Usuario;
import com.salesianostriana.dam.proyectofinaldanielmartinez.repository.UsuarioRepository;
import com.salesianostriana.dam.proyectofinaldanielmartinez.service.base.BaseServiceImpl;

@Service
public class UsuarioService 
	extends BaseServiceImpl<Usuario, Long, UsuarioRepository>{
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	
	public boolean existeUsername(String username) {
        return usuarioRepository.existsByUsername(username);
    }
    
    public boolean existeEmail(String email) {
        return usuarioRepository.existsByEmail(email);
    }
}
