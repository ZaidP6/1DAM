package ejercicio01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Mazo {

	private List<Carta> listaCartas;

	public Mazo(List<Carta> listaCartas) {
		super();
		this.listaCartas = listaCartas;
	}

	public List<Carta> getListaCartas() {
		return listaCartas;
	}

	public void setListaCartas(List<Carta> listaCartas) {
		this.listaCartas = listaCartas;
	}

	@Override
	public String toString() {
		return "Mazo [listaCartas=" + listaCartas + "]";
	}
	
	
	public Carta findByNumPalo(int numFind,String paloFind ) {
		Carta c = null;
		Iterator<Carta> it = listaCartas.iterator();
		while(it.hasNext()) {
			if(numFind == c.getNumero()) {
				if (c.getPalo().equalsIgnoreCase(paloFind)) {
					c = it.next();
				}
			}
		}
		return c;
	}
	
	public void mostrarCarta(Carta c) {
		System.out.println(c);
	}
	
	public List<Carta> findPalo(List<Carta> listaMazo) {
		List<Carta> listaCeros = new ArrayList<Carta>();
		Iterator<Carta> it = listaMazo.iterator(); 
		while(it.hasNext()) {
			
		}
		
		return listaCeros;
	}
	
	public int calcularPuntuacion() {
		int suma = 0;
		for (Carta carta : listaCartas) {
			suma += carta.getPuntos();
		}
		return suma;
	}
	
	public void modificarNombre(Carta c,String nuevoNombre) {
		c.setNombre(nuevoNombre);
	}
	
	public List<Carta> mostrarLista(){
		Iterator<Carta> it = listaCartas.iterator();
		while(it.hasNext()) {
			System.out.println(listaCartas);
		}
		return listaCartas ;
	}
	
	public void ordenarPorPalos() {
		Collections.sort(listaCartas);
	}
	
	public void oredenarPorPuntuacion() {
		Collections.sort(listaCartas);
	}
	
	public List<Carta> findReturn0() {
		List<Carta> listaCeros = new ArrayList<Carta>();
		Carta c= null;
		Iterator<Carta> it = listaCartas.iterator();
		while(it.hasNext()) {
			if (c.getPuntos() == 0) {
				listaCeros.add(c);
			}
		}
		return listaCeros;
		
	}
	
}
