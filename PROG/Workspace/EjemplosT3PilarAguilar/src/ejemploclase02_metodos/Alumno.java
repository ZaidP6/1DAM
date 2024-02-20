package ejemploclase02_metodos;

public class Alumno {

	private String nombre;
	private double notaPro, notaBD;
	
	
	
	public Alumno(String nombre, double notaPro, double notaBD) {
		super();
		this.nombre = nombre;
		this.notaPro = notaPro;
		this.notaBD = notaBD;
	}
	
	
	public double calcularMedia() {
		
		double suma, notaMedia, divisor = 2;
		suma = notaPro + notaBD;
		notaMedia = suma /divisor;
		return notaMedia;
	}
	
	public void mostrarNotaMedia(double notaMedia) {
		
		System.out.println("La nota media del alumno "+nombre+" es de: "+notaMedia);
	}
	
}
