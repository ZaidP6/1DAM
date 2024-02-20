package ejemplo03_polimorfismo;

public class Cuadrado extends Figura{

	private double lado;
	
	public Cuadrado ( ){
	}
	public Cuadrado(String nombre, String color, double lado) {
	super(nombre, color);
	this.lado=lado;
	}
	public double getLado() {
	return lado;
	}
	public void setLado(double lado) {
	this.lado = lado;
	}
	
	public String toString() {
		return "Cuadrado [lado=" + lado + ", toString()=" + super.toString() + "]";
	}
		@Override
	public double calcularArea() {
		return lado*lado;
	}
		@Override
	public double calcularPerimetro() {
		return lado*4;
	}
	public void mostrarLados (){
		System.out.println("Solo estoy en la clase Cuadrado porque los demás no tienen lados, en concreto tengo 4 lados ");
	}
}
