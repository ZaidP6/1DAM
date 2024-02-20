package ejemplo10_arraysobjetos;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Concesionario c1;
		int nVs = 0;//Contador de objetos Vehículo
		
		int seguir, tam=100, potencia;  //variable para salir del bucle y tamaño
		String modelo;
		boolean cRuedas;
		//Creamos un array de objetos Vehiculo para almacenar 100 Vehículos
		Vehiculo listaVehiculos[] = new Vehiculo[tam];
		String aux;
		
		do {
			System.out.print("Introduce el modelo del vehículo: ");
			modelo = Leer.dato();
			System.out.print("Introduce la potencia: ");
			potencia=Leer.datoInt();
			listaVehiculos[nVs]=new Vehiculo (modelo, potencia);
			c1.agregarV(new Vehiculo(modelo, potencia));
			
			System.out.println("Si desea terminar pulse 0, cualquier número para seguir");
			seguir=Leer.datoInt();
		
		} while(seguir !=0 && nVs<listaVehiculos.length);
		
		System.out.println("Indique el tope de potencia");
		potencia = Leer.datoInt();
		
		c1.mostrarEmpepinados(potencia);
		
		
	}

}
