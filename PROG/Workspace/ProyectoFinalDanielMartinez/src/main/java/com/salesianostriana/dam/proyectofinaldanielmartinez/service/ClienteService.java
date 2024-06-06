package com.salesianostriana.dam.proyectofinaldanielmartinez.service;

import java.util.List;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.salesianostriana.dam.proyectofinaldanielmartinez.model.Cliente;
import com.salesianostriana.dam.proyectofinaldanielmartinez.model.Venta;
import com.salesianostriana.dam.proyectofinaldanielmartinez.repository.ClienteRepository;
import com.salesianostriana.dam.proyectofinaldanielmartinez.service.base.BaseServiceImpl;

@Service
public class ClienteService 
	extends BaseServiceImpl<Cliente, Long, ClienteRepository> implements UserDetailsService{

	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return repository.findFirstByUsername(username)
				.orElseThrow(() -> new UsernameNotFoundException("Error al buscar el usuario"));
	}
	
	public List<Cliente> findByNombre(String nombre){
		return this.repository.findByNombreContainsIgnoreCase(nombre);
	}
	
	public Cliente obtenerClienteActual(@AuthenticationPrincipal Cliente cliente) {
        if (cliente != null) {
            return cliente;
        } else {

        	return null;
        }
    }
	
}
