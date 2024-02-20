package ejemplo06_ordenar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//realmente esta lista deberia estar en la clase carrera, y ésta tener un array de corredores
		
		List<Corredor> listaCorredores = new ArrayList<Corredor>();
		
		listaCorredores.add(new Corredor(7, 2.34, "Ángel Naranjo"));
		listaCorredores.add(new Corredor(2, 2.59, "Rafa Villar"));
		listaCorredores.add(new Corredor(13, 1.34, "Zaid"));
		listaCorredores.add(new Corredor(4, 3.34, "Luismi"));
		listaCorredores.add(new Corredor(1, 1.22, "Usaint Bolt"));
		listaCorredores.add(new Corredor(26, 5.34, "Fanegas"));
		listaCorredores.add(new Corredor(9, 15.50, "Dani"));
		listaCorredores.add(new Corredor(5, 1.58, "Pablo"));
		
		
		
		//esto debe estar en el switch como case
		Collections.sort(listaCorredores, new ComparaPorMarca());
		
		
		
	}

}
