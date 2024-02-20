package ejemplo_abidimensional01;

import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int col, fil, hasta, desde;
		int [] [] bidimensionales;
		int [][] lista2 = {{6,3,5,2,5,3}, {45,758,26,745,86},{5,74,21,36,94,10}};
		Random rdm = new Random (System.nanoTime());
		
		System.out.println("¿Cuántas columnas quiere?");
		col = Leer.datoInt();
		System.out.println("¿Cuántas filas quiere?");
		fil = Leer.datoInt();
		System.out.println("Indique el número menor");
		desde = Leer.datoInt();
		System.out.println("Indique el número mayor");
		hasta = Leer.datoInt();
		
		bidimensionales = new int [fil][col];
		
		
		for (int i = 0; i < bidimensionales.length; i++) {
			for (int j = 0; j < bidimensionales[i].length; j++) {
				
				bidimensionales [i][j] = rdm.nextInt(hasta - desde +1)+desde;
			}
		}
		
		for (int i = 0; i < bidimensionales.length; i++) {
			for (int j = 0; j < bidimensionales[i].length; j++) {
				
				System.out.print(bidimensionales[i][j]+"\t\t");
			}
			System.out.println("");
			System.out.println("");
		}
		
		System.out.println("---------------------------------------------------------------------");
		
		for (int i = 0; i < lista2.length; i++) {
			for (int j = 0; j < lista2[i].length; j++) {
				System.out.print(lista2[i][j]+"\t\t");
			}
			System.out.println();
		}
		
		
	}

}
