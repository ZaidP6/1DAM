package ejercicio_09;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Crear un programa que gestione un sorteo de lotería. La lotería de Navidad se realiza sobre números que van desde el 00001 al 99999 
		 *(no tendremos en cuenta series). Para facilitar, tendremos solo la clase Sorteo y la principal para probar todo. El programa debe hacer lo siguiente:
			•Comprar un décimo (eligiendo el número por teclado).
			•Comprar un décimo generado por la máquina (aleatorio).
			•Hacer sorteo (generará aleatoriamente el número premiado).
			•Comprobar si nuestro décimo está premiado devolviendo un boolean.
			•Mostrar si eres ganador o no.*/
		
		int op=0,elegido,desde=0, hasta=99999;
		Sorteo sort1=new Sorteo();
		double precioDecimo=20, dineroUsuario;
		
		
		
		
		System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/**/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/");
		System.out.println("                                                       Bienvenido al Sorteo de tu vida                                                                              ");
		System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/**/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/");
		
		do {
			
			System.out.println("""
					          
					           1. Para comprar un décimo de su elección.
					           2. Para comprar un décimo elegido por la máquina.
					           3. Para comprobar si su décimo está pemiado.
					           0. Para salir.
					""");
			op=Leer.datoInt();
			
			switch(op){
				
				case 1:
					System.out.println("Indique cuánto se quiere gastar");
					dineroUsuario=Leer.datoDouble();
					System.out.println("Indique el número de 5 dígitos que desea comprar");
					elegido=Leer.datoInt();
					sort1.imprimirDecimoElegido(precioDecimo, dineroUsuario,elegido);
					System.out.println();
					System.out.println("**********************************************************************************************");
					
					break;
				case 2:
					
					System.out.println("Indique en qué número desea que empiece el sorteo");
					desde=Leer.datoInt();
					System.out.println("Indique en qué número desea que termine el sorteo");
					hasta=Leer.datoInt();
					
					sort1.imprimirGenerado(desde, hasta);	
					System.out.println();
					System.out.println("**********************************************************************************************");
					break;
				case 3:
					
					sort1.imprimirResultado(sort1.comprobarNum(sort1.generarDecimo(desde, hasta), sort1.generarNumAleatorio(hasta, desde)));
					System.out.println();
					System.out.println("**********************************************************************************************");
					
					break;
	
				case 0:
					System.out.println("Saliendo......");
					System.out.println();
					System.out.println("***********************************************************************************");
					
					break;
				default:
					System.out.println("Por favor indique una opción válida, vuelva a intentarlo");
					System.out.println();
					System.out.println("***********************************************************************************");
					
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
