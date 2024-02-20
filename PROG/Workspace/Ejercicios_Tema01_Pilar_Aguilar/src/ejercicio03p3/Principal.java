package ejercicio03p3;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Hacer un programa que “imite” un cutre ticket de un McDonals que solo vende un tipo de hamburguesas,
			un tipo de patatas y un tipo de refrescos. Se debe pedir por teclado las cantidades de cada uno y el precio de
			una unidad y calcular el total de la venta, leer la cantidad entregada para pagar y el cambio.
			* Quién lo atendió: Vuestro nombre
			* Fecha: (usando un String, no el tipo fecha de java)
			* Patatas medianas: Precio
			* Bebida mediana: precio
			* Hamburguesa Mc Royal: Precio
			* Total a pagar: Suma de los 3 precios.
			* Entregado: Cantidad entregada
			* Cambio: Cambio a devolver
			Se deben usar las variables y operaciones adecuadas y guardar todos los datos intermedios en variables. 
		 */
		
		String nombre = "Zaid", fecha, patMed = "patatas medianas", bebida = "Coca-Cola",comida = "Mc Royal";
		double pPatatas, pBebida, pComida, pTotal, pEntrega, cambio, totBebida, totComida, totPatata;
		int cantPatatas, cantBebidas, cantComida;
		
		
		System.out.println("¿Qué fecha es hoy?");
		fecha = Leer.dato();
		
		System.out.println("¿Cuántas bolsas de "+patMed+ " va a querer?");
		cantPatatas = Leer.datoInt();
		
		System.out.println("¿Cuántos vasos de "+bebida+" quiere?");
		cantBebidas = Leer.datoInt();
		
		System.out.println("¿Cuántas hamburguesas "+comida+" quiere?");
		cantComida = Leer.datoInt();
		
		System.out.println("¿A cuanto están hoy las "+patMed+"?");
		pPatatas = Leer.datoDouble();
		
		System.out.println("¿A cuanto están hoy la "+bebida+"?");
		pBebida = Leer.datoDouble();
		
		System.out.println("¿A cuanto están hoy la "+comida+"?");
		pComida = Leer.datoDouble();
		
		
		totBebida = cantBebidas * pBebida;
		totComida = cantComida * pComida;
		totPatata = cantPatatas * pPatatas;
		pTotal = totBebida + totComida + totPatata;
		
		System.out.println("-------------------------------------------------------------------------------------------");
		System.out.println("Bienvenido al restaurante de Zaid");
		System.out.println("-------------------------------------------------------------------------------------------");
		System.out.println("\t\t\t\tLe atiende "+nombre+" a día "+fecha+".");
		System.out.println("");
		System.out.println("Artículo\t\tCantidad\t\tprecio/u/\t\tPrecio Artículos");
		System.out.println("-------------------------------------------------------------------------------------------");
		System.out.printf("%s\t\t   %d\t\t\t %.2f€\t\t\t  %.2f€\n", comida, cantComida, pComida, totComida);
		System.out.println("");
		System.out.printf("%s\t\t   %d\t\t\t %.2f€\t\t\t  %.2f€\n", bebida, cantBebidas, pBebida, totBebida);
		System.out.println("");
		System.out.printf("%s\t   %d\t\t\t %.2f€\t\t\t   %.2f€\n", patMed, cantPatatas, pPatatas, totPatata);
		System.out.println("");
		System.out.println("-------------------------------------------------------------------------------------------");
		System.out.printf("\t\t\tEl total del pedido es: %.2f€\n", pTotal);
		
		System.out.println("¿Cuánto va a entregar?");
		pEntrega = Leer.datoDouble();
		System.out.println("Perfecto, su ticket quedaría así:");
		System.out.println("-------------------------------------------------------------------------------------------");
		System.out.println("");
		System.out.println("");
		
		cambio = pEntrega - pTotal;
		
		System.out.println("-------------------------------------------------------------------------------------------");
		System.out.println("Bienvenido al restaurante de Zaid");
		System.out.println("-------------------------------------------------------------------------------------------");
		System.out.println("\t\t\t  Le atiende "+nombre+" a día "+fecha+".");
		System.out.println("");
		System.out.println("Artículo\t\tCantidad\t\tprecio/u/\t\tPrecio Artículos");
		System.out.println("-------------------------------------------------------------------------------------------");
		System.out.printf("%s\t\t   %d\t\t\t %.2f€\t\t\t  %.2f€\n", comida, cantComida, pComida, totComida);
		System.out.println("");
		System.out.printf("%s\t\t   %d\t\t\t %.2f€\t\t\t  %.2f€\n", bebida, cantBebidas, pBebida, totBebida);
		System.out.println("");
		System.out.printf("%s\t   %d\t\t\t %.2f€\t\t\t   %.2f€\n", patMed, cantPatatas, pPatatas, totPatata);
		System.out.println("");
		System.out.println("-------------------------------------------------------------------------------------------");
		System.out.printf("\t\t\tEl total del pedido es: %.2f€\n", pTotal);
		System.out.printf("\t\t\t\tSe ha entregado %.2f€.\n",pEntrega);
		System.out.printf("\t\t\t\t     Se devuelve %.2f€.\n", cambio);
		System.out.println("");
		System.out.println("-------------------------------------------------------------------------------------------");
		System.out.println("\t\t\t\tGRACIAS POR LA VISITA");
		
		
	}

}
