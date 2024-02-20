package ejercicio04;

import java.util.HashMap;
import java.util.Map;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Contacto c1 = new Contacto("Pablo", "Romero", "+34 684591276");
		var c2 = new Contacto("Carlos", "Rodríguez", "+34 634418829");
		var c3 = new Contacto("Nombre3", "Apellido3", "+34 745124511");
		Map<Contacto, String> lista = new HashMap<Contacto, String>();
		
		lista.put(c1, null);
		
	}

}
