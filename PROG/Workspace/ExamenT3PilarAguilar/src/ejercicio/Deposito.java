package ejercicio;

public class Deposito {

	private double radio;
	private double altura;
	private int litrosCapacidad;
	private double costeProd;
	
	
	@Override
	public String toString() {
		return "Deposito [radio=" + radio + ", altura=" + altura + ", litrosCapacidad=" + litrosCapacidad
				+ ", costeProd=" + costeProd + "]";
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int getLitrosCapacidad() {
		return litrosCapacidad;
	}

	public void setLitrosCapacidad(int litrosCapacidad) {
		this.litrosCapacidad = litrosCapacidad;
	}

	public double getCosteProd() {
		return costeProd;
	}

	public void setCosteProd(double costeProd) {
		this.costeProd = costeProd;
	}

	public Deposito(double radio, double altura, int litrosCapacidad, double costeProd) {
		super();
		this.radio = radio;
		this.altura = altura;
		this.litrosCapacidad = litrosCapacidad;
		this.costeProd = costeProd;
	}
	
	public double calcularVolumenDep() {
		double volumen;
		int dos= 2;
		
		volumen = Math.PI * Math.pow(radio, dos) * altura;
		return volumen;
	}
	
	
	
	
	
}
