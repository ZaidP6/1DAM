package ejercicio03;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Leer un número y mostrar por la salida estándar si dicho número es o no par.
		 */
		
		int num1,dos = 2;
		
		
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("");
		System.out.println("Bienvenido al PAR-IMPAR");
		System.out.println("");
		System.out.println("----------------------------------------------------------------------------------");
		
		System.out.println("Introduzca un número sin decimales para saber si es par o si es impar.");
		num1 = Leer.datoInt();
		System.out.println("");
		
		if (num1 % dos == 0) {
			System.out.println("El número que ha elegido es par.");
		} else
			System.out.println("El número que ha elegido es impar.");
		
		System.out.println("");
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("");
		System.out.println("Gracias por usar el programa :)");
	}

}
