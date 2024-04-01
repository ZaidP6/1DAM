package ejercicio03;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Operaciones ope1;
		int num;
		
		System.out.println("Indique un número entero.");
		num = Leer.datoInt();
		
		ope1 = new Operaciones();
		
		ope1.imprimirPosivoNegativo(num);
		System.out.println("----------------------------------------------------------------");
		ope1.imprimirParImpar(num);
		
	}

}
