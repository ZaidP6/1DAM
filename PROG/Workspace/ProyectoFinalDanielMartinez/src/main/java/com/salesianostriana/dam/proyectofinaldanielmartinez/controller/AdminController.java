package com.salesianostriana.dam.proyectofinaldanielmartinez.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import com.salesianostriana.dam.proyectofinaldanielmartinez.model.Admin;
import com.salesianostriana.dam.proyectofinaldanielmartinez.model.Producto;
import com.salesianostriana.dam.proyectofinaldanielmartinez.model.Venta;
import com.salesianostriana.dam.proyectofinaldanielmartinez.service.AdminService;
import com.salesianostriana.dam.proyectofinaldanielmartinez.service.ProductoService;
import com.salesianostriana.dam.proyectofinaldanielmartinez.service.VentaService;

import org.springframework.ui.Model;

@Controller
public class AdminController {

	@Autowired
    private ProductoService productoService;
	
	@Autowired
	private AdminService adminService;
	
	@Autowired
	private VentaService ventaService;
	
	@Autowired
    private PasswordEncoder passwordEncoder;

    public AdminController(ProductoService productoService) {
        this.productoService = productoService;
    }

    @GetMapping("/admin")
	public String indexadmin(Model model) {
    	List<Producto> productos = productoService.seleccionarProductosAleatorios(4);
		model.addAttribute("productos", productos);
		return "/admin/indexadmin";
	}
    
    @GetMapping("/admin/perfil")
	public String perfiladmin() {
		return "/admin/perfiladmin";
	}
    
    @GetMapping("/admin/productos/melee")
    public String listarMeleeAdmin(Model model, @RequestParam(name = "orden", required = false) String orden) {
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
        model.addAttribute("producto", new Producto());
        return "/admin/meleeadmin";
    }
    
    @GetMapping("/admin/productos/melee/{id}")
    public String cargarProductoMelee(@PathVariable("id") Long id, Model model) {
    	Optional<Producto> optionalProducto = productoService.findById(id);
        Producto producto = optionalProducto.get();
            System.out.println(producto);
            model.addAttribute("producto", producto);
            return "/admin/productoadmin";
    }
    
    @GetMapping("/admin/productos/distancia/{id}")
    public String cargarProductoDistancia(@PathVariable("id") Long id, Model model) {
    	Optional<Producto> optionalProducto = productoService.findById(id);
        Producto producto = optionalProducto.get();        
        System.out.println(producto);
        model.addAttribute("producto", producto);
        return "/admin/productoadmin";
    }
    
    @GetMapping("/admin/productos/distancia")
    public String listarDistanciaAdmin(Model model, @RequestParam(name = "orden", required = false) String orden) {
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
        model.addAttribute("producto", new Producto());
        return "/admin/distanciaadmin";
    }



    
    @PostMapping("/admin/productos/melee/guardarProducto")
    public String guardarMelee(@ModelAttribute Producto producto) {
    	productoService.save(producto);
        return "redirect:/admin/productos/melee";
    }

   
    @PostMapping("/admin/productos/melee/eliminarProducto/{id}")
    public String eliminarMelee(@PathVariable("id") Long id) {
        productoService.borrarProducto(id);
        return "redirect:/admin/productos/melee";
    }
    
    
    @GetMapping("/admin/productos/editar/{id}")
	public String mostrarFormularioMelee(@PathVariable("id") long id, Model model) {
    	Optional<Producto> optionalProducto = productoService.findById(id);
        Producto editar = optionalProducto.get();
		editar.setId(editar.getId());
		model.addAttribute("productoEdit", editar);
		
		return "/admin/formularioprod";
		
	}
    
    @PostMapping("/admin/productos/editar/submit")
    public String procesarMelee(@ModelAttribute("productoEdit") Producto p) {
    	productoService.edit(p);
    	return "redirect:/admin";
    }

    @PostMapping("/admin/productos/distancia/guardarProducto")
    public String guardarDistancia(@ModelAttribute Producto producto) {
    	productoService.save(producto);
        return "redirect:/admin/productos/distancia";
    }

   
    @PostMapping("/admin/productos/distancia/eliminarProducto/{id}")
    public String eliminarDistancia(@PathVariable("id") Long id) {
        productoService.borrarProducto(id);
        return "redirect:/admin/productos/distancia";
    }
    
    
    @GetMapping("/admin/productos/cuero")
    public String listarCueroAdmin(Model model, @RequestParam(name = "orden", required = false) String orden) {
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
        model.addAttribute("producto", new Producto());
        return "/admin/cueroadmin";
    }

    @GetMapping("/admin/productos/cuero/{id}")
    public String cargarProductoCuero(@PathVariable("id") Long id, Model model) {
    	Optional<Producto> optionalProducto = productoService.findById(id);
        Producto producto = optionalProducto.get();
            System.out.println(producto);
            model.addAttribute("producto", producto);
            return "/admin/productoadmin";
    }

    @PostMapping("/admin/productos/cuero/guardarProducto")
    public String guardarCuero(@ModelAttribute Producto producto) {
    	productoService.save(producto);
        return "redirect:/admin/productos/cuero";
    }

    @PostMapping("/admin/productos/cuero/eliminarProducto/{id}")
    public String eliminarCuero(@PathVariable("id") Long id) {
        productoService.borrarProducto(id);
        return "redirect:/admin/productos/cuero";
    }
    
    @GetMapping("/admin/productos/metal")
    public String listarMetalAdmin(Model model, @RequestParam(name = "orden", required = false) String orden) {
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
        model.addAttribute("producto", new Producto());
        return "/admin/metaladmin";
    }

    @GetMapping("/admin/productos/metal/{id}")
    public String cargarProductoMetal(@PathVariable("id") Long id, Model model) {
        Optional<Producto> optionalProducto = productoService.findById(id);
            Producto producto = optionalProducto.get();
            System.out.println(producto);
            model.addAttribute("producto", producto);
            return "/admin/productoadmin";
    }
    
    @GetMapping("/admin/productos/{id}")
    public String cargarProducto(@PathVariable("id") Long id, Model model) {
        Optional<Producto> optionalProducto = productoService.findById(id);
            Producto producto = optionalProducto.get();
            System.out.println(producto);
            model.addAttribute("producto", producto);
            return "/admin/productoadmin";
    }

    @PostMapping("/admin/productos/metal/guardarProducto")
    public String guardarMetal(@ModelAttribute Producto producto) {
    	productoService.save(producto);
        return "redirect:/admin/productos/metal";
    }

    @PostMapping("/admin/productos/metal/eliminarProducto/{id}")
    public String eliminarMetal(@PathVariable("id") Long id) {
        productoService.borrarProducto(id);
        return "redirect:/admin/productos/metal";
    }

    
    @GetMapping("/admin/descuento")
    public String abrirDescuentos(Model model, @RequestParam(name = "orden", required = false) String orden) {
    	List<Producto> productos = productoService.findAll();
    	model.addAttribute("productos", productos);
    	
    	return "/admin/descuentos";
    }
    
    @GetMapping("/admin/descuento/{id}")
    public String formDescuento(@PathVariable("id") long id, @RequestParam(value = "cant", required = false, defaultValue = "0") double cant, Model model) {
        Optional<Producto> prod = productoService.findById(id);
        if (prod.isPresent()) {
            Producto producto = prod.get();
            if (cant > 0) {
                adminService.aplicarDescuento(id, cant);
                producto = productoService.findById(id).get();
            }
            model.addAttribute("productoEdit", producto);
            return "/admin/descueentoproduc";
        } else {
            model.addAttribute("error", "Producto no encontrado");
            return "error";
        }
    }
    
    @PostMapping("/admin/descuento/submit")
    public String aplicarDescuento(@RequestParam("id") Long id, @RequestParam("cant") double cant) {
        adminService.aplicarDescuento(id, cant);
        return "redirect:/admin/descuento";
    }

    @PostMapping("/admin/liquidacion")
    public String ponerLiquidacion() {
    	adminService.ponerLiquidacion();
    	return "redirect:/admin/descuento";
    }
    
    @GetMapping("/admin/productos/otros")
    public String listarOtrosAdmin(Model model, @RequestParam(name = "orden", required = false) String orden) {
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
        model.addAttribute("producto", new Producto());
        return "/admin/otrosadmin";
    }

    @GetMapping("/admin/productos/otros/{id}")
    public String cargarProductoOtros(@PathVariable("id") Long id, Model model) {
        Optional<Producto> optionalProducto = productoService.findById(id);
            Producto producto = optionalProducto.get();
            System.out.println(producto);
            model.addAttribute("producto", producto);
            return "/admin/productoadmin";
    }

    @PostMapping("/admin/productos/otros/guardarProducto")
    public String guardarOtros(@ModelAttribute Producto producto) {
    	productoService.save(producto);
        return "redirect:/admin/productos/otros";
    }

    @PostMapping("/admin/productos/otros/eliminarProducto/{id}")
    public String eliminarOtros(@PathVariable("id") Long id) {
        productoService.borrarProducto(id);
        return "redirect:/admin/productos/otros";
    }
    
    
    @GetMapping("/admin/profile")
    public String adminProfile(Model model, @AuthenticationPrincipal Admin admin) {
        model.addAttribute("admin", admin);
    	return "/admin/perfiladmin";
    }
    
    @PostMapping("/admin/profileEdit/submit")
    public String adminEditProfile(@ModelAttribute("admin") Admin admin) {
        admin.setPassword(passwordEncoder.encode(admin.getPassword()));
        Admin updatedAdmin = adminService.edit(admin);
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        auth = new UsernamePasswordAuthenticationToken(updatedAdmin, auth.getCredentials(), auth.getAuthorities());
        SecurityContextHolder.getContext().setAuthentication(auth);
        return "redirect:/admin/profile";
    }
    
    @GetMapping("/admin/ventas")
    public String getVentas(Model model) {
        List<Venta> ventas = ventaService.findAll();
        String mesConMasVentas = adminService.getMesConMasVentas();
        Producto productoMasVendido = adminService.getProductoMasVendido();

        model.addAttribute("ventas", ventas);
        model.addAttribute("mesConMasVentas", mesConMasVentas);
        model.addAttribute("productoMasVendido", productoMasVendido);

        return "admin/ventas";
    }
    
    @GetMapping("/admin/detalleVenta/{id}")
    public String verDetallesVenta(@PathVariable Long id, Model model) {
        Venta pedido = ventaService.findById(id)
                                   .orElseThrow(() -> new IllegalArgumentException("Pedido no encontrado: " + id));
        model.addAttribute("pedido", pedido);
        return "admin/detallesVenta";
    }
}
