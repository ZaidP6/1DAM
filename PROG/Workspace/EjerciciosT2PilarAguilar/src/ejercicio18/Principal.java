package ejercicio18;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Haga un programa de la interfaz de un cajero automático. Tendrá las opciones, ver saldo, 
			retirar dinero, comprar entradas e ingresar dinero. En cada opción se pedirán los datos 
			necesarios y se realizarán las operaciones adecuadas. El coste de las entradas se debe restar al 
			saldo de dicha cuenta. La cuenta será creada por nosotros con un saldo inicial concreto.
		 */
		int op, cantEntrada;
		double saldo = 258.36, retirada, pEntrada = 28.67, totEntrada, ingreso;
		
		
		
		System.out.println("Bienvenido al cajero.");
		
		do {
			
			System.out.println("--------------------------------------------------");
			System.out.println("");
			System.out.println("Elija una opción:");
			System.out.println("1 - Ver saldo");
			System.out.println("2 - Retirar dinero");
			System.out.println("3 - Comprar entradas");
			System.out.println("4 - Ingresar dinero");
			System.out.println("0 - Salir");
			System.out.println("");
			System.out.println("--------------------------------------------------");
			 op= Leer.datoInt();
			 
			 switch (op) {
			 	case 1:
			 		System.out.printf("La cuenta tiene ahora mismo %.2f€.\n", saldo);
			 		break;
			 		
			 	case 2:
			 		System.out.println("¿Cuánto desea retirar?");
			 		retirada = Leer.datoDouble();
			 		if(retirada<=saldo) {
			 			saldo -=retirada; 
			 			System.out.printf("Ha retirado %.2f€, tiene en cuenta ahora mismo %.2f€.\n", retirada, saldo);
			 		}
			 		break;
			 		
			 	case 3:
			 		System.out.println("¿Cuántas entradas desea comprar?");
			 		cantEntrada = Leer.datoInt();
			 		totEntrada = pEntrada * cantEntrada;
			 		if (totEntrada<=saldo) {
			 			saldo-=totEntrada;
						System.out.printf("Ha comprado las entradas por un valor de %.2f€ y en su cuenta quedan %.2f€.\n", totEntrada, saldo);
			 		}else
			 			System.out.println("Lo siento, no tiene dinero suficiente.");
			 		break;
			 		
			 	case 4:
			 		System.out.println("¿Cuánto dinero desea ingresar?");
			 		ingreso = Leer.datoDouble();
			 		saldo += ingreso;
			 		System.out.printf("Estupendo! Se ha añadido %.2f€ a su cuenta. Ahora tiene %.2f€.\n", ingreso, saldo);
			 		break;
			 		
			 	case 0:
			 		System.out.println("Ha salido correctamente.");
			 		break;
			 		
			 	default:
			 		System.out.println("Error, pruebe de nuevo.");
			 		break;
			}
			
			
		}while(op!=0);
		
		System.out.println("Gracias por usar el cajero.");
		
		
		
	}

}
