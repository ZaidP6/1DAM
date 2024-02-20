package ejercicio11p1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * ¡Qué follón! Mi pueblo ha tenido cortes de agua este verano debido a la sequía. Han tenido que abrir 
			pozos. La capacidad de sacar agua de los pozos se cuenta por litros por segundo y la capacidad del 
			depósito para guardar el agua en metros cúbicos. Serías capaz de crear un programa que calcule 
			cuántos metros cúbicos se sacan de uno de los pozos que tiene un caudal de 8 litros por segundo si está 
			conectado 24 horas.

		 */
		
		double litSeg = 8, cantDepoL, convSeg = 60, segundos, horas = 24, convLm3 = 0.001, cantM3;
		
		segundos = horas * convSeg * convSeg;
		
		cantDepoL = segundos * litSeg;
		cantM3 = cantDepoL * convLm3;
		
		
		System.out.println("/////////////////////////////////////////////////////");
		System.out.println("BIENVENIDO AL PROGRAMA");
		System.out.println("/////////////////////////////////////////////////////");

		System.out.printf("%.0f horas son %.0f segundos.\n", horas, segundos);
		System.out.println("La cantidad del depósito en " + horas + " horas es de " + cantDepoL + " litros.");
		System.out.printf("La capacidad del depósito es de %.2fm%c.\n",cantM3, '³');
		
		System.out.println("/////////////////////////////////////////////////////");
		System.out.println("Gracias por usar el programa");
		
		
		
	}

}
