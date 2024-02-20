package ejercicio_ar06;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double [] preciosMes;
		String [] meses = {"Enero", "Febrero","Marzo", "Abril", "Mayo", "Junio"};
		int tam = 6;
		
		preciosMes = new double[tam];
		
		
		System.out.println("Bienvenido");
		System.out.println("Introduce los gastos mensuales de los 6 primeros meses.");
		
		for (int i = 0; i < meses.length; i++) {
			preciosMes[i] = Leer.datoDouble();
		}
		
		System.out.println(meses[0]+"\t\t\t"+meses[1]+"\t\t\t"+meses[2]+"\t\t\t"+meses[3]+"\t\t\t"+meses[4]+"\t\t\t"+meses[5]);
		
		
	}

}
