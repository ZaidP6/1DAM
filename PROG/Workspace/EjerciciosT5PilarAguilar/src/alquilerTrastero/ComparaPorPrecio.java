package alquilerTrastero;

import java.util.Comparator;

public class ComparaPorPrecio implements Comparator<Trastero>{

	@Override
	public int compare(Trastero t1, Trastero t2) {
		// TODO Auto-generated method stub
		return -Double.compare(t1.getPrecio(), t2.getPrecio());
	}

}