package ejercicio01;

public class CazasMilitares extends Avion{

	
	private int numMisiles;

	public CazasMilitares(int id, double longitud, double litrosCombustible, int numMisiles) {
		super(id, longitud, litrosCombustible);
		this.numMisiles = numMisiles;
	}

	public int getNumMisiles() {
		return numMisiles;
	}

	public void setNumMisiles(int numMisiles) {
		this.numMisiles = numMisiles;
	}

	@Override
	public String toString() {
		return "CazasMilitares [numMisiles=" + numMisiles + ", toString()=" + super.toString() + "]";
	}
	
	public double calcularPrecioAterrizaje(int numMisiles) {
		int cantEuros = 2;
		int cien = 100;
		double maxCombustible = 20000;
		
		if (super.getLitrosCombustible()> maxCombustible) {
			return (cantEuros*super.getLongitud()) + cien;
		}
		
		return cantEuros*super.getLongitud();
	}
	
	
	
}
