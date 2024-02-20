package ejercicio01;


import java.util.ArrayList;
import java.util.List;

public class Principal {

	
	public static void main(String args) {
		
	
	
		/*
		 * Realizar un programa que permita gestionar notas de texto (como las de un móvil, no son calificaciones
			de clase). Usaremos la clase ArrayList y el listado debe guardar objetos tipo Nota (tú decides los
			atributos que debe tener una nota). Se podrán mostrar de manera individual (sin necesidad de buscar,
			solo diciendo cuál de la lista mostrada), dar información del número de notas guardadas, agregar una
			nueva nota, un método que borre una de las notas guardadas comprobando antes que la lista no está
			vacía. Se borrará por número (la nota 1, la 2...), por lo que habrá que mostrarle al usuario la lista con
			todas las notas (en un método) y su número correspondiente, el usuario introducirá el número de la
			que quiera borrar (esto no es lo ideal puesto que así habría que mostrar todas las notas ¿y si hay miles
			de ellas?).
		 */
		
		List<Nota> listaNotas = new ArrayList<Nota>();
		
		CrudNotas crudN = new CrudNotas(listaNotas);
		//listaNotas.add("Titulo", "Descripción de la nota");
		
		Nota nota = new Nota(2, "Nota 2","Me encanta la clase de bbdd.");
		listaNotas.add(nota);
		listaNotas.add(nota);
		
		listaNotas.add(new Nota(1, "Nota 1","Me encanta la clase de programación."));
		
		System.out.println(listaNotas);
		
		System.out.println("Mostrar lista:");
		
		crudN.mostrarLista();
		
		crudN.listaNotas.add(nota);
		
		crudN.calcularCantNotas();
		
		
		
		
	}
	
	
}
