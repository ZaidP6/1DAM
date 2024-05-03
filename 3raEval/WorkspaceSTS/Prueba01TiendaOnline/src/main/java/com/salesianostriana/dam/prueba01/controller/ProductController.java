package com.salesianostriana.dam.prueba01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.salesianostriana.dam.prueba01.model.Product;
import com.salesianostriana.dam.prueba01.service.ProductService;


@Controller
public class ProductController {

    private final ProductService productoServicio;

    public ProductController(ProductService productoServicio) {
        this.productoServicio = productoServicio;
    }

    @GetMapping("/productos/formulario")
    public String mostrarFormulario(Model model) {
        model.addAttribute("producto", new Product());
        return "addProductForm";
    }

    @PostMapping("/productos/guardarProducto")
    public String guardarProducto(@ModelAttribute("producto") Product producto     ) {
        // Aquí puedes manejar la lógica para guardar el producto en la base de datos
        // y la imagen en el sistema de archivos, base de datos o almacenamiento en la nube
        // También puedes agregar validaciones y procesamiento adicional aquí

        // Por simplicidad, solo se imprime la información en la consola
        System.out.println("Nombre: " + producto.getProductName());
        System.out.println("Descripción: " + producto.getProductDescription());
        System.out.println("Precio: " + producto.getProductPvP());
        System.out.println("Stock: " + producto.getProductStockQuantity());
        System.out.println("Fecha: " + producto.getProductDate());

        // Aquí deberías llamar al método de tu servicio para guardar el producto
        productoServicio.agregar(producto);

        // Redirige a una página de éxito o cualquier otra página deseada
        return "redirect:/productos/formulario";
    }
}
