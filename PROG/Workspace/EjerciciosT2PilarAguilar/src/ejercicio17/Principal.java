package ejercicio17;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Realizar un programa que calcule el salario mensual de un vendedor. Este será el resultado de
			un sueldo fijo 1000€ mensuales más un porcentaje de las ventas realizadas. Lo que se cobra
			por ventas se calculará mediante el 20 % de lo vendido en total al mes.
		 */
		
		double salFijo = 1000, porVentas = 20, gananciaVenta, sueldoTot, cien = 100;
		int op;
		
		System.out.println("Bienvenido.");
		System.out.println("Vamos a calcular el sueldo de un mes.");
		
		
		do {
			
			
			
			System.out.println("¿Cuántas ganancias ha tenido con las ventas?");
			gananciaVenta = Leer.datoDouble();
			
			
			gananciaVenta *= porVentas / cien;
			
			sueldoTot = salFijo + gananciaVenta;
			
			System.out.println("----------------------------------------------------");
			System.out.println("");
			System.out.printf("El sueldo obtenido este mes es de %.2f€.\n", sueldoTot);
			
			System.out.println("");
			System.out.println("----------------------------------------------------");
			
			System.out.println("Pulse 1 para continuar ó 0 para salir.");
			op = Leer.datoInt();
			
			
		} while (op!=0);
		
		System.out.println("Gracias, hasta la próxima.");
		
	}

}
