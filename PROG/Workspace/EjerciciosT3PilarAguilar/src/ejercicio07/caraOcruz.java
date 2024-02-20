package ejercicio07;

import java.util.Random;

/*
 * Crear un programa que simule el juego de cara o cruz. Para ello, se usarán los siguientes métodos:
	• Método que simule el lanzamiento de la moneda y resultado.
	• Método para comprobar ganador, se le pasará el número elegido por el jugador y dentro se generará 
	  el aleatorio llamando al método anterior. Devuelve true si son iguales o false si no.
	• Un método para mostrar en bonito el ganador. Si se le pasa true mostrar un mensaje de ganador y si 
	  no, debe mostrar "Siga jugando".
	• En el main, se debe crear lo necesario para simular un juego de cara o cruz.
 */




public class caraOcruz {
	
	
	
	
	public int genenarLado() {
		Random rdm;
		int num, hasta = 2, desde = 1;
		rdm = new Random(System.nanoTime());
		num =rdm.nextInt(hasta-desde+1)+desde;
		return num;
	}
	
	public void mostrarResultado() {
		
		if(genenarLado()== 1) {
			System.out.println("Ha salido cara.");
		}else
			System.out.println("Ha salido cruz.");
	}
	
	public boolean comprobarAcierto(int eleccion) {
		if (genenarLado() == eleccion) {
			return true;
		}else
			return false;
	
	}
	
	public void mostrarAcierto(int eleccion) {
		if(comprobarAcierto(eleccion)) {
			System.out.println("¡Enhorabuena! Ha acertado.");
		}else
			System.out.println("Vaya...Otra vez será.");
	}

}
