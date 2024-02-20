/*
 * Primer día(31/10/23): Marisa no viene. Pilar empieza realizando el switch principal, 
 * haciendo el caso 4 y 5 e intentando rellenar el array bidimensinoal.
 * Además Pilar hace el quizz de Ángel.
 * Segundo día (02/11/23): Marisa hace el case 1, Pilar le ayuda (mucho dolor de cabeza).
 * Tercer día (03/11/23): Marisa rellena array aleatoriamente y hace caso 1 y 2. Pilar hace case 3, retoca los casos 
 * 4 y 5 y da formato al código. Para rellenar un poco más el programa, se añade la opción de saber cuál es el 
 * mayor y cuál es l menor. Marisa da formato a la tabla del array bidimensional, mientras Pilar junta todo el código y lo organiza.
 */

/*
 * Nuestro programa se encarga de una parte de la gestión de un refugio, concretamente la parte de adopción de los animales. la vacunación
 * y las donaciones hechas al refugio, también muestra el peludito de mayor edad.
 * Para ello hemos rellenado un array bidimensional con dos aleatorios diferentes, para que en la fila 1 de la tabla lo que corresponde 
 * a la i=0 nos rellene el array con un 1 ó un 2 según sea perro o gato, y en la fila 2 (i=1) nos rellene la edad de los peluditos, a partir
 * de esa información guardada en el array tenemos las diferentes opciones del menú.
 * Como mejoras, se puede implementar que se puedan dar de alta animales leyendo la información por teclado, que puedas escoger qué 
 * mascota vacunar pidiendo la posición en la tabla por teclado, corrección de los posibles errores.
 */



package proyecto;

import java.util.Random;

import utilidades.Leer;


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int op, fila = 2, colu = 10, especie=0, edad=0,desdeEs=1,hastaEs=2,desdeEd=0,
				hastaEd=15,op2=0, mayor=0, menor=0;
		double cuentaRefugio = 0.0, donacion, precio, hastaP= 100.00,desdeP = 30.00;
		String [] nombres = {"Anma", "Bebo", "Perla", "Lula","Ahsoka", "Lennon", "Yoko", "Oreo","Rufo","Ringo"};
		Random rdmPrecio= new Random (System.nanoTime());
		
		int [] [] animales= new int [fila][colu];
		
		Random rdmEspecie= new Random (System.nanoTime());
		Random rdmEdad= new Random (System.nanoTime());
		
		for (int i = 0; i < animales.length; i++) {

			for (int j = 0; j < animales[i].length; j++) {
				
			especie=rdmEspecie.nextInt(hastaEs-desdeEs+1)+desdeEs;
			edad=rdmEdad.nextInt(hastaEd-desdeEd+1)+desdeEd;
			animales[0][j]=especie;
			animales[1][j]=edad;
			}

		}
		
		System.out.println("""
				-------------------------------------------------------
				
				(づ｡◕‿‿◕｡)づ BIENVENIDO AL REFUGIO MAPI (づ｡◕‿‿◕｡)づ
				
				-------------------------------------------------------
				
				""");
		
		do {
			System.out.println();
			System.out.println("Elija una opción del menú");
			System.out.println();
			System.out.println("""
					1. Mostrar los animales del refugio
					2. Adoptar un animal
					3. Vacunar a un animal
					4. Hacer una donación al Refugio
					5. Consultar saldo de la cuenta del Refugio.
					6. Para saber la edad del peludito mas mayor.
					0. Salir

				""");
			
			op = Leer.datoInt();
			System.out.println();
			
			switch (op) {
				case 1:
					
					System.out.println("Recuerde que 1 es un perro y 2 es un gato.");
					System.out.println();
					System.out.println();
					for (int i = 0; i < nombres.length; i++) {
			            System.out.print("  |    "+nombres[i]+"    ");
			            
			        }
			        System.out.println(" ");
			        
			    
			        System.out.println("  -----------------------------------------------------------------------------------"
			                + "----------------------------------------------------------------------------");
			        System.out.println(" ");
			        
			        for (int i = 0; i < animales.length; i++) {
			            for (int j = 0; j < animales[i].length; j++) {
			                
			                System.out.print("  |\t "+animales[i][j]+"    ");
			            }
			            System.out.println(" ");
			            System.out.println("  -----------------------------------------------------------------------------------"
			                    + "----------------------------------------------------------------------------");
			            System.out.println(" ");
			            
			        }
			        
			        System.out.println();
					break;

				case 2:
					System.out.println("¿A cuál de ellos desea adoptar? Escriba en número.");
					System.out.println();
					System.out.println("""
					1. Anma  2.Bebo  3.Perla  4.Lula   5.Ahsoka   6.Lennon   7.Yoko   8.Oreo   9.Rufo   10.Ringo
							""");
					System.out.println("Pulse el número del animal que quiere llevarse.");
					op2=Leer.datoInt();
					switch(op2){

						case 1:
							System.out.println("Ehorabuena ha adoptado a " + nombres[0] + ".");
							break;
						case 2:
							System.out.println("Ehorabuena ha adoptado a " + nombres[1] + ".");
							break;
						case 3:
							System.out.println("Ehorabuena ha adoptado a " + nombres[2] + ".");
							break;
						case 4:
							System.out.println("Ehorabuena ha adoptado a " + nombres[3] + ".");
							break;
						case 5:
							System.out.println("Ehorabuena ha adoptado a " + nombres[4] + ".");
							break;
						case 6:
							System.out.println("Ehorabuena ha adoptado a " + nombres[5] + ".");
							break;
						case 7:
							System.out.println("Ehorabuena ha adoptado a " + nombres[6] + ".");
							break;
						case 8:
							System.out.println("Ehorabuena ha adoptado a " + nombres[7] + ".");
							break;
						case 9:
							System.out.println("Ehorabuena ha adoptado a " + nombres[8] + ".");
							break;
						case 10:
							System.out.println("Ehorabuena ha adoptado a " + nombres[9] + ".");
							break;
						case 0:
							System.out.println("Ohhh sentimos que no quiera a ninguno :(");
							break;
						default:
							System.out.println("Opción no disponible introduzca un número del 1 al 10 para adoptar a un peludito.");
							break;

						}
					break;
					
				case 3:
					
					System.out.println("¡Está en buenas manos!");
					System.out.println();
					System.out.println("Diga qué tipo es:");
					System.out.println("""
							1. Perro
							2. Gato
							""");
					especie = Leer.datoInt();
					precio = rdmPrecio.nextDouble(hastaP-desdeP +1)+desdeP;
					System.out.println();
					System.out.println("-----------------------------------------------------");
					System.out.println();
					
					if (especie == 1) {
						System.out.println("Veamos... Le toca la vacuna de la rabia, la pentavalente y la Leishmaniosis.");
						System.out.println();
						System.out.printf("El precio total de las vacunas es de %.2f€.\n", precio);
						
					} else if(especie == 2){
						System.out.println("Veamos... Le toca la vacuna de la leucemia, la trivalente y la desparasitación.");
						System.out.println();
						System.out.printf("El precio total de las vacunas es de %.2f€.\n", precio);
						
					}else
						System.out.println("Dato erróneo");
					System.out.println();
					System.out.println("------------------------------------------------------");
					cuentaRefugio += precio;
					
					break;
					
				case 4:
					System.out.println("¡Qué bien que quiera hacer una donación!");
					System.out.println("¿Cuánto desea donar?");
					donacion = Leer.datoDouble();
					
					System.out.println();
					System.out.printf("Muchas gracias por contribuir a nuestra causa con una cantidad de %.2f€.\n", donacion);
					cuentaRefugio += donacion;
					
					break;
					
				case 5:
					
					System.out.printf("Actualmente, el saldo de la cuenta es de %.2f€.\n", cuentaRefugio);
					break;
					
				case 6:
					for (int i = 0; i < animales.length; i++) {
						for (int j = 0; j < animales[i].length; j++) {

							if(i==1 && j==0) {
								mayor=animales[i][j];

							}
							if(animales [i][j]>mayor) {

								mayor=animales[i][j];

							}

						}

					}

					System.out.println(" La edad del peludito más mayor es de "+mayor);
					break;
					
				case 0:
					System.out.println("Una pena que se quiera ir.");
					break;
		
				default:
					System.out.println("Error. Inténtelo de nuevo.");
					break;
			}
		} while (op!=0);
		
		System.out.println("""
				
				---------------------------------------------
				
				(づ｡◕‿‿◕｡)づ ¡Hasta la próxima! (づ｡◕‿‿◕｡)づ
				
				---------------------------------------------
				""");
		
		
		
		
		
	}

}
