package ejercicio_02;

public class Circulo {

	private double radio;

	public Circulo(double radio) {
		super();
		this.radio = radio;
	}
	
	
	public double calcularAreaCm() {
		
		double area=0;
		int dos=2;
		
		area= Math.pow(radio, dos)*Math.PI;
		
		return area;
	}
	
	public double calcularAreaMetros() {
		
		
		double conversor=10000;
		
		return calcularAreaCm()/conversor;
	}
	
	public void imprimirAreaCm(double area) {
		
		System.out.printf("El área del círculo es: %.2f cm².",area);
	}
	
	public void imprimirAreaM(double area) {
		
		System.out.printf("El área del círculo es: %.2f m².",area);
	}
}
