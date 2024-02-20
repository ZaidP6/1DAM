package ejercicio02;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Hacer un programa que calcule el área de un círculo en cm2. Debemos tener la clase Círculo, con un solo
			atributo llamado radio. En el main, debemos crear un objeto tipo Círculo y llamar a dicho método. Mejorar
			el programa añadiendo a la clase Círculo otro método que calcule el área del círculo en m2.
		 */
		
		Circulo cir1;
		double radio;
		
		System.out.println("Indique el radio del círculo en centímetros.");
		radio = Leer.datoDouble();
		
		
		cir1 = new Circulo(radio);
		cir1.calcularAreaCm();
		
		cir1.mostrarAreaCm();
		
		System.out.println("-----------------------------------------------------------");
		
		cir1.calcularAreaMe();
		cir1.mostrarAreaM();
		
		System.out.println();
		
		System.out.println("Gracias por usar el calculador");
		
		
	}

}
