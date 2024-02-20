package ejercicio03;

public class Moto extends Vehiculo{

	double impuestoMoto;

	public Moto(String matricula, String marca, String modelo, int cilindrada, double potencia, int catEmisiones,
			double impuestoBase, double impuestoMoto) {
		super(matricula, marca, modelo, cilindrada, potencia, catEmisiones, impuestoBase);
		this.impuestoMoto = impuestoMoto;
	}

	public double getImpuestoMoto() {
		return impuestoMoto;
	}

	public void setImpuestoMoto(double impuestoMoto) {
		this.impuestoMoto = impuestoMoto;
	}

	@Override
	public String toString() {
		return "Moto [impuestoMoto=" + impuestoMoto + ", toString()=" + super.toString() + "]";
	}
	public double calcularImpuestos(double incrementoEmi) {
		double impuestoTotal;
		double cien=100;
		
		impuestoTotal = super.calcularImpuestos(incrementoEmi) + impuestoMoto*super.getCilindrada()/cien;
		return impuestoTotal;
	}
	
	
}
