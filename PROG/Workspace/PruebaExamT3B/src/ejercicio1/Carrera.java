package ejercicio1;

import java.util.Arrays;

public class Carrera {

	private Corredor []listaCorredores;
	private int numCorredores;
	private double kilometros;
	
	public Carrera(Corredor[] listaCorredores, int numCorredores, double kilometros) {
		super();
		this.listaCorredores = listaCorredores;
		this.numCorredores = numCorredores;
		this.kilometros = kilometros;
	}
	public Corredor[] getListaCorredores() {
		return listaCorredores;
	}
	public void setListaCorredores(Corredor[] listaCorredores) {
		this.listaCorredores = listaCorredores;
	}
	public double getKilometros() {
		return kilometros;
	}
	public void setKilometros(double kilometros) {
		this.kilometros = kilometros;
	}
	
	
	public int getNumCorredores() {
		return numCorredores;
	}
	public void setNumCorredores(int numCorredores) {
		this.numCorredores = numCorredores;
	}
	
	
	@Override
	public String toString() {
		return "Carrera [listaCorredores=" + Arrays.toString(listaCorredores) + ", numCorredores=" + numCorredores
				+ ", kilometros=" + kilometros + "]";
	}
	public void agregarCorredor(Corredor c) {
		
		listaCorredores[numCorredores] = c;
		numCorredores++;
			

	}
	
}
