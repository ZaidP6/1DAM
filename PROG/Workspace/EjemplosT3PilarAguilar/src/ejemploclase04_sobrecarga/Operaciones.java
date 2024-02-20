package ejemploclase04_sobrecarga;

public class Operaciones {

	
	public double sumar (double a, double b) {
		return a+b;
	}
	
	public int sumar (int a, int b) {
		return a+b;
	}
	
	public void sumar (int a, int b) {
		System.out.println(a+b);
	}
	
	
}
