package com.salesianostriana.dam.pilaraguilartiendaonline01.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
@MappedSuperclass 
public class BasicUser {
	
	@Id @GeneratedValue
	private int basicUserId;
	
	private String basicUserName;
	private String basicUserPassword;
	private String basicUserPhoto;

}
