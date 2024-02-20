package ejemplo02_ticket;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		Scanner sc = new Scanner (System.in);
		String nombre;
		String aux;
		int cant;
		double precio;
		
		System.out.println("Nombre del producto");
		nombre = sc.nextLine();
		System.out.println(nombre);

		
		System.out.println("Diga el precio");
		aux = sc.nextLine();
		precio = Double.parseDouble(aux);
		
		System.out.println("Diga la cantidad");
		aux = sc.nextLine();
		cant = Integer.parseInt(aux);
		
		System.out.println("Bienvenido a la tienda");
		System.out.println();
		
	}

}
