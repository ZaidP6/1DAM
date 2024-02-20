package ejercicio05;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Cuando era pequeño me mandaban a copiar determinadas frases cuando hacía algo 
		 * mal para no olvidarlo. Realizar un programa que lea un texto del teclado y un 
		 * número entero y muestre en pantalla dicho texto una cantidad de veces igual al 
		 * número introducido. La clase se puede llamar "Copiado".
		 */
		
		String frase;
		int nVeces;
		
		Copiado copi1;
		
		System.out.println("Bienvenido");

		System.out.println("Por favor, indique la frase a repetir");
		frase = Leer.dato();
		System.out.println("Por favor, indique el número de veces a repetir");
		nVeces = Leer.datoInt();
		
		copi1 = new Copiado(frase, nVeces);
		
		copi1.imprimirFrases();
		
		
		System.out.println();
		System.out.println("Gracias por usar el copiador");
		
		
	}

}
