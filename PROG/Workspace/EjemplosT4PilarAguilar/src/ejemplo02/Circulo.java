package ejemplo02;

public class Circulo {

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
	
	
	
}
