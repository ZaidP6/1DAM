package ejercicio02_p2;

import java.util.Arrays;

public class Hotel {

	private Habitacion [] listaHabitaciones;
	private int numHab;
	
	
	@Override
	public String toString() {
		return "Hotel [listaHabitaciones=" + Arrays.toString(listaHabitaciones) + ", numHab=" + numHab + "]";
	}

	public Habitacion[] getListaHabitaciones() {
		return listaHabitaciones;
	}

	public void setListaHabitaciones(Habitacion[] listaHabitaciones) {
		this.listaHabitaciones = listaHabitaciones;
	}

	public int getNumHab() {
		return numHab;
	}

	public void setNumHab(int numHab) {
		this.numHab = numHab;
	}

	public Hotel(Habitacion[] listaHabitaciones, int numHab) {
		super();
		this.listaHabitaciones = listaHabitaciones;
		this.numHab = numHab;
	}

	public void añadirHab(Habitacion hab) {
		hab = new Habitacion(hab.getIdHab(),hab.getTipo(),hab.getPrecio(), hab.getNombre(), hab.getDias(), 
				hab.isLimpia(), hab.isExtraMiniBar());
		
		listaHabitaciones[numHab]= hab;
		numHab++;
		
	}
	
	public int findById(int idHab) {
		int i = 0;
		boolean encontrado = false;
		
		while (i < listaHabitaciones.length && !encontrado) {
			Habitacion hab = listaHabitaciones[i];
				if(hab.getIdHab() == idHab) {
					encontrado = true;
				}else
					i++;
			}
		if(encontrado) {
			return i;
		}else
			return -1;
	}
	
	
	
	
	public boolean comprobarLimpieza(int nHab) {
		if(listaHabitaciones[nHab-1].isLimpia()) {
			return true;
		}
		return false;
		
	}
	
	public double calcularPrecioEstancia(Habitacion hab) {
		double precioEstancia = 0, suplementoTipoA = 58.50, suplementoTipoB = 20.00, suplementoTipoC = 0;
		double precioLimpia = -25, precioMiniBar = 75.69;
		
		
		if(hab.getTipo()== 'a') {
			precioEstancia += suplementoTipoA;
		}else if (hab.getTipo() == 'b'){
			precioEstancia += suplementoTipoB;
		}
		
		precioEstancia = (precioEstancia +hab.getPrecio()) * hab.getDias();
		
		if(hab.isLimpia()) {
			precioEstancia += precioLimpia;
		}
		if(hab.isExtraMiniBar()) {
			precioEstancia += precioMiniBar;
		}
		
		return precioEstancia;
	}
	
	public void mostrarFactura() {
		
		System.out.println();
		
		
	}
	
}
