package ejemploclase03_getter;

public class Vendedor {

	private String nombre;
	private double ventas;
	private int cantVehiculos;
	
	
	
	public Vendedor(String nombre, double ventas, int cantVehiculos) {
		super();
		this.nombre = nombre;
		this.ventas = ventas;
		this.cantVehiculos = cantVehiculos;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public double getVentas() {
		return ventas;
	}



	public void setVentas(double ventas) {
		this.ventas = ventas;
	}



	public int getCantVehiculos() {
		return cantVehiculos;
	}



	public void setCantVehiculos(int cantVehiculos) {
		this.cantVehiculos = cantVehiculos;
	}



	@Override
	public String toString() {
		return "Vendedor [nombre=" + nombre + ", ventas=" + ventas + ", cantVehiculos=" + cantVehiculos + "]";
	}
	
	
	
	
	
}
