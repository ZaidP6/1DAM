package ejercicio01;

public class Empleado {

	private String codigoEmpleado;

	public Empleado(String codigoEmpleado) {
		super();
		this.codigoEmpleado = codigoEmpleado;
	}

	public String getCodigoEmpleado() {
		return codigoEmpleado;
	}

	public void setCodigoEmpleado(String codigoEmpleado) {
		this.codigoEmpleado = codigoEmpleado;
	}

	@Override
	public String toString() {
		return "Empleado [codigoEmpleado=" + codigoEmpleado + "]";
	}
	
	
}
