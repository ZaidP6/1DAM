package ejemplo02;

import java.util.ArrayList;
import java.util.HashMap;

public class Principal {
    public static void main(String[] args) {
    	
        // Ejemplo de inferencia de tipo con ArrayList
    	
        var listaDeNumeros = new ArrayList<Integer>(); // No es necesario especificar el tipo del ArrayList
        listaDeNumeros.add(10);
        listaDeNumeros.add(20);
        listaDeNumeros.add(30);

        // Ejemplo de inferencia de tipo con HashMap
        var listaDeNombres = new HashMap<Integer, String>(); // No es necesario especificar el tipo del HashMap
        listaDeNombres.put(1, "Juan");
        listaDeNombres.put(2, "María");
        listaDeNombres.put(3, "Carlos");

        // Imprimir lista
        System.out.println("Elementos de la lista:");
        for (var elemento : listaDeNumeros) {
            System.out.println(elemento);
        }

        // Imprimir HashMap
        System.out.println("\nElementos del mapa:");
        for (var entry : listaDeNombres.entrySet()) {
            System.out.println("Clave: " + entry.getKey() + ", Valor: " + entry.getValue());
        }
    }
}
