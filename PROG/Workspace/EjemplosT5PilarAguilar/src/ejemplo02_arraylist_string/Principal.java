package ejemplo02_arraylist_string;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int indiceNoProgramador = -1;

		List<String> lista = new ArrayList<String>();
		lista.add("Pilar");
		lista.add("Carlos");
		
		//Imprime la lista completa
		System.out.println(lista);
		
		//Cantidad de objetos que hay en el array
		System.out.println(lista.size());
		
		 //Imprimir si la cadena Pilar está en lista.
		// Contains solo devuelve un boolean
		 
		System.out.println(lista.contains("Pilar"));
		
		//Borramos un objeto de un indice.
		lista.remove(2 + indiceNoProgramador);
		System.out.println(lista);
		
		//Cantidad de objetos que hay en el array
		System.out.println(lista.size());
		
		
	}

}
