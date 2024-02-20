package ejercicio02_p2;

public class Habitacion {

	private int idHab;
	private char tipo;
	private double precio;
	private String nombre;
	private int dias;
	private boolean limpia;
	private boolean extraMiniBar;
	
	
	public Habitacion(int idHab, char tipo, double precio, String nombre, int dias, boolean limpia,
			boolean extraMiniBar) {
		super();
		this.idHab = idHab;
		this.tipo = tipo;
		this.precio = precio;
		this.nombre = nombre;
		this.dias = dias;
		this.limpia = limpia;
		this.extraMiniBar = extraMiniBar;
	}
	public int getIdHab() {
		return idHab;
	}
	public void setIdHab(int idHab) {
		this.idHab = idHab;
	}
	public char getTipo() {
		return tipo;
	}
	public void setTipo(char tipo) {
		this.tipo = tipo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getDias() {
		return dias;
	}
	public void setDias(int dias) {
		this.dias = dias;
	}
	public boolean isLimpia() {
		return limpia;
	}
	public void setLimpia(boolean limpia) {
		this.limpia = limpia;
	}
	public boolean isExtraMiniBar() {
		return extraMiniBar;
	}
	public void setExtraMiniBar(boolean extraMiniBar) {
		this.extraMiniBar = extraMiniBar;
	}
	@Override
	public String toString() {
		return "Habitacion [idHab=" + idHab + ", tipo=" + tipo + ", precio=" + precio + ", nombre=" + nombre + ", dias="
				+ dias + ", limpia=" + limpia + ", extraMiniBar=" + extraMiniBar + "]";
	}
	
	
	
	
	
	
	
}
