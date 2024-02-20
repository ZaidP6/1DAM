package ejercicio16;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Un trabajador necesita calcular su salario semanal, el cual se obtiene de la siguiente manera:
			Si trabaja 40 horas o menos se le paga 16 euros por hora, si trabaja más de 40 horas se le paga
			16 euros por cada una de las primeras 40 horas y 20 euros por cada hora extra. El programa
			deberá pedir al usuario el número de horas trabajadas por el obrero en total y mostrar el salario
			que le corresponde.

		 */
		
		int op;
		double pHorasN =16, pHorasCom = 20, salTot, horasN, horasComp;
		
		System.out.println("Vamos a calcular un salario");
		
		do {
			
			System.out.println("------------------------------------------------------------");
			System.out.println("");
			System.out.println("¿Cuántas horas normales ha trabajado esta semana?");
			horasN = Leer.datoDouble();
			System.out.println("¿Cuántas horas complementarias ha trabajado esta semana? (Es decir, sin contar esas 40 horas normales)");
			horasComp = Leer.datoDouble();
			
			if(horasN >= 40) {
				salTot = (horasN*pHorasN)+(horasComp*pHorasCom);
				System.out.printf("EL salario de esta semana es de %.2f€.\n", salTot);
			}else {
				salTot = (horasN*pHorasN);
				System.out.printf("EL salario de esta semana es de %.2f€.\n", salTot);
			}
			
			
			System.out.println("");
			System.out.println("------------------------------------------------------------");
			
			System.out.println("¿Quiere calcular un salario?");
			System.out.println("Pulse 1 para continuar o pulse 0 para salir.");
			op = Leer.datoInt();
			
		}while(op!=0);
		
	}

}
