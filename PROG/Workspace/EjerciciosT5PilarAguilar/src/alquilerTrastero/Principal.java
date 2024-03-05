package alquilerTrastero;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Variables
		
		double capacidad, precio;
		String aux, direccion;
		int opc, numTrastero;
		
		//Scanner 
		
		Scanner scn = new Scanner(System.in);
		
		//Se crea una lista de trasteros y se instancian unos cuatos de ejemplo
		
		List<Trastero> listaTrasteros = new ArrayList<Trastero>();
		
		listaTrasteros.add(new Trastero (10, "San Vicente de Paul, 20, Sevilla", 1200, false));
		listaTrasteros.add(new Trastero (25, "Doctor Fedriani, 3, Sevilla", 5000, true));
		listaTrasteros.add(new Trastero (5, "Eliseda, 20, Córdoba", 800, false));
		listaTrasteros.add(new Trastero (35, "López de Gomara, 7, Sevilla", 30000, true));
		listaTrasteros.add(new Trastero (12, "Plaza España, 10, Pamplona", 1500, false));
		
		
		//Se instancia la clase Oficina incluyendo la lista de trasteros
		
		Oficina o = new Oficina(listaTrasteros);
		
		
		//Apartado "visual" del programa
		
		do {
			
			System.out.println("""
					
					-------------------------------------------------------------
					Opción 1:	Agregar trastero
					Opción 2:	Ver trasteros disponibles por número
					Opción 3:	Ver trasteros disponibles por precio
					Opción 4:	Ocupar trastero
					Opción 5:	Desocupar trastero
					Opción 6:	Modificar precio de un trastero
					Opción 7:	Borrar trastero
					Opción 8:	Ver trastero más caro
					Opción 0:	Salir
					-------------------------------------------------------------
					  
					""");
			aux = scn.nextLine();
			opc = Integer.parseInt(aux);
			
			switch (opc) {
			
				case 1:
					
					System.out.println("Capacidad del trastero");
					aux = scn.nextLine();
					capacidad = Double.parseDouble(aux);
					
					System.out.println("Dirección del trastero");
					direccion = scn.nextLine();
					
					System.out.println("Precio del trastero");
					aux = scn.nextLine();
					precio = Double.parseDouble(aux);
					
					o.agregarTrastero(new Trastero (capacidad, direccion, precio, false));
					
					break;
					
				case 2:
					
					o.ordenarTrasterosPorNumero();
					
					o.mostrarTrasterosNoOcupados();
					
					break;
					
				case 3:
					
					o.ordenarPorPrecio();
					
					o.mostrarTrasterosNoOcupados();
					
					break;
					
				case 4:
					
					System.out.println("Número del trastero que quiere ocupar");
					aux = scn.nextLine();
					numTrastero = Integer.parseInt(aux);
					
					o.buscarPorNumero(numTrastero).setOcupado(true);
					
					break;
					
				case 5:
					
					System.out.println("Número del trastero que quieres desocupar");
					aux = scn.nextLine();
					numTrastero = Integer.parseInt(aux);
					
					o.buscarPorNumero(numTrastero).setOcupado(false);
				
					
				case 6:
					
					System.out.println("Número del trastero que quiere modificar");
					aux = scn.nextLine();
					numTrastero = Integer.parseInt(aux);
					
					System.out.println("Precio nuevo");
					aux = scn.nextLine();
					precio = Double.parseDouble(aux);
					
					o.modificarPrecio(o.buscarPorNumero(numTrastero), precio);
					
					break;
					
				case 7:
					
					System.out.println("Número del trastero que quieres borrar");
					aux = scn.nextLine();
					numTrastero = Integer.parseInt(aux);
					
					o.borrarTrastero(o.buscarPorNumero(numTrastero));
					
					break;
					
				case 8:
					
					System.out.println(o.buscarMasCaro());
					
					break;
					
				case 0:
					
					System.out.println("***********");
					System.out.println("Saliendo...");
					System.out.println("***********");
					
					break;
					
				default:
					
					System.out.println("*****************");
					System.out.println("Opción equivocada");
					System.out.println("*****************");
					
					break;
			}
			
			
		}while (opc != 0);
		
		System.out.println();
		System.out.println("--------------------------------");
		System.out.println("Gracias por utilizar el programa");
		System.out.println("--------------------------------");

	}

}