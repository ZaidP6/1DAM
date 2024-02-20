package ejercicio03;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Implementar un programa que contenga dos métodos en una clase “operaciones”: un método al que se le
			pase un número entero y diga si este es positivo o negativo y otro que diga si un número es par o impar. La
			clase no debe tener ningún atributo. Se deben probar los métodos en el main.
		 */
		
		Operaciones ope1;
		int num;
		
		System.out.println("Indique un número entero.");
		num = Leer.datoInt();
		
		ope1 = new Operaciones();
		
		ope1.imprimirPosivoNegativo(num);
		System.out.println("----------------------------------------------------------------");
		ope1.imprimirParImpar(num);
		
	}

}
