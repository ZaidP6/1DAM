package com.salesianostriana.dam.prueba01;

import lombok.Data;

@Data
public class OrderLine {
	
	private int orderLineProduct;
	private int orderLineQuantity;
	private double orderLinePrice;
}
