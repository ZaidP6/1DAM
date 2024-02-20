package ejercicio01p1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Declarar 3 variables de tipo entero (int) con valores 3, 5, 9. Sumarlas guardando el resultado en una
			nueva variable. Restar 1 a dicha variable, almacenando en una variable diferente. Imprimir el resultado
			almacenado en esa variable por la salida estándar.

		 */
		
		
		int num1 = 3, num2 = 5, num3 = 9, resultado, rest1 = 1, resultado2;
		
		
		System.out.println("********************************************");
		System.out.println("BIENVENIDO A NUESTRO PROGRAMA");
		System.out.println("********************************************");
		
		resultado = num1 + num2 + num3;
		
		resultado2 = resultado - rest1;
		
		System.out.println("El resultado de la primera operación es: " + resultado);
		System.out.println("El resultado de la segunda operación es: " + resultado2);
		System.out.println("********************************************");
	}

}
