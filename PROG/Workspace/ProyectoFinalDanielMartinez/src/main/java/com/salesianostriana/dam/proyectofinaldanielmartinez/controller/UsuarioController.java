package com.salesianostriana.dam.proyectofinaldanielmartinez.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.salesianostriana.dam.proyectofinaldanielmartinez.model.Cliente;
import com.salesianostriana.dam.proyectofinaldanielmartinez.model.Producto;
import com.salesianostriana.dam.proyectofinaldanielmartinez.model.Venta;
import com.salesianostriana.dam.proyectofinaldanielmartinez.service.ClienteService;
import com.salesianostriana.dam.proyectofinaldanielmartinez.service.ProductoService;
import com.salesianostriana.dam.proyectofinaldanielmartinez.service.VentaService;


@Controller
public class UsuarioController {

	@Autowired
	private ProductoService productoService;
	
	@Autowired
	private ClienteService clienteService;
	
	@Autowired
	private VentaService ventaService;
	
	
	@Autowired
    private PasswordEncoder passwordEncoder;
	
	@GetMapping("/user")
	public String indexuser(Model model) {
		List<Producto> productos = productoService.seleccionarProductosAleatorios(4);
		model.addAttribute("productos", productos);
		return "/user/indexuser";
	}
	
	@GetMapping("/user/productos/melee")
    public String listarMeleeUser(Model model, @RequestParam(name = "orden", required = false) String orden) {
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
        return "/user/meleeuser";
    }
	
	@GetMapping("/user/productos/distancia")
    public String listarDistanciaUser(Model model, @RequestParam(name = "orden", required = false) String orden) {
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
        return "/user/distanciauser";
    }
    
    @GetMapping("/user/productos/melee/{id}")
    public String cargarProductoMelee(@PathVariable("id") Long id, Model model) {
        Optional<Producto> optionalProducto = productoService.findById(id);
            Producto producto = optionalProducto.get();
            System.out.println(producto);
            model.addAttribute("producto", producto);
            return "/user/productouser";
    }
    
    @GetMapping("/user/productos/distancia/{id}")
    public String cargarProductoDistancia(@PathVariable("id") Long id, Model model) {
        Optional<Producto> optionalProducto = productoService.findById(id);
        Producto producto = optionalProducto.get();
        System.out.println(producto);
        model.addAttribute("producto", producto);
        return "/user/productouser";
    }
	
    @GetMapping("/user/productos/cuero")
    public String listarCueroUser(Model model, @RequestParam(name = "orden", required = false) String orden) {
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
        return "/user/cuerouser";
    }

    @GetMapping("/user/productos/cuero/{id}")
    public String cargarProductoCuero(@PathVariable("id") Long id, Model model) {
        Optional<Producto> optionalProducto = productoService.findById(id);
            Producto producto = optionalProducto.get();
            System.out.println(producto);
            model.addAttribute("producto", producto);
            return "/user/productouser";
    }
    
    @GetMapping("/user/productos/metal")
    public String listarMetalUser(Model model, @RequestParam(name = "orden", required = false) String orden) {
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
        return "/user/metaluser";
    }

    @GetMapping("/user/productos/metal/{id}")
    public String cargarProductoMetal(@PathVariable("id") Long id, Model model) {
        Optional<Producto> optionalProducto = productoService.findById(id);
            Producto producto = optionalProducto.get();
            System.out.println(producto);
            model.addAttribute("producto", producto);
            return "/user/productouser";
    }
    
    @GetMapping("/user/productos/otros")
    public String listarOtrosUser(Model model, @RequestParam(name = "orden", required = false) String orden) {
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
        return "/user/otrosuser";
    }

    @GetMapping("/user/productos/otros/{id}")
    public String cargarProductoOtros(@PathVariable("id") Long id, Model model) {
        Optional<Producto> optionalProducto = productoService.findById(id);
            Producto producto = optionalProducto.get();
            System.out.println(producto);
            model.addAttribute("producto", producto);
            return "/user/productouser";
    }
    
    @GetMapping("/user/productos/{id}")
    public String cargarProducto(@PathVariable("id") Long id, Model model) {
        Optional<Producto> optionalProducto = productoService.findById(id);
            Producto producto = optionalProducto.get();
            System.out.println(producto);
            model.addAttribute("producto", producto);
            return "/user/productouser";
    }
	
	@GetMapping("/user/profile")
    public String userProfile(Model model, @AuthenticationPrincipal Cliente cliente) {
        model.addAttribute("usuario", cliente);
    	return "/user/perfiluser";
    }
    
    @PostMapping("/user/profileEdit/submit")
    public String userEditProfile(@ModelAttribute("usuario") Cliente cliente) {
    	cliente.setPassword(passwordEncoder.encode(cliente.getPassword()));
    	Cliente clienteEdit = clienteService.edit(cliente);
    	Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        auth = new UsernamePasswordAuthenticationToken(clienteEdit, auth.getCredentials(), auth.getAuthorities());
        SecurityContextHolder.getContext().setAuthentication(auth);
    	return "redirect:/user/profile";
    	
    }
    
    @GetMapping("/user/busqueda")
    public String buscarProductos(String nombre, Model model) {
    	List<Producto> buscados = productoService.findByNombre(nombre);
    	
    	if(!buscados.isEmpty()) {
    		model.addAttribute("productos", buscados);
    	
    		return "/user/busquedauser";
    	
    	}else {
    		model.addAttribute("productos", new ArrayList<>());
            model.addAttribute("mensaje", "No se ha encontrado ningún producto");
            
            return "/user/busquedauser";
    	}
    	
    }
    
    @GetMapping("/user/productos/busqueda/{id}")
    public String cargarProductoBusqueda(@PathVariable("id") Long id, Model model) {
        Optional<Producto> optionalProducto = productoService.findById(id);
            Producto producto = optionalProducto.get();
            System.out.println(producto);
            model.addAttribute("producto", producto);
            return "/user/productouser";
    }
    
    @GetMapping("/user/mis-pedidos")
    public String verMisPedidos(@AuthenticationPrincipal Cliente logeado, Model model) {
        Cliente cliente = clienteService.obtenerClienteActual(logeado);
        if (cliente != null) {
            List<Venta> pedidosFinalizados = ventaService.findByClienteAndCerrada(cliente);
            model.addAttribute("pedidos", pedidosFinalizados);
        }
        return "/user/mis-pedidos";
    }
    
    @GetMapping("/user/pedidos/{id}")
    public String verDetallesPedido(@PathVariable Long id, Model model) {
        Venta pedido = ventaService.findById(id)
                                   .orElseThrow(() -> new IllegalArgumentException("Pedido no encontrado: " + id));
        model.addAttribute("pedido", pedido);
        return "user/detallesPedido";
    }

}

