package ejercicio04;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Leer un número que será la cantidad de dinero que una persona quiere retirar de su 
		 * cuenta bancaria. Mostrar un mensaje diciendo que “no es posible” si la cantidad 
		 * que se quiere retirar es mayor que el saldo de la cuenta y el nuevo saldo si se 
		 * ha podido retirar.
		 */
		
		double dinRetirar, saldoCuenta;
		
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("");
		System.out.println("Bienvenido al cajero");
		System.out.println("");
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("");
		
		System.out.println("Disculpe las molestias pero hemos perdido datos "
				+ "de los clientes.");
		System.out.println("¿Podría indicar la cantidad de dinero que tiene en cuenta?");
		saldoCuenta = Leer.datoDouble();
		System.out.println("");
		
		System.out.println("Perfecto, ¿cuánto desea retirar?");
		dinRetirar = Leer.datoDouble();
		System.out.println("");
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("");
		
		if(dinRetirar>saldoCuenta) {
			System.out.println("Lo sentimos, no puede retirar más de "
					+ "lo que tiene.");
		}else {
			saldoCuenta -= dinRetirar;
			System.out.printf("Con la cantidad retirada, "
					+ "su saldo se queda en %.2f€.\n", saldoCuenta);
		}
		
		System.out.println("");
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("");
		System.out.println("Gracias por usar el cajero. Que tenga un buen día. :)");
	}

}
