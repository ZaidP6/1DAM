package ejercicio05_v2;

import java.util.Arrays;

public class Oficina {

	
	private Empleado []listaEmpleados;
	private int numEmpleados;
	
	
	
	@Override
	public String toString() {
		return "Oficina [listaEmpleados=" + Arrays.toString(listaEmpleados) + ", numEmpleados=" + numEmpleados + "]";
	}

	public Empleado[] getListaEmpleados() {
		return listaEmpleados;
	}

	public void setListaEmpleados(Empleado[] listaEmpleados) {
		this.listaEmpleados = listaEmpleados;
	}

	public int getNumEmpleados() {
		return numEmpleados;
	}

	public void setNumEmpleados(int numEmpleados) {
		this.numEmpleados = numEmpleados;
	}

	public Oficina(Empleado[] listaEmpleados, int numEmpleados) {
		super();
		this.listaEmpleados = listaEmpleados;
		this.numEmpleados = numEmpleados;
	}

	public double calcularSueldoEmpleado(Empleado e) {
		return e.calcularSueldo();
	}
	
	public double calcularTotalSueldos() {
		double totalGastado = 0;
		for (int i = 0; i < numEmpleados; i++) {
			totalGastado += calcularSueldoEmpleado(listaEmpleados[i]);
		}
		return totalGastado;
	}
	
	public void mostrarEmpleado(double objetivoVentas) {
		for (int i = 0; i < listaEmpleados.length; i++) {
			System.out.println(listaEmpleados[i] + "Sueldo: "+ calcularSueldoEmpleado(listaEmpleados[i]));
			//Se castea el empleado a vendedor para que compruebe que sea un vendedor y no un empleado.
			if(listaEmpleados[i] instanceof Vendedor) { 
				((Vendedor)listaEmpleados[i]).felicitarVenta(objetivoVentas);
			}
		}
	}
	
	
}
