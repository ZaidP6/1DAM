package ejercicioTipoExamen01_bis;

import java.util.Arrays;

public class GestionHabitaciones {

	private Habitacion []listaHabitaciones;
	private int numHabitaciones;
	public GestionHabitaciones(Habitacion[] listaHabitaciones, int numHabitaciones) {
		super();
		this.listaHabitaciones = listaHabitaciones;
		this.numHabitaciones = numHabitaciones;
	}
	public Habitacion[] getListaHabitaciones() {
		return listaHabitaciones;
	}
	public void setListaHabitaciones(Habitacion[] listaHabitaciones) {
		this.listaHabitaciones = listaHabitaciones;
	}
	public int getNumHabitaciones() {
		return numHabitaciones;
	}
	public void setNumHabitaciones(int numHabitaciones) {
		this.numHabitaciones = numHabitaciones;
	}
	@Override
	public String toString() {
		return "GestionHabitaciones [listaHabitaciones=" + Arrays.toString(listaHabitaciones) + ", numHabitaciones="
				+ numHabitaciones + "]";
	}
	
	
}
