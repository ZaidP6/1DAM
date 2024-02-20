package ejercicio05_v2;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Empleado []listaEmpleados;
		int numEmpleados = 4;
		
		listaEmpleados = new Empleado[numEmpleados];
		listaEmpleados[0] = new Vendedor(1, "Jose", "Fuenlabrada", 1650.89, 2500, 10);
		listaEmpleados[1] = new Vendedor(1, "Jose", "Fuenlabrada", 1650.89, 2500, 10);
		listaEmpleados[2] = new Gerente(1, "Jose", "Fuenlabrada", 1650.89, 2.5);
		listaEmpleados[3] = new Gerente(1, "Jose", "Fuenlabrada", 1650.89, 1.5);
		
		Oficina o = new Oficina(listaEmpleados, numEmpleados);
		
		System.out.println(o.calcularTotalSueldos());
		
		
		
	}

}
