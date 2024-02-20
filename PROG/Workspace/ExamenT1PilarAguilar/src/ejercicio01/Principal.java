package ejercicio01;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double alturaY, radioY, yarda = 0.9144, volumenL, volumenM, alturaM, radioM;
		byte dos = 2;
		short mil = 1000;
		
		System.out.println("----------------------------------------------------------");
		System.out.println("");
		System.out.println("Bienvenidos al programa.");
		System.out.println("");
		System.out.println("----------------------------------------------------------");
		
		System.out.println("Por favor, escriba el radio que tiene la base del depósito (en yardas).");
		radioY = Leer.datoFloat();
		
		System.out.println("Por favor, indique la altura que tiene el depósito (en yardas).");
		alturaY = Leer.datoFloat();
		
		System.out.println("Hagamos la conversión a metros.");
		
		alturaM = alturaY /yarda;
		radioM = radioY /yarda;
		
		System.out.println("");
		System.out.println("----------------------------------------------------------");
		System.out.println("");
		System.out.printf("La altura sería %.2f metros y el radio sería %.2f metros.\n", alturaM, radioM);
		
		volumenM = (Math.PI * Math.pow(radioM, dos) * alturaM);
		
		System.out.println("");
		System.out.println("----------------------------------------------------------");
		System.out.println("");
		System.out.printf("El volumen del depósito en metros es de %.2f metros³.", volumenM);
		System.out.println("");
		System.out.println("----------------------------------------------------------");
		
		volumenL = volumenM * mil;
		
		System.out.println("");
		System.out.printf("El volumen del depósito en litros es de %.2f Litros.\n", volumenL);
		System.out.println("");
		System.out.println("----------------------------------------------------------");
		
		System.out.println("----------------------------------------------------------");
		System.out.println("");
		System.out.println("Gracias por usar el programa^^");
		System.out.println("");
		System.out.println("----------------------------------------------------------");
		
		
	}

}
