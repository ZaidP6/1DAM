package ejercicioTipoExamen02;

import java.util.Arrays;

public class TiendaAmbulante {

	private Producto[]lista;

	public TiendaAmbulante(Producto[] lista) {
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
		return "TiendaAmbulante [lista=" + Arrays.toString(lista) + "]";
	}
	
	
	
	public int calcularProductosStock() {
		int contador = 0;
		for (int i= 0; i < lista.length; i++) {
			if (lista[i].isVendido() == false) {
				contador++;
			}
		}
		return contador;
		
	}
	
	public double calcularTotalVendido(double porcentaje) {
		double total = 0;
		for (int i = 0; i < lista.length; i++) {
			if (lista[i].isVendido()) {
				total = lista[i].calcularPvP(porcentaje);
			}
		}
		return total;
		
	}
	
	public double devolverCambio(double aPagar, double cantEntregada) {
		double cantADevolver = 0;
		
		cantADevolver= cantEntregada - aPagar;
		return cantADevolver;
		
	}
	
	public void mostrarProductos() {
		for (int i = 0; i < lista.length; i++) {
			if (lista[i].isVendido()) {
				System.out.println("Producto vendido: "+lista[i]);
			}
			System.out.println("Producto en stock: "+lista[i]);
		}
	}
	
	public Producto findByMarca(String marca) {
		boolean encontrado = false;
		int i = 0;
		while (i<lista.length && !encontrado) {
			Producto p = lista[i];
			if (((Movil) p).getMarca().equalsIgnoreCase(marca)) {
				encontrado = true;
			}else
				i++;
		}
		if(encontrado) {
			return lista[i];
		}
		
		return null;
		
	}
	
	public Producto findByTipo(String tipo) {
		boolean encontrado = false;
		int i = 0;
		while (i<lista.length && !encontrado) {
			Producto p = lista[i];
			if (((EspadaLaser)p).getTipo().equalsIgnoreCase(tipo)) {
				encontrado = true;
			}else
				i++;
		}
		if (encontrado) {
			return lista[i];
		}
		return null;
		
	}
	
	
	public void mostrarMensaje(Producto p) {
		
	}
	
}
