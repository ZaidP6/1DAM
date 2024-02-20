package ejercicio02p2;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Realizar un programa que lea un valor entero por teclado y muestre por pantalla su doble, su triple y 
			su mitad.
		 */
		
		int num1, num2,num3, dos = 2, tres = 3;
		double num4, mitad = 0.5;
		
		System.out.println("Bienvenido!");
		System.out.println("Introduzca un número sin decimales para mostrarle su doble, su triple y la mitad.");
		num1 = Leer.datoInt();
		
		num2 = num1 * dos;
		System.out.printf("El doble del número %d es %d.\n", num1, num2);
		
		num3 = num1 * tres;
		System.out.printf("El triple del número %d es %d.\n", num1, num3);
		
		num4 = num1 * mitad;
		System.out.printf("La mitad del número %d es %.1f.\n",num1, num4);
		
		System.out.println("Gracias por usar el programa!");
		
	}

}
