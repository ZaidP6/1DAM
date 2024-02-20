package ejercicio02;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombreCancion, plat = "Spotify";
		int cantReproducciones, cantLikes;
		short top5;
		float precioSemTop5, precio1Repro = 0.004f, ganLikes, cien = 100, ganTop5, totGanCancion, ganTotPer, iphone = 3000f, totCuenta;
		byte cantPersonas, porGanLikes;
		
		
		/*
		 * la cantidad de reproducciones no creo que pase de los 100 000 000 ni el número de likes, por eso el int. Las semanas del top 5 pueden pasar de 127 por lo que he 
		 * usado short. Las variable de float porque no necesito más de 8 decimales. Y la cantidad de personas y el porcentaje de las ganancias porque no van a pasar de 100
		 * (suponiendo que no es una orquesta xD).
		 */
		
		System.out.println("----------------------------------------------------------");
		System.out.println("");
		System.out.println("Bienvenidos al programa.");
		System.out.println("");
		System.out.println("----------------------------------------------------------");
		
		System.out.println("AVISO: el nombre de l canción no puede tener más de 16 caracteres, la canción no puede estar"
				+ "compuesta por mas de 127 personas.");
		
		System.out.println("");
		
		
		System.out.println("Por favor, indique el nombre de la canción que desea calcular.");
		nombreCancion = Leer.dato();
		System.out.println("Por favor, indique cuántas repodroducciones tiene la canción " + nombreCancion + ".");
		cantReproducciones = Leer.datoInt();
		
		System.out.println("¿Cuántas semanas ha estado la canción " + nombreCancion + " en el top 5?");
		top5 = Leer.datoShort();
		
		System.out.println("¿Cuánto paga " + plat + " por estar una semana en el top 5?");
		precioSemTop5 = Leer.datoFloat();
		
		System.out.println("¿Cuántas personas han compuesto la canción?");
		cantPersonas = (byte) Leer.datoShort();
		
		System.out.println("¿Cuántos likes tiene actualemnte?");
		cantLikes = Leer.datoInt();
		
		System.out.println("¿Qué porcentaje de ganancias se lleva con los likes?");
		porGanLikes = (byte) Leer.datoShort();
		
		ganLikes = cantLikes * (porGanLikes / cien);
		ganTop5 = top5 * precioSemTop5;
		totGanCancion = ganLikes + ganTop5;
		
		System.out.println("");
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Nombre canción\t\tNúmero reproducciones\t\tTop 5\t\tGanancias Top5\t\tNº Likes\t\tGanancias Likes");
		System.out.println("");
		System.out.printf("%s\t\t   %d\t\t\t %d\t\t $%.2f\t\t%d\t\t $%.2f\n", nombreCancion, cantReproducciones, top5,ganTop5, cantLikes, ganLikes);
		System.out.println("");
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("");
		
		System.out.printf("\t\t\tEl total de las ganancias por canción es de $%.2f.\n", totGanCancion);
		System.out.println("");
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
		
		ganTotPer = totGanCancion / cantPersonas;
		totCuenta = ganTotPer - iphone;
		System.out.printf("Cada integrante ha ganado $%.2f.\n", ganTotPer);
		System.out.println("");
		System.out.printf("Si uno de ellos quisiera comprase el nuevo iPhone, le quedaria una cuantía de $%.2f.\n", totCuenta);
		
		
		System.out.println("----------------------------------------------------------");
		System.out.println("");
		System.out.println("¡Gracias por usar el programa!");
		System.out.println("");
		System.out.println("----------------------------------------------------------");
		
	}

}
