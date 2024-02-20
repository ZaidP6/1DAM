package ejemploclase03_getter;

public class Vehiculo {

	
	private String nombre;
	private double precio;
	private int nRuedas;
	
	
	public Vehiculo(String nombre, double precio, int nRuedas) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.nRuedas = nRuedas;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getnRuedas() {
		return nRuedas;
	}

	public void setnRuedas(int nRuedas) {
		this.nRuedas = nRuedas;
	}

}
