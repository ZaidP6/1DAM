package ejercicio01;

public class Avion implements IAterrizaje{

	private int id;
	private double longitud;
	private double litrosCombustible;
	
	
	public Avion(int id, double longitud, double litrosCombustible) {
		super();
		this.id = id;
		this.longitud = longitud;
		this.litrosCombustible = litrosCombustible;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getLongitud() {
		return longitud;
	}
	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}
	public double getLitrosCombustible() {
		return litrosCombustible;
	}
	public void setLitrosCombustible(double litrosCombustible) {
		this.litrosCombustible = litrosCombustible;
	}
	@Override
	public String toString() {
		return "Avion [id=" + id + ", longitud=" + longitud + ", litrosCombustible=" + litrosCombustible + "]";
	}
	@Override
	public double calcularPrecioAterrizaje(int id, double porcentaje) {
		int cantEuros = 2;
		int cien = 100;
		double maxCombustible = 20000;
		
		if (litrosCombustible> maxCombustible) {
			return (cantEuros*longitud) + cien;
		}
		
		return cantEuros*longitud;
	}
	
	
	
	
	
	
}
