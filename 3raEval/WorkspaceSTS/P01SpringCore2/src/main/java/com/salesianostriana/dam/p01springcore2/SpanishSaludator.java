package com.salesianostriana.dam.p01springcore2;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class SpanishSaludator implements Saludator{

	@Override
	public void imprimirSaludo() {
		System.out.println("Hola a 1DAM");
	}
	
	@PostConstruct
	void alComenzar(){
		System.out.println("Método \"alComenzar\" llamado");
	}

	@PreDestroy
	void antesDeDestruir() {
		System.out.println("Método \"antesDeDestruir\" qu se ejecuta antes de que se destruya.");
	}
}
