package ejercicio02_p2;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Estoy en crisis. He pensado en alquilar las habitaciones de mi casa, pero estilo hotel para que tenga caché.
			Debemos gestionar mi “minihotel” y para ello, debemos crear la clase Habitación, una clase Hotel con una
			lista de Habitaciones y una clase principal de prueba para gestionar el hotel (realmente habría algunas clases
			más, como serían Cliente, Productos, etc. Pero no entraremos en eso).
			Podemos poner todos los métodos en la clase Hotel. Se podrá hacer lo siguiente:
			- Agregar una habitación a la lista (cuyos atributos serán tipo, precio, qué servicios extra tiene, String con el
			nombre de cliente asignado, número de días contratados, si está limpia, etc.)
			- Ver si está ocupada o no.
			- Calcular precio final según número de días, servicios extra contratados y consumo del minibar.
			- Mostrar factura.
			- Aquellos métodos que se quieran añadir. 
					 */
		int op, dias;
		char tipo;
		double precio;
		String nombre;
		Boolean limpia, extraMiniBar;
		
		Hotel hotel;
		
		
		
		System.out.println("Bienvenido al minihotel");
		System.out.println("Elija una opción:");
		menu();
		op = Leer.datoInt();
		
		switch (op) {
			case 1:
				System.out.println("Indique el tipo ( a, b o c");
				tipo = Leer.datoChar();
				System.out.println("");
				
				
				
				
				break;
	
			default:
				break;
		}
		
		
		
	}
	
	
	public static void menu() {
		System.out.println("""
				--------------------------------------------------
				
				1 - Añadir una habitación
				2 - Ver si está ocupada
				3 - Ver precio según días
				4 - Mostrar factura
				5 - Otros métodos
				0 - Salir
				
				---------------------------------------------------
				""");
		
		
	}

}
