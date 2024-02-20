package ejemploclase01;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declarar
		String nombre, calle;
		int edad;
		double notaMedia;
		Alumno alum2;
		//--------------------------------
		//Inicializar
		int edadYo = 24;
		//--------------------------------
		//instanciar metodo con valores
		Alumno alum1 = new Alumno("Pilar Aguilar Díaz", 24, 9.63);
		
		
		System.out.println("Diga el nombre y apellidos");
		nombre = Leer.dato();
		System.out.println("Indique la edad");
		edad = Leer.datoInt();
		System.out.println("Indique la nota media");
		notaMedia = Leer.datoDouble();
		
		//Instanciar
		alum2 = new Alumno(nombre, edad, notaMedia);
		
		//System.out.println(alum1.nombre+alum1.edad+alum1.notaMedia);
		//System.out.println(alum2);
		
		//introducir métodos
		System.out.println("Indique la clalle");
		calle = Leer.dato();
		
		alum1.mostrarDatos("Plaza de España");
		System.out.println("-----------------------------------------------------");
		alum2.mostrarDatos(calle);
		
	}

}
