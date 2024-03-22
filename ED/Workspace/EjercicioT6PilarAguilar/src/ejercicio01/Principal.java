package ejercicio01;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) throws ExcepcionCodigo {
		// TODO Auto-generated method stub

		
		Empleado em = new Empleado("A1234");
		String codigoEmpleado;
		Caja caja1 = new Caja(1200);
		
		
		try {
			
			System.out.println("Indique su código de empleado");
			codigoEmpleado = Leer.dato();
			
			caja1.comprobarCodigo(codigoEmpleado);
			
		} catch (Exception e) {
			
			System.out.println("Código no válido");
		}
	}

}
