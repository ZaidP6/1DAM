package com.salesianostriana.dam.prueba01.service;

import java.util.ArrayList;
import java.util.List;

import com.salesianostriana.dam.prueba01.model.Product;

public class ProductService {

	//simula una mini base de datos
	
		public List <Product> lista=new ArrayList <Product>();
		
		public void agregar (Product p) {
			
			lista.add(p);
		}
			
		public List<Product> getLista (){
			return lista; 
		}

	
}
