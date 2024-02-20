package ejercicio11;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Realizar un programa dirigido por menús que solicite el peso de una persona, y escriba por 
			pantalla su peso en cualquier planeta del Sistema Solar. Las equivalencias son las siguientes 
			(basta con multiplicar el peso de la persona en la tierra por la constante de equivalencia):
			PLANETA Mercurio Venus Tierra Marte Júpiter Saturno Urano Neptuno
			EQUIVALENCIA 0.38 0.91 1.00 0.38 2.53 1.06 0.92 1.2

		 */
		
		int op;
		double masa, peso, gMercurio = 0.38, gVenus = 0.91, gTierra = 1.00, gMarte = 0.38, 
				gJupiter = 2.53, gSaturno = 1.06, gUrano = 0.92, gNeptuno = 1.2;
		
		System.out.println("-----------------------------------------------------------------");
		System.out.println("");
		System.out.println("Bienvenido al programa planetario.");
		System.out.println("");
		System.out.println("-----------------------------------------------------------------");
		
		System.out.println("Indique su masa.");
		masa = Leer.datoDouble();
		System.out.println("-----------------------------------------------------------------");
		System.out.println("");
		System.out.println("¿En qué planeta quieres comparar tu peso?");
		System.out.println("1 - Mercurio");
		System.out.println("2 - Venus");
		System.out.println("3 - Tierra");
		System.out.println("4 - Marte");
		System.out.println("5 - Júpiter");
		System.out.println("6 - Saturno");
		System.out.println("7 - Urano");
		System.out.println("8 - Neptuno");
		System.out.println("0 - Salir");
		System.out.println("");
		System.out.println("-----------------------------------------------------------------");
		System.out.println("");
		op = Leer.datoInt();
		
		switch (op) {
			case 1:
				peso = masa * gMercurio;
				System.out.printf("Su peso en Mercurio sería de %.2f kg.\n", peso);
				break;
				
			case 2:
				peso = masa * gVenus;
				System.out.printf("Su peso en Mercurio sería de %.2f kg.\n", peso);
				break;
				
			case 3:
				peso = masa * gTierra;
				System.out.printf("Su peso en Mercurio sería de %.2f kg.\n", peso);
				break;
				
			case 4:
				peso = masa * gMarte;
				System.out.printf("Su peso en Mercurio sería de %.2f kg.\n", peso);
				break;
				
			case 5:
				peso = masa * gJupiter;
				System.out.printf("Su peso en Mercurio sería de %.2f kg.\n", peso);
				break;
				
			case 6:
				peso = masa * gSaturno;
				System.out.printf("Su peso en Mercurio sería de %.2f kg.\n", peso);
				break;
				
			case 7:
				peso = masa * gUrano;
				System.out.printf("Su peso en Mercurio sería de %.2f kg.\n", peso);
				break;
				
			case 8:
				peso = masa * gNeptuno;
				System.out.printf("Su peso en Mercurio sería de %.2f kg.\n", peso);
				break;
				
			case 0:
				System.out.println("Lamentamos que se vaya tan pronto.");
				break;

			default:
				System.out.println("Lo siento, eso no es una opción.");
				break;
		}
		System.out.println("");
		System.out.println("Gracias por usar el programa.");
		
	}

}
