package ejercicio04;

public class Alimentacion extends Producto{

	private int diasCaducidad;

	

	public Alimentacion(int nSerie, String nombre, double precioUnitario, int categoria, double IVA,
			int diasCaducidad) {
		super(nSerie, nombre, precioUnitario, categoria, IVA);
		this.diasCaducidad = diasCaducidad;
	}

	public int getDiasCaducidad() {
		return diasCaducidad;
	}

	public void setDiasCaducidad(int diasCaducidad) {
		this.diasCaducidad = diasCaducidad;
	}

	@Override
	public String toString() {
		return "Alimentacion [diasCaducidad=" + diasCaducidad + ", toString()=" + super.toString() + "]";
	}
	
	public void comprobarCaducidad() {
		if(diasCaducidad <= 2 /*&& diasCaducidad>=0*/) {
			System.out.println("Cuidao!Tu producto está a punto de caducar!");
		}else
			System.out.println("Tu producto está fresco! Pero ten en cuenta la caducidad ehh.");
		
	}
	
	public double calcularPvP(double descuentoAlimentacion,double impuestoLujo) {
		double pvp;
		
		if(diasCaducidad <= 2 /*&& diasCaducidad>=0*/) {
			int cien = 100;
			pvp = super.calcularPvP(descuentoAlimentacion,impuestoLujo) * ((cien - descuentoAlimentacion)/cien);
			return pvp;
		}else
			pvp = super.calcularPvP(descuentoAlimentacion,impuestoLujo);
			return pvp;
		
	}
	
}
