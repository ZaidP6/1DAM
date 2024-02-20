package ejercicio01_p2;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*
	 * Escriba una clase Producto, caracterizada por 5 atributos (uno de ellos debe ser precio de fábrica). En esta
		clase se debe tener el método para calcular el precio de coste, que será el precio de fábrica más un porcentaje
		pasado como parámetro que será el coste en el transporte.
		En una clase Tienda, con un array de productos como atributo se podrá:
		- Listar datos de todos los productos.
		- Comprobar si un producto del array es “frágil” o no, mediante un método que devuelva un tipo boolean.
		- Añadir un producto a la lista pasando como parámetro un producto.
		- Calcular la cantidad invertida por la tienda en comprar todos los productos, es decir, la suma de todos los
			precios de fábrica.
		- Calcular el PVP, Precio de Venta al Público, que será un porcentaje, dado como parámetro, sumado al precio
			de coste.
		- Calcular las posibles ganancias cuando se hayan vendido todos los productos, es decir, la suma de todos los
			precios de venta al público menos la suma de todos los precios de fábrica.
		Crear un main de prueba con un menú donde se pueda hacer todo esto.
	 */	
		int op, tam = 10;
		Producto p1 = new Producto("Pipas", false,0.3, 0.8, true);
		Producto p2 = new Producto("Gafas", true,100, 260, true);
		Producto p3 = new Producto("Guantes", false,23.28, 75.99, true);
		Producto [] listaP = new Producto[tam];
		Tiendacrud []listado;
		
		
		
		
				
		
		
		System.out.println("Bienvenido al programa");
		
		System.out.println("Elija una de las siguientes opciones");
		menu();
		
		op = Leer.datoInt();
		
		switch (op) {
			case 1:
				listaP.mostrarProductos();
				
				break;
	
			default:
				break;
			}
		
		
	}
	
	public static void menu() {
		System.out.println("""
				1 - Listar datos de todos los productos
				2 - Comprobar si un producto del array es “frágil” o no
				3 - Añadir un producto a la lista
				4 - Calcular la cantidad gastada por la tienda
				5 - Calcular el PVP
				6 - Calcular las posibles ganancias
				""");
	}

}
