package ejercicio05;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Realiza un programa que calcule la potencia de un número, dado este y su exponente. 
			Pueden ocurrir tres casos:
			* El exponente sea positivo, imprime resultado en pantalla.
			* El exponente sea 0, el resultado es 1.
			* El exponente sea negativo, el resultado es 1/potencia con el exponente positivo.
		 */
		
		double base, exp, resultado;
		System.out.println("Introduzca la base de la operación.");
		base = Leer.datoDouble();
		System.out.println("Introduzca el exponente de la operación.");
		exp = Leer.datoDouble();
		
		resultado = Math.pow(base, exp);
		
		if(exp == 0) {
			System.out.println("Cualquier número elevado a cero el resultado siempre será 1.");
		}else if(exp > 0) {
			System.out.printf("El resultado es: %.2f.\n", resultado);
		}else
			resultado = 1/(-resultado);
			System.out.printf("El resultado es: %.2f.\n", resultado);
	}

}
