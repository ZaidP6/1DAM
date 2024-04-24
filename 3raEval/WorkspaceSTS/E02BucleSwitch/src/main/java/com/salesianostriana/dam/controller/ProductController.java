package com.salesianostriana.dam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.salesianostriana.dam.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	ProductService proService;
	
	public String controladorCondicionales (Model model) {
		
		model.addAttribute("productLista", proService.getProductList());
		return "plantillaBucleYFormateo";
		
	}
	
}
