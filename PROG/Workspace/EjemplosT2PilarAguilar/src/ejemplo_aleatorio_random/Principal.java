package ejemplo_aleatorio_random;

import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Random rdn = new Random(System.nanoTime());
		int hasta, desde, num, tope, uno = 1;
		
		System.out.println("¿Cuántos números quiere obtener?");
		tope = Leer.datoInt();
		
		System.out.println("Diga hasta qué valor quiere llegar.");
			hasta = Leer.datoInt();
			System.out.println("Diga desde qué valor quiere empezar.");
			desde = Leer.datoInt();
			
			
		for (int i = 0; i < tope; i++) {
			
			
			num = rdn.nextInt(hasta - desde + uno) + desde;
			
			System.out.printf("---------- %d ----------\n", num);
			System.out.println("");
		}
		
	}

}
