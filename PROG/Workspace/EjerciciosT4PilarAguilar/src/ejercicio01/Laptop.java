package ejercicio01;

public class Laptop extends Ordenador{

	
	private boolean conSeguro;
	private double precioSeguro;
	
	
	public Laptop(int id, String marca, double precioBase, int capacidadHDD, int procesadorHz, boolean conSeguro,
			double precioSeguro) {
		super(id, marca, precioBase, capacidadHDD, procesadorHz);
		this.conSeguro = conSeguro;
		this.precioSeguro = precioSeguro;
	}


	public boolean isConSeguro() {
		return conSeguro;
	}


	public void setConSeguro(boolean conSeguro) {
		this.conSeguro = conSeguro;
	}


	public double getPrecioSeguro() {
		return precioSeguro;
	}


	public void setPrecioSeguro(double precioSeguro) {
		this.precioSeguro = precioSeguro;
	}


	@Override
	public String toString() {
		return "Laptop [conSeguro=" + conSeguro + ", precioSeguro=" + precioSeguro + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	public double calcularPvp(double porGanancia) {
		double pvp;
		if(conSeguro) {
			pvp = super.calcularPvp(porGanancia) + precioSeguro;
			return pvp;
		}else
			return super.calcularPvp(porGanancia);
		
	}
	
}
