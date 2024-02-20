package ejercicio_ar05;

import java.util.Random;

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
		
		int [] numbers;
		int tam, hasta, desde, suma = 0, mayor = 0, menor = 0,pos, op;
		Random rdm = new Random (System.nanoTime());
		
		System.out.println("Bienvenido al programa");
		System.out.println("Por favor, indique la cantidad de números.");
			tam = Leer.datoInt();
		while (tam<=0) {
			System.out.println("Vuelve a introducir número válido.");
			tam=Leer.datoInt();
			
		}
		numbers = new int [tam];
		
		do {
			
			System.out.println("Elija una opción.");
			System.out.println("""
					1. Rellenar el array con números aleatorios
					2. Calcular la suma de todos los números
					3. Mostrar el número mayor del array
					4. Mostrar el número menor del array
					5. Elige un número para modificarlo
					0. Salir
					""");
			op = Leer.datoInt();
			
			switch (op) {
				case 1:
					
					
					System.out.println("Indique el número de menor valor.");
					desde = Leer.datoInt();
					System.out.println("Indique el número de mayor valor,");
					hasta = Leer.datoInt();
					
					
					//Rellenar con aleatorios
					for (int i = 0; i < numbers.length; i++) {
						numbers[i] = rdm.nextInt(hasta-desde +1)+desde;
					}
					//Imprimir array
					for (int i = 0; i < numbers.length; i++) {
						System.out.println((i+1)+". número "+numbers[i]);
					}
					break;
					
				case 2:
					//sumar todos los número del array
					for (int i = 0; i < numbers.length; i++) {
						suma += numbers[i];
					}
					System.out.println("La suma de todos los números es de "+suma);
					break;
					
				case 3:

					//buscar mayor
					for (int i = 0; i < numbers.length; i++) {
						if(i == 0) {
							mayor = numbers[i];
						}
						if(mayor<numbers[i]) {
							mayor= numbers[i];
						}
					}
					System.out.println("El número mayor es "+mayor);
					break;
					
				case 4:
					
					//buscar menor
					for (int i = 0; i < numbers.length; i++) {
						if(i == 0) {
							menor = numbers[i];
						}
						if(menor>numbers[i]) {
							menor= numbers[i];
						}
					}
					System.out.println("El número menor es "+menor);
					break;
					
				case 5:
					//modificar valor elegido
					System.out.println("Indique la posición del valor que desea cambiar.");
					pos = Leer.datoInt() -1;
					System.out.println("Introducta el valor nuevo.");
					numbers [pos] = Leer.datoInt();
					
					System.out.println("La posición "+(pos +1) + " ahora tiene un "+numbers[pos]);
					break;
					
				case 0: 
					System.out.println("Vaya..Lamentamos que se vaya...");
					break;
		
				default:
					System.out.println("Número erróneo.");
					break;
			}
			
			
		} while (op!=0);
		System.out.println("Gracias por usar el programa.");
	}

}
