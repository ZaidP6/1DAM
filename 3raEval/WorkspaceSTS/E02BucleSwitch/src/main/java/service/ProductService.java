package service;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import model.Product;

@Service
public class ProductService {

	public List<Product> getProductList(){
		return Arrays.asList(
				new Product(1,"Botijo", "Enfría has menos 10 grados", 20.5055, true, LocalDateTime.now()),
				new Product(2,"Botijo Extra", "Enfría has menos 200 grados", 200.50, true, LocalDateTime.now())
				);
	}
	
}
