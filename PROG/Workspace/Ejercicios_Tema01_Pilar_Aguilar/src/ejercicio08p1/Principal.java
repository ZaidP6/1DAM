package ejercicio08p1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		/*
		 * Haz un programa que calcule la longitud de una circunferencia de radio 3 metros y el área de un círculo 
			de radio 5.2 metros. Puedes hacer infinidad de ejercicios como este con fórmulas matemáticas como 
			áreas, volúmenes, teoremas (Pitágoras, por ejemplo), etc
		 */
		
		double radio1 = 3, radio2 = 5.2, longitud1, longitud2;
		int dos = 2;
		
		System.out.println("*********************************************************");
		System.out.println("Bienvenido al programa");
		System.out.println("*********************************************************");
		
		longitud1 = dos * Math.PI * radio1;
		longitud2 = dos * Math.PI * radio2;
		
		System.out.printf("La longitud de la primera circunferencxia con radio %.0f es de %.2fm.\n", radio1, longitud1);
		System.out.printf("La longitud de la segunda circunferencxia con radio %.0f es de %.2fm.\n", radio2, longitud2);
		
		System.out.println("*********************************************************");
		System.out.println("Gracias por usar el programa.");
		
		
		
	}

}
