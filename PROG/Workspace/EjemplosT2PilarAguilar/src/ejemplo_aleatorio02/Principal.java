package ejemplo_aleatorio02;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tam = 4, pos;
		
		
	
		// Primera forma de crear Array
		int [] edades;
		edades = new int [tam];
		
		
		//segunda forma
		
		int [] edades2 = new int [tam];
		
		//tercera forma, inicializando con valores (cascaporras)
		
		int [] edades3 = {20,18,45,75,65,3,14,25,27,30,51,48};
		
		//Guardar valores
		
		edades [2] = 47;
		
		System.out.println(edades[2]);
		
		
		System.out.println("¿En qué casilla desea guardar la edad?");
		pos = Leer.datoInt() - 1;
		System.out.println("¿Qué edad desea guardar?");
		edades[pos] = Leer.datoInt();
		
		for (int i = 0; i < edades.length; i++) {
			System.out.println(edades[i]);
		}
	}

}
