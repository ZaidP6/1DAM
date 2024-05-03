package com.salesianostriana.dam.pilaraguilartiendaonline01.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@DiscriminatorValue("A")
@NoArgsConstructor @Entity @Data
@EqualsAndHashCode(callSuper = false)
public class Admin extends BasicUser {

	
}
