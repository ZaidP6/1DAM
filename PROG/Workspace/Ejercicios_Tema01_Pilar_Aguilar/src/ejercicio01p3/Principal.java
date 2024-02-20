package ejercicio01p3;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * El precio final de venta de un automóvil nuevo para un comprador es la suma total de: el coste de fabricación 
			del vehículo, el porcentaje de la ganancia del vendedor y los impuestos estatales aplicables (sobre el coste de 
			fabricación). Pedir por teclado la ganancia del vendedor que se quiere en porcentaje en cada coche, el % de 
			impuesto y el coste de fabricación y diseñar un programa para calcular el precio final de un automóvil e 
			imprimirlo por pantalla.
		 */
		
		
		double costeFabricacion, porGananciaV, imEstatal, gananciaVendedor, porImpuesto, precioFinal, cien = 100.00;
		String nombreCoche;
		
		
		System.out.println("Bienvenido al concesionario");
		System.out.println("¿Qué coche desea vender?");
		nombreCoche = Leer.dato();
		
		System.out.println("Qué porcentaje de ganancia desea tener hoy? Escriba sólo números por favor.");
		porGananciaV = Leer.datoDouble();
		
		System.out.println("¿Cuál es el porcentaje de impuesto del vehículo? Escriba sólo números por favor.");
		porImpuesto = Leer.datoDouble();
		
		System.out.println("¿Cuál es el precio de fabricación del " + nombreCoche + "?");
		costeFabricacion = Leer.datoDouble();
		
		gananciaVendedor = costeFabricacion * porGananciaV / cien;
		imEstatal = costeFabricacion * porImpuesto /cien;
		precioFinal = costeFabricacion + imEstatal + gananciaVendedor;
		
		System.out.println("-------------------------------------------------------------------------------------------");
		System.out.println("");
		System.out.println("Con los datos aportados tenemos:");
		System.out.println("");
		System.out.printf("\t- La ganancia del vendedor es de: %.2f€.\n", gananciaVendedor);
		System.out.println("");
		System.out.printf("\t- El impuesto del vehículo a vender es de: %.2f€.\n", imEstatal);
		System.out.println("");
		System.out.printf("\t- Teniendo en cuenta los datos anteriores, el %s costaría: %.2f€.\n", nombreCoche, precioFinal);
		System.out.println("");
		System.out.println("-------------------------------------------------------------------------------------------");
		System.out.println("");
		System.out.println("Gracias por usar el programa. ¡Suerte con la venta!");
		
		
		
		
		
	}

}
