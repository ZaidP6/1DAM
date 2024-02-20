package ejercicio05;

public class Vendedor extends Empleado{

	private int cantVentas;
	private double porIncentivo;
	public Vendedor(int nEmpleado, String nombre, String apellido, double sueldoBase, int cantVentas,
			double porIncentivo) {
		super(nEmpleado, nombre, apellido, sueldoBase);
		this.cantVentas = cantVentas;
		this.porIncentivo = porIncentivo;
	}
	public int getCantVentas() {
		return cantVentas;
	}
	public void setCantVentas(int cantVentas) {
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
	
	public double calcularIncentivo() {
		return porIncentivo * super.getSueldoBase()*cantVentas;
	}
	
	public double calcularSueldo() {
		double sueldoTot;
			sueldoTot = super.calcularSueldo() + calcularIncentivo();
		return sueldoTot;
	}
	
}
