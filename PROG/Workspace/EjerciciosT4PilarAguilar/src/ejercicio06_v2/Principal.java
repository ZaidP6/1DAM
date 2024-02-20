package ejercicio06_v2;

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
		double mantenimientoFijo = 10, impuestoCajero = 1, regaloIngreso = 1;
		int op, cantCuentas = 6, buscador;
		double ingreso,retirada;
		CuentaBancaria []listaCuentas = new CuentaBancaria[cantCuentas];
		
		
		
		CuentaBancaria cuentaC1 = new CuentaCorriente(1, 1000, mantenimientoFijo, 0);
		CuentaBancaria cuentaJ1 = new CuentaJoven(2, 500, regaloIngreso);
		CuentaBancaria cuentaE1 = new CuentaEmpresa(3, 10000, impuestoCajero);
		CuentaBancaria cuentaC2 = new CuentaCorriente(4, 1000, mantenimientoFijo, 0);
		CuentaBancaria cuentaJ2 = new CuentaJoven(5, 500, regaloIngreso);
		CuentaBancaria cuentaE2 = new CuentaEmpresa(6, 10000, impuestoCajero);
		
		listaCuentas[0] = cuentaC1;
		listaCuentas[1] = cuentaJ1;
		listaCuentas[2] = cuentaE1;
		listaCuentas[3] = cuentaE2;
		listaCuentas[4] = cuentaC2;
		listaCuentas[5] = cuentaJ2;
		
		Oficina o = new Oficina(listaCuentas, cantCuentas);
		
		System.out.println("Indique el número de cuenta que busca");
		buscador = Leer.datoInt();
		
		
		if (o.buscarNCuenta(buscador) == -1) {
			System.out.println("Cuenta no encontrada");
		}else {
			o.mostrarCuenta(listaCuentas[o.buscarNCuenta(buscador)]);
			
			do {
				System.out.println("Indique la operación:");
				System.out.println("""
						1 - Ingresar
						2 - Retirar
						3 - Consultar saldo
						4 - Consultar puntos
						""");
				op = Leer.datoInt();
				
				switch (op) {
					case 1:
						System.out.println("Indique cantidad");
						ingreso = Leer.datoDouble();
						listaCuentas[o.buscarNCuenta(buscador)].ingresarDinero(ingreso);
						System.out.println("Ingreso con éxito");
						break;
					case 2:
						System.out.println("Indique cantidad");
						retirada = Leer.datoDouble();
						listaCuentas[o.buscarNCuenta(buscador)].retirarDinero(retirada);
						
						break;
					case 3:
						listaCuentas[o.buscarNCuenta(buscador)].consultarSaldo();
						break;
						
					case 4:
						if(listaCuentas[o.buscarNCuenta(buscador)] instanceof CuentaCorriente) {
							
							System.out.println("Tiene " + ((CuentaCorriente)listaCuentas[o.buscarNCuenta(buscador)]).calcularPuntos() + " puntos.");
						}
							
						
						
					default:
						break;
				}
			} while (op!=0);
		}
		
		System.out.println("Calculemos cuánto tiene la Oficina del banco.");
		System.out.println(o.calcularTotalCuentas());
		System.out.println("¿Cuánto ha ganado?");
		System.out.println( o.calcularGanancia());
		System.out.println("¿Cuánto ha perdido?");
		System.out.println(o.calcularPerdida());
		
		
		
	}

}
