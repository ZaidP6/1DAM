package ejercicioexam03;

import java.util.Comparator;

public class comparaPorDuracion implements Comparator<Cancion>{

	@Override
	public int compare(Cancion c1, Cancion c2) {
		
		return Double.compare(c1.getDuracion(), c2.getDuracion());
	}
	
	public int compareTo(Cancion c) {
		if(this.getDuracion() < c.getDuracion()) {
			return -1;
		}else if (this.getDuracion() > c.getDuracion()) {
			return 1;
		}
		return 0;
	}

}
