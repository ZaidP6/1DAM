package com.salesianostriana.dam.e01primerholamundo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class MainDeMentira {
	
	@Autowired
	private Saludator saludator;

	@PostConstruct
	public void init() {
		
		saludator.imprimirSaludo();
	}
}
