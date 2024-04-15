package com.salesianostriana.dam.intentoappweb01;

import org.springframework.context.annotation.Primary;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class MainController {

	@GetMapping("/")
	@Primary
	public String welcome(@RequestParam(name = "name", required = false, defaultValue = "illo")String name, Model model){
		model.addAttribute("name", "Luismi");
		return "index.html";
		}
	
}
