package ejercicio_10;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub

		/*Este programa tendría otra serie de clases, pero por simplificar lo haremos solo con 3 clases. Crear un programa que simule una máquina vendedora de tickets de metro. 
		 * Tendremos que crear la clase Ticket (Clase POJO), la clase Maquina (donde estarán todos los métodos con funcionalidad) y la clase principal de prueba. Tendrá un menú donde se pueda:
						•Comprar uno o varios billetes.
						•Calcular el cambio a devolver.
						•Imprimir por pantalla el billete. Solo uno. Si se han comprado “x” debemos mostrar en el ticket el mensaje “válido para x personas”.
						•Opciones de operario: el operario que lleva el mantenimiento de la máquina, debe tener disponible un método que le ofrezca el saldo
						 total de la recaudación de la máquina en ese día (no es necesario usar fechas) y otro método que pueda poner a cero el contador de saldo total.
						•Dentro de la opción de operario, también debe contar con la posibilidad de cambiar el precio de los billetes ya que estos suelen subir todos los años.
						•Las operaciones para el operario se harán solo si se introduce la contraseña adecuada antes de cualquier otra cosa, por lo que se debe tener el método comprobar contraseña.*/
		
		
		double precioU=1.2, dinero=0, precioT=0,suma=0, precioN=0;
		String trayecto="Centro";
		int op=0,op2=0, cantidadT=0, contraseña1=1234, contraseña2=0;
		boolean comprobado=false;
		Ticket t1=new Ticket(precioU,trayecto);
		
		Maquina m1=new Maquina(t1);
		
		System.out.println("**********************************************************************************************************");
		System.out.println("                   Bienvenido a la máquina expendedora de billetes                                        ");
		System.out.println("**********************************************************************************************************");
		
		do {
			
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
		System.out.println();
		System.out.println("""
							(1). Para comprar billetes.
							(2). Para ver su cambio.
							(3). Para imprimir billete.
							(4). Para opciones del operario.
									
							(0). Para salir
				""");
		op=Leer.datoInt();
		switch(op) {
			case 1:
				System.out.println("Cuántos tickets desea comprar");
				cantidadT=Leer.datoInt();
				System.out.println("Introduzca el dinero que va a emplear");
				dinero=Leer.datoDouble();
				if(m1.comprobarDinero(dinero)==true) {
					precioT=m1.comprarBilletes(cantidadT, dinero);
					m1.sumarecaudado(suma, cantidadT, dinero);
				}
				else {
					System.out.println("Lo sentimos con esa cantidad no llega ni a la vuelta de la esquina");
				}
				
				System.out.printf("El total de su compra es: %.2f €\n",precioT);
				break;
			case 2:
				System.out.printf("Su cambio es: %.2f €\n",m1.calcularCambio(cantidadT, dinero));
				break;
			case 3:
				m1.imprimirBillete(cantidadT);
				break;
			case 4:
				
				while(comprobado==false) {
				System.out.println("Introduzca la contraseña numérica de 4 dígitos");
				contraseña2=Leer.datoInt();
				m1.comprobarContraseña(contraseña2, contraseña1);
				}
				
				System.out.println("""
						(1). Ver recaudación.
						(2). Resetear recaudado
						(3). Cambiar precio de los billetes
						(0). Para salir
						""");
						op2=Leer.datoInt();
						
						
				switch(op2) {
				
					case 1:
					
						System.out.printf("El total recaudado es:  %.2f€",m1.sumarecaudado(suma, cantidadT, dinero));
						break;
					
					case 2:

						m1.resetearSuma(suma);
						System.out.println(suma);
						break;
					
					case 3:
						
						System.out.println("Indique el nuevo precio");
						precioN=Leer.datoDouble();
						t1.cambiarPrecioBillete(precioN);
						break;
						
					case 0:
						System.out.println("Saliendo.......");
						break;
						
					default:
						
						System.out.println("Por favor introduzca una opción válida");
						break;
						
				}while(op2!=0);
				
			case 0:
				System.out.println("Saliendo.......");
				break;
				
			default:
				
				System.out.println("Por favor introduzca una opción válida");
				break;
		}
		}while(op!=0);
		
		System.out.println("               	               (0 0) \r\n"
				+ "                       ---oOO-- (_) ----oOO---    \r\n"
				+ "                 ╔═════════════════════════════════╗ \r\n"
				+ "                 ║ Gracias por usar el programa..♥ ║ \r\n"
				+ "                 ╚═════════════════════════════════╝ \r\n"
				+ "                         -------------------\r\n"
				+ "                             |__|__| \r\n"
				+ "                              || || \r\n"
				+ "                             ooO Ooo ");
	}

}
