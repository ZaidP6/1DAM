package ejemploswitch;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int op, op2;
		
		
		System.out.println("----------------------------------------------------------------");
		System.out.println("");
		System.out.println("Elija una opción del menú (sólo el número):");
		System.out.println("");
		System.out.println("1 - Comer un serranito.");
		System.out.println("2 - Sólo café para hoy.");
		System.out.println("3 - Un montaito y una cerveza");
		System.out.println("4 - Estoy a dieta, una ensalada.");
		System.out.println("0 - Salir.");
		System.out.println("");
		System.out.println("----------------------------------------------------------------");
		System.out.println("");
		
		
		op = Leer.datoInt();
		
		switch (op) {
			case 1:
				System.out.println("Aquí tiene su serranito, que lo disfrute.");
				System.out.println("Escriba un número aleatorio entre 1 y 3 para saber si tiene regalo.");
				op2 = Leer.datoInt();
				
				switch (op2) {
					case 1:
							System.out.println("Vaya...No ha habido suerte.");
						break;
					
					case 2:
						System.out.println("Enhorabuena! Ha ganado una mochila!");
						break;
						
					case 3: 
						System.out.println("Enhorabuena! Ha ganado una botella de Spiderman!");
						break;
	
					default:
						System.out.println("Número erróneo, ha perdido la oportunidad.");
						break;
				}
				break;
			
			case 2:
				System.out.println("Mejor tome un café para que se despierte.");
				break;
				
			case 3:
				System.out.println("La verdad es que ese montaito y la cerveza entraría muy bien.");
				break;
				
			case 4:
				System.out.println("Ánimo con la dieta, que disfrutes las ensalada.");
				break;
				
			case 0:
				System.out.println("Una pena si no quiere nada, vuelva otro día.");
				break;

			default:
				System.out.println("Erroooooooorrr, tienes que pulsar un número de esos, no el que tú quieras.");
				break;
		}
		
		System.out.println("");
		System.out.println("Gracias por elegirnos:)");
		
	}

}
