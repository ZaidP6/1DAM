package ejercicio_11;

import java.util.Random;

public class GestionNotas {

	/*Crear un programa para poner las notas de un alumno (clase Alumno con atributos). Los atributos de un alumno son su nombre, curso, un array de notas, número de suspensos y nota media.
		En una clase GestionNotas, el programa debe poder poner notas a un solo alumno, mostrar todas sus notas por pantalla, modificar una nota, calcular la media y dar su número de suspensos.
			Probar todo en la clase Principal.*/
	
	private Alumno al1;

	public GestionNotas(Alumno al1) {
		super();
		this.al1 = al1;
	}

	public Alumno getAl1() {
		return al1;
	}

	public void setAl1(Alumno al1) {
		this.al1 = al1;
	}

	@Override
	public String toString() {
		return "GestionNotas [al1=" + al1 + "]";
	}
	
	
	public double generarNotas(double hasta, double desde) {
		Random rnd = new Random (System.nanoTime());
		
		return rnd.nextDouble(hasta-desde+1)+desde;
	}
	
	public void imprimirNotas() {
		System.out.printf("Las notas del alumno son %.2f: ",al1.getNotas());
	}
	
	
}

