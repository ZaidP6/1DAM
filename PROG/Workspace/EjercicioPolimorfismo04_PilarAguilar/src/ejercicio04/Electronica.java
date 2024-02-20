package ejercicio04;

public class Electronica extends Producto{

	private double capacidad;

	public Electronica(int nSerie, String nombre, double precioUnitario, int categoria, double IVA, double capacidad) {
		super(nSerie, nombre, precioUnitario, categoria, IVA);
		this.capacidad = capacidad;
	}

	public double getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}

	@Override
	public String toString() {
		return "Electronica [capacidad=" + capacidad + ", toString()=" + super.toString() + "]";
	}
	
	public double calcularPvP(double descuentoAlimentacion, double impuestoLujo) {
		double pvp;
		int cien = 100;
		pvp = super.calcularPvP(descuentoAlimentacion,impuestoLujo) *((cien + impuestoLujo)/cien);
		return pvp;
		
	}
	
	
}
