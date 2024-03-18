package pruebaexamen03;

import java.util.Arrays;

public class Pasteleria {

	private String nombre;
	private int[] cantTartasSemana;
	private double precioCosteLitroMasa;
	
	public Pasteleria(String nombre, int[] cantTartasSemana, double precioCosteLitroMasa) {
		super();
		this.nombre = nombre;
		this.cantTartasSemana = cantTartasSemana;
		this.precioCosteLitroMasa = precioCosteLitroMasa;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int[] getCantTartasSemana() {
		return cantTartasSemana;
	}

	public void setCantTartasSemana(int[] cantTartasSemana) {
		this.cantTartasSemana = cantTartasSemana;
	}

	public double getPrecioCosteLitroMasa() {
		return precioCosteLitroMasa;
	}

	public void setPrecioCosteLitroMasa(double precioCosteLitroMasa) {
		this.precioCosteLitroMasa = precioCosteLitroMasa;
	}

	@Override
	public String toString() {
		return "Pasteleria [nombre=" + nombre + ", cantTartasSemana=" + Arrays.toString(cantTartasSemana)
				+ ", precioCosteLitroMasa=" + precioCosteLitroMasa + "]";
	}
	
	
	public void rellenarArrayTartas (Tarta tarta) {
		cantTartasSemana
	}
	
}
