package com.salesianostriana.dam.proyectofinaldanielmartinez.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.salesianostriana.dam.proyectofinaldanielmartinez.model.Cliente;
import com.salesianostriana.dam.proyectofinaldanielmartinez.model.LineaVenta;
import com.salesianostriana.dam.proyectofinaldanielmartinez.model.Producto;
import com.salesianostriana.dam.proyectofinaldanielmartinez.model.Venta;
import com.salesianostriana.dam.proyectofinaldanielmartinez.service.ClienteService;
import com.salesianostriana.dam.proyectofinaldanielmartinez.service.VentaService;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class CarroController {

	@Autowired
	private VentaService ventaService;
	
	@Autowired
	private ClienteService clienteService;
	
	
	@GetMapping("/user/agregar/{id}")
    public String agregarAlCarrito(@AuthenticationPrincipal Cliente logeado, @PathVariable Long id, int cantidad) {
        Cliente cliente = clienteService.obtenerClienteActual(logeado);
        if (cliente != null) {
            ventaService.agregarProductoAlCarrito(cliente, id, cantidad);
        }
        return "redirect:/user/carro";
    }

	@GetMapping("/user/carro")
	public String verCarrito(@AuthenticationPrincipal Cliente logeado, Model model) {
	    Cliente cliente = clienteService.obtenerClienteActual(logeado);
	    if (cliente != null) {
	        Venta carrito = ventaService.obtenerCarritoDelCliente(cliente);
	        
	        Map<Producto, LineaVenta> lineasMap = new LinkedHashMap<>();
	        for (LineaVenta linea : carrito.getLineas()) {
	            lineasMap.put(linea.getProducto(), linea);
	        }
	        
	        model.addAttribute("carrito", carrito);
	        model.addAttribute("lineasMap", lineasMap);
	    }
	    return "/user/carro";
	}
	
	@GetMapping("/carrito/eliminar/{id}")
    public String eliminarProductoDelCarrito(@AuthenticationPrincipal Cliente userDetails, @PathVariable Long id) {
        Cliente cliente = clienteService.obtenerClienteActual(userDetails);
        if (cliente != null) {
            ventaService.eliminarProductoDelCarrito(cliente, id);
        }
        return "redirect:/user/carro";
    }

    @PostMapping("/carrito/finalizar")
    public String finalizarVenta(@AuthenticationPrincipal Cliente userDetails) {
        Cliente cliente = clienteService.obtenerClienteActual(userDetails);
        if (cliente != null) {
            ventaService.finalizarVenta(cliente);
        }
        return "redirect:/user/carro";
    }
    
    @PostMapping("/user/carrito/aplicar-codigo")
    public String aplicarCodigo(@AuthenticationPrincipal Cliente logeado, @RequestParam("codigo") String codigo, Model model) {
        Cliente cliente = clienteService.obtenerClienteActual(logeado);
        if (cliente != null) {
            ventaService.aplicarCodigo(cliente, codigo);
            model.addAttribute("mensaje", "Código promocional aplicado correctamente!");
        } else {
            model.addAttribute("mensaje", "Código promocional inválido.");
        }
        
        return "redirect:/user/carro";
    }
	
}
