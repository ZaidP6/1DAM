package ejercicio4;

public class Lineadeventa {

	private Producto p;
	private int cantidad;
	
	
	
	public Lineadeventa(Producto p, int cantidad) {
		super();
		this.p = p;
		this.cantidad = cantidad;
	}



	public Producto getP() {
		return p;
	}



	public void setP(Producto p) {
		this.p = p;
	}



	public int getCantidad() {
		return cantidad;
	}



	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}



	@Override
	public String toString() {
		return "Lineadeventa [p=" + p + ", cantidad=" + cantidad + "]";
	}
	
	
	
	public double calcularPrecioTotalLinea() {
		
		return p.calcularPrecioUnitario()*cantidad;
	}
	//Si no tuviera atributo producto el metodo seria asi
	public double calcularPrecioDeUno(Producto p) {
		return p.calcularPrecioUnitario();
	}
	//metodo para calcular el precio con el metodo anterior
	public double calcularPrecioTotalLineaV2() {
			
			return calcularPrecioDeUno(p)*cantidad;
		}
	
	
}
