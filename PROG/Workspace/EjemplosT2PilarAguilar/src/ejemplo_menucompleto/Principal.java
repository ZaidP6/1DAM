package ejemplo_menucompleto;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dia;
		
		
		System.out.println("Bienvenido al refranero semanal");
		System.out.println("");
		
		do{
			
			
			System.out.println("-------------------------------------------------------------------");
			System.out.println("");
			System.out.println("1 - lunes");
			System.out.println("2 - martes");
			System.out.println("3 - miércoles");
			System.out.println("4 - jueves");
			System.out.println("5 - viernes");
			System.out.println("6 - sábado");
			System.out.println("7 - domingo");
			System.out.println("0 - Salir");
			System.out.println("");
			System.out.println("-------------------------------------------------------------------");
			
			System.out.println("¿Qué día elije? (Ponga sólo el número).");
			dia = Leer.datoInt();
			System.out.println("");
			
			switch (dia) {
				case 1:
					System.out.println("Ha elegido el lunes.");
					System.out.println("El refrán de hoy es: Un solo pensamiento positivo al comenzar la semana puede hacer la diferencia");
					break;
				
				case 2:
					System.out.println("Ha elegido el martes.");
					System.out.println("El refrán de hoy es: Quiérete, eres la única persona que va pasar el resto de "
							+ "tu vida contigo.");
					break;
				
				case 3:
					System.out.println("Ha elegido el miércoles.");
					System.out.println("El refrán de hoy es: El triunfo no consiste en vencer siempre, sino en no rendirse.");
					
				case 4:
					System.out.println("Ha elegido el jueves.");
					System.out.println("El refrán de hoy es: A veces no es necesario cambiar de página, de hoja, de libro. A veces"
							+ "solo basta con cambiar al forma de interpretar lo que está escrito");
					break;
					
				case 5:
					System.out.println("Ha elegido el viernes.");
					System.out.println("El refrán de hoy es: No dejes para mañana lo que puedas hacer hoy. Pero hoy es viernes, "
							+ "mejor lo dejamos para el lunes.");
					break;
					
				case 6:
					System.out.println("Ha elegido el sábado.");
					System.out.println("El refrán de hoy es: No trates de entender todo, a veces no se trata de entender sino de aceptar.");
					break;
					
				case 7:
					System.out.println("Ha elegido el domingo.");
					System.out.println("El refrán de hoy es: La pacinecia no es la habilidad de saber esperar sino la habilidad de "
							+ "mantener una buena actitud mientras esperas.");
					break;
					
				case 0:
					System.out.println("Vaya...sentimos que quiera irse.");
					break;

				default:
					System.out.println("Opción errónea, inténtelo de nuevo.");
				break;
			}
			
		}while(dia!=0);
		
		System.out.println("");
		System.out.println("Hasta luego!");
		
	}

}
