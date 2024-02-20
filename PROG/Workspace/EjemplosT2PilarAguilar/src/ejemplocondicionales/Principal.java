package ejemplocondicionales;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num1, num2, tope = 5;
		
		System.out.println("Escriba el primer número.");
		num1 = Leer.datoInt();
		
		if (num1>=tope) {
			System.out.println("Aprobado!");
		} else
			System.out.println("Suspenso!");
		
		
		System.out.println("Escriba el segundo número");
		num2 = Leer.datoInt();
		
		
		
		if (num2<tope) {
			System.out.println("Vaya...Has sacado un " + num2 + " en el examen de mates.");
		}else
			System.out.println("Estupendo!! Tienes un " + num2 + " en el examen de programación.");
		
		System.out.println("");
		System.out.println("Bye bye!");
		
	}

}
