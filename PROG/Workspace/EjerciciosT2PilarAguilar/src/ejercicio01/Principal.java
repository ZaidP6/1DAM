package ejercicio01;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Leer 2 números y determinar el mayor de ellos. Mejorar el programa mostrando también la 
			posibilidad de que sean iguales.
		 */
		
		int num1, num2;
		
		
		System.out.println("------------------------------------------------------");
		System.out.println("");
		System.out.println("Bienvenido al comparador");
		System.out.println("");
		System.out.println("------------------------------------------------------");
		System.out.println("Introduzca un número (sin decimales).");
		num1 = Leer.datoInt();
		System.out.println("Introduzca otro número (sin decimales).");
		num2 = Leer.datoInt();
		
		System.out.println("------------------------------------------------------");
		System.out.println("");
		
		if(num1==num2) {
			System.out.println("Upsss...Los números son iguales.");
		}else if (num1<num2) {
			System.out.println("El número " + num1 + " es más pequeño que " + num2 + ".");
		}else 
			System.out.println("El número " + num2 + " es más pequeño que " + num1 + ".");
		
		
		System.out.println("");
		System.out.println("------------------------------------------------------");
		System.out.println("");
		System.out.println("Gracias por usar el comparador.");
	}

}
