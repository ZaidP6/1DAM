package ejercicio04;

public class Producto {

	private int nSerie;
	private String nombre;
	private double precioUnitario;
	private int categoria;
	private double IVA;
	
	
	public Producto(int nSerie, String nombre, double precioUnitario, int categoria, double IVA) {
		super();
		this.nSerie = nSerie;
		this.nombre = nombre;
		this.precioUnitario = precioUnitario;
		this.categoria = categoria;
		this.IVA = IVA;
	}


	public int getnSerie() {
		return nSerie;
	}


	public void setnSerie(int nSerie) {
		this.nSerie = nSerie;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getPrecioUnitario() {
		return precioUnitario;
	}


	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}


	public int getCategoria() {
		return categoria;
	}


	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	public double getIVA() {
		return IVA;
	}


	public void setIVA(double iVA) {
		IVA = iVA;
	}

	@Override
	public String toString() {
		return "Producto [nSerie=" + nSerie + ", nombre=" + nombre + ", precioUnitario=" + precioUnitario
				+ ", categoria=" + categoria + ", IVA=" + IVA + "]";
	}


	public double calcularPvP(double descuentoAlimentacion,double impuestoLujo) {
		double pvp;
		pvp = precioUnitario * IVA;
		
		return pvp;
	}
	
}
