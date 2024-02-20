package ejercicio_07;

import java.util.Random;

public class Moneda {
	
	/*Crear un programa que simule el juego de cara o cruz. Para ello, se usarán los siguientes métodos:
	•Método que simule el lanzamiento de la moneda y resultado.
	•Método para comprobar ganador, se le pasará el número elegido por el jugador y dentro se generará el aleatorio llamando al método anterior. 
		Devuelve true si son iguales o false si no.
	•Un método para mostrar en bonito el ganador. Si se le pasa true mostrar un mensaje de ganador y si no, debe mostrar "Siga jugando".
	•En el main, se debe crear lo necesario para simular un juego de cara o cruz.*/

	private int cara;
	
	//Constructor
	public Moneda(int cara) {
		super();
		this.cara = cara;
	}
	//Getters and Setters
		public int getCara() {
		return cara;
	}
	
	public void setCara(int cara) {
		this.cara = cara;
	}
	
	//to String
	public String toString() {
		return "Moneda [cara=" + cara + "]";
	}
	
	public int lanzarMoneda(int hasta, int desde) {
		Random rnd= new Random (System.nanoTime());
	
	return rnd.nextInt(hasta-desde+1)+desde;
	
	
	}
	
	public boolean comprobarLanzamiento(int num, int desde, int hasta) {
		boolean lanzamiento;
	
	
		if(lanzarMoneda(desde,hasta)==num){
		
			lanzamiento=true;
		
		}
	
		else {
			lanzamiento=false;
		
		}
	
		return lanzamiento;
	}
	
	public void imprimirResultado(boolean lanzamiento) {
	
		if(lanzamiento==true) {
		
			System.out.println("Ha resultado usted ganador");
		}
		else {
			System.out.println("Siga jugando");
		}
		}
	
	
	}
