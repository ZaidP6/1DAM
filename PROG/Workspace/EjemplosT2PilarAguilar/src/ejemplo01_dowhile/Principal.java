package ejemplo01_dowhile;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num, tope;
		
		//Preguntar que número queremos que nos repita
		
		System.out.println("Bienvenido");
		System.out.println("Escriba un número cualquiera ó 0 para salir.");
		do {
			
			num = Leer.datoInt();
			
			if(num!=0) {
				System.out.println(num);
			}
			
			
		}while(num != 0);
		
		System.out.println("Ha salido del programa.");
//------------------------------------------------------------------------------------------------------------------
		
		//Repetir un número hasta que coincida con el tope
		
		
		System.out.println("Indique un tope");
		tope = Leer.datoInt();
		
		do{
			
			System.out.println(num++ + 1);
			
			
		}while(num != tope);
		
		System.out.println("Adiós");
		
		
	}

}
