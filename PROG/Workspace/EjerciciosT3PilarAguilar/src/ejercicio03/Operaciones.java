package ejercicio03;

public class Operaciones {

	/*
	 * Implementar un programa que contenga dos métodos en una clase “operaciones”: un método al que se le
		pase un número entero y diga si este es positivo o negativo y otro que diga si un número es par o impar. La
		clase no debe tener ningún atributo. Se deben probar los métodos en el main.
	 */
	
	//constructor
	public Operaciones() {
		
		
	}

	//métodos
	public boolean comprobarPositivo(int num) {
		if(num >=0) {
			return true;
		}else
			return false;
	}
	
	
	public void imprimirPosivoNegativo(int num) {
		if(comprobarPositivo(num)== true) {
			System.out.printf("El número %d es positivo.\n", num);
		}else
			System.out.printf("El número %d es negativo.\n", num);

	}
	
	
	public boolean comprobarPar(int num) {
		int dos= 2;
		if(num % dos == 0) {
			return true;
		}else
			return false;
	}
	
	public void imprimirParImpar(int num) {
		
		if(comprobarPar(num)== true) {
			System.out.printf("El número %d es par.\n", num);
		}else
			System.out.printf("El número %d es impar.\n", num);
	}
	
	
	
	
	
	
	
	
	
}
