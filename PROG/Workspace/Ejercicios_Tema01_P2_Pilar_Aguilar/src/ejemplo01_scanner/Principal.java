package ejemplo01_scanner;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner (System.in);
		String nombre;
		String aux;
		int edad;
		double precio;
		
		System.out.println("Escribe tu nombre.");
		nombre = sc.nextLine();
		
		System.out.println(nombre);
		
		System.out.println("Tu edad?");
		aux = sc.nextLine();
		edad = Integer.parseInt(aux);
		System.out.println(edad);
		
		System.out.println("Precio del melón:");
		aux = sc.nextLine();
		precio = Double.parseDouble(aux);
		System.out.println(precio);
	}

}
