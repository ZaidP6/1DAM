package ejercicio1;

public class Corredor {

	private String nombre, apellidos;
	private int dorsal, categoría;
	private double tiempo;
	
	public Corredor(String nombre, String apellidos, int dorsal, int categoría, double tiempo) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dorsal = dorsal;
		this.categoría = categoría;
		this.tiempo = tiempo;
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
	public int getDorsal() {
		return dorsal;
	}
	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}
	public int getCategoría() {
		return categoría;
	}
	public void setCategoría(int categoría) {
		this.categoría = categoría;
	}
	public double getTiempo() {
		return tiempo;
	}
	public void setTiempo(double tiempo) {
		this.tiempo = tiempo;
	}
	@Override
	public String toString() {
		return "Corredor [nombre=" + nombre + ", apellidos=" + apellidos + ", dorsal=" + dorsal + ", categoría="
				+ categoría + ", tiempo=" + tiempo + "]";
	}
	
	
	
}
