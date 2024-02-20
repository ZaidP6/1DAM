package ejercicio11;

public class Alumno {

	private String nombre;
	private String apellido;
	private double [] notasAl;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public double[] getNotasAl() {
		return notasAl;
	}
	public void setNotasAl(double[] notasAl) {
		this.notasAl = notasAl;
	}
	public Alumno(String nombre, String apellido, double[] notasAl) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.notasAl = notasAl;
	}
	
	
	
}
