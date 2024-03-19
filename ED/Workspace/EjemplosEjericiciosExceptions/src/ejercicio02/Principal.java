package ejercicio02;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Variables

		double gradosCelsius, gradosFahrenheit;
		String aux;
		int opc = -1;

		//Scanner

		Scanner s = new Scanner(System.in);

		//Conversor

		Conversor c = new Conversor();

		do {

			System.out.println("""
					--------------------------------------------------
					Opción 1:	Pasar a grados celsius
					Opción 2:	Pasar a grados fahrenheit
					Opción 0:	Salir
					--------------------------------------------------
					""");

			try {
				aux = s.nextLine();
				opc = Integer.parseInt(aux);

				switch (opc) {

					case 1:

						System.out.println("Introduzca la temperatura en grados Fahrenheit");
						aux = s.nextLine();
						gradosFahrenheit = Double.parseDouble(aux);

						try {

							System.out.printf("%.2f grados Fahrenheit son %.2f grados Celsius\n", gradosFahrenheit, c.convertirACelsius(gradosFahrenheit));

						}catch (TempValueException tve) {

							System.out.println(tve.getMessage());
						}

						break;

					case 2:

						System.out.println("Introduzca la temperatura en grados Celsius");
						aux = s.nextLine();
						gradosCelsius = Double.parseDouble(aux);

						try {

							System.out.printf("%.2f grados Celsius son %.2f grados Fahrenheit\n", gradosCelsius, c.convertirAFahrenheit(gradosCelsius));

						}catch (TempValueException tve) {

							System.out.println(tve.getMessage());
						}

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

			}catch (Exception e) {

				System.out.println("Introduce un número churrica");
			}

		}while(opc != 0);

		s.close(); //Es buena idea ponerlo (si se usa Scanner), con leer no hace falta.
	}

}
