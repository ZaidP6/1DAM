package ejemplo_practica_exam;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Solicitar al usuario que introduzca por teclado el tamaño del array.
			• Declarar y definir el array de enteros.
			• Rellenar el array mediante números aleatorios entre los dos valores que diga el usuario.
			• Mostrar por pantalla la suma de todos los elementos.
			• Mostrar el mayor y el menor guardados en el array.
			• Modificar un valor elegido por el usuario.
		 */
		
		
		int [] numeros;
		int tam, op, hasta, desde;
		
		
		
		
		
		System.out.println("Bienvenido introduzca la cantidad de aleatorios.");
		tam = Leer.datoInt();
		
		numeros = new int[tam];
		
		do {
			
			System.out.println("Por gavor, elige una de estas iopciones."
					+ "");
			
		} while (op!=0);
		
	}

}
