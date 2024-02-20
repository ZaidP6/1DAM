package ejemplo04_map;

public class Alumno {

	private int id;
	private double notaMedia;
	private String nombre;
	public Alumno(int id, double notaMedia, String nombre) {
		super();
		this.id = id;
		this.notaMedia = notaMedia;
		this.nombre = nombre;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getNotaMedia() {
		return notaMedia;
	}
	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Alumno [id=" + id + ", notaMedia=" + notaMedia + ", nombre=" + nombre + "]";
	}
	
	
	
}
