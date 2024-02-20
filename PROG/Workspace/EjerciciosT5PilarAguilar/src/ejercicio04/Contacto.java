package ejercicio04;

import java.util.Map;

public class Contacto{

	private String nombre;
	private String apellidos;
	private String numTel;
	public Contacto(String nombre, String apellidos, String numTel) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.numTel = numTel;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getNumTel() {
		return numTel;
	}
	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}
	@Override
	public String toString() {
		return "Contacto [nombre=" + nombre + ", apellidos=" + apellidos + ", numTel=" + numTel + "]";
	}
	
	
	
	
	
	
}
