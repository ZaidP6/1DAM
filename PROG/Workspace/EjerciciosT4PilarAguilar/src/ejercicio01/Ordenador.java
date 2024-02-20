package ejercicio01;

public class Ordenador {

	//capacidad de disco duro, frecuencia del procesador, precio base y marca
	private int id;
	private String marca;
	private double precioBase;
	private int capacidadHDD;
	private int procesadorHz;
	
	
	public Ordenador(int id, String marca, double precioBase, int capacidadHDD, int procesadorHz) {
		super();
		this.id = id;
		this.marca = marca;
		this.precioBase = precioBase;
		this.capacidadHDD = capacidadHDD;
		this.procesadorHz = procesadorHz;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public double getPrecioBase() {
		return precioBase;
	}


	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}


	public int getCapacidadHDD() {
		return capacidadHDD;
	}


	public void setCapacidadHDD(int capacidadHDD) {
		this.capacidadHDD = capacidadHDD;
	}


	public int getProcesadorHz() {
		return procesadorHz;
	}


	public void setProcesadorHz(int procesadorHz) {
		this.procesadorHz = procesadorHz;
	}


	@Override
	public String toString() {
		return "Ordenador [id =" + id + "marca =" + marca + ", precioBase=" + precioBase + ", capacidadHDD=" + capacidadHDD
				+ ", procesadorHz=" + procesadorHz + "]";
	}
	
	public double calcularPvp(double porGanancia) {
		double pvp;
		double cien = 100;
		pvp = precioBase + precioBase*porGanancia/cien;
		return pvp;
	}
	
	
	
	
	
}
