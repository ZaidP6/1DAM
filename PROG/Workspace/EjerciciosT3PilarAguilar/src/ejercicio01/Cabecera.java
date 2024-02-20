package ejercicio01;

public class Cabecera {

	/*
	 * nombre de la asignatura, aula donde se realiza y un String con la fecha
	 */
	
	private String nombreAsig, aula, fecha;

	public Cabecera(String nombreAsig, String aula, String fecha) {
		super();
		this.nombreAsig = nombreAsig;
		this.aula = aula;
		this.fecha = fecha;
	}
	
	public void Imprimir() {
		System.out.println("*******************************************************************************");
		System.out.println();
		System.out.println("Examen de " +nombreAsig + " en el aula de " + aula + " a día de " + fecha+". ¡Suerte!");
		System.out.println();
		System.out.println("*******************************************************************************");
	}
	
	
	
}
