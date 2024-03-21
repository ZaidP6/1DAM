package ejemplo03;


import java.time.LocalDate;
import java.util.Formatter;

public class Principal {

	public static void main(String[] args) throws DateException, Exception {
		// TODO Auto-generated method stub

		/*
		 * Crear clase reserva,hacer una reserva que sea anterior al dia de hoy.
		 * Crear una exception para que ésta salte.
		 */
		
		Reserva reserva;
		Formatter formateoFecha = new Formatter("dd-MM-yyyy");
		LocalDate fechaReserva;
		LocalDate hoy = LocalDate.now();
		
		
		
		System.out.println("Indique la fecha que desea reservar");
		
	}

}
