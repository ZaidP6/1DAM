package ejercicio01p2;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Hacer un programa donde se declaren varias variables de distinto tipo, se lee por teclado un valor dado 
			por el usuario y mostrar por la pantalla el valor con el formato adecuado (usando printf).

		 */
		
		int edad;
		double dinero;
		String nombre;
		char confir;
		
		
		System.out.println("Bienvenido!!!");
		
		System.out.println("Por favor, indique su nombre.");
		nombre = Leer.dato();
		
		System.out.println("Por favor, indique su edad (sólo números).");
		edad = Leer.datoInt();
		
		System.out.println("Por favor inquique la cantidad de dinero que lleva en la cartera o tiene en la cuenta corrinte (Para separar los céntimos, usar un punto).");
		dinero = Leer.datoDouble();
		
		System.out.println("Compruebe que su información es correcta:");
		System.out.printf("Su nombre es %s, tiene %d años y su poder adquisitivo es de %.2f€.\n", nombre, edad, dinero);
		
		System.out.println("¿Son esos datos correctos? Conteste con 'S' si es afirmativo o 'N' si es erróneo.");
		confir = Leer.datoChar();
		
		if (confir == 'S'|| confir == 's') {
			System.out.println("Perfecto! Gracias por usar el programa!");
		} else {
			System.out.println("Vaya...Reinicie el programa y vuelva a introducir los datos.");
		}
		
	}

}
