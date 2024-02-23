package ejercicio01;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Aeropuerto a;
		
		Avion a1= new Avion(1, 150, 154.23);
		Avion a2 = new NavesEspaciales(2, 125, 500, 4);
		Avion a3 = new CazasMilitares(3, 50, 25, 8);
		Avion []listaAviones = {a1, a2, a3};
		
		int op = 0, id = 0;
		double porcentaje = 0;
		int numMisiles = 0;
		
		
		a = new Aeropuerto("Aero Race", listaAviones);
		
		
		System.out.println("Bienvenido al aeropuerto");
		
		do {
			System.out.println("""
					
					Elija una opción:
					
					1 - Buscar un avión
					2 - Calcular aterrizaje de un avión
					3 - Mostrar lista de aviones
					4 - Mostrar total recaudado de los cazas
					5 - Mostrar total recaudado de todos los aviones
					
					""");
			
			op = Leer.datoInt();
			
			switch (op) {
				case 1:
					System.out.println("Indique el id a buscar (Del 1 al 3 para que salgan datos)");
					id = Leer.datoInt();
					System.out.println(a.findById(id));
					
					break;
					
				case 2:
					System.out.println("Indique el porcentaje de incremento por ser una nave espacial");
					porcentaje = Leer.datoDouble();
					System.out.println("Indique el porcentaje");
					porcentaje = Leer.datoDouble();
					
					System.out.println("El aterrizaje del avión elegido cuesta "+a.findById(id).calcularPrecioAterrizaje(id, porcentaje)+ " €.");;
					break;
					
				case 3:
					
					a.mostrarListaAviones();
					break;
					
				case 4:
					System.out.println("Indique el porcentaje");
					porcentaje = Leer.datoDouble();
					System.out.println("El total recaudado por todos los cazas es de "+ a.calcularTotalReacudadoCazas(id, porcentaje)+ " €.");
					break;
					
				case 5:
					System.out.println("Indique el porcentaje");
					porcentaje = Leer.datoDouble();
					System.out.println("El total recaudado por todos los cazas es de "+ a.calcularTotalReacaudado(id, porcentaje)+ " €.");
					break;
				
				default:
					break;
			}
			
			
		} while (op != 0);
		
		
		
		
		
	}

}
