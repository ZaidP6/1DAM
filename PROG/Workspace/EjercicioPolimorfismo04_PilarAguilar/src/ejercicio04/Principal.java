package ejercicio04;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) { //PILAR AGUILAR DIAZ
		// TODO Auto-generated method stub

		int nSerie = 001;
		String nombre;
		double precioUnitario;
		int categoria;
		double IVA;
		int diasCapudcidad;
		double capacidad;
		double descuentoAlimentacion, impuestoLujo;
		Producto p1 = new Alimentacion(0, "Lechuga", 0.64, 1, 6, 2);
		Producto p2 = new Electronica(1, "PS4", 250.78, 2, 21, 500);
		Producto p3 = new Alimentacion(2, "Zanahorias", 1.24, 1, 6, 4);
		Producto p4 = new Electronica(3, "Juego Howarts Legacy", 28.76, 2, 21, 15.9);
		int op,op2;

		
		
		
		
		System.out.println("Bienvenido al Super Salesianos");
		
		do {
			
			menu();
			op = Leer.datoInt();
			
			switch (op) {
				case 1:
					nSerie += 1; 
					System.out.println("Indique el nombre del producto");
					nombre = Leer.dato();
					System.out.println("Indique el precio unitario del producto");
					precioUnitario = Leer.datoDouble();
					System.out.println("Indique el porcentaje del IVA (si es para alimentación recomiendo un 6% y si es de electrónica un 21%)");
					IVA = Leer.datoDouble();
					System.out.println("""
							Elija la categoría:
							1 - Alimentación
							2 - Electrónica
							""");
					categoria = Leer.datoInt();
					
					if(categoria == 1) {
						System.out.println("Indique cuántos días le quedan para caducar (si ya ha caducado, indica cuántos dias lleva caducado en negativo)");
						diasCapudcidad = Leer.datoInt();
						Producto p = new Alimentacion(nSerie, nombre, precioUnitario, categoria, IVA, diasCapudcidad);
						if(diasCapudcidad<0) {
							System.out.println("No te tomes eso que te mueres.");
						}
					}if (categoria == 2) {
						System.out.println("Indique la capacidad en Gb");
						capacidad = Leer.datoDouble();
						Producto p = new Electronica(nSerie, nombre, precioUnitario, categoria, IVA, capacidad);
					}else
						System.out.println("Lo siento, no existen más categorías.");
					
					break;
				case 2:
					System.out.println("Antes que nada, indique el descuento qu tendrán los alimentos si están "
							+ "a 2 días o menos de caducar.");
					descuentoAlimentacion = Leer.datoDouble();
					System.out.println("E indique el impuesto que tendrá la electrónica por ser algo de lujo.");
					impuestoLujo = Leer.datoDouble();
					
					System.out.println();
					System.out.println("Elija el producto a calcular: ");
					System.out.printf("1 - %s\n",p1.getNombre());
					System.out.printf("1 - %s\n",p2.getNombre());
					System.out.printf("1 - %s\n",p3.getNombre());
					System.out.printf("1 - %s\n",p4.getNombre());
					
					op2 = Leer.datoInt();
					System.out.println();
					
					switch (op2) {
						case 1:
							System.out.printf("El producto '%s' cuesta %.2f€\n", p1.getNombre(),p1.calcularPvP(descuentoAlimentacion, impuestoLujo));
							break;
						case 2: 
							System.out.printf("El producto '%s' cuesta %.2f€\n", p2.getNombre(),p2.calcularPvP(descuentoAlimentacion, impuestoLujo));
							break;
						case 3:
							System.out.printf("El producto '%s' cuesta %.2f€\n", p3.getNombre(),p3.calcularPvP(descuentoAlimentacion, impuestoLujo));
							break;
						case 4: 
							System.out.printf("El producto '%s' cuesta %.2f€\n", p4.getNombre(),p4.calcularPvP(descuentoAlimentacion, impuestoLujo));
							break;
						default:
							System.out.println("Lo siento, esa no es una opción.");
							break;
					}
					
				case 3:
					
	
				default:
					break;
			}
			
		}while(op == 0);
		
	}
	
	public static void menu() {
		System.out.println("""
				
				----------------------------------------------------------
				
				Elija entre estas opciones:
				1 - Crear un producto
				2 - Calcular el precio de un producto
				3 - Hacer una compra
				0 - Salir
				
				----------------------------------------------------------
				
				""");
	}

}
