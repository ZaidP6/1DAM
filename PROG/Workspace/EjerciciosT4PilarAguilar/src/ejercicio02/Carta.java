package ejercicio02;

public class Carta extends Documento{

	private String fecha;

	public Carta(int cif, String nombreEmpresa, String direccion, String fecha) {
		super(cif, nombreEmpresa, direccion);
		this.fecha = fecha;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Carta [fecha=" + fecha + ", toString()=" + super.toString() + "]";
	}
	
	public void generarEncabezado() {
		super.generarEncabezado();
		System.out.println("Fecha: "+fecha);
	}
	
	
	
}
