package ejercicio4;

public abstract class Producto {

	
	private String nombre;
	private int codId;
	private double precioUnitario;
	
	public Producto(String nombre, int codId, double precioUnitario) {
		super();
		this.nombre = nombre;
		this.codId = codId;
		this.precioUnitario = precioUnitario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCodId() {
		return codId;
	}
	public void setCodId(int codId) {
		this.codId = codId;
	}
	public double getPrecioUnitario() {
		return precioUnitario;
	}
	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", codId=" + codId + ", precioUnitario=" + precioUnitario + "]";
	}
	
	//Métodos
	public abstract double calcularPrecioUnitario();
	
	
}
