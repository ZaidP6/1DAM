package ejercicio02p3;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Realizar un programa que calcule el espacio recorrido por un objeto que se mueve a velocidad constante. El
			objeto, por ejemplo, zapatilla de una madre hacia el hijo, ha recorrido un espacio inicial de 5.5 m y se mueve
			a una velocidad constante de 3.2 m/s. Vosotros debéis dar un valor al tiempo que el objeto está en movimiento.
			La ecuación usada es:
			espacio= espacioInicial + velocidad*tiempo
		 */
		
		
		double espacioInicial = 5.5, espacioRecor, velocidad = 3.2, tiempo = 5;
		
		espacioRecor = espacioInicial + (velocidad*tiempo);
		
		System.out.println("//////////////////////////////////////////////////////////////////");
		System.out.println("Bienvenido al programa de La Zapatilla de mamá.");
		System.out.println("//////////////////////////////////////////////////////////////////");
		System.out.println("");
		
		System.out.printf("El espacio recorrido en %.1fs es de %.2fm.\n", tiempo, espacioRecor);
		System.out.println("");
		System.out.println("Gracias por usar el programa");
		
	}

}
