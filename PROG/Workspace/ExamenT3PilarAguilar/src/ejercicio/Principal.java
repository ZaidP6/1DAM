package ejercicio;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int op, tam = 5, porcentajeGanancia;
		double radio;
		double altura;
		int litrosCapacidad;
		double costeProd;
		int posicionDep = 0;
		int capacidadTotal = 0;
		double precioL;
		Deposito deposito;
		Deposito [] listaDepositos =new Deposito [tam];
		Plataforma plataforma = new Plataforma (listaDepositos, posicionDep, capacidadTotal);
		Deposito deposito1 = new Deposito(5.25,6.48,25, 5.64);
		Deposito deposito2 = new Deposito(10,3,40, 8.54);
		Deposito deposito3 = new Deposito(8.69,4.87,5, 7.24);
		listaDepositos[4] = deposito1;
		listaDepositos[3] = deposito2;
		listaDepositos[2] = deposito3;
		
		
		
		
		
		System.out.println("Bienvenido a la plataforma de almacenamiento");
		
		do {
			System.out.println("Elija una opción");
			Menu();
			op = Leer.datoInt();
			System.out.println("****************************************************************");
			
			switch (op) {
				case 1:
					System.out.println("Indique el radio");
					radio = Leer.datoDouble();
					System.out.println("Indique la altura");
					altura = Leer.datoDouble();
					System.out.println("Indique la capacidad de litros (sin decimales)");
					litrosCapacidad = Leer.datoInt();
					System.out.println("Indique el coste de producción");
					costeProd = Leer.datoDouble();
					
					
					deposito = new Deposito(radio, altura, litrosCapacidad, costeProd);
					plataforma.AgregarDeposito(deposito);
					
					plataforma.MostrarDeposito(deposito);
					
					break;
				case 2:
					System.out.println("¿Qué porcentaje de ganancias se lleva?");
					porcentajeGanancia = Leer.datoInt();
					System.out.println("¿Cuál desea calcular? Del 1 al 5");
					posicionDep = Leer.datoInt() -1;
					plataforma.CalcularPrecioVenta(listaDepositos[posicionDep], porcentajeGanancia);
					
					System.out.println(plataforma.CalcularPrecioVenta(listaDepositos[posicionDep], porcentajeGanancia));
					break;
					
				case 3:
					plataforma.CalcularLitrosTotales();
					
					plataforma.MostrarLitrosTotales();
					break;
					
				case 4:
					System.out.println("¿Qué depósito desea calcular?");
					posicionDep = Leer.datoInt();
					System.out.println("¿A cuánto se cobra el litro?");
					precioL = Leer.datoDouble();
					plataforma.findByPosicion(posicionDep);
					plataforma.getListaDepositos();
					plataforma.calcularGananciaRepsol(precioL);
					
					
					break;
					
				case 5:
					System.out.println("¿A cuánto se cobra el litro?");
					precioL = Leer.datoDouble();
					plataforma.calcularGananciaRepsol(precioL);
					System.out.println(plataforma.calcularGananciaRepsol(precioL));
					break;
					
				case 6:
					break;
					
				case 0:
					System.out.println("Hasta luego!");
					break;
					
					
					
				default:
					System.out.println("Error");
					break;
			}
			
			
			
			
		} while (op!=0);
		
		System.out.println("¡Gracias por usar el programa!");
		
	}
	
	public static void Menu() {
		System.out.println("""
				1 - Añadir nuevo depósito
				2 - Calcular precio de venta de un depósito
				3 - Calcular n litros de los depósitos.
				4 - Ganancias Repsol
				0 - Salir
				""");
	}

}
