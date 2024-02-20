package ejercicio03;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Los vehículos a motor pagan un determinado impuesto de circulación. La cantidad a pagar depende
			de la cilindrada, potencia en caballos y categoría de emisiones contaminantes (cero emisiones, ECO,
			tipo B y tipo C). Crear un programa para calcular la cantidad que debe pagar un vehículo dependiendo
			de sus características. (Los vehículos a motor pueden ser motocicletas, coches y furgonetas).
			El impuesto se calcula con una cantidad fija cuyo valor depende del tipo de emisiones por el simple
			hecho de ser un vehículo con motor más:
			- El 60 % de la cilindrada en el caso de las motocicletas.
			- Otra cantidad fija a las furgonetas por ser transporte de mercancías.
			- El 25 % de la potencia en el caso de los coches.
			La jerarquía de clases no tiene mucho sentido en este ejemplo, pero está puesto para reescribir métodos.
			Probar todo en un main sencillo.
		 */
		
		//Vehiculo v1;
		String matricula;
		String marca;
		String modelo;
		int cilindrada;
		double potencia;
		int catEmisiones;
		double impuestoBase = 55.36;
		double incrementoEmi = 15.5;
		
		Coche c1;
		//double impuestoCoche = 25;
		
		Furgoneta f1;
		//double impuestoFurgo=45.89;
		
		//Moto m1;
		double impuestoMoto=60;
		Moto m2;
		m2 = new Moto("1159HCL", "Aprilia", "Shiver", 750, 75, 2, impuestoBase, impuestoMoto);
		
		
		int op;
		
		
		System.out.println("Bienvenido");
		
		
		System.out.println("""
				Elija el tipo de vehículo:
				1 - Coche
				2 - Furgoneta
				3 - Moto
				4 - Vehículo genérico
				""");
		
		op = Leer.datoInt();
		
		switch (op) {
			case 1:
				System.out.println("Indique matrícula");
				matricula = Leer.dato();
				System.out.println("Indique marca");
				marca = Leer.dato();
				System.out.println("Indique modelo");
				modelo = Leer.dato();
				System.out.println("Indique cilindrada");
				cilindrada = Leer.datoInt();
				System.out.println("Indique potencia en kw");
				potencia = Leer.datoDouble();
				System.out.println("""
						Indique categoría de emisiones:
						0 - Zero emisiones
						1 - ECO
						2 - C
						3 - B
						""");
				catEmisiones = Leer.datoInt();
				c1 = new Coche(matricula, marca, modelo, cilindrada, potencia, catEmisiones, impuestoBase);
				System.out.println(c1);
				System.out.printf("El impuesto del %s es de %.2f€.\n",marca,c1.calcularImpuestos(incrementoEmi));
				break;
				
			case 2:
				System.out.println("Indique matrícula");
				matricula = Leer.dato();
				System.out.println("Indique marca");
				marca = Leer.dato();
				System.out.println("Indique modelo");
				modelo = Leer.dato();
				System.out.println("Indique cilindrada");
				cilindrada = Leer.datoInt();
				System.out.println("Indique potencia en kw");
				potencia = Leer.datoDouble();
				System.out.println("""
						Indique categoría de emisiones:
						0 - Zero emisiones
						1 - ECO
						2 - C
						3 - B
						""");
				catEmisiones = Leer.datoInt();
				f1 = new Furgoneta(matricula, marca, modelo, cilindrada, potencia, catEmisiones, impuestoBase);
				System.out.printf("El impuesto del %s es de %.2f€.\n",marca,f1.calcularImpuestos(incrementoEmi));
				f1.toString();
				break;
				
			case 3:
				
				System.out.printf("El impuesto de la %s es de %.2f€.\n",m2.getMarca(),m2.calcularImpuestos(incrementoEmi));
				System.out.println(m2);
				break;
				
			case 4:
				System.out.printf("El impuesto base a día de hoy es de %.2f€\n",impuestoBase);
				break;
	
			default:
				break;
		}
		
		
		
		
	}

}
