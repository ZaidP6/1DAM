package ejercicio4;

import java.util.Arrays;

public class Venta {

	private Lineadeventa [] listaVentas;

	public Venta(Lineadeventa[] listaVentas) {
		super();
		this.listaVentas = listaVentas;
	}

	public Lineadeventa[] getListaVentas() {
		return listaVentas;
	}

	public void setListaVentas(Lineadeventa[] listaVentas) {
		this.listaVentas = listaVentas;
	}

	@Override
	public String toString() {
		return "Venta [listaVentas=" + Arrays.toString(listaVentas) + "]";
	}
	
	
	public double calcularTotalTicket() {
		double total = 0;
		for (int i = 0; i < listaVentas.length; i++) {
			total += listaVentas[i].calcularPrecioTotalLinea();
		}
		return total;
	}
	
	public void imprimirTicket() {
		for (int i = 0; i < listaVentas.length; i++) {
			System.out.println(listaVentas[i].getP().getNombre());
			System.out.println("\t\t"+listaVentas[i].getP().getPrecioUnitario());
			System.out.println("\t\t"+listaVentas[i].getCantidad());
			System.out.println("\t\t"+listaVentas[i].calcularPrecioTotalLinea());
		}
		System.out.println("--------------------------------------------------------");
		System.out.println("Total: "+ calcularTotalTicket()+"€");
	}
	
	public void mostrarProductoGuardado() {
		for (int i = 0; i < listaVentas.length; i++) {
			System.out.println(listaVentas[i].getP().getNombre());
			if (listaVentas[i].getP() instanceof Alimentacion) {
				((Alimentacion)listaVentas[i].getP()).mostrarSiCaducaEn2Dias();
			}
		}
	}
	
}
