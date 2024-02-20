package ejercicio01;

import java.util.ArrayList;
import java.util.List;

public class CrudNotas {

	List<Nota> listaNotas= new ArrayList <>();

	public CrudNotas(List<Nota> listaNotas) {
		super();
		this.listaNotas = listaNotas;
	}

	public List<Nota> getListaNotas() {
		return listaNotas;
	}

	public void setListaNotas(List<Nota> listaNotas) {
		this.listaNotas = listaNotas;
	}

	@Override
	public String toString() {
		return "CrudNotas [listaNotas=" + listaNotas + "]";
	}
	
	public void addNota(Nota nota) {
		listaNotas.add(nota);
	}
	
	public int calcularCantNotas() {
		int contador = 0;
		for (Nota nota : listaNotas) {
			contador++;
			
		}
		return contador;
	}
	
	public int findById(int num) {
		boolean encontrado = false;
		int i = 0;
		while (i<listaNotas.size()&& !encontrado) {
			Nota n = listaNotas.get(num);
			if (num == i+1) {
				encontrado = true;
			} else {
				i++;
			}
			if(encontrado==true) {
				return i;
			}else
				return -1;
		}
		
		return 0;
	}
	
	public Nota findByNote(int num) {
		boolean encontrado = false;
		int i = 0;
		
		while(i<listaNotas.size() && !encontrado) {
			Nota n = listaNotas.get(num);
			if (num == i+1) {
				encontrado = true;
			} else {
				i++;
			}
			if(encontrado == true) {
				return listaNotas.get(i);
			}else
				return null;
		}
		
		return null;
	}
	
	public void modificarTitulo(int id) { //se puede modificar titulo, modificar cuerpo o incluso modificar la nota entera
		
	}
	
	public Nota mostrarNotaPorIndice(int indice) {
		return listaNotas.get(indice-1);
	}
	
	public void removeNota(Nota nota) {
		if(!listaNotas.isEmpty()) {
			listaNotas.remove(nota);
		}
			
	}
	
	public void mostrarLista() {
		for (Nota nota : listaNotas) {
			System.out.println(nota);
		}
		
	}
	
}
