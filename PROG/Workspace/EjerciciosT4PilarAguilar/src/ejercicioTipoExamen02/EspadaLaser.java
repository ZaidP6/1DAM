package ejercicioTipoExamen02;

public class EspadaLaser extends Producto{
	
	private String tipo;

	public EspadaLaser(int idProducto, String nombre, double precioBase, int cantidad, boolean vendido, String tipo) {
		super(idProducto, nombre, precioBase, cantidad, vendido);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "EspadaLaser [tipo=" + tipo + ", toString()=" + super.toString() + "]";
	}

	@Override
	public double calcularPvP(double porcentaje) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
