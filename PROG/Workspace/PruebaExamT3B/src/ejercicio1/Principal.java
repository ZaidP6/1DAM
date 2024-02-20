package ejercicio1;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int op;
		String nombre, apellidos;
		int dorsal, categoria;
		double tiempo;
		
		
		System.out.println("Bienvenido");
		
		System.out.println("Indique la opción");
		menu();
		op = Leer.datoInt();
		do {
			
			switch (op) {
				case 1:
					System.out.println("indique el nombre");
					nombre = Leer.dato();
					System.out.println("indique los apellidos");
					apellidos = Leer.dato();
					System.out.println("indique el dorsal");
					dorsal = Leer.datoInt();
					System.out.println("indique la categoria (1.juvenil, 2.senior, 3.veterano)");
					categoria = Leer.datoInt();
					System.out.println("indique el tiempo");
					tiempo = Leer.datoDouble();
					
					Corredor c = new Corredor();
					break;
	
				default:
					break;
			}
			
			
		} while (op!=0);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	public static void menu() {
		System.out.println("""
				1 - Agregar un nuevo corredor
				2 - CalcularTiempoEnSegundos
				3 -  Buscar y devolver todos los corredores de la categoría veterano.
				4 - Modificar el tiempo de un corredor por otro leído por teclado buscando el corredor como consideres mejor.

c)
d) Modificar el tiempo de un corredor por otro leído por teclado buscando el corredor como consideres mejor.
e) Calcular la media de tiempo en minutos por kilómetro de un corredor. Se debe buscar el corredor y dividir su tiempo por el número
de kilómetros de la carrera. Vosotros elegís la forma de buscarlo.
f) Calcular cuánto tiempo han tardado entre todos los corredores de la categoría juvenil.
g) Buscar el corredor que menos ha tardado de todos (consideraremos que no hay dos corredores con el mismo tiempo).
				""");
	}

}
