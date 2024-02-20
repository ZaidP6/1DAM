package ejemplo04_map;

import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Map<String, String> lista = new HashMap<>();
		//En esta interfaz en vez de usar un metodo add se usa put.
		/*
		Set<String> listaClaves = lista.keySet();
		Collection listaValores = lista.values(); //Aqui se usa la inferencia de datos
		//Collection<String> listaValores2 = lista.values(); //Aqui no se usa la inferencia de datos
		
		lista.put("Uno", "One");
		lista.put("Dos", "Two");
		lista.put("Uno", "Ummmm"); // Machaca el valor de la primera linea porque tiene la misma clave.
		lista.put("Tres", "One");
		
		System.out.println(lista);
		System.out.println(listaClaves);
		System.out.println(listaValores);
		
		//  ???
		
		*/
		Set<Entry<String, String>> listaEntrySet = lista.entrySet(); //Es un Set pero con las parejas, no solo con las ids o los values.
		
		Map< Integer, Alumno> listaAlumnos = new HashMap<Integer, Alumno>();
		Alumno a = new Alumno (3, 4.23, "Ruiz");
		
		listaAlumnos.put(6, a);  //new Alumno(1, 7.5, "Zaid"));
		
		System.out.println(listaAlumnos);
		a.setNombre("Rafa");
		System.out.println(listaAlumnos);
		
		
	}

}
