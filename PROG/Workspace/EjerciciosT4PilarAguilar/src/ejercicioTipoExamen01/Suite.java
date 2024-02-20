package ejercicioTipoExamen01;

public class Suite extends Habitacion{

	private double m2;
	private double consumoServicioHab;
	public Suite(int numHab, double precioBase, boolean ocupada, String cliente, int dias, int cantPersonas, double m2,
			double consumoServicioHab) {
		super(numHab, precioBase, ocupada, cliente, dias, cantPersonas);
		this.m2 = m2;
		this.consumoServicioHab = consumoServicioHab;
	}
	public double getM2() {
		return m2;
	}
	public void setM2(double m2) {
		this.m2 = m2;
	}
	public double getConsumoServicioHab() {
		return consumoServicioHab;
	}
	public void setConsumoServicioHab(double consumoServicioHab) {
		this.consumoServicioHab = consumoServicioHab;
	}
	@Override
	public String toString() {
		return "Suite [m2=" + m2 + ", consumoServicioHab=" + consumoServicioHab + ", toString()=" + super.toString()
				+ "]";
	}
	
	public double calcularPrecio(double descuento) {
		return getPrecioBase()*(100-descuento)/100 * getDias() + consumoServicioHab;
	}
}
