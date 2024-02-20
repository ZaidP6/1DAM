package ejemploclase04_sobrecarga;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Operaciones oper1;
		double num1,num2;
		
		System.out.println("Inquique los números que desean sumar");
		num1 = Leer.datoDouble();
		num2 = Leer.datoDouble();
		
		oper1.sumar(num1, num2);
		
		
	}

}
