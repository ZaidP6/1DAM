package ejercicioTipoExamenD;

public class Vehiculo {

	private String matricula;
	private double dimensionM;
	private int anioFab;
	public Vehiculo(String matricula, double dimensionM, int anioFab) {
		super();
		this.matricula = matricula;
		this.dimensionM = dimensionM;
		this.anioFab = anioFab;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public double getDimensionM() {
		return dimensionM;
	}
	public void setDimensionM(double dimensionM) {
		this.dimensionM = dimensionM;
	}
	public int getAnioFab() {
		return anioFab;
	}
	public void setAnioFab(int anioFab) {
		this.anioFab = anioFab;
	}
	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", dimensionM=" + dimensionM + ", anioFab=" + anioFab + "]";
	}
	
	
	
	
	
}
