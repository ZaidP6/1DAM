package ejercicio_clase01_holamundo;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double num1 = 7;
		double num2 = 34;
		double resultado;
		int edad;
		int anio;
		
		
		System.out.println("Que pasa broh");
		System.out.println("tengo hambre");
		System.out.println("Quiero recreo");
		System.out.println("Aunque me da perza tener que ir a Mercadona");
		System.out.println("Sigo teniendo hambre...Mucha hambre");
		resultado = num1 + num2 + Math.PI;
		
		edad = 52;
		anio = 2050;
		
		System.out.printf("El resultado de la suma es: %.2f.\n", (resultado));
		
		System.out.println("********************************************");
		System.out.println("En el año " + anio + " tendré " + edad + " años.");
		System.out.println("********************************************");
	}

}
