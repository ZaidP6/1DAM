package ejercicioTipoExamen01;

public class Apartamento extends Habitacion{
	
	private double servicioLimpieza;

	public Apartamento(int numHab, double precioBase, boolean ocupada, String cliente, int dias, int cantPersonas,
			double servicioLimpieza) {
		super(numHab, precioBase, ocupada, cliente, dias, cantPersonas);
		this.servicioLimpieza = servicioLimpieza;
	}

	public double getServicioLimpieza() {
		return servicioLimpieza;
	}

	public void setServicioLimpieza(double servicioLimpieza) {
		this.servicioLimpieza = servicioLimpieza;
	}

	@Override
	public String toString() {
		return "Apartamento [servicioLimpieza=" + servicioLimpieza + ", toString()=" + super.toString() + "]";
	}
	
	public double calcularPrecio(double descuento) {
		return getPrecioBase() * getDias() + servicioLimpieza;
	}
	
	
}
