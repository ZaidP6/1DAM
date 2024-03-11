package ejemploConcesionario;

import java.util.ArrayList;
import java.util.List;

import utilidades.Leer;

public class Menu {

	static void mostrarMenu() {

		List<Coche> listaCoches = new ArrayList<Coche>();
		List<Extras> listaExtra = new ArrayList<>();

		CrudCoche crudCoche = new CrudCoche(listaCoches);
		Concesionario concesionario = new Concesionario(crudCoche);

		// Variables
		String marca, modelo, numBastidor;
		String asientoCalefaccion = "Asiento con calefacción", pantalla = "Pantalla",
				techoRetractil = "Techo retráctil";
		double caballos, precio;
		boolean vendido = false;
		int opcion, opcion2, opcion3, limit, skip, leerExtras1, leerExtras2;
		Extras extra1 = new Extras(asientoCalefaccion);
		Extras extra2 = new Extras(pantalla);
		Extras extra3 = new Extras(techoRetractil);

		// Introduccion de objetos a un list para ya tener algunos ejemplos
		Coche coche = new Coche("Seat", "Leon", "6425T", 450, 400000, false);
		Coche coche1 = new Coche("Audi", "A4", "43643Y", 390, 250000, true);
		Coche coche2 = new Coche("Peugeot", "P5", "7623U", 600, 590000, true);
		Coche coche3 = new Coche("Seat", "Ibiza", "7923R", 450, 400000, false);
		Coche coche4 = new Coche("Seat", "Leon", "1630L", 450, 400000, false);
		Coche coche5 = new Coche("Seat", "Leon", "0258G", 450, 400000, true);

		coche.addExtra(extra1);
		coche1.addExtra(extra2);
		coche2.addExtra(extra3);
		coche3.addExtra(extra2);
		coche4.addExtra(extra1);
		coche5.addExtra(extra3);

		crudCoche.addCoche(coche);
		crudCoche.addCoche(coche1);
		crudCoche.addCoche(coche2);
		crudCoche.addCoche(coche3);
		crudCoche.addCoche(coche4);
		crudCoche.addCoche(coche5);

		// Enunciado

		// Tenemos un concesionario, en el cual venderemos coches de distintas marcas,
		// modelos... Cada coche tiene un Número de bastidor, que lo identifica, el
		// precio que costará, los caballos...
		// Nuestro concesionario estará formado por una lista de coches. El programa
		// debe poder realizar las siguientes operaciones:
		// Añadir un coche al concesionario, mostrar los coches siguiendo diferentes
		// requisitos ( marca, modelo, limitando el número de resultados y saltando una
		// cantidad dada, también por marca y modelo. Debemos poder calcular las
		// ganancias totales si se venden todos los coches, contar el número de los
		// coches vendidos, calcular el precio medio de los coches de una marca,
		// ordenar los coches por varios requisitos (orden alfabético de la marca y
		// modelo y por el precio), un método que mostrará el coche y sus extras y un
		// método collect.

		do {
			System.out.println("""
					0 ---> Salir
					1 ---> Añadir un coche al concesionario
					2 ---> Mostrar los coches del concesionario(Todos los mostrar)
					3 ---> Calcular ganancias si se venden todos los coches
					4 ---> Contar los coches vendidos
					5 ---> Comprobar que extras tiene cada coche
					6 ---> Ordenar coches por requisitos
					7 ---> Borrar un coche
					8 ---> Mostrar el coche y sus extras
					9 ---> Modificar precio de un coche
					""");
			opcion = Leer.datoInt();
			switch (opcion) {
			case 1:
				System.out.println("Introduzca la marca del coche");
				marca = Leer.dato();
				System.out.println("Introduzca el modelo");
				modelo = Leer.dato();
				System.out.println("Introduzca el número de bastidor");
				numBastidor = Leer.dato();
				System.out.println("Introduzca los caballos que tiene el coche");
				caballos = Leer.datoDouble();
				System.out.println("Introduzca el precio del coche");
				precio = Leer.datoDouble();

				coche = new Coche(marca, modelo, numBastidor, caballos, precio, vendido);

				System.out.println("""
						0 ---> Coche no tiene extras
						1 ---> Asientos tapizados
						2 ---> Pantalla
						3 ---> Techo Retráctil
						""");
				leerExtras1 = Leer.datoInt();

				switch (leerExtras1) {
				case 1:
					coche.addExtra(extra1);
					break;
				case 2:
					coche.addExtra(extra2);
					break;
				case 3:
					coche.addExtra(extra3);
					break;
				case 0:
					break;
				default:
					System.out.println("Diga un dato válido");
					break;
				}
				crudCoche.addCoche(coche);
				System.out.println();
				break;
			case 2:
				do {
					System.out.println("""
							1 ---> Mostrar lista de coches por modelos, saltando N primeros coches.
							2 ---> Mostrar lista de coches por modelos, limitando el resultado a N coches.
							3 ---> Mostrar el coche por el número de bastidor.
							4 ---> Mostrar lista de coches por marca.
							0 ---> Salir
							""");
					opcion3 = Leer.datoInt();

					switch (opcion3) {
					case 1:
						System.out.println("Diga el modelo del coche que desea ver");
						modelo = Leer.dato();
						System.out.println("Diga el número de coches que desea saltar");
						skip = Leer.datoInt();

						crudCoche.mostrar(crudCoche.findListaModelosSkipN(modelo, skip));
						break;
					case 2:
						System.out.println("Diga el modelo del coche que desea ver");
						modelo = Leer.dato();
						System.out.println("Diga el número de coches que desea mostrar");
						limit = Leer.datoInt();
						crudCoche.mostrar(crudCoche.findNModelos(modelo, limit));
						break;

					case 3:
						System.out.println("Introduzca el número de bastidor del coche que quiere borrar");
						numBastidor = Leer.dato();
						crudCoche.borrarCoche(numBastidor);

						System.out.println(crudCoche.findByNumBastidor(numBastidor));
						break;

					case 4:
						System.out.println("Diga la marca de coche que desea ver");
						marca = Leer.dato();

						crudCoche.mostrar(crudCoche.buscarPorMarca(marca));
						break;

					case 0:

						break;
					default:

						System.out.println("Inserte dato válido");
						break;
					}

				} while (opcion3 != 0);
				break;
			case 3:

				System.out.printf("Las ganancias totales son: %.2f€", concesionario.calcularGanancias());
				System.out.println();

				break;
			case 4:
				System.out.println(concesionario.contarCocheVendidos());
				break;
			case 5:
				concesionario.queExtraTieneCadaCoche();
				break;
			case 6:
				do {
					System.out.println("""
							1 ----> Ordenar por precio
							2 ----> Ordenar por orden alfabetico
							0 ----> Salir
							""");
					opcion2 = Leer.datoInt();
					switch (opcion2) {
					case 1:

						crudCoche.mostrar(concesionario.ordenarPorPrecioMayorAMenor());
						System.out.println();
						break;
					case 2:
						crudCoche.mostrar(concesionario.ordenarPorOrdenAlfabeticoMarcaYModelo());
						System.out.println();
						break;
					default:
						System.out.println("Introduzca una opción correcta");
						break;
					case 0:

						break;
					}

				} while (opcion2 != 0);
				break;
			case 7:
				System.out.println("Introduzca el número de bastidos del coche que quiere borrar");
				numBastidor = Leer.dato();
				crudCoche.borrarCoche(numBastidor);
				break;

			default:
				System.out.println("Introduzca una opción correcta");
				System.out.println();
				break;
			case 0:
				System.out.println("Saliendo...");
				break;
			}

		} while (opcion != 0);
	}
}
