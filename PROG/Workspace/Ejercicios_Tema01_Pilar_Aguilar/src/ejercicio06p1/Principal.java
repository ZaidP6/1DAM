package ejercicio06p1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 	6. Realizar un programa que escriba el precio de un producto en una compra, una vez descontado el tanto
			por ciento de descuento, dando nosotros en la declaración de las variables el precio inicial de un
			producto y el tanto por ciento que se va a descontar. Ojo, el cálculo del tanto por ciento lo debe hacer
			el programa no el usuario, por ejemplo, se debe usar 20 y no 0.2.
			descuento= 20 %; y no descuento=0.2;
		 */
		
		
		double pBase = 16.75, pvp, porcen = 20, cien = 100, desc;
		
		
		desc = pBase * porcen / cien;
		pvp = pBase - desc;
		
		System.out.println("******************************************************");
		System.out.println("Bienvenido al programa");
		System.out.println("******************************************************");
	
		System.out.println("    ");
		System.out.printf("El precio del producto con un %.0f%c de descuento se quedaría en %.2f€.\n", porcen,'%', pvp);
		System.out.println("    ");
		
		System.out.println("******************************************************");
		System.out.println("Gracias por usar el programa.");
		
	}

}
