package com.salesianostriana.dam.pilaraguilartiendaonline02.service;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

import com.salesianostriana.dam.pilaraguilartiendaonline02.model.Product;
import com.salesianostriana.dam.pilaraguilartiendaonline02.repository.ProductRepository;
import com.salesianostriana.dam.pilaraguilartiendaonline02.service.base.BaseServiceImpl;



@Service
public class ProductService 
    extends BaseServiceImpl<Product, Long, ProductRepository>{

	private List <Product> lista;
	private long siguienteId;
	
	public void agregar (Product p) {
		
		siguienteId++;
		p.setProductId(siguienteId);
		
		lista.add(p);
			
	}
	
	public List<Product> getLista (){
		return Collections.unmodifiableList(lista); 
	}
	
	public Product findById(long id) {
		Product tem=null;
		boolean salir = false;

		for (int i = 0; i < lista.size() && !salir; i++) {
			if (lista.get(i).getProductId()==id) {
				tem = lista.get(i);
				salir = true;
			}
		}
		return tem;
	}
	public void editar (Product p) {
		
		int num;;
		if (p!=null) {
			
			Product tem=findById(p.getProductId());
			num=lista.indexOf(tem);
			lista.set(num, p);
		}
			
		else {
			
		}
			
	}
	
	public void delete (long id) {
		lista.remove(findById(id));
	}
}
