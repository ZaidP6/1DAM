package ejercicioTipoExamen02;

public abstract class Producto {

	private int idProducto;
	private String nombre;
	private double precioBase;
	private int cantidad;
	private boolean vendido;
	public Producto(int idProducto, String nombre, double precioBase, int cantidad, boolean vendido) {
		super();
		this.idProducto = idProducto;
		this.nombre = nombre;
		this.precioBase = precioBase;
		this.cantidad = cantidad;
	}
	public int getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecioBase() {
		return precioBase;
	}
	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
	public boolean isVendido() {
		return vendido;
	}
	public void setVendido(boolean vendido) {
		this.vendido = vendido;
	}
	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + ", nombre=" + nombre + ", precioBase=" + precioBase
				+ ", cantidad=" + cantidad + ", vendido=" + vendido + "]";
	}
	
	
	public abstract double calcularPvP(double porcentaje);
}
