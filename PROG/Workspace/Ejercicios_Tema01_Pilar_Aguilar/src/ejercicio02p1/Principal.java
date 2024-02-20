package ejercicio02p1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		/*
		 * En tiempos de sequía hay que cuidar el agua de las piscinas y muchas engañan según su forma.
			Calcula y muestra en pantalla el volumen de dos piscinas:
				- Piscina olímpica (50 m de largo por 21 de ancho) y 2,50 de profundidad.
				- Piscina circular de 1,80 de profundidad y 12 metros de radio.
			¿Cuánto costará llenar cada una si el metro cúbico cuesta 1,80 €?

		 */

		
		double largo1 = 50, ancho1 = 21, prof1 = 2.5, vol1, vol2, exp = 2;
		double prof2 = 1.8, rad1 = 12, precioMetro = 1.8, precioOlim, precioCir;
		
		vol1 = largo1*ancho1*prof1;
		vol2 = Math.PI * Math.pow(rad1, exp) *prof2;
		
		precioOlim = vol1 * precioMetro;
		precioCir = vol2 * precioMetro;
		
		
		System.out.println("********************************************");
		System.out.println("BIENVENIDO AL PROGRAMA");
		System.out.println("********************************************");
		
		System.out.printf("La piscina olímpica tiene un volumen de %.2f m3.\n", vol1);
		System.out.printf("Por tanto, el precio de la piscina olímpica es: %.2f€.\n", precioOlim);
		System.out.println("********************************************");
		
		System.out.printf("La piscina circular tiene un volumen de %.2f m3.\n", vol2);
		System.out.printf("Por tanto, el precio de la piscina circular es %.2f€.\n", precioCir);
		System.out.println("********************************************");
		
	}

}
