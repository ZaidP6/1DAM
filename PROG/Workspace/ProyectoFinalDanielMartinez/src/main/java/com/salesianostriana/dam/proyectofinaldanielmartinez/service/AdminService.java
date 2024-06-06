package com.salesianostriana.dam.proyectofinaldanielmartinez.service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salesianostriana.dam.proyectofinaldanielmartinez.model.Admin;
import com.salesianostriana.dam.proyectofinaldanielmartinez.model.LineaVenta;
import com.salesianostriana.dam.proyectofinaldanielmartinez.model.Producto;
import com.salesianostriana.dam.proyectofinaldanielmartinez.model.Venta;
import com.salesianostriana.dam.proyectofinaldanielmartinez.repository.AdminRepository;
import com.salesianostriana.dam.proyectofinaldanielmartinez.service.base.BaseServiceImpl;

@Service
public class AdminService 
	extends BaseServiceImpl<Admin, Long, AdminRepository>{
    
	@Autowired
	private ProductoService productoService;
	
	@Autowired
	private VentaService ventaService;
	
	public void aplicarDescuento(Long productoId, double cantidad) {
	    Producto producto = productoService.findById(productoId)
	            .orElseThrow(() -> new IllegalArgumentException("Producto no encontrado"));

	    if (!producto.isDescuento()) {
	        
	        double descuento = (producto.getPrecio() * cantidad) / 100;
	        producto.setPrecio(producto.getPrecio() - descuento);
	        producto.setNombre(producto.getNombre() + " DESCUENTO");
	        producto.setDescuento(true);
	    } else {
	     
	        String nombreOriginal = producto.getNombre().replace(" DESCUENTO", "");
	        double precioOriginal = producto.getPrecio() / (1 - (cantidad / 100));
	        
	        producto.setNombre(nombreOriginal);
	        producto.setPrecio(precioOriginal);
	        producto.setDescuento(false);
	    }
	    productoService.save(producto);
	}

	
	public void ponerLiquidacion() {
	    List<Producto> catalogo = productoService.findAll();
	    
	    for (Producto producto : catalogo) {
	        if (producto.isDescuento()) {
	            
	            producto.setNombre(producto.getNombre().replace(" LIQUIDACIÓN", ""));
	            producto.setPrecio(producto.getPrecio() * 2);
	            producto.setDescuento(false);
	        } else if (producto.getStock() < 10) {
	            
	            producto.setNombre(producto.getNombre() + " LIQUIDACIÓN");
	            producto.setPrecio(producto.getPrecio() / 2);
	            producto.setDescuento(true);
	        }
	        productoService.edit(producto);
	    }
	}
	
	
	public String getMesConMasVentas() {
        List<Venta> ventas = ventaService.findAll();
        Map<String, Long> ventasPorMes = ventas.stream()
            .collect(Collectors.groupingBy(
                v -> v.getFecha().getYear() + "-" + String.format("%02d", v.getFecha().getMonthValue()),
                Collectors.counting()
            ));

        return ventasPorMes.entrySet().stream()
            .max(Map.Entry.comparingByValue())
            .map(Map.Entry::getKey)
            .orElse("No hay ventas");
    }
	
	public Producto getProductoMasVendido() {
        List<Venta> ventas = ventaService.findAll();
        
        Map<Producto, Integer> ventasPorProducto = ventas.stream()
            .flatMap(v -> v.getLineas().stream())
            .collect(Collectors.groupingBy(LineaVenta::getProducto, Collectors.summingInt(LineaVenta::getCantidad)));

        return ventasPorProducto.entrySet().stream()
            .max(Map.Entry.comparingByValue())
            .map(Map.Entry::getKey)
            .orElse(null);
    }



}