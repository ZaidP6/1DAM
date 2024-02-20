package ejercicioTipoExamen01;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		double precioBase = 45.60, consumoServicioHab = 86.24;
		Habitacion hab1 = new Habitacion(1, precioBase, true, "Juan", 4, 2);
		Habitacion hab2 = new Suite(2, precioBase, true, "Luismi", 8, 4, 90.5, consumoServicioHab);
		Habitacion hab3 = new Apartamento(3, precioBase, false, "Familia Ruiz", 5, 8, consumoServicioHab);
		
		System.out.println("Bienvenido al minihotel");
		
		
		
	}

}
