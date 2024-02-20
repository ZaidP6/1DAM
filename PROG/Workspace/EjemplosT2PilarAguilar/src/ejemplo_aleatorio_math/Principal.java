package ejemplo_aleatorio_math;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int tope, min, op;
		double num;
		
		System.out.println("Bienvenido al dado");
		
		
		do {
			System.out.println("--------------------------------------------------");
			System.out.println("");
			System.out.println("¿Quiere tirar el dado?");
			System.out.println("1 - Sí");
			System.out.println("0 - No");
			op = Leer.datoInt();
			System.out.println("");
			System.out.println("--------------------------------------------------");
			System.out.println("");
			
			if(op == 1) {
				
				
				//Aleatorio con Math.random y usando Math.floor para redondear a la baja
				System.out.println("Diga hasta qué numero quiere llegar.");
				tope =Leer.datoInt();
				System.out.println("Diga desde qué número quiere empezar.");
				min = Leer.datoInt();
				
				num = (int)Math.floor(Math.random()*tope + min);
				
				System.out.println("Su número aleatorio es...");
				System.out.printf("---------- %.0f ----------\n", num);
				System.out.println("");
				
			}else
				System.out.println("Vaya...");
			
			
		} while (op!=0);
			 
			System.out.println("Gracias por usar el dado");
		
	}

}
