package ejercicio04p2;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Calcular la edad de una persona en días. Se usará una variable edad cuyo valor leeremos por teclado y 
			mostraremos por pantalla el número de días suponiendo que todos los años tienen 365 días.
		 */
		
		int diasAnio =365, diasTot, edad;
		String nombre;
		
		System.out.println("Bienvenido al programa.");
		System.out.println("");
		System.out.println("////////////////////////////////////////////////////////////////");
		System.out.println("");
		
		System.out.println("¿Cómo se llama?");
		nombre = Leer.dato();
		System.out.println("¿Cuántos años tiene?");
		edad = Leer.datoInt();
		
		diasTot = diasAnio * edad;
		
		System.out.printf("Estupendo %s! Usted tiene %d días de vida.\n", nombre, diasTot);
		System.out.println("");
		System.out.println("////////////////////////////////////////////////////////////////");
		System.out.println("");
		System.out.println("Gracias por usar el programa!");
		
		
	}

}
