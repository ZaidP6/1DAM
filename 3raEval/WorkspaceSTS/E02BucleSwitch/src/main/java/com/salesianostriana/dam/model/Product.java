package com.salesianostriana.dam.model;

import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class Product {

	private int productId;
	private String productName;
	private String productDescription;
	private double poductPrice;
	private boolean productInStock;
	
	@DateTimeFormat(iso = ISO.DATE_TIME) //para determinar el formato
	private LocalDateTime productDate;
	
}
