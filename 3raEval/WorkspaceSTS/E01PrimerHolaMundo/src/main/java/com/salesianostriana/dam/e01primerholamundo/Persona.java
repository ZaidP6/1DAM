package com.salesianostriana.dam.e01primerholamundo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data					//Getters y Setters
@AllArgsConstructor		//Constructor
@NoArgsConstructor		//Constructor vacio
public class Persona {

	private String nombre;
	private String apellidos;
	
}
