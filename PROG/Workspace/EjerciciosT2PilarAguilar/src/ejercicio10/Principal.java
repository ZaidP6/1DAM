package ejercicio10;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		int op, cantPers;
		double pSalaVip, pSala3D, pSAlaNormal, pSalaInfantil, precioTotal;
		
		System.out.println("Bienvenido al CINE SALESIANO");
		System.out.println("");
		System.out.println("----------------------------------------------------------------");
		
		
		System.out.println("Indique el precio de la sala Vip.");
		pSalaVip = Leer.datoDouble();
		
		System.out.println("Indique el precio de la sala 3D.");
		pSala3D = Leer.datoDouble();
		
		System.out.println("Indique el precio de la sala normal.");
		pSAlaNormal = Leer.datoDouble();
		
		System.out.println("Indique el precio de la sala infantil.");
		pSalaInfantil = Leer.datoDouble();
		
		System.out.println("");
		System.out.println("----------------------------------------------------------------");
		System.out.println("");
		
		System.out.println("¿Cuántas entradas quiere?");
		cantPers = Leer.datoInt();
		
		
		System.out.println("");
		System.out.println("----------------------------------------------------------------");
		System.out.println("");
		System.out.println("Elija una sala de cine (sólo el número):");
		System.out.println("");
		System.out.printf("1 - SALA VIP - precio entrada: %.2f€\n", pSalaVip);
		System.out.printf("2 - SALA 3D - precio entrada: %.2f€\n", pSala3D);
		System.out.printf("3 - SALA NORMAL - precio entrada: %.2f€\n", pSAlaNormal);
		System.out.printf("4 - SALA INFANTIL - precio entrada: %.2f€\n", pSalaInfantil);
		System.out.println("0 - SALIR");
		System.out.println("");
		System.out.println("----------------------------------------------------------------");
		System.out.println("");
		
		
		
		op = Leer.datoInt();
		System.out.println("");
		System.out.println("----------------------------------------------------------------");
		System.out.println("");
		
		switch (op) {
			case 1:
				precioTotal = cantPers * pSalaVip;
				System.out.printf("Comprando %d entrada/s le sale a %.2f€.\n", cantPers, precioTotal);
				System.out.println("");
				System.out.println("----------------------------------------------------------------");
				break;
			
			case 2:
				precioTotal = cantPers * pSala3D;
				System.out.printf("Comprando %d entrada/s le sale a %.2f€.\n", cantPers, precioTotal);
				System.out.println("");
				System.out.println("----------------------------------------------------------------");
				break;
				
			case 3:
				precioTotal = cantPers * pSAlaNormal;
				System.out.printf("Comprando %d entrada/s le sale a %.2f€.\n", cantPers, precioTotal);
				System.out.println("");
				System.out.println("----------------------------------------------------------------");
				break;
				
			case 4:
				precioTotal = cantPers * pSalaInfantil;
				System.out.printf("Comprando %d entrada/s le sale a %.2f€.\n", cantPers, precioTotal);
				System.out.println("");
				System.out.println("----------------------------------------------------------------");
				break;
				
			case 0:
				System.out.println("Una pena si no le interesa nada de la carelera, vuelva otro día.");
				System.out.println("");
				System.out.println("----------------------------------------------------------------");
				break;

			default:
				System.out.println("Erroooooooorrr, tienes que pulsar un número de esos, no el que tú quieras. Vuele a empezar.");
				System.out.println("");
				System.out.println("----------------------------------------------------------------");
				break;
		}
		
		System.out.println("");
		System.out.println("Gracias por elegir CINE SALESIANO :)");
		
	}

}
