package ejemplo01;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Principal {

	
	
	public static void main(String[]args) {
		
		List<String> lista = new ArrayList<String>();
		lista.add("Weird");lista.add("Weird");lista.add("Weird");lista.add("Weird");lista.add("Weird");
		lista.add("Weird");lista.add("Weird");lista.add("Weird");lista.add("Weird");lista.add("Weird");
		lista.add("Weird");lista.add("Weird");lista.add("Weird");lista.add("Weird");lista.add("Weird");
		lista.add("Weird");lista.add("Weird");lista.add("Weird");lista.add("Weird");lista.add("Weird");
		lista.add("Weird");lista.add("Weird");lista.add("Weird");lista.add("Weird");lista.add("Weird");
		
		
		//No hace falta implementar la interfaz, se declara como un objeto.
		IBienvenida bienvenida = x -> System.out.println(x);
		
		int e = 3;
		
		ISuma suma = z -> z+2;
		
		System.out.println(suma.sumar(e));
		
		
		
		
		
		Supplier <Double> kmR = () -> Math.random();
		for (int i = 0; i < lista.size(); i++) {
			kmR.get();
		}
		
		Consumer <String> mostrarPalabra = p -> System.out.println(p);
		for (String palabra : lista) {
			mostrarPalabra.accept(palabra);
			
		}
		
		
		
		
	}
	
	
	
	
}
