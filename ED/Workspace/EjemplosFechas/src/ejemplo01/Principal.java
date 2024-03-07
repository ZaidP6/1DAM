package ejemplo01;

import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate hoy = LocalDate.now();  //Fecha actual formato fecha
		LocalDate fecha1 = LocalDate.of(1998, 12, 06); //Fecha introducida formato fecha
		LocalDate fecha2 = LocalDate.parse("1985-04-15"); //Fecha introducida formato String
		
		
		
		
		
		
		System.out.println(hoy);
		System.out.println(fecha1);
		System.out.println(fecha2);
		
		
	}

}
