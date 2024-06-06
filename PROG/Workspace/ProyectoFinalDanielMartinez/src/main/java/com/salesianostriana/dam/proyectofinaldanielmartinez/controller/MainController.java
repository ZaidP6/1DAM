package com.salesianostriana.dam.proyectofinaldanielmartinez.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.salesianostriana.dam.proyectofinaldanielmartinez.model.Producto;
import com.salesianostriana.dam.proyectofinaldanielmartinez.service.ProductoService;


@Controller
public class MainController {

	@Autowired
	private ProductoService productoService;
	
	
	public MainController(ProductoService productoService) {
		this.productoService = productoService;
	}

	@GetMapping("/")
	public String index(Model model) {
		List<Producto> productos = productoService.seleccionarProductosAleatorios(4);
		model.addAttribute("productos", productos);
        return "index";
	}
	
	
	
	@GetMapping("/melee")
    public String listarProductosMelee(Model model, @RequestParam(name = "orden", required = false) String orden) {
    	List<Producto> productosMelee = productoService.mostrarProductosMelee();
        List<Producto> productos;

        if (orden != null) {
            switch (orden) {
                case "nombre_asc":
                    productos = productoService.ordenarProductosPorNombreAsc(1);
                    break;
                case "precio_bajo":
                    productos = productoService.ordenarProductosPorPrecioAsc(1);
                    break;
                case "precio_alto":
                    productos = productoService.ordenarProductosPorPrecioDesc(1);
                    break;
                default:
                    productos = productosMelee;
                    break;
            }
        } else {
            productos = productosMelee;
        }

        model.addAttribute("productos", productos);
        return "melee";
    }
	
	@GetMapping("/distancia")
    public String listarProductosDistancia(Model model, @RequestParam(name = "orden", required = false) String orden) {
    	List<Producto> productosDistancia = productoService.mostrarProductosDistancia();
        List<Producto> productos;

        if (orden != null) {
            switch (orden) {
                case "nombre_asc":
                    productos = productoService.ordenarProductosPorNombreAsc(2);
                    break;
                case "precio_bajo":
                    productos = productoService.ordenarProductosPorPrecioAsc(2);
                    break;
                case "precio_alto":
                    productos = productoService.ordenarProductosPorPrecioDesc(2);
                    break;
                default:
                    productos = productosDistancia;
                    break;
            }
        } else {
            productos = productosDistancia;
        }

        model.addAttribute("productos", productos);
        return "distancia";
    }
	
	@GetMapping("/metal")
    public String listarProductosMetal(Model model, @RequestParam(name = "orden", required = false) String orden) {
    	List<Producto> productosMetal = productoService.mostrarProductosMetal();
        List<Producto> productos;

        if (orden != null) {
            switch (orden) {
                case "nombre_asc":
                    productos = productoService.ordenarProductosPorNombreAsc(4);
                    break;
                case "precio_bajo":
                    productos = productoService.ordenarProductosPorPrecioAsc(4);
                    break;
                case "precio_alto":
                    productos = productoService.ordenarProductosPorPrecioDesc(4);
                    break;
                default:
                    productos = productosMetal;
                    break;
            }
        } else {
            productos = productosMetal;
        }

        model.addAttribute("productos", productos);
        return "metal";
    }
	@GetMapping("/cuero")
    public String listarProductosCuero(Model model, @RequestParam(name = "orden", required = false) String orden) {
    	List<Producto> productosCuero = productoService.mostrarProductosCuero();
        List<Producto> productos;

        if (orden != null) {
            switch (orden) {
                case "nombre_asc":
                    productos = productoService.ordenarProductosPorNombreAsc(3);
                    break;
                case "precio_bajo":
                    productos = productoService.ordenarProductosPorPrecioAsc(3);
                    break;
                case "precio_alto":
                    productos = productoService.ordenarProductosPorPrecioDesc(3);
                    break;
                default:
                    productos = productosCuero;
                    break;
            }
        } else {
            productos = productosCuero;
        }

        model.addAttribute("productos", productos);
        return "cuero";
    }
	
	@GetMapping("/otros")
    public String listarProductosOtros(Model model, @RequestParam(name = "orden", required = false) String orden) {
    	List<Producto> productosOtros = productoService.mostrarProductosOtros();
        List<Producto> productos;

        if (orden != null) {
            switch (orden) {
                case "nombre_asc":
                    productos = productoService.ordenarProductosPorNombreAsc(5);
                    break;
                case "precio_bajo":
                    productos = productoService.ordenarProductosPorPrecioAsc(5);
                    break;
                case "precio_alto":
                    productos = productoService.ordenarProductosPorPrecioDesc(5);
                    break;
                default:
                    productos = productosOtros;
                    break;
            }
        } else {
            productos = productosOtros;
        }

        model.addAttribute("productos", productos);
        return "otros";
    }	
	
	@GetMapping("/quienessomos")
	public String quienesSomos() {
		return "quienessomos";
	}
	
	@GetMapping("/avisoslegales")
	public String avisosLegales() {
		return "avisoslegales";
	}
	
	@GetMapping("/busqueda")
    public String buscarProductos(String nombre, Model model) {
    	List<Producto> buscados = productoService.findByNombre(nombre);
    	
    	if(!buscados.isEmpty()) {
    		model.addAttribute("productos", buscados);
    	
    		return "/busqueda";
    	
    	}else {
    		model.addAttribute("productos", new ArrayList<>());
            model.addAttribute("mensaje", "No se ha encontrado ningún producto");
            
            return "/busqueda";
    	}
    	
    }
	
	@GetMapping("/busqueda/{id}")
    public String cargarProductoBusqueda(@PathVariable("id") Long id, Model model) {
        Optional<Producto> optionalProducto = productoService.findById(id);
            Producto producto = optionalProducto.get();
            System.out.println(producto);
            model.addAttribute("producto", producto);
            return "/producto";
    }
	
	
}
