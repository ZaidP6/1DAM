package ejemplo06_ordenar;

import java.util.Comparator;

public class ComparaPorMarca implements Comparator<Corredor>{

	
	//Compararamos 2 objetos de tipo corredor
	@Override
	public int compare(Corredor c1, Corredor c2) {
		
		if (c1.getMarca() < c2.getMarca()) {
			return -1;
		}else {
			if (c1.getMarca() > c2.getDorsal()) {
				return 1;
			}
			return 0;
		}
	}

	
	
	
}
