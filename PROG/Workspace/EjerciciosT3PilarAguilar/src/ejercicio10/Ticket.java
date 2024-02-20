package ejercicio10;

public class Ticket {

	private String fecha;
	private String trayecto;
	private double precio;
	private int nPersonas;
	

	public Ticket(String fecha, String trayecto, double precio, int nPersonas) {
		super();
		this.fecha = fecha;
		this.trayecto = trayecto;
		this.precio = precio;
		this.nPersonas = nPersonas;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getTrayecto() {
		return trayecto;
	}

	public void setTrayecto(String trayecto) {
		this.trayecto = trayecto;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	

	public int getnPersonas() {
		return nPersonas;
	}

	public void setnPersonas(int nPersonas) {
		this.nPersonas = nPersonas;
	}

	@Override
	public String toString() {
		return "Ticket [fecha=" + fecha + ", trayecto=" + trayecto + ", precio=" + precio + ", nPersonas=" + nPersonas
				+ "]";
	}
	
	
	Mo hae dal 
	
}
