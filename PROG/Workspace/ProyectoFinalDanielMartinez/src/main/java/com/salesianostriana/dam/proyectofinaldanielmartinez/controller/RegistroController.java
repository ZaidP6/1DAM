package com.salesianostriana.dam.proyectofinaldanielmartinez.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.salesianostriana.dam.proyectofinaldanielmartinez.model.Cliente;
import com.salesianostriana.dam.proyectofinaldanielmartinez.service.UsuarioService;

@Controller
public class RegistroController {

    @Autowired
    private UsuarioService usuarioService;
    
    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping("/registro")
    public String registroForm(Model model) {
        model.addAttribute("cliente", new Cliente());
        return "registro";
    }

    @PostMapping("/registro/submit")
    public String submitRegistro(@ModelAttribute("cliente") Cliente cliente, Model model) {
        if (usuarioService.existeUsername(cliente.getUsername())) {
            model.addAttribute("errorUsername", "El nombre de usuario ya está registrado");
            return "registro";
        }
        if (usuarioService.existeEmail(cliente.getEmail())) {
            model.addAttribute("errorEmail", "El correo electrónico ya está registrado");
            return "registro";
        }else {
        	cliente.setPassword(passwordEncoder.encode(cliente.getPassword()));
        	usuarioService.save(cliente);
        	return "redirect:/";
        }
        
        
    }



}
