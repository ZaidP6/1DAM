package ejemplo01;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//comprobar nivel de jerarquia
				//a mas generico mas al final
				// a mas específica la excepcion, mas al principio
				
		Calculadora c = new Calculadora();
		int num, den;
		boolean salida = false;
		
		
		
		do {
			
			try {
				System.out.println("Indique numerador");
				num = Leer.datoInt();
				System.out.println("Indique denominador");
				den = Leer.datoInt();
				System.out.println(c.dvidir(num, den));
				System.out.println(c.raizCuadrada(-4)); 
					//no se puede hacer con raiz cuadrada porque 
					//devuelve isNaN o que no se puede
				salida = true;
			}catch (ArithmeticException e) {
					System.out.println("No puede dividir entre 0");
			}catch (NumberFormatException e) {
				System.out.println("Dato incorrecto, debe ser un entero");
			}catch (Exception e) {
				System.err.println("Error inesperado!"); 
					//Cuidado! System.err.println() se ejecuta mas lento, mejor usar out
			}
		}while (!salida );
		
	}

}
