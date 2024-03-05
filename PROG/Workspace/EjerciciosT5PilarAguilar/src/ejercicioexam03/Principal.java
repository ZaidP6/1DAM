package ejercicioexam03;

import java.util.ArrayList;
import java.util.List;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int op = 0, num, gratis;
		String cantante;
		Cancion c1 = new Cancion(1, "Halo", "Beyonce", 150, true, 3.45);
		Cancion c2 = new Cancion(2, "Hello", "Adele", 200, true, 3.58);
		Cancion c3 = new Cancion(3, "Piratas del Caribe", "Hans Zimmer", 500, false, 7.34);
		Cancion c4 = new Cancion(4, "Perro negro", "Bad Bunny", 2, false, 2.27);
		Cancion c5 = new Cancion(5, "Rolling in the deep", "Adele", 35, true, 4.25);
		Cancion c6 = new Cancion(6, "Fire in to the rain", "Adele", 269, false, 2.45);
		
		List<Cancion> listaCanciones = new ArrayList<Cancion>();
		listaCanciones.add(c4);
		listaCanciones.add(c6);
		listaCanciones.add(c3);
		listaCanciones.add(c5);
		listaCanciones.add(c1);
		listaCanciones.add(c2);
		
		MiMusica gestion = new MiMusica(listaCanciones);
		
		System.out.println("Bienvenido");
		
		menu();
		
		op = Leer.datoInt();
		
		switch (op) {
			case 1:
				gestion.mostrarLista(gestion.findByFree());
				
				break;
			case 2:
				gestion.mostrarLista(gestion.findByDuracion());
				break;
				
			case 3:
				System.out.println("¿Qué cantante quiere buscar?");
				cantante = Leer.dato();
				gestion.mostrarLista(gestion.findByInterprete(cantante));
				break;
				
			case 4:
				System.out.printf("La canción más escucha es: %s del artista %s con la cantidad de "
						+ "%d reproducciones.\n", gestion.findByReproducciones().getTitulo(), 
						gestion.findByReproducciones().getInterprete(),
						gestion.findByReproducciones().getNumReproducciones());
				break;
				
			case 5:
				System.out.println("Indique el id de la canción a modificar");
				num = Leer.datoInt();
				System.out.println("Indique '1' si quiere que sea gratis o "
						+ "'2' si quiere que sea de pago.");
				gratis = Leer.datoInt();
				gestion.modificarDePago(gestion.findById(num), gratis);
				
				System.out.println(gestion.findById(num));	
				break;
				
			case 6:
				gestion.ordenarInterprete();
				gestion.mostrarV2();
				break;
				
			case 7:
				
				
			default:
				break;
		}
		
	}
	
	
	public static void menu(){
		System.out.println("""
				Selecciones una opción:
				
				1. Buscar todas las canciones gratis usando un iterator.
				2. Buscar la canción que mayor duración de todas.
				3. Buscar todas las canciones de un intérprete elegido por el usuario.
				4. Buscar la canción que más veces haya sido escuchada.
				5. Modificar una canción, modificando su atributo de gratis o de pago. 
					Se puede buscar la canción a modificar de la manera que decidáis.
				6. Ordenar la lista por intérprete alfabéticamente como orden natural.
				7. Ordenar la lista por orden no natural, este será por duración de la canción, de mayor a menor duración.
				8. Crear una lista aleatoria de canciones con el número de canciones que diga el usuario. Debes decidir la forma 
				de hacerlo.
				9. Calcular la media de duración entre todas las canciones de la lista.
				10. Imprimir toda la lista, es decir, mostrar todos los datos de todas las canciones almacenadas usando un iterator.
				""");
	}

}
