package ejercicio06p2;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Realizar un programa para calcular y mostrar por pantalla el sueldo de un trabajador. Se deben pedir 
			todos los datos necesarios por teclado. El sueldo se calcula multiplicando las horas trabajadas por el 
			precio de la hora "normal" más las horas extras por el precio al que se paga una hora extra (mayor que 
			una normal)
		 */
		
		double precioHora, precioHExtra, sueldo, horasTra, horasTraEx;
		String nombre;
		
		
		System.out.println("Bienvenido al programa.");
		System.out.println("");
		System.out.println("//////////////////////////////////////////////////////////////////////////");
		System.out.println("");
		System.out.println("Indique su nombre por favor.");
		nombre = Leer.dato();
		
		System.out.println("Perfecto " + nombre + ", indique las horas nomarles trabajadas.");
		horasTra = Leer.datoDouble();
		
		System.out.println("Ahora indique cúantas horas extras ha trabajado.");
		horasTraEx = Leer.datoDouble();
		
		System.out.println("¿A cuánto cobra las horas normales?");
		precioHora = Leer.datoDouble();
		
		System.out.println("¿Y las horas extra?");
		precioHExtra = Leer.datoDouble();
		
		sueldo = (precioHora *horasTra) + (precioHExtra * horasTraEx);
		
		System.out.printf("Estupendo %s, su sueldo este mes es de %.2f€.\n", nombre, sueldo);
		System.out.println("");
		System.out.println("//////////////////////////////////////////////////////////////////////////");
		System.out.println("");
		System.out.println("Gracias por usar el programa.");
		
		
		
	}

}
