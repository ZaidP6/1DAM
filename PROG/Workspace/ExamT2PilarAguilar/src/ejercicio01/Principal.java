package ejercicio01;

import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int op, tam = 8, hasta, desde, suma = 0, menosMil = 0, mil = 1000, totPers = 2500000, cien = 100;
		int provinciaNum, votosAdd, mayorVotos = 0, iMayorVotos = 0;
		int [] votos = new int [tam];
		String [] provincias = {"Sevilla", "Cádiz", "Huelva", "Málaga", "Almería", "Granada", "Córdoba", "Jaén"};
		double porcentajeVotos,mediaVotos;
		Random rdm = new Random (System.nanoTime());
		
		
		System.out.println("--------------------------------------------------------------------");
		System.out.println("");
		System.out.println("Bienvenidos al SUPER EXAMEN de nuestra asignatura favorita^^");
		System.out.println("");
		System.out.println("--------------------------------------------------------------------");
		
		do {
			System.out.println("");
			System.out.println("Elija una opción.");
			System.out.println("""
					
					--------------------------------------------------------------------
					
					1. Generar votos aleatorios para cada provincia.
					2. Mostrar los votos en cada provincia.
					3. Mostrar el total de votos.
					4. Cantidad de provincias con menos de 1000 votos.
					5. Porcentaje de votos según población Andalucía.
					6. Añadir votos a una provincia - Pucherazo.
					7. Media de votos totales por provincia.
					8. La provincia que más votos ha conseguido.
					0. Salir
					
					--------------------------------------------------------------------
					
					""");
			
			op = Leer.datoInt();
			
			switch (op) {
				case 1: //generar los votos
					System.out.println("Indique el menor número de votos.");
					desde = Leer.datoInt();
					System.out.println("Indique el mayor númeor de votos");
					hasta = Leer.datoInt();
					
					for (int i = 0; i < votos.length; i++) {
						votos[i] = rdm.nextInt(hasta -desde +1)+desde;
					}
					
					break;
					
				case 2://mostrar votos por provincias.
					for (int i = 0; i < provincias.length; i++) {
						System.out.print(provincias[i] + "\t\t");
					}
					System.out.println("");
					for (int i = 0; i < votos.length; i++) {
						System.out.print(votos[i] + "\t\t");
					}
					System.out.println("");
					break;
				
				case 3: //Mostrar el total de votos.
					for (int i = 0; i < votos.length; i++) {
						suma+=votos[i];
					}
					System.out.println("Han votado un total de " + suma + " personas.");
					break;
					
				case 4: //Cantidad de provincias con menos de 1000 votos.
					for (int i = 0; i < votos.length; i++) {
						if(votos[i]<mil) {
							menosMil++;;
						}
					}
					System.out.println("Un total de " + menosMil + " provincias tienen menos de " + mil + " votos.");
					break;
					
				case 5: // Porcentaje de votos según población Andalucía.
					for (int i = 0; i < votos.length; i++) {
						suma+=votos[i];
					}
					porcentajeVotos = (suma * cien) / totPers;
					System.out.printf("Ha votado un %.2f%% de la población.\n", porcentajeVotos); 
					break;
					
				case 6: //Añadir votos, pucherazo.
					System.out.println("Elija la provincia a la que desea añadir votos.");
					System.out.println("""
							
							1. Sevilla
							2. Cádiz
							3. Huelva
							4. Málaga
							5. Almería
							6. Granada
							7. Córdoba
							8. Jaén
							
							""");
					provinciaNum = Leer.datoInt() - 1;
					System.out.println("¿Cuántos votos desea añadir?");
					votosAdd = Leer.datoInt();
					
					votos[provinciaNum]+= votosAdd;
					
					System.out.println("La provincia "+ provincias[provinciaNum] + " ahora tiene " + votos[provinciaNum] + " votos.");
					
					break;
					
				case 7://Media de votos totales por provincia.
					
					for (int i = 0; i < votos.length; i++) {
						suma+=votos[i];
					}
					mediaVotos = (double) suma / provincias.length;
					System.out.printf("La media de votos por provincia es de %.0f votos.\n",mediaVotos );
					
					break;
					
				case 8:
					for (int i = 0; i < votos.length; i++) {
						if(i == 0) {
							mayorVotos = votos[i];
						}else {
							if (votos[i]>mayorVotos) {
								mayorVotos = votos[i];
								iMayorVotos = i;
							}
						}
						
					}
					System.out.println("La provincia que más votos ha tenido con un total de " 
							+mayorVotos+ " votos ha sido " + provincias[iMayorVotos]+ ".");
					
					break;
					
				case 0:
					System.out.println("Una pena que quiera marcharse.");
					break;
					
				default:
					System.out.println("Dato erróneo, repita por favor.");
					
					break;
			}
			
			
			
			
		} while (op!=0);
		
		System.out.println("Gracias por usar el programa del SUPER EXAMEN.=)");
		
	}

}
