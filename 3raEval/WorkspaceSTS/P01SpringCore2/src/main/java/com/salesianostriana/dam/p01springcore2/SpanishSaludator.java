package com.salesianostriana.dam.p01springcore2;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

public class SpanishSaludator implements Saludator{

	@Override
	public void imprimirSaludo() {
		System.out.println("Hola a 1DAM");
	}

}
