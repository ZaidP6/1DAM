package ejercicio10;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Este programa tendría otra serie de clases, pero por simplificar lo haremos solo con 3 clases. Crear un
			programa que simule una máquina vendedora de tickets de metro. Tendremos que crear la clase Ticket
			(Clase POJO), la clase Maquina (donde estarán todos los métodos con funcionalidad) y la clase principal
			de prueba. Tendrá un menú donde se pueda:
			
			• Comprar uno o varios billetes.
			
			• Calcular el cambio a devolver.
			
			• Imprimir por pantalla el billete. Solo uno. Si se han comprado “x” debemos mostrar en el ticket el
				mensaje “válido para x personas”.
			
			• Opciones de operario: el operario que lleva el mantenimiento de la máquina, debe tener disponible
				un método que le ofrezca el saldo total de la recaudación de la máquina en ese día (no es necesario
				usar fechas) y otro método que pueda poner a cero el contador de saldo total.
				
			• Dentro de la opción de operario, también debe contar con la posibilidad de cambiar el precio de
				los billetes ya que estos suelen subir todos los años.
			
			• Las operaciones para el operario se harán solo si se introduce la contraseña adecuada antes de
				cualquier otra cosa, por lo que se debe tener el método comprobar contraseña.
		 */
		
		int op;
		
		
		
		
		do {
		System.out.println("Elija una opción del menú");	
		op = Leer.datoInt();
		menu();
		
		switch (op) {
			case 1:
				reñrnsr<array>asika
				break;
	
			default:
				break;
		}
		}while(op != 0);
		
		
	}
	
	private static void menu(){
		System.out.println("""
				1 - Comprar uno o varios billetes
				2 - Calcular el cambio a devolver
				3 - Imprimir por pantalla el billete
				4 - Operario: saldo total
				5 - Operario: poner a cero el contador
				6 - Operario: cambiar el precio delos billetes
				""");
	}
}
