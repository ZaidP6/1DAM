package ejercicioTipoExamen01;

public class GestionHabitaciones {
	
	Habitacion []listaHabitaciones;
	private int cantHabitaciones;
	
	
	
	public int buscarNumHabitacion(int numHabitacion) {
		int i = 0;
		boolean encontrado = false;
		while (i<cantHabitaciones && !encontrado) {
			Habitacion habitacion = listaHabitaciones[i];
			if (habitacion.getNumHab() == numHabitacion) {
				encontrado = true;
			}else
				i++;
		}
		if(encontrado == true) {
			return i;
		}else 
			return -1;
		
	}
}
