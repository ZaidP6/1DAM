package com.salesianostriana.dam.p01springcorebis;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("englishSaludator")
public class EnglishSaludator implements Saludator{

	@Override
	public void imprimirSaludo() {
		System.out.println("How do you say FERIA in english?");
		
	}

	
}
