package ejemplo01_for_mejorado;

public class Principal {

	
	public static void main(String []args) {
		
		int [] numeros = {5,8,6,9,4,52,7,2,6,47};
		int suma = 0;
		
		
		//Otra forma de un if else, operador ternario
		//Antes del interrogante sería la condición, si se cumple pone lo que hay a la izquierda de los 2 puntos, si es
		//falso hará lo que hay a la derecha.
		
		int verdad;
		verdad = (suma >=0) ? 1 : 0;
		
		//FOREACH
		//Antes de los 2 puntos se define variable del tipo de lo que tenga dentro (del array que se va a recorrer).
		//No se pone i = 0; No se usan ';'.
		//Después de los 2 puntos el nombre del array.
		//Empieza SIEMPRE desde el primer elemento.
		//Siempre llega hasta el final, no hay opción de acabar antes.
		//No hay condición entre los paréntesis.
		
		for (int i : numeros) { 
			
		}
		
		
		
		
	}
	
	
}
