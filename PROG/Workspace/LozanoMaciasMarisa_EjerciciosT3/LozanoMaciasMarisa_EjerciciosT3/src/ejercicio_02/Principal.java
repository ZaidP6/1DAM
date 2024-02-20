package ejercicio_02;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Hacer un programa que calcule el área de un círculo en cm2. Debemos tener la clase Círculo,
		 *  con un solo atributo llamado radio. En el main, debemos crear un objeto tipo Círculo y llamar a dicho método. 
		 *  Mejorar el programa añadiendo a la clase Círculo otro método que calcule el área del círculo en m2.
		 */
		
		Circulo circ1;
		double radio,areaCm,areaM;
		
		System.out.println("Indique el radio en cm");
		radio=Leer.datoDouble();
		
		circ1= new Circulo(radio);
		
		areaCm=circ1.calcularAreaCm();
		areaM=circ1.calcularAreaMetros();
		
		circ1.calcularAreaMetros();
		circ1.imprimirAreaCm(areaCm);
		circ1.imprimirAreaM(areaM);
		

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
