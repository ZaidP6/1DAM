package ejemplo_arrays;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] edades;
		int tam, suma = 0, media, pos;
		
		
		//pedimos tamaño
		System.out.println("Diga el tamaño del array");
		tam = Leer.datoInt();
		
		//instanciamos array
		edades = new int [tam];
		
		//rellenamos array por teclado
		
		for (int i = 0; i < edades.length; i++) {
			System.out.println("Introduce una edad");
			edades[i] = Leer.datoInt();
		}
		
		//Recorremos array para mostrar
		for (int i = 0; i < edades.length; i++) {
			System.out.println("En la casilla "+(i+1)+" hay guardado un "+ edades[i]);
		}
		
		//sumar todos los elementos
		for (int i = 0; i < edades.length; i++) {
			suma+=edades[i];
		}
		System.out.println("La suma de las edades es: " + suma + " años.");
		media = suma / tam;
		System.out.println("La media de las edades es de: "+media + " años.");
		
		System.out.println("Diga la posición que desea mostrar.");
		pos = Leer.datoInt() - 1;
		if(pos > tam && pos < 1) {
			System.out.println("En la posición " +(pos+1)+ " hay un " + edades[pos]);
		}else
			System.out.println("Número no válido");
		
		
		// modificar valor elegido por el usuario
		System.out.println("Qué posición desea modificar");
		pos = Leer.datoInt() -1;
		System.out.println("Introduce el nuevo valor.");
		edades[pos] = Leer.datoInt();
		
		//Recorremos array para mostrar
			for (int i = 0; i < edades.length; i++) {
				System.out.println("En la casilla "+(i+1)+" hay guardado un "+ edades[i]);
			}
		
	}

}
