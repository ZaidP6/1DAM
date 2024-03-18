package pruebaexamen03;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tarta tarta;
		int op, num, extraNum;
		String sabor;
		double volumenLitros;
		boolean extra;
		System.out.println("bienvenido");
		
		
		do {
			menu();
			op = Leer.datoInt();
			
			switch (op) {
				case 1:
					System.out.println("Indique num tarta");
					num = Leer.datoInt();
					System.out.println("Indique el sabor");
					sabor = Leer.dato();
					System.out.println("Indique el volumen en litros");
					volumenLitros = Leer.datoDouble();
					System.out.println("Indique si lleva extra con '1' o '0' si no lleva");
					extraNum = Leer.datoInt();
					if (extraNum == 1) {
						extra = true;
					}else if(extraNum == 0){
						extra = false;
					}else {
						System.out.println("Dato erróneo, por tanto no llevará extra");
						extra = false;
					}
					break;
				case 2:
					
					break;
				default:
					break;
			}
			
		} while (op!=0);
	}

	public static void menu() {
		System.out.println("""
				Elija una opción:
				
				1 - Crear una tarta
				2 - 
				0 -  salir
				""");
	}
	
}
