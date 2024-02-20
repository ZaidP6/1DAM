package ejercicio02;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Escribir un programa que tenga una clase Documento y dos clases hijas, Tarjeta de visita y Carta.
			Crear los métodos necesarios para que, la cabecera de cada tipo de documento se imprima en pantalla
			de una forma diferente, según sus características. Como es un ejemplo académico, podemos hacer los
			métodos de impresión dentro de cada clase. Por ejemplo, el documento genérico solo tiene un pequeño
			encabezado con los datos de la empresa, la tarjeta puede llevar, además, los datos de contacto de una
			persona y la carta, una fecha.
			Crear un main para hacer una prueba con cada método llamado con objetos de las distintas clases.
		 */
		
		Documento doc;
		int cif;
		String nombreEmpresa;
		String direccion;
		Tarjetadevisita tar;
		String nombre;
		int movil;
		Carta car;
		String fecha;
		
		
		System.out.println("Indique el número del cif");
		cif = Leer.datoInt();
		System.out.println("Indique el nombre de la empresa");
		nombreEmpresa = Leer.dato();
		System.out.println("Indique la dirección de la empresa");
		direccion = Leer.dato();
		System.out.println("Indique la fecha");
		fecha = Leer.dato();
		System.out.println("Indique el nombre del jefe de la empresa");
		nombre = Leer.dato();
		System.out.println("Indique el móvil del jefe");
		movil = Leer.datoInt();
		
		
		
		doc = new Documento(cif, nombreEmpresa, direccion);
		car = new Carta(cif, nombreEmpresa, direccion,fecha);
		tar = new Tarjetadevisita(cif, nombreEmpresa, direccion, nombre, movil);
		doc.generarEncabezado();
		
		System.out.println();
		System.out.println("***************************************************");
		System.out.println();
		
		car.generarEncabezado();
		
		System.out.println();
		System.out.println("***************************************************");
		System.out.println();
		
		tar.generarEncabezado();
		
	}

}
