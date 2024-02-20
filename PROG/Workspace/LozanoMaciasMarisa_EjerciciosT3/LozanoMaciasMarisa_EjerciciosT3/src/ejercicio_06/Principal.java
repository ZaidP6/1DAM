package ejercicio_06;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Crear una clase llamada Generadora sin atributos, pero con varios métodos que generen aleatoriamente distintos números o resultados según las características
		 *  del sorteo o para qué se vaya a usar, por ejemplo, generar 1, x, 2 para una quiniela, generar par o impar para jugar a pares o nones, generar 1, 2 o 3 para 
		 *  jugar a los "chinos", del 1 al 49 para el sorteo de primitiva... Crear una clase principal donde se prueben todos los métodos pidiendo los datos necesarios
		 *   para cada generación.
		 */
		int desdeP=1,hastaP=49,primitiva=6, quiniela=8,desdeQ=1,hastaQ=3, desdePar=0,hastaPar=20,num1;
		Generadora gen1= new Generadora();
		
		int op=0;

		System.out.println("Bienvenido a tu sitio de juegos");
		
		do {
			
			System.out.println("""
					*****************************************************************************************
									1. Para jugar a la primitiva
									2. Para jugar a pares y nones
									3. Para jugar a los chinos
									4. Para jugar a la quiniela 
									0. Para salir
					****************************************************************************************
					""");
			op=Leer.datoInt();
			
			switch(op) {
				case 1:
					for (int i = 0; i < primitiva; i++) {
						
						System.out.print(" "+ gen1.generarPrimitiva(desdeP, hastaP));
						
					}
					System.out.println();
					break;
				case 2:
					
					System.out.println("Indique un número del 1 al 10 para seleccionar cuántos desde quiere sacar");
					num1=Leer.datoInt();
					gen1.imprimirParImpar(gen1.generarParImpar(desdePar, hastaPar,num1));
					break;
					
				case 3:
					
					System.out.println("Indique un número del 1 al 6 para apostar");
					num1=Leer.datoInt();
					gen1.imprimirChino(desdePar, hastaPar, gen1.comprobarChino(desdePar, hastaPar, num1));
					break;
					
				case 4:
					for (int i = 0; i < quiniela; i++) {
						gen1.imprimirQuiniela(desdeQ,hastaQ,gen1.generarQuiniela(desdeQ, hastaQ));
					}
					break;
				case 0:
					System.out.println("Saliendo...");
					break;
				default:
					System.out.println("Indique un número válido");
					break;
					
			}
			
		}while (op!=0);
		

		System.out.println("               	               (0 0) \r\n"
				+ "                       ---oOO-- (_) ----oOO---    \r\n"
				+ "                 ╔═════════════════════════════════╗ \r\n"
				+ "                 ║ Gracias por usar el programa..♥ ║ \r\n"
				+ "                 ╚═════════════════════════════════╝ \r\n"
				+ "                         -------------------\r\n"
				+ "                             |__|__| \r\n"
				+ "                              || || \r\n"
				+ "                             ooO Ooo ");
	}

}
