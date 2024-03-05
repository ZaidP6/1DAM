package ejercicioexam03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class MiMusica{

	private List<Cancion> listaCanciones;
	
	
	
	
	@Override
	public String toString() {
		return "MiMusica [listaCanciones=" + listaCanciones + "]";
	}




	public List<Cancion> getListaCanciones() {
		return listaCanciones;
	}




	public void setListaCanciones(List<Cancion> listaCanciones) {
		this.listaCanciones = listaCanciones;
	}




	public MiMusica(List<Cancion> listaCanciones) {
		super();
		this.listaCanciones = listaCanciones;
	}

	


	public List<Cancion> findByFree(){
		List<Cancion> listaCancionesGratis = new ArrayList<Cancion>();
		Cancion c = null;
		Iterator<Cancion> it = listaCanciones.iterator();
		while(it.hasNext()) {
			c = it.next();
			if(c.isGratis()) {
				listaCancionesGratis.add(c);
			}
		}
		return listaCancionesGratis;
	}
	
	public List<Cancion> findByDuracion(){
		List<Cancion> listaCancionesMasDuracion = new ArrayList<Cancion>();
		Cancion c = null;
		for (Cancion cancion : listaCanciones) {
			if(c.getDuracion() < cancion.getDuracion()) {
				c = cancion;
				listaCancionesMasDuracion.add(c);
			}
		}
		
		return listaCancionesMasDuracion;
		
	}
	
	public List<Cancion> findByInterprete(String cantante){
		List<Cancion> listaCancionesInterprete = new ArrayList<Cancion>();
		for (Cancion cancion : listaCanciones) {
			if(cancion.getInterprete().equalsIgnoreCase(cantante)) {
				listaCancionesInterprete.add(cancion);
			}
		}
		return listaCancionesInterprete;
		
	}
	
	public Cancion findByReproducciones() {
		Cancion c = null;
		for (Cancion cancion : listaCanciones) {
			if (cancion.getNumReproducciones()> c.getNumReproducciones()) {
				c = cancion;
			}
		}
		return c;
	}
	
	public Cancion findById(int num) {
		Cancion c = null;
		
		for (int i = 0; i < listaCanciones.size(); i++) {
			if(listaCanciones.get(i).getId() == num) {
				c= listaCanciones.get(i);
			}
		}
		return c;
	}
	
	public void modificarDePago(Cancion c, int gratis) {
		if (gratis == 1) {
			c.setGratis(true);
		}
		if (gratis == 2) {
			c.setGratis(false);
		}
		
	}
	
	
	public void mostrarLista(List<Cancion> lista) {
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
	}
	
	public void mostrarV2() {
		for (Cancion cancion : listaCanciones) {
			System.out.println(cancion);
		}
	}

	public void ordenarPorZA() {
		ComparaNombreCancion com = new ComparaNombreCancion();
		Collections.sort(listaCanciones,Collections.reverseOrder(com));
	}
	
	public void ordenarInterprete() {
		Collections.sort(listaCanciones);
	}


	
	
}
