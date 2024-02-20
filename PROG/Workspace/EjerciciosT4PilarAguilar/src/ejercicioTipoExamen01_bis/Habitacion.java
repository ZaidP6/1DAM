package ejercicioTipoExamen01_bis;

public class Habitacion {

	private int codId;
	private double precioBase;
	private boolean ocupada;
	private String nombreCliente;
	private int diasEstancia;
	private int numPersonas;
	public Habitacion(int codId, double precioBase, boolean ocupada, String nombreCliente, int diasEstancia,
			int numPersonas) {
		super();
		this.codId = codId;
		this.precioBase = precioBase;
		this.ocupada = ocupada;
		this.nombreCliente = nombreCliente;
		this.diasEstancia = diasEstancia;
		this.numPersonas = numPersonas;
	}
	public int getCodId() {
		return codId;
	}
	public void setCodId(int codId) {
		this.codId = codId;
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
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public int getDiasEstancia() {
		return diasEstancia;
	}
	public void setDiasEstancia(int diasEstancia) {
		this.diasEstancia = diasEstancia;
	}
	public int getNumPersonas() {
		return numPersonas;
	}
	public void setNumPersonas(int numPersonas) {
		this.numPersonas = numPersonas;
	}
	@Override
	public String toString() {
		return "Habitacion [codId=" + codId + ", precioBase=" + precioBase + ", ocupada=" + ocupada + ", nombreCliente="
				+ nombreCliente + ", diasEstancia=" + diasEstancia + ", numPersonas=" + numPersonas + "]";
	}
	
	public double calcularPrecioHab(double descuento) {
		return precioBase*diasEstancia;
	}
	
	
}
