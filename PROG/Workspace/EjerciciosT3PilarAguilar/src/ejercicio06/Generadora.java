package ejercicio06;

import java.util.Random;

public class Generadora {

	/*
	 * Crear una clase llamada Generadora sin atributos, pero con varios 
	 * métodos que generen aleatoriamente distintos números o resultados 
	 * según las características del sorteo o para qué se vaya a usar, por 
	 * ejemplo, generar 1, x, 2 para una quiniela, generar par o impar para 
	 * jugar a pares o nones, generar 1, 2 o 3 para jugar a los "chinos", 
	 * del 1 al 49 para el sorteo de primitiva... Crear una clase principal donde se prueben todos los métodos pidiendo los datos necesarios para cada generación.
	 */
	
	/*
	 * Se debe hacer un método genérico para generar números random
	 * otro método llamando a éste para hacer cada sorteo
	 * otro método para mostrar cada resuktado de cada sorteo
	 * indicar en la main los topes de los sorteos o bien tener las variables para preguntarlo por teclado
	 */
	
	
	public int generarRandom(int hasta, int desde) {
		Random rdm;
		int num = 0;
		rdm = new Random(System.nanoTime());
		num =rdm.nextInt(hasta-desde+1)+desde;
		return num;
	}
	
	public int generarPrimitiva(int hasta, int desde) {
		int num = 0;
		num = generarRandom(hasta, desde);
		return num;
	}
	
	
	
	
	public void mostrarNGuardadosPrim(int num1, int num2, int num3, int num4, int num5, int num6) {
		System.out.println("Número 1: "+num1);
		System.out.println("Número 2: "+num2);
		System.out.println("Número 3: "+num3);
		System.out.println("Número 4: "+num4);
		System.out.println("Número 5: "+num5);
		System.out.println("Número 6: "+num6);
	}
	
	
	
	
	
}
