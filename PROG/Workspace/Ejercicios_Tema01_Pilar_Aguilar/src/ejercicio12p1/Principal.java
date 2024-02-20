package ejercicio12p1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Imprime por pantalla un ticket de una tienda. El empleado se llama “John Snow” y el cliente ha 
			comprado 4 latas de Coca Cola a 1.20 €, una bolsa de pipas de 0.40 € y una espada llamada “Garra” 
			que cuesta 150 €. No hace falta calcular le devolución de la compra, pero puedes hacerlo si inicializas 
			una variable con el dinero entregado por el cliente.
		 */
		
		String empleado = "John Snow", lata = "Coca-Cola", pipas = "pipas", espada = "espada Garra";
		double totalCompra, precioLata = 1.2, precioPipas = 0.4, precioGarra = 150, pTotLata, pTotPipa, pTotSword, cantDevol, cantEntregada = 200;
		int cantLatas = 4, cantPipas = 1, cantSword = 1;
		
		
		
		pTotLata = cantLatas * precioLata;
		pTotPipa = cantPipas * precioPipas;
		pTotSword = cantSword * precioGarra;
		totalCompra = pTotLata + pTotPipa + pTotSword;
		cantDevol = cantEntregada - totalCompra; 
		
		System.out.println("\t\t\t\tBIENVENIDO A LA TIENDA MANOLI");
		System.out.println("Le atiende: " + empleado +"\t\t\t\t\t\t Fecha: 28/09/23\tHora:16:30");
		System.out.println("*********************************************************************************************************");
		System.out.println("Artículo\t\t\tCantidad\t\tprecio/u/\t\tPrecio Artículos");
		System.out.println("*********************************************************************************************************");
		System.out.println(lata + "\t\t\t   " + cantLatas + "\t\t\t  " +  precioLata + "€\t\t\t      " + pTotLata  + "€");
		System.out.println(pipas + "\t\t\t\t   " + cantPipas + "\t\t\t  " +precioPipas + "€\t\t\t      " + pTotLata  + "€");
		System.out.println(espada + "\t\t\t   " + cantSword + "\t\t\t" + precioGarra + "€\t\t\t    " + pTotSword  + "€");

		System.out.println("*********************************************************************************************************");

		System.out.printf("\t\t\t\t El total de la compra es de %.2f€\t\t\t\t\t\t\n", totalCompra);
		System.out.printf("\tSe ha entregado: %.2f€\t\t\t\tA devolver: %.2f€\n", cantEntregada, cantDevol);
		
		System.out.println("*********************************************************************************************************");

		System.out.println("\t\t\t\tGRACIAS POR COMPRAR EN TIENDA MANOLI!");
		
		
	}

}
