package ejercicio06;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Crear un programa que reciba por teclado 3 notas, calcule la media y diga si la media sale 
			aprobada o no.
		 */
		
		int tres = 3;
		double nota1, nota2, nota3, media;
		String aprob ="aprobado", susp = "suspenso";
		
		System.out.println("Bienvenido al programa");
		System.out.println("");
		System.out.println("Introduzca las 3 notas obtenidas.");
		nota1 = Leer.datoDouble();
		nota2 = Leer.datoDouble();
		nota3 = Leer.datoDouble();
		
		media = (nota1 + nota2 + nota3)/ tres;
		
		System.out.println("------------------------------------------------------------");
		System.out.println("");
		System.out.printf("La media de sus notas es de %.2f.\n", media);
		System.out.println("");
		
		if(media >= 5) {
			System.out.println("Estupendo! Usted ha " + aprob + "!");
		}else
			System.out.println("Vaya...Lo sentimos mucho, usted está " + susp + ".");
		
		System.out.println("------------------------------------------------------------");
		System.out.println("");
		System.out.println("Gracias por usar el programa.");
		
	}

}
