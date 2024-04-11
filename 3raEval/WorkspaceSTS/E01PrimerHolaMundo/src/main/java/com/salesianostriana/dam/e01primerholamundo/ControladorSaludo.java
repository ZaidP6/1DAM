package com.salesianostriana.dam.e01primerholamundo;

import org.springframework.stereotype.Controller;

@Controller
public class ControladorSaludo {

	@GetMapping({ "/", "welcome" })
	public String welcome(@RequestParam(name = "nombre", required = false,
	defaultValue = "Mundo") String nombre,Model model) {
		model.addAttribute("nombre", nombre);// Incluimos la información en el modelo
		return "index";
	}
	
}
