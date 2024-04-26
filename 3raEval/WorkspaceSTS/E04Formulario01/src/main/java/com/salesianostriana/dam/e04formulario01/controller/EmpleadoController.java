package com.salesianostriana.dam.e04formulario01.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.salesianostriana.dam.e04formulario01.model.Empleado;

public class EmpleadoController {

	//Para rellennar formulario vacio es una petición Get, si es para llevarte los datos y guardarlos es una petición Post
	
	@GetMapping("/empleado")
	public String showForm(Model model) {
		Empleado empleado = new Empleado();
		model.addAttribute("empleadoForm", empleado);
		
		return "formulario";
	}
	
	@PostMapping("/addEmpleado")   //Este no guarda los datos en la bbdd, solo lo pinta en otra pagWeb.
	public String submit(@ModelAttribute("empleadoForm")Empleado empleado, Model model) {
		model.addAttribute("empleado", empleado);
		return "viewForm";
	}
	
}
