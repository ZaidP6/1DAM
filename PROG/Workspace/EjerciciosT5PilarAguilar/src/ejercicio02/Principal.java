package ejercicio02;

import java.util.ArrayList;
import java.util.List;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Crear un programa para gestionar los socios de un Club de campo. Se debe poder guardar Socios con
			sus datos personales, buscarlos, mostrar sus datos, modificarlos y borrarlos (operaciones CRUD). Usar
			la clase ArrayList. Este ejercicio es para empezar, así que no es necesario hacer nada más, aunque se
			podrían agregar funcionalidades como alquilar pistas, pagar cuotas, etc.
			Debemos usar la clase Socio, la clase Club y la principal como mínimo. Puedes probar a separar "las
			operaciones CRUD" en una clase CRUDSocio de la clase Club.
		 */
		int op, nSocio,edad, num;
		String nombre,apellido;
		double cuota;
		
		List<Socio>listaSocios = new ArrayList<Socio>();
		CrudSocio gestion = new CrudSocio(listaSocios);
		
		System.out.println("Bienvenido");
		
		do {
			System.out.println("""
					1 - Añadir socio
					2 - Buscar socio
					3 - Modificar nombre
					4 - Modificar edad
					5 - Borrar socio
					6 - Mostrar la lista de socios
					""");
			System.out.println("Elija una opción");
			op = Leer.datoInt();
			
			switch (op) {
				case 1:
					System.out.println("Indique el número del socio");
					nSocio = Leer.datoInt();
					System.out.println("Indique el nombre");
					nombre = Leer.dato();
					System.out.println("Indique el apellido");
					apellido = Leer.dato();
					System.out.println("Indique la edad");
					edad = Leer.datoInt();
					System.out.println("Indique el precio de la cuota");
					cuota = Leer.datoDouble();
					
					Socio soc = new Socio(nSocio, nombre, apellido, edad, cuota);
					
					gestion.addSocio(soc);
					
					break;
				case 2:
					System.out.println("Indique el número del socio que desea buscar");
					num = Leer.datoInt();
					
					if (gestion.findById(num) == null) {
						System.out.println("Vaya, no se encuentra a ningún socio con ese id");
					}else
						gestion.mostrarSocio(num);
					break;
				case 3: 
					System.out.println("Indique el número de socio que desea cambiar el nombre");
					num = Leer.datoInt();
					System.out.println("¿Por qué nombre desea cambiarlo?");
					nombre = Leer.dato();
					
					gestion.modificarNombreSocio(num, nombre);
					
					break;
					
				case 4:
					System.out.println("Indique el número de socio que desea cambiar la edad");
					num = Leer.datoInt();
					System.out.println("Indique la edad correcta");
					edad = Leer.datoInt();
					
					gestion.modificarEdadSocio(num, edad);
					break;
				case 5:
					System.out.println("Indique el número de socio al cual desea borrar");
					num = Leer.datoInt();
					
					gestion.removeSocio(num);
					break;
				case 6:
					gestion.mostrarListaSocios();
					break;
				default:
					break;
			}
		} while (op!=0);
		

		
	}

}
