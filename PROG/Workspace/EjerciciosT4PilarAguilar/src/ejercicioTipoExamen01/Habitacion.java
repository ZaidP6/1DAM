package ejercicioTipoExamen01;

public class Habitacion {
	
	private int numHab;
	private double precioBase;
	private boolean ocupada;
	private String cliente;
	private int dias;
	private int cantPersonas;
	
	public Habitacion(int numHab, double precioBase, boolean ocupada, String cliente, int dias, int cantPersonas) {
		super();
		this.numHab = numHab;
		this.precioBase = precioBase;
		this.ocupada = ocupada;
		this.cliente = cliente;
		this.dias = dias;
		this.cantPersonas = cantPersonas;
	}

	public int getNumHab() {
		return numHab;
	}

	public void setNumHab(int numHab) {
		this.numHab = numHab;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public boolean isOcupada() {
		return ocupada;
	}

	public void setOcupada(boolean ocupada) {
		this.ocupada = ocupada;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public int getDias() {
		return dias;
	}

	public void setDias(int dias) {
		this.dias = dias;
	}

	public int getCantPersonas() {
		return cantPersonas;
	}

	public void setCantPersonas(int cantPersonas) {
		this.cantPersonas = cantPersonas;
	}

	@Override
	public String toString() {
		return "Habitacion [numHab=" + numHab + ", precioBase=" + precioBase + ", ocupada=" + ocupada + ", cliente="
				+ cliente + ", dias=" + dias + ", cantPersonas=" + cantPersonas + "]";
	}
	
	public double calcularPrecio(double descuento) {
		return precioBase * dias;
	}
	
}
