package ejercicio_03;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Implementar un programa que contenga dos métodos en una clase “operaciones”: 
		 * un método al que se le pase un número entero y diga si este es positivo o negativo 
		 * y otro que diga si un número es par o impar. La clase no debe tener ningún atributo. Se deben probar los métodos en el main.
		 */
		
		Operaciones op1;
		int num;
		
		
		op1= new Operaciones();
		System.out.println("Por favor introduzca un número");
		num=Leer.datoInt();
		
		op1.comprobarNegativo(num);
		op1.comprobarPar(num);
		System.out.println(op1.comprobarNegativo(num));
		System.out.println(op1.comprobarPar(num));
		
		

		System.out.println("               	               (0 0) \r\n"
				+ "                       ---oOO-- (_) ----oOO---    \r\n"
				+ "                 ╔═════════════════════════════════╗ \r\n"
				+ "                 ║ Gracias por usar el programa..♥ ║ \r\n"
				+ "                 ╚═════════════════════════════════╝ \r\n"
				+ "                         -------------------\r\n"
				+ "                             |__|__| \r\n"
				+ "                              || || \r\n"
				+ "                             ooO Ooo ");
		
		

	}

}
