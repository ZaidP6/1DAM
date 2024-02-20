package ejercicio4;

public class Electronica extends Producto{

	
	
	private double pcntImpuesto;
	
	

	public Electronica(String nombre, int codId, double precioUnitario, double pcntImpuesto) {
		super(nombre, codId, precioUnitario);
		this.pcntImpuesto = pcntImpuesto;
	}



	@Override
	public String toString() {
		return "Electronica [pcntImpuesto=" + pcntImpuesto + ", toString()=" + super.toString() + "]";
	}



	public double getPcntImpuesto() {
		return pcntImpuesto;
	}



	public void setPcntImpuesto(double pcntImpuesto) {
		this.pcntImpuesto = pcntImpuesto;
	}



	@Override
	public double calcularPrecioUnitario() {
		double cien = 100;
		return super.getPrecioUnitario()+super.getPrecioUnitario()*pcntImpuesto/cien;
	}

	
	
}
