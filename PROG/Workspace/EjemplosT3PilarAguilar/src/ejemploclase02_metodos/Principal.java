package ejemploclase02_metodos;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int op;
		double notaMedia, notaProg, notaBD;
		String nombre;
		
		
		do {
			System.out.println("Indique el nombre");
			nombre = Leer.dato();
			System.out.println("Indique la nota de programación");
			notaProg = Leer.datoDouble();
			System.out.println("Indique la nota de base de datos");
			notaBD = Leer.datoDouble();
			
			System.out.println("""
					Indique la opción:
					1 - Calcular nota media
					2 - Mostrar nota media del alumno
					""");
			
			Alumno alum1 = new Alumno(nombre,notaProg,notaBD );
			op = Leer.datoInt();
			
			switch (op) {
				case 1:
					notaMedia = alum1.calcularMedia();
					break;
				case 2: 
					notaMedia = alum1.calcularMedia();
					alum1.mostrarNotaMedia(notaMedia);
					break;
				default:
					break;
			}
			
		}while(op!=0);		
		
		
	}

}
