package com.salesianostriana.dam.prueba01;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class Product {

	private int productId;
	private String productName;
	private String productDescription;
	private double productPvP;
	private int productStockQuantity;
	private String productReview;
	
}
