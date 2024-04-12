package com.salesianostriana.dam.p01springcoreweb;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class SpanishSaludator implements Saludator{

	@Override
	public void imprimirSaludo() {
		System.out.println("Hola a 1DAM");
	}

	@Override
	public String saludar() {
		return "Hola a 1DAM";
	}

}
