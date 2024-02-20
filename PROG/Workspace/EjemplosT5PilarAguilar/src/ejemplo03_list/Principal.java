package ejemplo03_list;

import java.util.ArrayList;
import java.util.List;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String dni;
		
		
		
		List<Persona>listaPersonas = new ArrayList<Persona>();
		CrudPersona c = new CrudPersona(listaPersonas);
		
		listaPersonas.add(new Persona("Pilar", 25, "77868489B"));
		listaPersonas.add(new Persona("Angel", 36, "123456789A"));
		System.out.println(listaPersonas);
		System.out.println(listaPersonas.get(0));
		
		System.out.println("Introduzca el dni a buscar");
		dni = Leer.dato();
		
		System.out.println(c.findByDni(dni));
		
	}

}
