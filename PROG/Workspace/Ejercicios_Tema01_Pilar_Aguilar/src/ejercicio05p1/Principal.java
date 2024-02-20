package ejercicio05p1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Crear un programa donde se declare una variable inicializada con un valor de 50 que será una cantidad
			de euros, y mostrar por pantalla su cambio a libras esterlinas (moneda oficial del Reino Unido). Se
			debe tener otra variable cuyo valor será el valor de 1 libra en euros y otra para guardar el resultado
			(podéis buscar el cambio en internet).

		 */
		
		
		double precio1 = 50, cambioEL = 1.15, resulCambio;
		
		
		resulCambio = precio1 * cambioEL;
		
		
		System.out.println("********************************************************************");
		System.out.println("Bienvenido al programa");
		System.out.println("********************************************************************");
		System.out.printf("50 euros al cambio en libra esterlina es de: %.2f libras.", resulCambio);
		
	}

}
