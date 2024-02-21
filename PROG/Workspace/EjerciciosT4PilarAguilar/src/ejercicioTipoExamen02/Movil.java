package ejercicioTipoExamen02;

public class Movil extends Producto{
	
	private String marca;

	public Movil(int idProducto, String nombre, double precioBase, int cantidad, boolean vendido, String marca) {
		super(idProducto, nombre, precioBase, cantidad, vendido);
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "movil [marca=" + marca + ", toString()=" + super.toString() + "]";
	}

	@Override
	public double calcularPvP(double porcentaje) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
