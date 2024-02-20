package ejercicio01;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Implementar una clase que modele la cabecera de los exámenes de un centro escolar. La información sobre
			cada examen será el nombre de la asignatura, aula donde se realiza y un String con la fecha. Solo tendrá un
			método para imprimir adecuadamente dicha cabecera.
		 */
		
		String nombreAsig, aula, fecha;
		Cabecera cab1;
		
		System.out.println("Indique el nombre de la asignatura.");
		nombreAsig = Leer.dato();
		System.out.println("Indique el aula (ej: 1DAM)");
		aula = Leer.dato();
		System.out.println("Indique la fecha de hoy");
		fecha = Leer.dato();
		
		
		cab1 = new Cabecera(nombreAsig, aula, fecha);
		
		cab1.Imprimir();
		
	}

}
