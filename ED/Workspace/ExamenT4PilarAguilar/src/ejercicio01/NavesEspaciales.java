package ejercicio01;

public class NavesEspaciales extends Avion{

	int numMotores;

	public NavesEspaciales(int id, double longitud, double litrosCombustible, int numMotores) {
		super(id, longitud, litrosCombustible);
		this.numMotores = numMotores;
	}

	public int getNumMotores() {
		return numMotores;
	}

	public void setNumMotores(int numMotores) {
		this.numMotores = numMotores;
	}

	@Override
	public String toString() {
		return "NavesEspaciales [numMotores=" + numMotores + ", toString()=" + super.toString() + "]";
	}
	
	public double calcularPrecioAterrizaje(double porcentaje) {
		int cantEuros = 2;
		int cien = 100;
		double maxCombustible = 20000;
		double total = 0;
		
		
		if (super.getLitrosCombustible()> maxCombustible) {
			total = ((cantEuros*super.getLongitud()) + cien);
			
			if(numMotores>4) {
				total = total * (1+(porcentaje/cien));
			}
			return total;
		}else {
			if(numMotores>4) {
				total = (cantEuros*super.getLongitud())* (1+(porcentaje/cien));
				return total;
			}
			return (cantEuros*super.getLongitud());
		}
		
		
	}
	
	public void avisarExtraterrestres() {
			System.out.println("Nave espacial, llamen a los Men In Black");
	}
	
	
}
