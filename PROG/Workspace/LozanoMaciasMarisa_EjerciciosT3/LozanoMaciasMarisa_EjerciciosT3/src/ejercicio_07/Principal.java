package ejercicio_07;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Crear un programa que simule el juego de cara o cruz. Para ello, se usarán los siguientes métodos:
		 * 
			•Método que simule el lanzamiento de la moneda y resultado.
			•Método para comprobar ganador, se le pasará el número elegido por el jugador y dentro se generará el aleatorio llamando al método anterior. 
				Devuelve true si son iguales o false si no.
			•Un método para mostrar en bonito el ganador. Si se le pasa true mostrar un mensaje de ganador y si no, debe mostrar "Siga jugando".
			•En el main, se debe crear lo necesario para simular un juego de cara o cruz.*/
		
		
		int op,cara=0,hasta=2,desde=1, num;
		Moneda mon1 = new Moneda(cara);
		boolean lanzamiento;
		
		System.out.println();
		System.out.println("*************************************************************************************************************************");
		System.out.println("                                    Bienvenido al programa 'Cara o Cruz                                                  ");
		System.out.println("*************************************************************************************************************************");
		System.out.println();
		
		do {
			
		
			System.out.println("""
					-------------------------------------------------------------------------------------------------------------------------
											1. Para jugar
											0. Para salir
					-------------------------------------------------------------------------------------------------------------------------
					""");
			op=Leer.datoInt();
			
			switch(op){
				case 1:
					System.out.println("Pulse 1 para cara o 2 para cruz");
					
					num=Leer.datoInt();
					System.out.println(mon1.lanzarMoneda(hasta, desde)); 
					mon1.imprimirResultado(mon1.comprobarLanzamiento(num, desde, hasta));
				
					break;
				case 0:
					System.out.println("Saliendo...........");
					break;
				default:
					System.out.println("Esa opción no es válida, por favor pulse 1 para jugar o 0 para salir");
					break;
			}
		
		}while (op!=0);
	}


}


