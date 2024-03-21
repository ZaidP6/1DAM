package ejercicio01;

import java.util.ArrayList;
import java.util.List;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Realizar un programa que haga las operaciones básicas de una calculadora solo con números enteros (sumar,
			resta, multiplicar, dividir y raíz cuadrada) teniendo en cuenta las posibles excepciones que se pueden producir
			(entrada de datos, división por cero, raíz de un número negativo, etc.)
		 * */
		List<Integer> numeros= new ArrayList<Integer>();
		int op = 0;
		int simbolo = 20;
		double total = 0;
		
		
		System.out.println("Calculadora");
		
		do {
			
			for (Integer num : numeros) {
				System.out.println("Indique un número");
				num = Leer.datoInt();
				operacion();
				simbolo = Leer.datoInt();
				
				switch (simbolo) {
					case 1: 
						total += num;
						System.out.printf("%.2f\n", total);
						break;
					case 2:
						total -= num;
						System.out.printf("%.2f\n", total);
						break;
					case 3:
						total *= num;
						System.out.printf("%.2f\n", total);
						break;
					case 4:
						try {
							total /= num;
							System.out.printf("%.2f\n", total);
							break;
						}catch(Exception e){
							if(num == 0) {
								System.err.println("No puedes dividir entre 0");
							}
						}
				}		
			}
			
		} while (simbolo != 0);
		
	}
	
	public static void operacion() {
		System.out.println("""
				1 - Sumar
				2 - Restar
				3 - Multiplicar
				4 - Dividir
				0 - Salir
				""");
	}
}

