package ejercicio_ar04;

import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tam = 4, hasta = 99, desde = 0, suma=0;
		double media;
		int [] num = new int [tam];
		String [] nombres= {"Pilar", "Ángel", "Miguel", "Rafa"};
		
		
		Random rdm = new Random (System.nanoTime());
		
		
		for (int i = 0; i < num.length; i++) {
			num [i] = rdm.nextInt(hasta -desde +1)+desde;
		}
		
		for (int i = 0; i < nombres.length; i++) {
			System.out.print(nombres[i]+"\t\t");
		}
		System.out.println("");
		System.out.println("-----\t\t-----\t\t-----\t\t-----");
		
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]+"\t\t");
		}
		
		for (int i = 0; i < num.length; i++) {
			suma+=num[i];
		}
		
		media = (double) suma / num.length;
		System.out.print("\nLa media de las edades es ");
		System.out.println("\t"+media);
		
		
	}

}
