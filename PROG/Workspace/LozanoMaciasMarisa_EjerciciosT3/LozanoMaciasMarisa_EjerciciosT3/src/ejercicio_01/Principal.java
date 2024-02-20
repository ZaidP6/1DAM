package ejercicio_01;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Implementar una clase que modele la cabecera de los exámenes de un centro escolar. 
		 * La información sobre cada examen será el nombre de la asignatura, aula donde se realiza y un String con la fecha. 
		 * Solo tendrá un método para imprimir adecuadamente dicha cabecera.
		 */
		
		String asignatura,aula,fecha;
		Cabecera cab1;
		
		System.out.println("Por favor indique la asignatura");
		asignatura=Leer.dato();
		System.out.println("Por favor indique el aula");
		aula=Leer.dato();
		System.out.println("Por favor indique la fecha");
		fecha=Leer.dato();
		
		cab1= new Cabecera(asignatura,aula,fecha);
		
		cab1.imprimirCabecera();
		

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
