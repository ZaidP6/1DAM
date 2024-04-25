package com.salesianostriana.dam.e03fragmentos.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class MainController {

	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	public String otra(Model model) {
		model.addAttribute("mensaje", "Hey, q pasa");
		return "otraPagina";
	}
}
