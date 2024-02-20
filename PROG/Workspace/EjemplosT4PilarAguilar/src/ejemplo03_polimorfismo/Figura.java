package ejemplo03_polimorfismo;

public abstract class Figura {

	private String nombre, color;
	/*Es interesante el hecho de que sea una clase abstracta puesto que una figura es un objeto general, no sabemos cómo calcular su área o su perímetro si
	no concretamos qué tipo de figura es de todas formas se podría hacer perfectamente sin necesidad de que la clase Figura sea abstracta*/
	public Figura ( ){
	}
	public Figura (String nombre, String color) {
	this.nombre = nombre;
	this.color = color;
	}
	@Override
	public String toString() {
	return "Figura [nombre=" + nombre + ", color=" + color + "]";
	}
	public abstract double calcularArea ();
	public abstract double calcularPerimetro ();
	public void metodoSoloDeFigura ( ){
	System.out.println("Solo estoy en la clase Figura, sin sobrescribir en las hijas");
	}
	
}
