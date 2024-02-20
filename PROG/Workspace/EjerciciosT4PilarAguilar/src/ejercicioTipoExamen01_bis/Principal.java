package ejercicioTipoExamen01_bis;

public class Principal {

	
	public static void main(String[]args) {
		
		Habitacion hab1 = new Habitacion(1, 15.69, false, "Pepe", 4, 6);
		Habitacion hab2 = new Suite(2, 45.28, true, "Carlos", 20, 2, 85, 250.50);
		Habitacion hab3 = new Apartamento(3, 25, true, "Fabio", 7, 5, true, 22.50);
		GestionHabitaciones listaHabitaciones;
		
		
		
		listaHabitaciones = new GestionHabitaciones(listaHabitaciones, 3);
		System.out.println("");
		
		
		
		
		
		
		
	}
}
