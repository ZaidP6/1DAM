package ejercicio_clase03_printf;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		byte edad = 24;
		boolean mayoria = true;
		float precio = 2.50f;
		double pi = Math.PI;
		long gen = 515184511;
		short peq = 568;
		int num = 454484;
		String nombre = "Pilar";
		char letraDNI = 'a';
		
		
		
		double num1 = 5.86;
		double num2 = 8.96;
		double resultado;
		
		System.out.println("*********************************************************************");
		System.out.println("Bienvenido al programa por el cual ha pagado 1000€.");
		System.out.println("*********************************************************************");
		
		
		resultado = num1* num2;
		
		System.out.printf("El resultado de multiplicar %.2f por %.2f es: %.2f.\n", num1, num2, resultado);
		System.out.println("*********************************************************************");
		
		
		
		System.out.printf("Mi nombre es %s, tengo %d años, tengo la mayoría de edad %b, mi número fav es %.8f, tenemos %d genes, un número pequeño es %d, la letra de dni es %s, "
				+ "y el precio de las pipas es de %.2f€.\n ", nombre, edad, mayoria, pi, gen, peq, letraDNI, precio);
		
	}

}
