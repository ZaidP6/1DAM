package com.salesianostriana.dam.pilaraguilartiendaonline01.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderLine {
	
	@Id @GeneratedValue
	private Long orderLineId;
	
	private Product orderLineProduct;
	private int orderLineQuantity;
	private double orderLinePrice;
	
	@ManyToOne
	private Order order;
}
