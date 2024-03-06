package ejercicio01;

import java.util.Comparator;

public class ComparaPorPuntuacion implements Comparator<Carta>{

	@Override
	public int compare(Carta c1, Carta c2) {
			if (c1.getPuntos()<c2.getPuntos()) {
				c1.compareTo(c2);
				return -1;
			}else{
				return 1;
			}
	}

	

}
