package ejercicio_clase02_operaciones;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//VARIABLES
		
		int edad;
		int anioFuturo;
		int anioNac;
		double num1 = 5.86;
		double num2 = 8.96;
		double resultado;
		
		
		
		
		//OPERACIONES
		
		System.out.println("*********************************************************************");
		System.out.println("Bienvenido al programa por el cual ha pagado 1000€.");
		System.out.println("*********************************************************************");
		
		System.out.println("Por favor, indique el año de nacimiento.");
		anioNac = 1968;
		
		System.out.println("Pro favor, indique el año que desea saber la edad que tendrá.");
		anioFuturo = 2098;
		
		edad = anioFuturo - anioNac;
		
		System.out.println("*********************************************************************");
		System.out.println("En el año " + anioFuturo + " usted tendrá " + edad + " años.");
		System.out.println("*********************************************************************");
		
		resultado = num1* num2;
		
		System.out.printf("El resultado de multiplicar %.2f por %.2f es: %.2f.\n", num1, num2, resultado);
		System.out.println("*********************************************************************");
		
	}

}
