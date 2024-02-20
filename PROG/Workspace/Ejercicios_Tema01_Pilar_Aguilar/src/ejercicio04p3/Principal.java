package ejercicio04p3;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * 4. Cualquier cálculo de áreas, volúmenes, uso de fórmulas de física o matemáticas, etc. 
		 */
		
		double radioCirculo, areaCirc, dos = 2, tres = 3, volumenEsferaM3 =0.00;
		String volEsfera = "4/3 * pi * r³";
		
		System.out.println("------------------------------------------------------------");
		System.out.println("");
		System.out.println("Bienvenido al super programa.");
		System.out.println("");
		System.out.println("------------------------------------------------------------");
		System.out.println("Vamos a calcular el área de un círculo.");
		System.out.println("Qué radio quiere que tenga el círculo?");
		radioCirculo = Leer.datoDouble();
		
		areaCirc = Math.PI * Math.pow(radioCirculo, dos);
		System.out.printf("Sabiendo que la fórmula del círculo es pi * r² podemos calcualr que"
				+ " el cículo tiene un área de %.2fm².", areaCirc);
	
		//volumenEsferaM3 = 
		System.out.println("");
		System.out.println("------------------------------------------------------------");
		System.out.println("");
		System.out.println("Ahora valmos a calcular el volumen de una esfera.");
		System.out.printf("Sabiendo que la fórmula de una esfera es %s podemos calcular "
				+ "que el volumen es de %.2f.m³.\n", volEsfera,volumenEsferaM3 );
		
		
	}

}
