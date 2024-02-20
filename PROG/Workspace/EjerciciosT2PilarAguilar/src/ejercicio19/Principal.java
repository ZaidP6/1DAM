package ejercicio19;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Realizar una “mini-calculadora”, que realice las siguientes operaciones: suma, resta,
			multiplicación, división y decir si un número es par o impar. Se hará con un menú, y se pedirá
			en cada caso del switch los datos necesarios para realizar las operaciones. Se valorarán las
			comprobaciones que se hagan sobre los datos introducidos (por ejemplo, no dividir por cero).
		 */
		
		int op, tope;
		double num1,num2, resultado = 0, resultado2 = 0;

		
		System.out.println("");
		System.out.println("Bienvenido a la calculadora.");
		
		
		do {
			System.out.println("");
			System.out.println("-------------------------------------------------");
			System.out.println("");
			System.out.println("Indique qué operación desea realizar.");
			System.out.println("");
			System.out.println("1 - Suma");
			System.out.println("2 - Resta");
			System.out.println("3 - Multiplicación");
			System.out.println("4 - División");
			System.out.println("5 - Par o impar");
			System.out.println("0 - Salir");
			op = Leer.datoInt();
			System.out.println("");
			System.out.println("-------------------------------------------------");
			

			switch (op) {
				case 1:
					System.out.println("¿Cuántos números quiere usar?");
					tope = Leer.datoInt();
					if(tope == 0) {
						System.out.println("bye");
					}else {
						System.out.println("Escriba "+tope+" números seguidos de un enter.");
					
						for (int i = 0; i < tope; i++) {
						
							num1 = Leer.datoDouble();
						
							resultado += num1;
						}
						System.out.printf("Resultado: %.2f.\n", resultado);	
					}

					break;
					
				case 2:
					System.out.println("¿Cuántos números quiere usar?");
					tope = Leer.datoInt();
					if(tope == 0) {
						System.out.println("bye");
					}else {
						System.out.println("Escriba "+tope+" números seguidos de un enter.");
						
						for (int i = 0; i < tope; i++) {
							
							num1 = Leer.datoDouble();
							if(i == 0) {
								resultado = num1;
								}else 
									resultado -= num1; 
							
						}
						System.out.printf("Resultado: %.2f.\n", resultado);
					}
					
					
					break;
					
				case 3:
					System.out.println("¿Cuántos números quiere usar?");
					tope = Leer.datoInt();
					if(tope == 0) {
						System.out.println("bye");
					}else {
						System.out.println("Escriba "+tope+" números seguidos de un enter.");
						
						for (int i = 0; i < tope; i++) {
							num2 = Leer.datoInt();
							if(i == 0) {
								resultado2 = num2;
								}else 
									resultado2 *= num2;
							
						}
						System.out.printf("Resultado: %.2f.\n", resultado2);
					}
					
					break;
					
				case 4:
					System.out.println("¿Cuántos números quiere usar?");
					tope = Leer.datoInt();
					if(tope == 0) {
						System.out.println("bye");
					}else {
						System.out.println("Escriba "+tope+" números seguidos de un enter.");
						for (int i = 0; i < tope; i++) {
							num2 = Leer.datoInt();
							if(i == 0) {
							resultado2 = num2;
							}else {
								if(num2 == 0) {
									System.out.println("Lo siento, no se puede realizar la operación.");
								}else	
									resultado2 /=  num2;
							}	
						}
					}
	
					System.out.printf("Resultado: %.2f.\n", resultado2);	
					break;
					
				case 5:
					System.out.println("¿Qué número desea comprobar?");
					num1 = Leer.datoDouble();
					
					resultado = num1 % 2;
					if(resultado == 0) {
						System.out.println("El número "+num1+" es par.");
					}else
						System.out.println("El número "+num1+" es impar.");
					
					break;
					
				case 0:
					System.out.println("Gracias por usar la calculadora.");
					
					break;
				default:
					System.out.println("Número erróneo");
					break;
			}
			
			
			
		} while (op!=0);
		
		System.out.println("Hasta la próxima!");
		
	}

}
