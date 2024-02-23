package ejercicio01;

import java.util.Arrays;

public class Aeropuerto {

	
	private String nombre;
	private Avion []lista;
	
	
	public Aeropuerto(String nombre, Avion[] lista) {
		super();
		this.nombre = nombre;
		this.lista = lista;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Avion[] getLista() {
		return lista;
	}


	public void setLista(Avion[] lista) {
		this.lista = lista;
	}


	@Override
	public String toString() {
		return "Aeropuerto [nombre=" + nombre + ", lista=" + Arrays.toString(lista) + "]";
	}
	
	public Avion findById (int id) {
		boolean encontrado = false;
		int i = 0;
		while (i < lista.length && !encontrado) {
			Avion av = lista[i];
			if (id == lista[i].getId()) {
				encontrado = true;
			}
				i++;
		}
		if (encontrado) {
			return lista[i-1];
		}
			return null;
	}
	
	
	public double calcularAterrizajeAvion(int id, double porcentaje){
		return findById(id).calcularPrecioAterrizaje(id, porcentaje);
	}
	
	public void mostrarListaAviones() {
		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);
			if(lista[i] instanceof NavesEspaciales) {
				((NavesEspaciales)lista[i]).avisarExtraterrestres();
			}
			
		}
	}
	

	public double calcularTotalReacudadoCazas(int id, double porcentaje){
		double total = 0;
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] instanceof CazasMilitares) {
				total += lista[i].calcularPrecioAterrizaje(id, porcentaje);
			}
		}
		return total;
	}
	
	
	public double calcularTotalReacaudado(int id, double porcentaje) {
		double total = 0;
		for (int i = 0; i < lista.length; i++) {
			total += lista[i].calcularPrecioAterrizaje(id, porcentaje);
		}
		return total;
	}
}
