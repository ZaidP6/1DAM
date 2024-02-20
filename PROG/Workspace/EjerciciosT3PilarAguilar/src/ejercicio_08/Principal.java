package ejercicio_08;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Se desea llevar un control del estado de una cuenta corriente. Una cuenta corriente está caracterizada por su saldo y el nombre del titular y sobre ella se pueden realizar tres tipos de operaciones:
		 
		•Ingresar (cantidad): ingresa en la cuenta una cantidad de dinero dada por el usuario. No imprime de nuevo el saldo, pero sí lo actualiza.
		•Retirar (cantidad): Debe comprobar si queda suficiente saldo y si es así, disminuye la cuenta una determinada cantidad de dinero especificada por el usuario. No imprime de nuevo el saldo, pero sí lo actualiza.
		•Calcular el saldo en dólares americanos. Se le debe pasar el valor de cambio y debe devolver el valor del saldo en dólares.
		•Consultar el saldo. Solo imprime el saldo.
		Supón que la cuenta inicialmente tiene un saldo de cero. Escribe una clase CuentaCorriente que implemente las funcionalidades descritas y un main con un menú para probarlas.*/
		
		int op=0;
		
		double saldo, ingreso,retirada,cambio;
		
		String titular;
		
		CuentaCorriente cuenta1;
		
		System.out.println("-----------------------------------------------------------------------------------------------");
		System.out.println("           						 Bienvenido al banco 'Sin Blanca'                              ");
		System.out.println("-----------------------------------------------------------------------------------------------");
		
		
		
		System.out.println("Indique por favor con qué saldo cuenta en nuestro banco.");
		saldo=Leer.datoDouble();
		
		System.out.println("Indique por favor a nombre de quén está la cuenta.");
		
		titular=Leer.dato();
		
		cuenta1=new CuentaCorriente(saldo,titular);
		
		do {
			
			System.out.println("""
							1. Para Ingresar dinero.
							2. Para retirar dinero.
							3. Para hacer la conversión a dólares.
							4. Para consultar el saldo.
							5. Para ver datos de la cuenta.
							0. Para salir.
					""");
			op=Leer.datoInt();
			
			switch(op) {
			
				case 1:
					System.out.println("Indique por favor la ccantidad que desea ingresar.");
					ingreso=Leer.datoDouble();
					
					cuenta1.ingresarDinero(ingreso);
					System.out.println();
					System.out.println("***********************************************************************************");
					
					break;
					
				case 2:
					
					System.out.println("Indique por favor la cantidad a retirar");
					retirada=Leer.datoDouble();
					
					cuenta1.retirarDinero(retirada, cuenta1.comprobarSaldo(retirada));
					System.out.println();
					System.out.println("***********************************************************************************");
					
					break;
					
				case 3:
					
					System.out.println("Indique por favor a cuánto está el cambio en dólares");
					cambio=Leer.datoDouble();
					cuenta1.imprimirSaldoDolares(cuenta1.calcularCambioDolares(cambio));
					System.out.println();
					System.out.println("***********************************************************************************");
					break;
					
				case 4:
					
					
					cuenta1.imprimirSaldo();
					System.out.println();
					System.out.println("***********************************************************************************");
					break;
					
				case 5:
					
					System.out.println(cuenta1);
					System.out.println();
					System.out.println("***********************************************************************************");
					
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
