package ejercicio07;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Calcular el precio final de una compra de un solo producto, pidiendo por teclado el precio 
			del producto, la cantidad que se lleva y el porcentaje de descuento que se le aplica, pero solo 
			si el total es mayor de 100 €. Si no es superior, se mostrará el mensaje "No hay descuento".
		 */
		
		
		String prod1, nDes ="Lo siento, no hay descuento", sDes = "Estupendo! Se puede beneficiar del descuento en su compra.";
		double precio, pordescuento, descuento;
		int cant, cien = 100;
		
		System.out.println("Bienvenido al super unitario.");
		System.out.println("Por favor, diga el nombre del producto que se lleva.");
		prod1 = Leer.dato();
		System.out.println("Indique el precio del producto.");
		precio = Leer.datoDouble();
		System.out.println("¿Qué cantidad se lleva?");
		cant = Leer.datoInt();
		System.out.println("");
		
		precio = precio * cant;
		
		System.out.println(precio);
		
		if(precio > cien) {
			
			System.out.println("¿Cuánto porcentaje de descuento lleva?");
			pordescuento = Leer.datoDouble();
			descuento = precio * (pordescuento/cien);
			precio = precio - descuento;
			System.out.println(sDes);
			
		}else	
			System.out.println(nDes);
		
		System.out.println("");
		System.out.printf("El precio total de su compra de %s es de %.2f€.\n", prod1, precio);
		System.out.println("");
		System.out.println("Gracias por visitar el super unitario.");
		
		
	}

}
