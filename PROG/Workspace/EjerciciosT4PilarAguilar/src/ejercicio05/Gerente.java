package ejercicio05;

public class Gerente extends Empleado{

	private double porImpuesto;

	public Gerente(int nEmpleado, String nombre, String apellido, double sueldoBase, double porImpuesto) {
		super(nEmpleado, nombre, apellido, sueldoBase);
		this.porImpuesto = porImpuesto;
	}

	public double getPorImpuesto() {
		return porImpuesto;
	}

	public void setPorImpuesto(double porImpuesto) {
		this.porImpuesto = porImpuesto;
	}

	@Override
	public String toString() {
		return "Gerente [porImpuesto=" + porImpuesto + ", toString()=" + super.toString() + "]";
	}
	
	
	public double calcularSueldo() {
		double sueldoTot;
		sueldoTot = super.calcularSueldo() - porImpuesto*super.getSueldoBase();
		return sueldoTot;
	}
	
	
	
	
	
	
}
