package ejemploConcesionario;

import java.util.ArrayList;
import java.util.List;

public class Coche {

	private String marca;
	private String modelo;
	private String numBastidor;
	private double caballos;
	private double precio;
	private List<Extras> listaExtra = new ArrayList<Extras>();
	private boolean vendido;

	public Coche(String marca, String modelo, String numBastidor, double caballos, double precio,
			List<Extras> listaExtra, boolean vendido) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.numBastidor = numBastidor;
		this.caballos = caballos;
		this.precio = precio;
		this.listaExtra = listaExtra;
		this.vendido = vendido;
	}

	public Coche(String marca, String modelo, String numBastidor, double caballos, double precio, boolean vendido) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.numBastidor = numBastidor;
		this.caballos = caballos;
		this.precio = precio;
		this.vendido = vendido;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getNumBastidor() {
		return numBastidor;
	}

	public void setNumBastidor(String numBastidor) {
		this.numBastidor = numBastidor;
	}

	public double getCaballos() {
		return caballos;
	}

	public void setCaballos(double caballos) {
		this.caballos = caballos;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public List<Extras> getListaExtra() {
		return listaExtra;
	}

	public void setListaExtra(List<Extras> listaExtra) {
		this.listaExtra = listaExtra;
	}

	public boolean isVendido() {
		return vendido;
	}

	public void setVendido(boolean vendido) {
		this.vendido = vendido;
	}

	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", modelo=" + modelo + ", numBastidor=" + numBastidor + ", caballos="
				+ caballos + ", precio=" + precio + ", listaExtra=" + listaExtra + ", vendido=" + vendido + "]";
	}

	public void addExtra(Extras e) {
		listaExtra.add(e);
	}
}
