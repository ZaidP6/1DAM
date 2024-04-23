package com.salesianostriana.dam.prueba01;

import lombok.Data;

@Data
public class Product {

	private int productId;
	private String productName;
	private String productDescription;
	private double productPvP;
	private int productStockQuantity;
	private String productReview;
	
}
