package ejercicio05;

import utilidades.Leer;

public class Copiado {

	private String frase;
	private int nVeces;
		
		
		
	public Copiado(String frase,int nVeces) {
			this.frase = frase;
			this.nVeces = nVeces;
	}
		
	/*
	 * public void leerFrase(String frase) {
		frase = Leer.dato();
	}
	 */
	
	// NUNCA SE DEE EN UN MÉTODO
	
	/*
	 * public int leerNumero(int nVeces){
		nVeces = Leer.datoInt();
		return nVeces;
		
	}
	 */
		
	public void imprimirFrases( ) {
		
		for (int i = 0; i < nVeces; i++) {
			System.out.println(frase);;
		}
	}
		
		
}
