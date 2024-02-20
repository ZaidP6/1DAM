package ejercicio12;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * 12. Implementar un programa que calcule el índice de masa corporal (IMC) de una persona y diga 
			en qué estado se encuentra dependiendo del resultado, según la tabla. El IMC se calcula 
			dividiendo el peso de una persona en kg entre la altura en metros al cuadrado, es decir:
			IMC= peso/altura2
		 */
		
		
		double peso,altura, iMC;
		int dos = 2;
		
		System.out.println("Bienvenido a la farmacia.");
		System.out.println("Indique su peso.");
		peso = Leer.datoDouble();
		
		System.out.println("Indique su altura.");
		altura = Leer.datoDouble();
		
		iMC = peso * Math.pow(altura, dos);
		
		if (iMC < 16 ) {
			System.out.println("Su IMC es menor a 16");
			System.out.println("Criterio de ingreso en hospital");
		} else if(iMC >= 16 && iMC < 17 ){
			System.out.println("Infrapeso");
		} else if(iMC >= 17 && iMC<18) {
			System.out.println("Bajo peso");
		} else if (iMC >= 18 &&  iMC < 25) {
			System.out.println("Peso normal (saludable)");
		}else if (iMC >= 25 && iMC < 30) {
			System.out.println("Sobrepeso (obesidad de grado I)");
		}else if (iMC >= 30 && iMC < 35) {
			System.out.println("Sobrepeso crónico (obesidad de grado II)");
		}else if (iMC >= 35 && iMC < 40) {
			System.out.println("Oesidad premórbida (obesidad de grado III)");
		}else {
			System.out.println("Obesidad mórbida (obesidad de grado IV)");
		}
		
		System.out.println("Gracias por usar el programa :)");
	}

}
