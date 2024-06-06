package com.salesianostriana.dam.proyectofinaldanielmartinez.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;

import com.salesianostriana.dam.proyectofinaldanielmartinez.model.Producto;
import com.salesianostriana.dam.proyectofinaldanielmartinez.service.ProductoService;

@Controller
public class ProductoController {

	@Autowired
    private final ProductoService productoService;

    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    @GetMapping("/productos")
    public String listarProductos(Model model) {
        List<Producto> productos = productoService.findAll();
        model.addAttribute("productos", productos);
        return "melee";
    }
    
    @GetMapping("/producto/{id}")
    public String cargarProducto(@PathVariable("id") Long id, Model model) {
        Optional<Producto> optionalProducto = productoService.findById(id);
        Producto producto = optionalProducto.get();
        System.out.println(producto);
        model.addAttribute("producto", producto);
        return "producto";
    }
    
    


}