package ejercicio06;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*
	 * Crear una clase llamada Generadora sin atributos, pero con varios 
	 * métodos que generen aleatoriamente distintos números o resultados 
	 * según las características del sorteo o para qué se vaya a usar, por 
	 * ejemplo, generar 1, x, 2 para una quiniela, generar par o impar para 
	 * jugar a pares o nones, generar 1, 2 o 3 para jugar a los "chinos", 
	 * del 1 al 49 para el sorteo de primitiva... Crear una clase principal 
	 * donde se prueben todos los métodos pidiendo los datos necesarios para cada generación.
	 */
		
		int op, hasta, desde, num1 = 0, num2 = 0, num3 = 0,num4 = 0, num5 = 0, num6 = 0, tiradas;
		Generadora generaPrim = new Generadora();
		
		
		System.out.println("Bienvenido");
		System.out.println("");
		
		
		do {
			
			menu();
			op = Leer.datoInt();
			
			
			
			switch (op) {
				case 1:
					desde = 1;
					hasta = 49;
					tiradas = 6;
					for (int i = 0; i <tiradas; i++) {
						generaPrim.generarPrimitiva(hasta, desde);
					}
					System.out.println("Ha elegido la primitiva.");
					System.out.println("Indique los "+tiradas+" números que desea marcar entre el "+desde+ "y el "+hasta+".");
					if(num1 >= desde && num1 <= hasta) {
						num1 = Leer.datoInt();
						
						num3 = Leer.datoInt();
						num4 = Leer.datoInt();
						num5 = Leer.datoInt();
						num6 = Leer.datoInt();
					}else
					if (num2 >= desde && num2 <= hasta) {
						num2 = Leer.datoInt();
					}
					
					generaPrim.mostrarNGuardadosPrim(num1, num2, num3, num4, num5, num6);
					
					break;
	
				default:
					break;
			}
			
			
			
		} while (op!=0);
		
	}

	



	static void menu() {
		System.out.println("""
				-----------------------------------------------------
				
				Elija una de las siguientes opciones:
				
				1 - Jugar a la primitiva
				2 - Jugar a sorteo
				3 - Jugar a los "chinos"
				4 - Jugar Par o impar
				0 - Salir
				
				-----------------------------------------------------
				
				""");
	}
}
