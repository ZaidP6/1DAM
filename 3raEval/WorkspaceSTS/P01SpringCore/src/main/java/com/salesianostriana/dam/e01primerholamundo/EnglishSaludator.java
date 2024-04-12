package com.salesianostriana.dam.e01primerholamundo;

import org.springframework.stereotype.Service;

@Service
public class EnglishSaludator implements Saludator{

	@Override
	public void imprimirSaludo() {
		System.out.println("Hello 1DAM");
		
	}

	
}
