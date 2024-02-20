package ejercicio02;

public class Socio {

	private int nSocio;
	private String nombre;
	private String apellido;
	private int edad;
	private double cuota;
	public Socio(int nSocio, String nombre, String apellido, int edad, double cuota) {
		super();
		this.nSocio = nSocio;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.cuota = cuota;
	}
	public int getnSocio() {
		return nSocio;
	}
	public void setnSocio(int nSocio) {
		this.nSocio = nSocio;
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
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getCuota() {
		return cuota;
	}
	public void setCuota(double cuota) {
		this.cuota = cuota;
	}
	@Override
	public String toString() {
		return "Socio [nSocio=" + nSocio + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad
				+ ", cuota=" + cuota + "]";
	}
	
	
	
}
