package ejercicio03;

public class Vehiculo {

	private String matricula;
	private String marca;
	private String modelo;
	private int cilindrada;
	private double potencia;
	private int catEmisiones;
	private double impuestoBase;
	
	
	public Vehiculo(String matricula, String marca, String modelo, int cilindrada, double potencia, int catEmisiones,
			double impuestoBase) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.cilindrada = cilindrada;
		this.potencia = potencia;
		this.catEmisiones = catEmisiones;
		this.impuestoBase = impuestoBase;
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
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


	public int getCilindrada() {
		return cilindrada;
	}


	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}


	public double getPotencia() {
		return potencia;
	}


	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}


	public int getCatEmisiones() {
		return catEmisiones;
	}


	public void setCatEmisiones(int catEmisiones) {
		this.catEmisiones = catEmisiones;
	}


	public double getImpuestoBase() {
		return impuestoBase;
	}


	public void setImpuestoBase(double impuestoBase) {
		this.impuestoBase = impuestoBase;
	}


	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", cilindrada="
				+ cilindrada + ", potencia=" + potencia + ", catEmisiones=" + catEmisiones + ", impuestoBase="
				+ impuestoBase + "]";
	}
	
	
	public double calcularImpuestos(double incrementoEmi) {
		double impuestoTotal;
		
		impuestoTotal = impuestoBase + incrementoEmi*catEmisiones;
		return impuestoTotal;
	}
	
	public void imprimirDatos() {
		
	}
	
}
