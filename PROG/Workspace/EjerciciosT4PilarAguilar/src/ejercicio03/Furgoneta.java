package ejercicio03;

public class Furgoneta extends Vehiculo{

	double impuestoFurgo;

	public Furgoneta(String matricula, String marca, String modelo, int cilindrada, double potencia, int catEmisiones,
			double impuestoBase) {
		super(matricula, marca, modelo, cilindrada, potencia, catEmisiones, impuestoBase);
		// TODO Auto-generated constructor stub
	}

	public double getImpuestoFurgo() {
		return impuestoFurgo;
	}

	public void setImpuestoFurgo(double impuestoFurgo) {
		this.impuestoFurgo = impuestoFurgo;
	}

	@Override
	public String toString() {
		return "Furgoneta [impuestoFurgo=" + impuestoFurgo + ", toString()=" + super.toString() + "]";
	}
	
	public double calcularImpuestos(double incrementoEmi) {
		double impuestoTotal;
		
		impuestoTotal = super.calcularImpuestos(incrementoEmi) + impuestoFurgo;
		return impuestoTotal;
	}
}
