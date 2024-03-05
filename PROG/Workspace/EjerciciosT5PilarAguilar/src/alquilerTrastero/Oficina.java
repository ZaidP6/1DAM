package alquilerTrastero;

import java.util.Collections;
import java.util.List;

public class Oficina {

	
	//Atributos
	
	private List<Trastero> listaTrasteros;

	//Constructor
	
	public Oficina(List<Trastero> listaTrasteros) {
		super();
		this.listaTrasteros = listaTrasteros;
	}

	
	//Getters and Setters
	
	public List<Trastero> getListaTrasteros() {
		return listaTrasteros;
	}

	public void setListaTrasteros(List<Trastero> listaTrasteros) {
		this.listaTrasteros = listaTrasteros;
	}
	
	
	
	//Métodos
	
	public void agregarTrastero (Trastero t) {
		
		listaTrasteros.add(t);
	}
	
	public Trastero buscarPorPrecio (double precio) {
		
		for (Trastero trastero : listaTrasteros) {
			
			if (trastero.getPrecio() == precio) {
				
				return trastero;
			}
		}
		
		return null;
	}
	
	public Trastero buscarPorNumero (int numTrastero) {
		
		for (Trastero trastero : listaTrasteros) {
			
			
			if (trastero.getNumTrastero() == numTrastero) {
				
				return trastero;
			}
		}
		
		return null;
	}
	
	public Trastero buscarMasCaro () {
		
		Trastero t = null;
		
		for (int i = 0; i < listaTrasteros.size(); i++) {
			
			if (i == 0) {
				
				t = listaTrasteros.get(i);
			}
			
			else if (i != 0 && t.getPrecio() < listaTrasteros.get(i).getPrecio()) {
				
				t = listaTrasteros.get(i);
			}
		}
		
		return t;
	}
	
	public void borrarTrastero (Trastero t) {
		
		listaTrasteros.remove(t);
	}
	
	public void modificarPrecio (Trastero t, double precioNuevo) {
		
		t.setPrecio(precioNuevo);
	}
	
	public void ordenarTrasterosPorNumero () {
		
		Collections.sort(listaTrasteros);
	}
	
	public void ordenarPorPrecio () {
		
		Collections.sort(listaTrasteros, new ComparaPorPrecio());
	}
	
	
	public void mostrarTrasterosNoOcupados () {
		
		for (Trastero trastero : listaTrasteros) {
			
			if (!trastero.isOcupado()) {
				
				System.out.println(trastero);
			}
		}
	}
}
