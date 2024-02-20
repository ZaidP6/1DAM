package ejercicioTipoExamenD;

import utilidades.Leer;

public class Principal {

	public Principal(Class<ejercicioTipoExamenD.listaVehiculos[]> class1) {
		// TODO Auto-generated constructor stub
	}

	public Principal(Class<ejercicioTipoExamenD.listaVehiculos[]> class1) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehiculo []listaVehiculos = new Vehiculo[6];
		Vehiculo v1 = new Vehiculo("5075dBk", 3.5, 2004);
		Vehiculo v2 = new Vehiculo("1159HcL", 1.56, 2011);
		String matricula;
		Principal concesionario = new Principal(listaVehiculos[]);
		
		System.out.println("indique matricula");
		matricula = Leer.dato();
		
		System.out.println(concesionario.buscarMatricula(matricula));
		
	}
	
	Vehiculo []listaVehiculos = new Vehiculo[6];
	
	public int buscarMatricula(String matricula) {
		int i = 0;
		boolean encontrado = false;
		
		while (i<listaVehiculos.length && !encontrado) {
			Vehiculo v1 = listaVehiculos[i];
			if(v1.getMatricula().equalsIgnoreCase(listaVehiculos[i].getMatricula())) {
				encontrado = true;
			}else
				i++;
			
		}
		if(encontrado) {
			System.out.printf("El vehículo con matrícula %s tiene asignado el aparcamiento %d.\n", matricula, i);
			return i;
		}else {
			System.out.println("Vehículo no encontrado.");
			return -1;
		}
			
		
		
			
			
			
		}

}
