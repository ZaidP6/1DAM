package ejercicio01;

public class Pc extends Ordenador{

	
	private double precioMontaje;

	public Pc(int id, String marca, double precioBase, int capacidadHDD, int procesadorHz, double precioMontaje) {
		super(id, marca, precioBase, capacidadHDD, procesadorHz);
		this.precioMontaje = precioMontaje;
	}

	public double getPrecioMontaje() {
		return precioMontaje;
	}

	public void setPrecioMontaje(double precioMontaje) {
		this.precioMontaje = precioMontaje;
	}

	@Override
	public String toString() {
		return "Pc [precioMontaje=" + precioMontaje + ", toString()=" + super.toString() + "]";
	}
	
	public double calcularPvp(double porGanancia) {
		return super.calcularPvp(porGanancia) + precioMontaje;
	}
	
	
	
}
