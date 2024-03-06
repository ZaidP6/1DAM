package ejercicio01;

public class Carta implements Comparable<Carta>{

	private String nombre;
	private String palo;
	private int numero;
	private int puntos;
	public Carta(String nombre, String palo, int numero, int puntos) {
		super();
		this.nombre = nombre;
		this.palo = palo;
		this.numero = numero;
		this.puntos = puntos;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPalo() {
		return palo;
	}
	public void setPalo(String palo) {
		this.palo = palo;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getPuntos() {
		return puntos;
	}
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	@Override
	public String toString() {
		return "Carta [nombre=" + nombre + ", palo=" + palo + ", numero=" + numero + ", puntos=" + puntos + "]";
	}
	@Override
	public int compareTo(Carta c) {
		
		return this.palo.compareToIgnoreCase(c.getPalo());
	}
	
	public void asignarPuntos() {
		int puntuacion11 = 11;
		Carta c = null;
		if(c.getNumero() == 1 || c.getNombre().equalsIgnoreCase("as")) {
			c.setPuntos(puntuacion11);
		}
	}
	
	
	
}
