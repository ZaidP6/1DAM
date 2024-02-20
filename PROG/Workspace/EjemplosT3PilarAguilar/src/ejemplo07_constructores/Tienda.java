package ejemplo07_constructores;

import java.util.Arrays;

public class Tienda {

	private Producto []listaProductos;
	private int numProductos;
	private int nTrabajadores;
	
	
	public Tienda(Producto[] listaProductos, int numProductos, int nTrabajadores) {
		super();
		this.listaProductos = listaProductos;
		this.numProductos = numProductos;
		this.nTrabajadores = nTrabajadores;
	}
	
	public Tienda() {
		super();
	}

	public Producto[] getListaProductos() {
		return listaProductos;
	}
	public void setListaProductos(Producto[] listaProductos) {
		this.listaProductos = listaProductos;
	}
	public int getNumProductos() {
		return numProductos;
	}
	public void setNumProductos(int numProductos) {
		this.numProductos = numProductos;
	}
	public int getnTrabajadores() {
		return nTrabajadores;
	}
	public void setnTrabajadores(int nTrabajadores) {
		this.nTrabajadores = nTrabajadores;
	}
	@Override
	public String toString() {
		return "Tienda [listaProductos=" + Arrays.toString(listaProductos) + ", numProductos=" + numProductos
				+ ", nTrabajadores=" + nTrabajadores + "]";
	}
	
	//VERBO EN INFINITIVO, SIN Ñ NI TILDES, QUE INDIQUE QUE HACE EL MÉTODO, 
	//LA 2DA PALABRA EMPIEZA EN  MAYÚSCULAS Y LA 1RA EN MINÚSCULAS, SIEMPRE, 
	//EN SERIO SIEMPRE, QUERIDO YO DEL FUTURO SIEEMPRE
	
	public void agregarProducto (Producto p) {
		
		listaProductos[numProductos] = p;
		numProductos++;
		
	}
	
	public void mostrarLista() {
		for (int i = 0; i < listaProductos.length; i++) {
			System.out.println(listaProductos[i]);
		}
	}
	
	public int findById(String nombre) {
		
		return 1;
	}
	
	public Producto [] findBySeccion(int seccion) {
		int i = 0;
		boolean encontrado = false;
		Producto [] listaEncontrados = new Producto[numProductos];
		
		while(i < numProductos && !encontrado) {
			if(listaProductos[i].getSeccion() == seccion) {
				listaEncontrados[i] = listaProductos[i];
				
			}
			i++;
			
		}
		return listaEncontrados;
		
	}
	
	public void mostrarEncojmV2() {
		for (int i = 0; i < listaProductos.length; i++) {
			//if (listaProductos[i]) {
				
				
			//} else {

			//}
			System.out.println("Diga la seccion que desea ver");
			System.out.println(listaProductos[i]); 
		}
	}
	
	public double findByPrecio(double precioFind) {
		Producto [] listaFind;
		for (int i = 0; i < listaProductos.length; i++) {
			if (listaFind[i]= listaProductos[i].getPrecioFabrica() {
				
			} else {

			}
		}
		
		return 53.64;
		
	}
	
	
}
