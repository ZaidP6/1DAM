package ejercicio02;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Leer dos números doubles. Vamos a dividir el primero entre el segundo y se debe mostrar 
		 * un mensaje de error si el segundo es cero ANTES de hacer la operación. Mostrar el resultado 
		 * de la división con dos decimales si no lo es.
		 */
		
		
		double num1, num2, resultado;
		
		System.out.println("-----------------------------------------------------");
		System.out.println("");
		System.out.println("BIENVENIDO A LA DIVISIÓN");
		System.out.println("");
		System.out.println("-----------------------------------------------------");
		System.out.println("");
		
		System.out.println("Elija una número con decimales para el divisor.");
		num1 = Leer.datoDouble();
		System.out.println("Elija otro número con decimales para el dividendo.");
		num2 = Leer.datoDouble();
		System.out.println("");
		System.out.println("-----------------------------------------------------");
		System.out.println("");
		
		
		if (num1 == 0) {
			System.out.println("Lo sentimos, pero no se puede realizar la operación.");
		} else {
			resultado = num2 / num1;
			System.out.printf("La operación de %.2f entre %.2f es de %.2f.\n", num2, num1, resultado);
		}
		
		System.out.println("");
		System.out.println("-----------------------------------------------------");
		System.out.println("");
		System.out.println("Gracias por usar el programa! :)");
		
	}

}
