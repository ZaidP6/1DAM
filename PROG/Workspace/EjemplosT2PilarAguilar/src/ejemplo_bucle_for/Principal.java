package ejemplo_bucle_for;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tope;
		String frase;
		
		//Primero se declara la variable i en el primer apartado, esa parte  es "desde dónde empieza a contar"
		//Segundo se indica la condición de "hasta cuándo" va a ir, es decir, "dónde para el bucle"
		//Tercero se indica de cuánto en cuánto va el contador, en este caso es el "incremento". De uno en uno, de dos en dos...
		
		System.out.println("¿Qué palabra o frase quire que se muestre?");
		frase = Leer.dato();
		System.out.println("¿Cuántas veces quiere que se repita?");
		tope = Leer.datoInt();
		
		for(int i =0;i<tope;i++) {
			System.out.println(frase);
		}
		
		
		
		
	}

}
