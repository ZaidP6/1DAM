package ejercicio4;

public class Alimentacion extends Producto{

	
	
	private double pcntDescuento;
	private boolean caducaEn2Dias;
	
	
	public Alimentacion(String nombre, int codId, double precioUnitario, double pcntDescuento, boolean caducaEn2Dias) {
		super(nombre, codId, precioUnitario);
		this.pcntDescuento = pcntDescuento;
		this.caducaEn2Dias = caducaEn2Dias;
	}


	public double getPcntDescuento() {
		return pcntDescuento;
	}


	@Override
	public String toString() {
		return "Alimentacion [pcntDescuento=" + pcntDescuento + ", caducaEn2Dias=" + caducaEn2Dias + ", toString()="
				+ super.toString() + "]";
	}


	public void setPcntDescuento(double pcntDescuento) {
		this.pcntDescuento = pcntDescuento;
	}


	public boolean isCaducaEn2Dias() {
		return caducaEn2Dias;
	}


	public void setCaducaEn2Dias(boolean caducaEn2Dias) {
		this.caducaEn2Dias = caducaEn2Dias;
	}


	@Override
	public double calcularPrecioUnitario() {
		double cien = 100;
		if(caducaEn2Dias) {
			return super.getPrecioUnitario()-(super.getPrecioUnitario()*pcntDescuento/cien);
		}else {
			return super.getPrecioUnitario();
		}
		
	}
	
	public void mostrarSiCaducaEn2Dias() {
		if(caducaEn2Dias) {
			System.out.println("Cuidao que caduca en menos de 2 días.");
		}
	}
}
