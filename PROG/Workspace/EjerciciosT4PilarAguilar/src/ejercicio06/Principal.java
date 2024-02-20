package ejercicio06;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Implementar un programa para un banco, donde se gestione la parte de cuentas de los usuarios. Este 
			banco solo y exclusivamente tiene 3 tipos de cuentas, cuenta corriente, cuenta joven y cuenta empresa. 
			Cada una de ellas se caracteriza por: 
			• La cuenta corriente paga mantenimiento fijo y acumula puntos cuando se usa en el cajero.
			• La cuenta joven no tiene mantenimiento y además, se le regala 1€ cada vez que hace un ingreso.
			• La cuenta de empresa, no tiene cuota de mantenimiento, pero el banco cobra un euro a la 
			empresa cuando saca dinero ya que está pensada para hacer transferencias y no usar dinero en 
			efectivo.
			El cliente tendrá un saldo, podrá sacar o meter dinero (reintegro e ingreso) por el cajero y dependiendo 
			del tipo de cuenta se le hará un determinado cálculo y se le actualizará el saldo.
			Hacer una clase oficina con un array de cuentas y probar los métodos anteriores, calcular el total de 
			dinero que tiene la oficina entre todas las cuentas, cuánto se ha ganado la oficina por las veces que las 
			cuentas de empresa han sacado dinero, cuánto ha gastado la oficina del banco en regalar el euro cuando 
			se ingresa dinero en una cuenta joven, etc.
			Ampliación: Quien lo desee, puede plantearse alguna clase más, como la clase cliente que puede tener 
			varias cuentas o que en la clase Oficina también haya un atributo que sea la lista de Clientes.
		 */
		double mantenimientoFijo = 10.25, impuestoCajero = 1, regaloIngreso = 1;
		int op, cantCuentas = 3, op2;
		double ingreso,retirada;
		CuentaBancaria []listaCuentas = new CuentaBancaria[cantCuentas];
		
		
		
		CuentaBancaria cuentaC1 = new CuentaCorriente(1, 1000, mantenimientoFijo, 0);
		CuentaBancaria cuentaJ1 = new CuentaJoven(2, 500, regaloIngreso);
		CuentaBancaria cuentaE1 = new CuentaEmpresa(3, 10000, impuestoCajero);
		listaCuentas[0] = cuentaC1;
		listaCuentas[1] = cuentaJ1;
		listaCuentas[2] = cuentaE1;
		
		Oficina o = new Oficina(listaCuentas, cantCuentas);
		//Cliente c = new Cliente("77858142K", "Luismi",cuentaC1);
		
		
		System.out.println("Bienvenido");
		
		do {
			System.out.println("Indique el tipo de cuenta que tiene o si es una oficina");
			System.out.println("""
					1 - Cuenta Corriente
					2 - Cuenta Joven
					3 - Cuenta Empresa
					4 - Oficina
					0 - Salir
					""");
			op = Leer.datoInt();
			
			switch (op) {
				case 1:
					System.out.println("¿Qué operación desea realizar?");
					System.out.println("""
							1 - Ingresar dinero
							2 - Retirar dinero
							3 - Consultar saldo
							""");
					op2 = Leer.datoInt();
					
					switch (op2) {
						case 1:
							System.out.println("¿Cuánto desea ingresar?");
							ingreso = Leer.datoDouble();
							cuentaC1.ingresarDinero(ingreso);
							System.out.printf("Ahora tiene %.2f€ en su cuenta.\n",cuentaC1.getSaldo());
							break;
							
						case 2:
							System.out.println("¿Cuánto desea retirar?");
							retirada = Leer.datoDouble();
							cuentaC1.retirarDinero(retirada);
							System.out.printf("Ahora tiene %.2f€ en su cuenta.\n",cuentaC1.getSaldo());
							break;
							
						case 3:
							cuentaC1.consultarSaldo();
							break;
		
						default:
							System.out.println("Vaya, eso no es una opción.");
							break;
						}
					break;
				case 2:
					System.out.println("¿Qué operación desea realizar?");
					System.out.println("""
							1 - Ingresar dinero
							2 - Retirar dinero
							3 - Consultar saldo
							""");
					op2 = Leer.datoInt();
					
					switch (op2) {
						case 1:
							System.out.println("¿Cuánto desea ingresar?");
							ingreso = Leer.datoDouble();
							cuentaJ1.ingresarDinero(ingreso);
							System.out.printf("Ahora tiene %.2f€ en su cuenta.\n",cuentaJ1.getSaldo());
							break;
							
						case 2:
							System.out.println("¿Cuánto desea retirar?");
							retirada = Leer.datoDouble();
							cuentaJ1.retirarDinero(retirada);
							System.out.printf("Ahora tiene %.2f€ en su cuenta.\n",cuentaJ1.getSaldo());
							break;
							
						case 3:
							cuentaJ1.consultarSaldo();
							break;
		
						default:
							System.out.println("Vaya, eso no es una opción.");
							break;
						}
					break;
					
				case 3:
					System.out.println("¿Qué operación desea realizar?");
					System.out.println("""
							1 - Ingresar dinero
							2 - Retirar dinero
							3 - Consultar saldo
							""");
					op2 = Leer.datoInt();
					
					switch (op2) {
						case 1:
							System.out.println("¿Cuánto desea ingresar?");
							ingreso = Leer.datoDouble();
							cuentaE1.ingresarDinero(ingreso);
							System.out.printf("Ahora tiene %.2f€ en su cuenta.\n",cuentaE1.getSaldo());
							break;
							
						case 2:
							System.out.println("¿Cuánto desea retirar?");
							retirada = Leer.datoDouble();
							cuentaE1.retirarDinero(retirada);
							System.out.printf("Ahora tiene %.2f€ en su cuenta.\n",cuentaE1.getSaldo());
							break;
							
						case 3:
							cuentaE1.consultarSaldo();
							break;
		
						default:
							System.out.println("Vaya, eso no es una opción.");
							break;
						}
					break;
					
				case 4:
					System.out.println("¿Qué operación desea realizar?");
					System.out.println("""
							1 - Consultar dinero total de cuentas
							2 - Consultar ganancias
							3 - Consultar pérdidas
							""");
					op2 = Leer.datoInt();
					
					switch (op2) {
						case 1:
							o.calcularTotalCuentas();
							break;
							
						case 2:
							o.calcularGanancia();
							break;
							
						case 3:
							o.calcularPerdida();
							break;
		
						default:
							System.out.println("Vaya, eso no es una opción.");
							break;
						}
					break;
				case 0:
					System.out.println("Hasta pronto!");
					break;
					
				default:
					System.out.println("Vaya, eso no es una opción.");
					break;
			
					
			}
		} while (op!=0);
		
		
		
	}

}
