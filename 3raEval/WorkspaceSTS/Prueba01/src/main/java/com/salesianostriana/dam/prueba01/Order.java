package com.salesianostriana.dam.prueba01;

import java.sql.Date;
import java.util.List;

import lombok.Data;

@Data
public class Order {

	private int orderId;
	private Date orderDate;
	private List<OrderLine> orderShopList;
	
}
