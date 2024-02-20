package ejercicio_12_prueba;

import java.util.Arrays;

public class Inmobiliaria {

	private Piso [] listaPisos;
	private int cantTrabajadores;
	private int posicion;
	
	
	
	
	@Override
	public String toString() {
		return "Inmobiliaria [listaPisos=" + Arrays.toString(listaPisos) + ", cantTrabajadores=" + cantTrabajadores
				+ ", posicion=" + posicion + "]";
	}

	public Piso[] getListaPisos() {
		return listaPisos;
	}

	public void setListaPisos(Piso[] listaPisos) {
		this.listaPisos = listaPisos;
	}

	public int getCantTrabajadores() {
		return cantTrabajadores;
	}

	public void setCantTrabajadores(int cantTrabajadores) {
		this.cantTrabajadores = cantTrabajadores;
	}

	public int getPosicion() {
		return posicion;
	}

	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}

	public Inmobiliaria(Piso[] listaPisos, int cantTrabajadores, int posicion) {
		super();
		this.listaPisos = listaPisos;
		this.cantTrabajadores = cantTrabajadores;
		this.posicion = posicion;
	}

	public void anadirPiso(Piso piso) {
		int posicion = 0;
		listaPisos[posicion] = piso;
		posicion++;
	}
	
	public double calcularPrecioFinalVenta(int porcentajeGanancia) {
		double precioFinalVenta, cien = 100;
		
		precioFinalVenta = (listaPisos[posicion].getPrecioVenta())+(porcentajeGanancia/cien *listaPisos[posicion].getPrecioVenta());
		return precioFinalVenta;
	}
	
	public int findById(int nRef) {
		int i = 0;
		boolean encontrado = false;
		while (i< listaPisos.length && !encontrado) {
			Piso piso1 = listaPisos[i];
			if(nRef == piso1.getnRef()) {
				encontrado = true;
			}else
				i++;
		}
		if(encontrado)
			return i;
		else
			return -1;
		
	}
	
	public Piso findByNombre(String direccion) {
		int i = 0;
		boolean encontrado = false;
		while (i< listaPisos.length && !encontrado) {
			Piso piso1 = listaPisos[i];
			if(piso1.getDireccion().equalsIgnoreCase(direccion)) {
				encontrado = true;
			}else
				i++;
		}
		if(encontrado)
			return listaPisos[i];
		else
			return null;
		
	}
	
}
