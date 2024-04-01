package ejercicio03;
/**
 * se describen todas las operaciones.
 * @author pilar
 *
 */
public class Operaciones {

	
	//constructor
	public Operaciones() {
		
		
	}

	//métodos
	/**
	 * Comprobar si el numero es positivo o negativo. Pasando como parametro un numero entero.
	 * @param num numero entero que se pide al usuario
	 * @return devuelve true si es positivo o false si es negativo
	 */
	public boolean comprobarPositivo(int num) {
		if(num >=0) {
			return true;
		}else
			return false;
	}
	
	/**
	 * Imprimir si es positivo o negativo.
	 * @param num numero entero que se pide al usuario
	 */
	public void imprimirPosivoNegativo(int num) {
		if(comprobarPositivo(num)== true) {
			System.out.printf("El número %d es positivo.\n", num);
		}else
			System.out.printf("El número %d es negativo.\n", num);

	}
	
	/**
	 * Comprobar si es par o impar
	 * @param num numero entero que se pide al usuario
	 * @return devuelve true si es par o false si es impar
	 */
	public boolean comprobarPar(int num) {
		int dos= 2;
		if(num % dos == 0) {
			return true;
		}else
			return false;
	}
	
	/**
	 * Imprime si es par o impar
	 * @param num numero entero que se pide al usuario
	 */
	public void imprimirParImpar(int num) {
		
		if(comprobarPar(num)== true) {
			System.out.printf("El número %d es par.\n", num);
		}else
			System.out.printf("El número %d es impar.\n", num);
	}
	
	
	
	
	
	
	
	
	
}
