package ejercicio03p2;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Realizar un programa que lea por teclado un valor correspondiente a una distancia en millas marinas
			(con decimales) y las escriba expresadas en metros. Sabiendo que 1 milla marina equivale a 1852 
			metros.

		 */
		 double milMarin, disMetros, conv = 1852;
		 
		 System.out.println("Bienvenido al programa.");
		 System.out.println();
		 
		 System.out.println("¿Cuántas millas marinas quiere convertir a metros?");
		 
		 milMarin = Leer.datoDouble();
		 
		 disMetros = milMarin * conv;
		 
		 System.out.println("///////////////////////////////////////////////////////////////////////");
		 System.out.println("");
		 System.out.printf("%.2f millas marinas equivalen a %.2f metros.\n", milMarin, disMetros);
		 System.out.println("");
		 System.out.println("Gracias por usar el programa.");
		
	}

}
