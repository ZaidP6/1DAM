package ejercicio01;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Crear un programa con una clase Ordenador que permita modelar uno con características como
			capacidad de disco duro, frecuencia del procesador, precio base y marca. Crear dos clases hijas,
			llamadas Sobremesa y Portátil. Añadir a Sobremesa el atributo precioMontaje y al portátil otro atributo
			que será un booleno por si se quiere o no seguro para la pantalla y otro con la cantidad a pagar por
			dicho seguro.
			La clase madre debe tener un método para calcular el precio de venta al público aplicando un % de
			ganancia del vendedor al precio base. Este método se debe reescribir en las clases hijas sumando la
			cantidad adecuada en el caso del montaje o la cantidad del seguro solo si el cliente lo quiere contratar.
			
			Crear un main sencillo (no es necesario crear menú) para comprobar todo, basta llamar a los métodos
			en orden adecuado y mostrar el resultado de los cálculos que hace cada uno, es decir, el precio de venta
			al público de un objeto de cada subtipo (uno de sobremesa y un portátil).
		 */
		
		Ordenador or;
		int id;
		String marca;
		double precioBase;
		int capacidadHDD;
		int procesadorHz;
		
		Pc pc;
		double precioMontaje;
		
		Laptop lap;
		double precioSeguro;
		
		System.out.println("Indique el id");
		id = Leer.datoInt();
		System.out.println("Indique la marca");
		marca = Leer.dato();
		System.out.println("Indique el precio base del ordenador");
		precioBase = Leer.datoDouble();
		System.out.println("Indique la capacidad del disco duro");
		capacidadHDD = Leer.datoInt();
		System.out.println("Indique la frecuencia del procesador");
		procesadorHz = Leer.datoInt();
		
		System.out.println("Indique precio del montaje para un sobremesa");
		precioMontaje = Leer.datoDouble();
		
		System.out.println("Indique precio del seguro para un portátil");
		precioSeguro = Leer.datoDouble();
		
		
	}

}
