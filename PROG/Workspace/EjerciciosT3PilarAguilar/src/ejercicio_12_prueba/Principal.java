package ejercicio_12_prueba;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int op, cantPisos = 8;
		int porcentajeGanancia, cien = 100;
		int cantTrabajadores = 5;
		int posicion = 0;
		int nRef;
		String direccion;
		int metros2;
		int estado;
		double precioVenta;
		Piso []listaPisos;
		Piso piso1;
		listaPisos = new Piso [cantPisos];
		Inmobiliaria inmo = new Inmobiliaria(listaPisos, cantTrabajadores, posicion);
		
		
		System.out.println("Bienvenido a la inmobiliaria");
		
		
		
		do {
			System.out.println("Elija una opción");
			menu();
			op = Leer.datoInt();
			
			switch (op) {
				case 1:
					System.out.println("Diga el número de referencia");
					nRef = Leer.datoInt();
					System.out.println("Diga la dirección");
					direccion = Leer.dato();
					System.out.println("Diga los m2");
					metros2 = Leer.datoInt();
					System.out.println("Diga el estado: 1 para nuevo, 2 para seminuevo y 3 para reformar");
					estado = Leer.datoInt();
					System.out.println("Diga el precio de venta");
					precioVenta = Leer.datoDouble();
					piso1 = new Piso(nRef,direccion, metros2, estado, precioVenta);
					inmo.anadirPiso(piso1);
					
					for (int i = 0; i < listaPisos.length; i++) {
						System.out.println(listaPisos[i]);
					}
			
					break;
				case 2:
					System.out.println("Indique el porcentaje de ganancia");
					porcentajeGanancia = Leer.datoInt();
					System.out.printf("%.2f€\n", inmo.calcularPrecioFinalVenta(porcentajeGanancia));
					
					break;
	
				default:
					break;
			}
			
		} while (op != 0);
		
	}
	
	
	
	public static void menu() {
		System.out.println("""
				1 - Agregar un nuevo piso (por teclado)
				2 - Calcular precioFinalVenta
				3 - Buscar pisos nuevos
				4 - Mostrar pisos nuevos
				5 - Modificar un precioVenta
				6 - Calcular precio del m2 del piso. pvp/metros2
				7 - Calcular cuánto gana la inmobiliaria con pisos seminuevos
				8 - Calcular cuánto gana cada vendedor (todos a partes iguales)
				0 - Salir
				""");
	}

}
