package ejercicio07;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int eleccion;
		caraOcruz obj1 = new caraOcruz();
		

		System.out.println("Bienvenido");
		System.out.println("");
		
		menu();
		eleccion = Leer.datoInt();
		
		obj1.genenarLado();
		obj1.mostrarResultado();
		obj1.comprobarAcierto(eleccion);
		obj1.mostrarAcierto(eleccion);
		
		
		
		
		
		
	}

	static void menu() {
		System.out.println("""
				-----------------------------------------------------
				
				Elija una de las siguientes opciones:
				
				1 - Cara
				2 - Cruz
				
				-----------------------------------------------------
				
				""");
	}
	
	
	
}
