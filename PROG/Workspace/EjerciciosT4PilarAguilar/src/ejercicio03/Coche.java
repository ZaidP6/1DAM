package ejercicio03;

public class Coche extends Vehiculo{

	
	double impuestoCoche;

	public Coche(String matricula, String marca, String modelo, int cilindrada, double potencia, int catEmisiones,
			double impuestoBase) {
		super(matricula, marca, modelo, cilindrada, potencia, catEmisiones, impuestoBase);
		// TODO Auto-generated constructor stub
	}

	public double getImpuestoCoche() {
		return impuestoCoche;
	}

	public void setImpuestoCoche(double impuestoCoche) {
		this.impuestoCoche = impuestoCoche;
	}

	@Override
	public String toString() {
		return "Coche [impuestoCoche=" + impuestoCoche + ", toString()=" + super.toString() + "]";
	}

	public double calcularImpuestos(double incrementoEmi) {
		double impuestoTotal;
		double cien=100;
		
		impuestoTotal = super.calcularImpuestos(incrementoEmi) + impuestoCoche*super.getPotencia()/cien;
		return impuestoTotal;
	}
	public void imprimirDatos() {
		
	}
	
	
}
