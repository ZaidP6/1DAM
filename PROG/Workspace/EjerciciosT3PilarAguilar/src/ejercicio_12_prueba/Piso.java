package ejercicio_12_prueba;

public class Piso {

	private int nRef;
	private String direccion;
	private int metros2;
	private int estado;
	private double precioVenta;
	public Piso(int nRef, String direccion, int metros2, int estado, double precioVenta) {
		super();
		this.nRef = nRef;
		this.direccion = direccion;
		this.metros2 = metros2;
		this.estado = estado;
		this.precioVenta = precioVenta;
	}
	public int getnRef() {
		return nRef;
	}
	public void setnRef(int nRef) {
		this.nRef = nRef;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getMetros2() {
		return metros2;
	}
	public void setMetros2(int metros2) {
		this.metros2 = metros2;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	public double getPrecioVenta() {
		return precioVenta;
	}
	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}
	@Override
	public String toString() {
		return "Piso [nRef=" + nRef + ", direccion=" + direccion + ", metros2=" + metros2 + ", estado=" + estado
				+ ", precioVenta=" + precioVenta + "]";
	}
	
	
	
}
