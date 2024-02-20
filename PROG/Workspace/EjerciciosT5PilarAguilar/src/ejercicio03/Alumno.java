package ejercicio03;

public class Alumno {

	private int id;
	private String nombre;
	private String apellido;
	private int anio;
	
	
	public Alumno(int id, String nombre, String apellido, int anio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.anio = anio;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	@Override
	public String toString() {
		return "Alumno [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", anio=" + anio + "]";
	}
	
	
	
}
