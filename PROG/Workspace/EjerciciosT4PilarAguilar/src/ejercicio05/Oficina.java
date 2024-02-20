package ejercicio05;

import java.util.Arrays;

public class Oficina {
	
	
	Empleado [] listaEmpleados;

	public Oficina(Empleado[] listaEmpleados) {
		super();
		this.listaEmpleados = listaEmpleados;
	}

	public Empleado[] getListaEmpleados() {
		return listaEmpleados;
	}

	public void setListaEmpleados(Empleado[] listaEmpleados) {
		this.listaEmpleados = listaEmpleados;
	}

	@Override
	public String toString() {
		return "Oficina [listaEmpleados=" + Arrays.toString(listaEmpleados) + "]";
	}
	
	public void calcularSueldoEmpleado (Empleado e) {
		
	}
	
	public double calcularGastoOfi(Empleado []listaEmpleados) {
		double gastoOfi = 0;
		for (int i = 0; i < listaEmpleados.length; i++) {
			gastoOfi += listaEmpleados[i].calcularSueldo();
		}
		
		return gastoOfi;
	}

}
