package ejemplo10_arraysobjetos;

import java.util.Arrays;

public class Concesionario {

	
	private Vehiculo []listaVehiculos;
	private int nVs;

	
	
	@Override
	public String toString() {
		return "Concesionario [listaVehiculos=" + Arrays.toString(listaVehiculos) + ", nVs=" + nVs + "]";
	}

	public Vehiculo[] getListaVehiculos() {
		return listaVehiculos;
	}

	public void setListaVehiculos(Vehiculo[] listaVehiculos) {
		this.listaVehiculos = listaVehiculos;
	}

	public int getnVs() {
		return nVs;
	}

	public void setnVs(int nVs) {
		this.nVs = nVs;
	}

	public Concesionario(Vehiculo[] listaVehiculos, int nVs) {
		super();
		this.listaVehiculos = listaVehiculos;
		this.nVs = nVs;
	}

	
	public void agregarV(Vehiculo v) {
		listaVehiculos[nVs] = v;
		nVs++;
		
	}
	
	public void findByCV() {
		
	}
	
	public void mostrarEmpepinados(int topePotencia) {
		
		for (int i = 0; i < nVs; i++) {
			if(listaVehiculos[i].getPotencia() >= topePotencia) {
				System.out.println(listaVehiculos[i]);
			}
		}
	}

	
}
