package ejercicio05_v2;

public class Vendedor extends Empleado{

	private double cantVentas;
	private double porIncentivo;
	public Vendedor(int nEmpleado, String nombre, String apellido, double sueldoBase, double cantVentas,
			double porIncentivo) {
		super(nEmpleado, nombre, apellido, sueldoBase);
		this.cantVentas = cantVentas;
		this.porIncentivo = porIncentivo;
	}
	public double getCantVentas() {
		return cantVentas;
	}
	public void setCantVentas(double cantVentas) {
		this.cantVentas = cantVentas;
	}
	public double getPorIncentivo() {
		return porIncentivo;
	}
	public void setPorIncentivo(double porIncentivo) {
		this.porIncentivo = porIncentivo;
	}
	@Override
	public String toString() {
		return "Vendedor [cantVentas=" + cantVentas + ", porIncentivo=" + porIncentivo + ", toString()="
				+ super.toString() + "]";
	}
	
	public double calcularSueldo() {
		return super.calcularSueldo() + cantVentas*porIncentivo/100;
	}
	
	public void felicitarVenta(double objetivo) {
		if(objetivo <= cantVentas) {
			System.out.println("Felicidades! Has superado el objetivo!");
		}else
			System.out.println("No has superado el objetivo, sigue intentándolo.");
		
	}
}
