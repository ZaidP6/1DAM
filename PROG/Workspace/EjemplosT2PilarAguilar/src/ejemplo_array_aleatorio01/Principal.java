package ejemplo_array_aleatorio01;


import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		int [] edades;
		int tam, desde, hasta;
		
		Random rd = new Random (System.nanoTime());
		
		System.out.println("Indique el tamaño.");
		tam = Leer.datoInt();
		
		edades = new int [tam];
		
		System.out.println("Indique el número menor");
		desde = Leer.datoInt();
		System.out.println("Indique el número mayor");
		hasta = Leer.datoInt();
		
		for (int i = 0; i < edades.length; i++) {
			edades[i] = rd.nextInt(hasta - desde +1) +desde; 
			
		}
		for (int i = 0; i < edades.length; i++) {
			System.out.println("Número "+(i+1)+". "+ edades[i]+ " año/s");
			
		}
		
	}
}
