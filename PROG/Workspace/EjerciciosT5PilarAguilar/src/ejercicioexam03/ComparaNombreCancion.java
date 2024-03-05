package ejercicioexam03;

import java.util.Comparator;

public class ComparaNombreCancion implements Comparator<Cancion>{

	
	@Override
	public int compare(Cancion c1, Cancion c2) {
		
		return c1.getTitulo().compareToIgnoreCase(c2.getTitulo());
	}
}
