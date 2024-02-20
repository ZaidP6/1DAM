package ejemploclase01;

public class Alumno {

	//Atributos
	
	private String nombre;
	private int edad;
	private double notaMedia;
	
	//Constructores
	
	public Alumno(String nombre, int edad, double notaMedia) {
		this.nombre = nombre;
		this.edad = edad;
		this.notaMedia = notaMedia;
	}
	
	
	//Métodos
	
	//El resultado del método si no devuelve nada se pone void
	public void mostrarDatos(String calle) {
		System.out.println("Los datos del alumno son:");
		System.out.println("Nombre: "+ nombre);
		System.out.println("Edad: "+ edad);
		System.out.println("Nota media: "+notaMedia);
		System.out.println("Calle: " + calle);
	}
	
	//calcularMedia
	
	
	
	
}
