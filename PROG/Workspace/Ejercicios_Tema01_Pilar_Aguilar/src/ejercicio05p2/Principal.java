package ejercicio05p2;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * ¿Qué saldo tendré al final del año en el banco si he abierto una cuenta pago de mantenimiento un 1 %
			del saldo con la que la abrí inicialmente al año y tengo unos intereses del 3 % del saldo inicial? Hacer 
			un programa que calcule esto y lo muestre por pantalla leyendo por teclado el saldo inicial con el que 
			se quiere abrir la cuenta.
		 */
		
		double saldoIni, saldoFin, porcMant = 1, porcInte = 3, impMan, impInte, cien =100;
		String nombre;
		
		
		System.out.println("Bienvenido a la calculadora del banco.");
		System.out.println("");
		System.out.println("///////////////////////////////////////////////////////////////////////");
		System.out.println("");
		System.out.println("Introduzca su nombre y apellido por favor.");
		nombre = Leer.dato();
		
		System.out.println("Indique por favor la cantidad que ingresó a principio de año.");
		saldoIni = Leer.datoDouble();
		
		
		impMan = saldoIni * (porcMant/cien);
		impInte = saldoIni * (porcInte/cien);
		saldoFin = saldoIni + impInte - impMan;
		
		
		System.out.println("///////////////////////////////////////////////////////////////////////");
		
		System.out.println("");
		
		System.out.printf("De mantenimiento le han quitado %.2f€, de interés ha generado %.2f€.\n", impMan, impInte);
		System.out.printf("Al final de año, si no se ha gastado nada, su cuenta tendrá %.2f€.\n", saldoFin);
		
		System.out.println("");
		
		System.out.println("///////////////////////////////////////////////////////////////////////");
		
		System.out.println("");
		
		System.out.printf("%s gracias por confiar en nuestro banco.\n", nombre);
		
	}

}
