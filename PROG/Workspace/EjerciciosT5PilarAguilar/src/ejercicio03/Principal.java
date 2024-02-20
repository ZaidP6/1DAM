package ejercicio03;

import java.util.HashSet;
import java.util.Set;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int op;
		String nombre;
		Alumno a;
		Set<Alumno> listaAlumnos = new HashSet<Alumno>();
		Clase c = new Clase(listaAlumnos);
		
		Alumno a1 = new Alumno(1, "Pepe", "Ruiz", 1999);
		Alumno a2 = new Alumno(2, "Sergio", "González", 2005);
		
		listaAlumnos.add(a1);
		listaAlumnos.add(a2);
		
		System.out.println("Bienvenido");
		
		
		
		do {
			
			System.out.println("Elija una opción");
			System.out.println("""
					1 - Buscar alumno por nombre
					""");
			
			op = Leer.datoInt();
			
			switch (op) {
				case 1:
					System.out.println("Qué nombre busca?");
					nombre = Leer.dato();
					
					System.out.println(c.findByNombre(nombre));
					
					break;
	
				default:
					break;
			}
			
			
			
			
			
		} while (op!= 0);
	}

}
