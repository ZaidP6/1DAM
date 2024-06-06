package com.salesianostriana.dam.proyectofinaldanielmartinez.model;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@DiscriminatorValue("ADMIN")
public class Admin extends Usuario{
	
	private static final long serialVersionUID = 1L;


}