package ejemplo06_ordenar;

public class Corredor implements Comparable<Corredor>{

	
	private int dorsal;
	private double marca;
	private String nombre;
	
	@Override
	public String toString() {
		return "Corredor [dorsal=" + dorsal + ", marca=" + marca + ", nombre=" + nombre + "]";
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public double getMarca() {
		return marca;
	}

	public void setMarca(double marca) {
		this.marca = marca;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Corredor(int dorsal, double marca, String nombre) {
		super();
		this.dorsal = dorsal;
		this.marca = marca;
		this.nombre = nombre;
	}

	@Override
	/**
	 * @param Corredor
	 */
	public int compareTo(Corredor c) { //coge un objeto y lo compara con otro Siempre compara un atributo del objeto
		if (this.dorsal<c.dorsal) {
			return -1;
		}else {
			if (this.dorsal>c.dorsal) {
				return 1;
			}
			return 0;
		}
		
	}
	
	
	
	
	
	
}
