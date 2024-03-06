package ejercicio01;

import java.util.ArrayList;
import java.util.List;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int op = 0;
		Carta c1 = new Carta("as", "picas", 1, 11);
		Carta c2 = new Carta("tres", "corazones", 3, 10);
		Carta c3 = new Carta("sota", "treboles", 10, 2);
		Carta c4 = new Carta("caballo", "rombos", 11, 3);
		Carta c5 = new Carta("rey", "picas", 12, 4);
		
		List<Carta> listaCartas = new ArrayList<Carta>();
		listaCartas.add(c5);
		listaCartas.add(c2);
		listaCartas.add(c4);
		listaCartas.add(c1);
		listaCartas.add(c3);
		Mazo mz = new Mazo(listaCartas);
		
		int num;
		String palo, nuevoNombre;
		ComparaPorPuntuacion com = new ComparaPorPuntuacion();
		
		
		
		
		System.out.println("Bienvenido a la Brisca");
		
		do {
			menu();
			
			op = Leer.datoInt();
			
			switch (op) {
				case 1:
					System.out.println("Indique el número a buscar");
					num = Leer.datoInt();
					System.out.println("Indique el palo a buscar");
					palo = Leer.dato();
					
					mz.mostrarCarta(mz.findByNumPalo(num, palo));
					
					break;
					
				case 2:
					mz.findReturn0();
					break;
				case 3:
					System.out.printf("La puntuación total de tu mazo es de %d puntos!\n", mz.calcularPuntuacion());
					break;
				case 4:
					System.out.println("Indique el número y el palo de la carta seguidos de un enter.");
					num = Leer.datoInt();
					palo = Leer.dato();
					System.out.println("Indique el nuevo nombre");
					nuevoNombre = Leer.dato();
					mz.modificarNombre(mz.findByNumPalo(num, palo), nuevoNombre);
					mz.mostrarCarta(mz.findByNumPalo(num, palo));
					break;
				case 5:
					mz.mostrarLista();
					break;
					
				case 6:
					//mz.mostrarLista(mz.ordenarPorPalos());
					break;
					
				case 7:
					com.compare(c1, c2);
					mz.oredenarPorPuntuacion();
					break;
					
				default:
					break;
			}
			
			
			
		} while (op!=0);
		
	}
	
	public static void menu() {
		System.out.println("Elija una opción:");
		System.out.println();
		System.out.println("""
				1 - Buscar carta por número y palo.
				2 - Buscar y devolver mazo con valor 0.
				3 - Calcular puntuación total del mazo.
				4 - Modificar nombre de carta
				5 - Mostrar toda la lista.
				6 - Ordenar lista por palo.
				7 - Ordenar las cartas de mayor a menor puntuación.
				""");
		
	}

}
