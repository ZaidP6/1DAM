package ejercicio02;

public class TempValueException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public TempValueException () {

		super("No puede haber temperaturas menores a -273ºC");
	}
	
}
