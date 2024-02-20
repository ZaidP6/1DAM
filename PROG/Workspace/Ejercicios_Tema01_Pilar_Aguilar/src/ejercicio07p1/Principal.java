package ejercicio07p1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Mi coche nuevo consume un montón. Dicen las indicaciones técnicas que 7,5 litros a los 100 km pero
			no me fío. Realizar un programa que nos ayude a calcular el dinero gastado en gasolina en un viaje.
			Para ello, podemos inicializar una variable con los kilómetros recorridos y otra con el precio por litro
			de gasolina
		 */
		
		double litrosCien = 7.5;
		int cien = 100;
		double kmRecor = 267.584;
		double litrosKm;
		double precioGas = 1.76;
		double gastado;
		
		System.out.println("***************************************************");
		System.out.println("Bienvnido al programa");
		System.out.println("***************************************************");
		
		litrosKm = litrosCien * kmRecor / cien;
		gastado = litrosKm * precioGas;
		
		System.out.printf("En %.3f km recorridos se han consumido %.2f litros.\n", kmRecor, litrosKm);
		System.out.printf("Hemos gastado en el viaje %.2f € en gasolina.\n", gastado);
		System.out.println("***************************************************");
		System.out.println("Gracias spor usar el programa.");
		
		
		
		
	}

}
