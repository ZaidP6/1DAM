package ejercicioTipoExamen01_bis;

public class Suite extends Habitacion{

	private double metros2;
	private double cantConsumidoEuros;
	public Suite(int codId, double precioBase, boolean ocupada, String nombreCliente, int diasEstancia, int numPersonas,
			double metros2, double cantConsumidoEuros) {
		super(codId, precioBase, ocupada, nombreCliente, diasEstancia, numPersonas);
		this.metros2 = metros2;
		this.cantConsumidoEuros = cantConsumidoEuros;
	}
	public double getMetros2() {
		return metros2;
	}
	public void setMetros2(double metros2) {
		this.metros2 = metros2;
	}
	public double getCantConsumidoEuros() {
		return cantConsumidoEuros;
	}
	public void setCantConsumidoEuros(double cantConsumidoEuros) {
		this.cantConsumidoEuros = cantConsumidoEuros;
	}
	@Override
	public String toString() {
		return "Suite [metros2=" + metros2 + ", cantConsumidoEuros=" + cantConsumidoEuros + ", toString()="
				+ super.toString() + "]";
	}
	
	public double calcularPrecioHab(double descuento) {
		double cien= 100;
		return (cien -descuento/cien) * (this.calcularPrecioHab(descuento)+cantConsumidoEuros);
	}
	
}
