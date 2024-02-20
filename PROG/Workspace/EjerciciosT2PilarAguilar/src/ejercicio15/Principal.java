package ejercicio15;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Se desea realizar un programa que gestione las notas de un alumno del centro. Para ello, se 
			necesita leer las notas de las 6 asignaturas de un solo alumno y mostrar por pantalla al final, 
			la nota media y el número de suspensos que tiene. No usar una variable para cada nota, ni es 
			necesario mostrar las notas de cada asignatura, solo la media y el número de suspensos.
		 */
		
		
		double nota = 0, media, suma = 0;
		int tope, cantSuspensos = 0, aprobado = 5, repeat;
		
		
	do {
		
		System.out.println("¿Quiere comprobar las notas de un alumno?");
		System.out.println("1 - si");
		System.out.println("0 - no");
		repeat = Leer.datoInt();
		
		switch(repeat) {
			
		case 1:
			System.out.println("¿Con cuántas notas desea operar?");
			tope = Leer.datoInt();
			
			for (int i = 0; i < tope; i++) {
				
				System.out.println("Introduzca la nota.");
				nota = Leer.datoDouble();
				if (nota<aprobado) {
					cantSuspensos++;
				}
				
				suma+=nota;
				
			}
			media = suma/tope;
			System.out.println("En total tiene suspensas " + cantSuspensos + " asigaturas.");
			System.out.printf("La media sale: %.2f.\n", media);
			break;
		
		case 0:
			System.out.println("Vuelva otro día.");
			break;
		
		default:
			System.out.println("Número erróneo.");
			break;	
		}
		
		} while (repeat!=0);
		
	System.out.println("Gracias por usar el programa.");
	
	}

}
