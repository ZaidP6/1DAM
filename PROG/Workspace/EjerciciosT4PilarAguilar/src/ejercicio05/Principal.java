package ejercicio05;

public class Principal {

	/*
	 * Crear una clase Empleado con los atributos nombre, apellidos, sueldo base y nº de Empleado.
		Introducir los métodos necesarios y oportunos.
		Crear una clase derivada de ella, llamada Vendedor que tenga como atributos la cantidad de ventas y
		un incentivo (un porcentaje de las ventas realizadas en un mes sumado a su sueldo base) y los métodos
		apropiados para manejarla.
		Otra clase hija puede ser Gerente, cuyo sueldo es el base, pero al que se le quita un % de impuestos
		(consideraremos que al vendedor no se le quita nada para que el ejercicio tenga algo más de sentido).
		Crear una clase Oficina caracterizada por una lista de Empleados donde se incluya un método que
		calcule el sueldo de un empleado pasándole como parámetro un empleado y otro método que calcule
		lo gastado por la oficina en total por el pago de sueldos a todos los empleados.
		Probar el programa en una clase principal, instanciando un array de empleados guardando varios tipos
		incluyendo un empleado genérico y mostrando su sueldo. Si el empleado es un vendedor se le debe
		felicitar con un mensaje por pantalla cuando haya vendido más de una cantidad pasada como parámetro
		que será su objetivo de ventas.
	 */
	
	public static void main(String[] args) {
		
	
		Empleado v1, v2, v3;
		Empleado g1, g2, g3;
		Oficina o;
		double salarioBase = 1350;
		double porImpuesto = 17.1;
		double porIncremento = 0.27;
		
		
		
		g1 = new Gerente(0, "Víctor", "Córdoba", salarioBase, porImpuesto);
		g2 = new Gerente(1, "Ignacio", "Sosa", salarioBase, porImpuesto);
		g3 = new Gerente(2, "Juan", "Gómez", salarioBase, porImpuesto);
		v1 = new Vendedor(3, "Pepe", "Ruiz", salarioBase, 45, porIncremento);
		v2 = new Vendedor(4, "Paco", "Rodríguez", salarioBase, 45, porIncremento);
		v3 = new Vendedor(5, "Luis", "López", salarioBase, 45, porIncremento);
		
		
		
		
	}
}
