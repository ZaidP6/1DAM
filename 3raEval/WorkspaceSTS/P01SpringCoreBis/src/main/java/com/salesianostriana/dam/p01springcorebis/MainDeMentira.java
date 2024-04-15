package com.salesianostriana.dam.p01springcorebis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import jakarta.annotation.PostConstruct;

@Controller
public class MainDeMentira {

	@Autowired  //Busca un bean del tipo de esta dependencia y si lo encuentras em guardas en esta referencia el acceso a la memoria
	private Saludator saludator;
	
	
	@PostConstruct
	void run() {
		//System.out.println("Hola Mundo");
		saludator.imprimirSaludo();
	}
	
	
}
