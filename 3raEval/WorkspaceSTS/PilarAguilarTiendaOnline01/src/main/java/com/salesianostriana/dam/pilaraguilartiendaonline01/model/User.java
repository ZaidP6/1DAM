package com.salesianostriana.dam.pilaraguilartiendaonline01.model;

import java.sql.Date;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@DiscriminatorValue("U")
@NoArgsConstructor @Entity @Data
@EqualsAndHashCode(callSuper = false)
public class User extends BasicUser{

	private String userMail;
	private Date userBirth;
	private Date userLastSession;
	private String userPhone;
	private String userAddress;
	
	
}
