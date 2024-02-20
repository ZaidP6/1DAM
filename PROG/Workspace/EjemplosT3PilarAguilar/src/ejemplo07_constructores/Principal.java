package ejemplo07_constructores;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*
		double precioFabrica;
		Producto p = new Producto("Lechuga", 1.2, 1, true);
		Producto p3;
		
		System.out.println("indique un precio");
		precioFabrica = Leer.datoDouble();
		Producto p1 = new Producto("Lechuga2", precioFabrica, 1, true);
		System.out.println(p1.getPrecioFabrica()); //este es el bueno
		System.out.println(precioFabrica); //esta varible puede cambiar en cualquier momento, se sebe usar los getters
		
		p3 = new Producto(); //No se crea objeto vacío
		
		System.out.println(p); //esto muestra la direccion de memoria
		System.out.println(p1.toString());
	*/
		
		int op, seccion,lecturaVenta, numProductos=0,numTrabajadores=10,tam=10;
        String nombre;
        double precioFabrica;
        boolean enVenta;
        Producto p1; 
        
        //productos de prueba 
        Producto p2 = new Producto ("melocotones",1.5,1,true);
        Producto p3 =new Producto ("camiseta",10,3,true);
       Producto [] listaProducto = new Producto[tam];
        Tienda t1=new Tienda(listaProducto,numProductos,numTrabajadores);
        
		
		do {
			System.out.println("Elija una opción del menú");
			menu();
			
			op = Leer.datoInt();
			
			switch (op) {
				case 1:
					System.out.println("Diga el nombre del producto");
					nombre = Leer.dato();
					System.out.println("Diga el precio de fábrica");
					precioFabrica= Leer.datoDouble();
					System.out.println("Diga la categoria");
					seccion = Leer.datoInt();
					System.out.println("Indique si está en venta con un 1 o no con cualquier otro");
					lecturaVenta = Leer.datoInt();
					if(lecturaVenta == 1)
						enVenta =true;
					else
						enVenta = false;
					
					p1 = new Producto(nombre, precioFabrica, seccion, enVenta);
					t1 = listaProducto[i];
					
					break;
					
				case 2:
					t1.mostrarLista();
	
				case 3:
					
				default:
					break;
			}
		} while (op!= 0);
		
	}
	
	public static void menu() {
		System.out.println("""
				1. Agregar nuevo producto
				2. Mostrar la lista
				3. Buscar por seccion
				""");
	}

}
