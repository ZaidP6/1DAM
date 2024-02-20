package ejercicio_05;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Cuando era pequeño me mandaban a copiar determinadas frases cuando hacía algo mal para no olvidarlo.
		 *  Realizar un programa que lea un texto del teclado y un número entero y muestre en pantalla dicho texto una 
		 *  cantidad de veces igual al número introducido. La clase se puede llamar "Copiado".
		 */
		
		Copiado cop1;
		
		String frase="";
		int num;
		
		System.out.println("Por favor introduzca la frase a copiar");
		frase=Leer.dato();
		
		cop1= new Copiado (frase);
		System.out.println("Introduzca el número de veces que desea copiar la frase");
		
		num=Leer.datoInt();
		
		cop1.copiarfrase(num);


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
