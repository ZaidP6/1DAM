package ejercicio02;

public class Circulo {

	
	private double radio;


	public Circulo(double radio) {
		super();
		this.radio = radio;
	}
	
	
	
	public double calcularAreaCm() {
		
		double area, dos = 2;
		area = Math.PI*Math.pow(radio, dos);
		return area;
	}
	
	public double calcularAreaMe() {
		int conversor = 10000;
		double areaM2;
		areaM2 = calcularAreaCm()/conversor;
		return areaM2;
	}
	
	public void mostrarAreaM() {
		System.out.printf("El área de un círculo de radio %.2f cm es de %.2fm².\n", radio, calcularAreaMe());
	}
	
	public void mostrarAreaCm() {
		System.out.printf("El área de un círculo de radio %.2f cm es de %.2fcm².\n", radio, calcularAreaCm());
	}
	
}