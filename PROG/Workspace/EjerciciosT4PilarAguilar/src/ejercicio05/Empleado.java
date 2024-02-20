package ejercicio05;

public class Empleado {

	private int nEmpleado;
	private String nombre;
	private String apellido;
	private double sueldoBase;
	public Empleado(int nEmpleado, String nombre, String apellido, double sueldoBase) {
		super();
		this.nEmpleado = nEmpleado;
		this.nombre = nombre;
		this.apellido = apellido;
		this.sueldoBase = sueldoBase;
	}
	public int getnEmpleado() {
		return nEmpleado;
	}
	public void setnEmpleado(int nEmpleado) {
		this.nEmpleado = nEmpleado;
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
	public double getSueldoBase() {
		return sueldoBase;
	}
	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
	@Override
	public String toString() {
		return "Empleado [nEmpleado=" + nEmpleado + ", nombre=" + nombre + ", apellido=" + apellido + ", sueldoBase="
				+ sueldoBase + "]";
	}
	
	
	
	public double calcularSueldo() {
		double sueldoTot;
		sueldoTot = sueldoBase;
		return sueldoTot;
	}
	
	
	
	
	
	
	
}
