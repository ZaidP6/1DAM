package ejemplo09_pasodeargumentosydevoluciondearrays;

import java.util.Random;

public class Listas {

	
	public void rellenarAleatorio(int desde, int hasta, int [] lista1) {
		Random rdm = new Random (System.nanoTime());
		
		for (int i = 0; i < lista1.length; i++) {
			lista1[i] = rdm.nextInt(hasta -desde +1)+desde;
		}
	}
	
	public void mostrarLista(int [] lista1) {
		for (int i = 0; i < lista1.length; i++) {
			System.out.println(lista1[i]);
		}
	}
	
	public int[] trucarLista(int []lista2) {
		int diez = 10;
		for (int i = 0; i < lista2.length; i++) {
			lista2[i] = diez;
		}
		return lista2;
	}
	
}
