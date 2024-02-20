package ejercicio10p1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Escribir un programa que sirva para calcular el precio final de un producto. El cliente se lleva 4 
			unidades de un producto que cuesta 12,99 € y se le aplica un descuento del 3 % al precio total.
		 */
		
		int unidades = 4, descuento = 3, conv = 100, uno =1;
		double precioBase = 12.99, pvp;
		
		System.out.println("****************************************************");
		System.out.println("Bienvenido al programa");
		System.out.println("****************************************************");
		
		pvp = unidades * precioBase;
		
		pvp = pvp * (uno - descuento / conv);
		
		System.out.printf("El precio final de los productos con un %d%c de descuento es de %.2f €.\n",descuento, '%', pvp);
		
		System.out.println("****************************************************");
		System.out.println("Gracias por usar el programa.");
		
		
	}

}
