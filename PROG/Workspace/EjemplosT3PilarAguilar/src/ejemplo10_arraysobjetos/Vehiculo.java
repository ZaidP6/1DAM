package ejemplo10_arraysobjetos;

public class Vehiculo {

	
	private String modelo;
	private int potencia;
	
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	public Vehiculo(String modelo, int potencia) {
		super();
		this.modelo = modelo;
		this.potencia = potencia;
	}
	
	
}
