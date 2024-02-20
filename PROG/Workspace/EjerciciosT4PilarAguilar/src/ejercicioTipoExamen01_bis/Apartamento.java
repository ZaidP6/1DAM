package ejercicioTipoExamen01_bis;

public class Apartamento extends Habitacion{
	
	private boolean contratarServicio;
	private double precioServicio;
	public Apartamento(int codId, double precioBase, boolean ocupada, String nombreCliente, int diasEstancia,
			int numPersonas, boolean contratarServicio, double precioServicio) {
		super(codId, precioBase, ocupada, nombreCliente, diasEstancia, numPersonas);
		this.contratarServicio = contratarServicio;
		this.precioServicio = precioServicio;
	}
	public boolean isContratarServicio() {
		return contratarServicio;
	}
	public void setContratarServicio(boolean contratarServicio) {
		this.contratarServicio = contratarServicio;
	}
	public double getPrecioServicio() {
		return precioServicio;
	}
	public void setPrecioServicio(double precioServicio) {
		this.precioServicio = precioServicio;
	}
	@Override
	public String toString() {
		return "Apartamento [contratarServicio=" + contratarServicio + ", precioServicio=" + precioServicio
				+ ", toString()=" + super.toString() + "]";
	}
	
	

}
