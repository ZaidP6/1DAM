package ejercicio;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * En este ejemplo se hará una gestión de trenes mediante una estación, para
		 * ello tendremos distintos trenes que estarán en una sola estación, además
		 * podemos gestionar los pasajeros que viajan en el tren, podremos ver de que
		 * tipo de pasajero se trata, si es un pasajero normal o si es un pasajero vip.
		 * Por otro lado tendremos distintas formas para ejecutar el programa, podremos
		 * hacerlo siendo el administrador del programa y tendremos el control de los
		 * trenes, como los pagos, las fechas de los mismos, etc.. Y por otro lado la
		 * vista de los pasajeros, podremos gestionar como hacer una reserva, los
		 * pasajeros que hay en un tren, etc..
		 */

		int opcion = 0, opcion2 = 0, dias = 0, id = 0, numPasajeros = 0, opcionOperario = 0, opcionAdmin = 0;
		double iva = 25.0, precioTicket = 0, descuento = 20.0;
		String dni = "", nombre = "", fechaNacimientoCliente = "", fechaReservaCliente = "", fechaTrenNuevo = "",
				contrasenya = "1ab", contrasenyaV2 = "";

		LocalDate fechaNacimiento = LocalDate.of(2004, 03, 03);
		LocalDate fechaNacimiento2 = LocalDate.of(2004, 02, 03);
		LocalDate fechaNacimiento3 = LocalDate.of(2004, 02, 10);
		LocalDate fechaReserva = LocalDate.of(2024, 8, 17);
		LocalDate fechaTren = LocalDate.of(2024, 8, 20);
		LocalDate fechaASuperar = LocalDate.of(2006, 01, 01);
		LocalTime llegadaAntelacion = LocalTime.of(1, 15);
		LocalDate fechaParaAgregarTren = LocalDate.now();

		List<Pasajero> lista = new ArrayList<>();
		List<Tren> listaTrenes = new ArrayList<>();

		Pasajero p = new Pasajero(fechaNacimiento, "Carlos", "1234A", 10.0, fechaReserva);
		Pasajero p1 = new PasajeroVip(fechaNacimiento2, "Dani", "1234B", 10.0, fechaReserva, 10.0, llegadaAntelacion);
		Pasajero p2 = new Pasajero(fechaNacimiento3, "Manolo", "2234A", 10.0, fechaReserva);
		Tren t = new Tren(fechaTren, 1, 0, lista);
		Estacion e = new Estacion(listaTrenes);
		Admin a = new Admin(contrasenya);

		t.add(p, fechaASuperar);
		t.add(p1, fechaASuperar);
		t.add(p2, fechaASuperar);
		e.add(t, fechaParaAgregarTren);

		do {

			System.out.println("Indique su función:");

			imprimirMenuAdminOCliente();

			opcionOperario = Leer.datoInt();

			switch (opcionOperario) {
			case 1:
				System.out.println("Indique la contraseña: ");

				contrasenyaV2 = Leer.dato();

				if (a.comprobarContrasenya(contrasenyaV2)) {

					do {
						System.out.println("_____________________________________");
						System.out.println("Indique la opción que desea: ");
						imprimirMenuAdmin();
						opcionAdmin = Leer.datoInt();

						switch (opcionAdmin) {
						case 1:
							System.out.println("Indique la fecha del tren (año-mes-día):");
							fechaTrenNuevo = Leer.dato();
							fechaTren = LocalDate.parse(fechaTrenNuevo);
							System.out.println("Indique el id del tren:");
							id = Leer.datoInt();
							e.add(new Tren(fechaTren, id, numPasajeros, lista), fechaParaAgregarTren);
							break;

						case 2:
							e.mostrarTrenes();
							break;

						case 3:
							System.out.printf("El total recaudado es: %.2f " + "€\n", t.calcularTotal(iva, descuento));
							break;

						case 4:
							System.out.println("Indique el dni de su reserva: ");
							dni = Leer.dato();
							System.out.printf("El precio del ticket de ese pasajero es: " + "%.2f €\n",
									t.calcularPrecioTicketUnPasajero(t.findByDni(dni), iva, descuento));
							break;

						case 5:
							do {
								System.out.println("Indique que desea hacer");

								imprimirMenuDeCambioHorario();

								opcion2 = Leer.datoInt();

								switch (opcion2) {
								case 1:
									System.out.println("Indique el id del tren:");
									id = Leer.datoInt();
									System.out.println(
											"Indique el número de días que desea aumentarle a la fecha del tren:");
									dias = Leer.datoInt();
									e.modificarHorarioTren(1, dias, id, opcion2);
									break;

								case 2:
									System.out.println("Indique el id del tren:");
									id = Leer.datoInt();
									System.out.println(
											"Indique el número de días que desea disminuir a la fecha del tren:");
									dias = Leer.datoInt();
									e.modificarHorarioTren(1, dias, id, opcion2);
									break;

								case 0:
									break;

								default:
									System.out.println("Esta opción no es válida");
									break;
								}
								break;

							} while (opcion2 != 0);
							break;

						case 0:
							break;

						default:
							System.out.println("Esta opción no está disponible");
							break;
						}
					} while (opcionAdmin != 0);

				} else {
					System.out.println("La contraseña es incorrecta");
				}
				break;

			case 2:
				do {
					System.out.println("_____________________________________");
					System.out.println("Indique la opción que desea");
					imprimirMenuCliente();
					opcion = Leer.datoInt();

					switch (opcion) {
					case 1:
						System.out.println("Indique el dni de su reserva: ");
						dni = Leer.dato();
						t.mostrarReserva(t.findByDni(dni), iva, descuento);
						break;

					case 2:
						if (t.verificarDisponibilidad(fechaReserva)) {
							System.out.println("Indique el nombre:");
							nombre = Leer.dato();
							System.out.println("Indique el dni:");
							dni = Leer.dato();
							System.out.println("Indique la fecha de nacimiento (año-mes-día):");
							fechaNacimientoCliente = Leer.dato();
							fechaNacimiento = LocalDate.parse(fechaNacimientoCliente);
							System.out.println("Indique el precio del ticket:");
							precioTicket = Leer.datoDouble();
							System.out.println("Indique la fecha de reserva (año-mes-día):");
							fechaReservaCliente = Leer.dato();
							fechaReserva = LocalDate.parse(fechaReservaCliente);

							if (t.hacerReserva(
									new Pasajero(fechaNacimiento, nombre, dni, precioTicket, fechaReserva))) {
								t.add(new Pasajero(fechaNacimiento, nombre, dni, precioTicket, fechaReserva),
										fechaASuperar);
							} else {
								System.out.println("La fecha de reserva debe ser anterior a la salida del tren");
							}
						} else {
							System.out.println("No hay disponibilidad para esa fecha");
						}

						break;

					case 3:
						t.imprimirPasajeros();
						break;
						
					case 4:
						t.ordenar();
						break;

					case 0:
						break;

					default:
						System.out.println("Esta opción no está disponible");
						break;

					}
				} while (opcion != 0);
				break;

			case 0:
				break;

			default:
				System.out.println("Esta opción no está disponible");
				break;
			}

		} while (opcionOperario != 0);

		System.out.println("Saliendo del programa..");

	}

	public static void imprimirMenuAdminOCliente() {
		System.out.println("_______________________________");
		System.out.println("1-Admin");
		System.out.println("2-Cliente");
		System.out.println("0-Salir del programa");
		System.out.println("_______________________________");
	}

	public static void imprimirMenuCliente() {
		System.out.println("_______________________________");
		System.out.println("1-Mostrar una reserva");
		System.out.println("2-Hacer una reserva");
		System.out.println("3-Ver pasajeros del tren");
		System.out.println("4-Ordenar pasajeros por fecha de nacimiento");
		System.out.println("0-Volver");
		System.out.println("_______________________________");
	}

	private static void imprimirMenuAdmin() {
		System.out.println("_______________________________");
		System.out.println("1-Añadir un tren");
		System.out.println("2-Mostrar trenes");
		System.out.println("3-Calcular total");
		System.out.println("4-Calcular precio de un pasajero");
		System.out.println("5-Cambiar horario tren");
		System.out.println("0-Volver");
		System.out.println("_______________________________");
	}

	public static void imprimirMenuDeCambioHorario() {
		System.out.println("______________________________________");
		System.out.println("0-Salir del programa");
		System.out.println("1-Aumentar días a la fecha de salida");
		System.out.println("2-Disminuir días a la fecha de salida");
		System.out.println("______________________________________");
	}

}
