package ejemplo01;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declaración de variables
		Trabajador miTrabajador;
		Empleado miEmpleado;
		Consultor miConsultor;
		
		
		//Creación de objetos
		miTrabajador= new Trabajador ("Bill Gates", "456");
		miEmpleado= new Empleado ("Steve Jobs", "123",24000.0);
		miConsultor= new Consultor("Bill Gates", "456", 10, 50.0);
		
		
		//Mostrar datos
		System.out.println(miTrabajador);
		System.out.println(miEmpleado);
		System.out.println(miConsultor);
		
		
		System.out.println(miEmpleado.calcularPaga());
		System.out.println(miConsultor.calcularPaga());
		System.out.println(miTrabajador.calcularPaga());
		
		
	}

}
