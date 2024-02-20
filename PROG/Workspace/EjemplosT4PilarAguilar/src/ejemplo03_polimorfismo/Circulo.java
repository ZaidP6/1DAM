package ejemplo03_polimorfismo;

public class Circulo extends Figura{

	private double radio;
		
	public Circulo (){
	}
	
	public Circulo(String nombre, String color, double radio) {
		super(nombre, color);
		this.radio = radio;
	}
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public String toString() {
		return "Circulo [radio=" + radio + ", toString()=" + super.toString()+"]";
	}
	
	public double calcularArea() {
	double dos = 2;
		return Math.PI* Math.pow(radio, dos);
	}
	
	public double calcularPerimetro() {
	// TODO Auto-generated method stub
		return 2*Math.PI*radio;
	}
	public void mostrarRadianes(){
		System.out.println("Solo estoy en la clase Círculo, porque los demás no pueden tener radianes en concreto tengo 2 pi radianes");
	}
	
}
