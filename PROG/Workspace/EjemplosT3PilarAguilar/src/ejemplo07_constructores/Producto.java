package ejemplo07_constructores;

public class Producto {

	private String nombre;
	private double precioFabrica;
	private int seccion; // 1 alimentación, 2 electrónica, 3 ropa
	private boolean enVenta;
	
	
	public Producto(String nombre, double precioFabrica, int seccion, boolean enVenta) {
		super();
		this.nombre = nombre;
		this.precioFabrica = precioFabrica;
		this.seccion = seccion;
		this.enVenta = enVenta;
	}


	public Producto() {
		super();
	}




	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getPrecioFabrica() {
		return precioFabrica;
	}


	public void setPrecioFabrica(double precioFabrica) {
		this.precioFabrica = precioFabrica;
	}


	public int getSeccion() {
		return seccion;
	}


	public void setSeccion(int seccion) {
		this.seccion = seccion;
	}


	public boolean isEnVenta() {
		return enVenta;
	}


	public void setEnVenta(boolean enVenta) {
		this.enVenta = enVenta;
	}


	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precioFabrica=" + precioFabrica + ", seccion=" + seccion + ", enVenta="
				+ enVenta + "]";
	}
	
	
	
	
}
