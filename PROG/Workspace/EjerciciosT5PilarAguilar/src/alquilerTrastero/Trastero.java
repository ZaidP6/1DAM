package alquilerTrastero;

public class Trastero implements Comparable<Trastero>{

	//Atributos
	
	private double capacidad; //m2
	private String direccion;
	private int numTrastero;
	private double precio;
	private boolean ocupado;
	
	//Contador para asignar el número de trastero automáticamente
	
	public static int contNumTrastero = 1;

	//Constructor
	public Trastero(double capacidad, String direccion, double precio, boolean ocupado) {
		super();
		this.capacidad = capacidad;
		this.direccion = direccion;
		this.numTrastero = contNumTrastero++; //Por cada instancia aumenta el número
		this.precio = precio;
		this.ocupado = ocupado;
	}

	
	//Getters and Setters
	
	public double getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getNumTrastero() {
		return numTrastero;
	}

	public void setNumTrastero(int numTrastero) {
		this.numTrastero = numTrastero;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isOcupado() {
		return ocupado;
	}

	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}


	//toString
	
	@Override
	public String toString() {
		return "Trastero [Capacidad=" + capacidad + ", Dirección=" + direccion + ", Número de Trastero=" + numTrastero
				+ ", Precio=" + precio + ", Está ocupado=" + ocupado + "]";
	}


	@Override
	public int compareTo(Trastero t) {
		// TODO Auto-generated method stub
		return Integer.compare(this.numTrastero, t.numTrastero);
	}
	
	
	
}
