package com.salesianostriana.dam.p01springcoreweb;

import org.springframework.stereotype.Service;

@Service
public class EnglishSaludator implements Saludator{

	@Override
	public void imprimirSaludo() {
		System.out.println("Hello 1DAM");
		
	}

	@Override
	public String saludar() {
		
		return "Hello 1DAM";
	}

	
}
