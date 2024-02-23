package ejemplo02;

import java.util.ArrayList;
import java.util.HashMap;

public class EjemploInferenciaValida {

	public static void main(String[] args) {

		//Ejemplo con variables simples:
		
		var numeroEntero = 10;  // inferencia para tipo integer
		var texto = "Prueba de inferencia";  // inferencia para tipo cadena de caracteres
		var pi = 3.14; //inferencia para tipo flotante
		
		
		
		System.out.println("Número entero: "+numeroEntero);
		System.out.println("Texto: "+texto);
		System.out.println("Número doble: "+pi);
		
		
		// Inferencia de tipo con ArrayList
        var list = new ArrayList<String>();
        list.add("Java");
        list.add("Python");
        // list.add(10); // Esto daría un error de compilación, ya que la lista es de tipo String

        // Inferencia de tipo con HashMap
        var map = new HashMap<Integer, String>();
        map.put(1, "Lunes");
        map.put(2, "Martes");

        // Iterando sobre el mapa
        for (var entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
		
		
	}

}
