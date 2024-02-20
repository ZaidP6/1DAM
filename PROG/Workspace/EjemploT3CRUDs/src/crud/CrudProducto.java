package crud;

import java.util.Arrays;

import model.Producto;

public class CrudProducto {

	private Producto [] lista;
	
	/*
	 * Construcctor para crear un obejto de esta clase 
	 * pasando como paarametro una lista, ya qie puesde 
	 * tener tamaño dado por el usuario en el main.
	 */

	public CrudProducto(Producto[] lista) {
		super();
		this.lista = lista;
	}

	public Producto[] getLista() {
		return lista;
	}

	public void setLista(Producto[] lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "CrudProducto [lista=" + Arrays.toString(lista) + "]";
	}
	
	
	
	/*
	 * Pasamos u producto y una posición y se añade dicho 
	 * producto en dicha lista. Ojo, como no se prueba 
	 * nada, se pierde lo que había.
	 */
	
	public void add (Producto p1, int posicion) {
		lista[posicion] = p1;
	}
	
	/*
	 * Método que mofifica el preciom de un producto
	 * se pasa com parametro el codigo del producto que 
	 * queredmos modificar (ambos cosas que se le pediran al susuario)
	 */
	
	
	public Producto findById(String codigo) {
		int i = 0;	//se declara un índice
		boolean encontrado = false; 	//se pasa una variable booleana para cuando el bucle encuentre lo que se pide
		
		while(i<lista.length && !encontrado) {
			Producto codPro = lista[i];
			if(codPro.getCodigo().equalsIgnoreCase(codigo))
				encontrado = true;
			else
				i++;
		}
		
		if(encontrado)
			return lista[i]; //Devolvemos el producto buscado
		else
			return null;
			
	}
	
	public int findByIdV2(String codigo) {
		int i = 0;
		boolean encontrado = false;
		
		while(i<lista.length && !encontrado) {
			if(lista[i].getCodigo().equalsIgnoreCase(codigo)) {
				encontrado = true;
			}else
				i++;
		}if(encontrado)
			return i;
		else
			return -1;
	}
	
	
	public Producto findByName (String nombre) {
		int i = 0;
		boolean encontrado = false;
		
		while(i<lista.length && !encontrado) {
			if(lista[i].getNombre().equalsIgnoreCase(nombre)) {
				encontrado =true;
			}else
				i++;		
		}
		if(encontrado)
			return lista[i];
		else
			return null;
	}
	
	public void editPrecio(String codigo, double precioUnitario) {
		int indice = findByIdV2(codigo);
		if(indice >=0) {
			lista[indice].setPrecioUnitario(precioUnitario);
		}
	}
	
	public int findProduct(Producto p) {
		int i = 0;
		boolean encontrado = false;
		while(i < lista.length && !encontrado) {
			Producto codPro = lista[i];
			//if(p.) {
				
			}
		}
	}
	
}
