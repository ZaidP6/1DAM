package ejemplo02;

public class EjemploInferenciaInvalida {

	public static void main(String []args) {
		
		var x; //error de compilación
		
		var resultado = obtenerResultado(); 
	}
	

	//Método que devuelve un valor ambiguo
	static <T> T obtenerResultado() {
		
		return null;
	}
	
	
	
}
