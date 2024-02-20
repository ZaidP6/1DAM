package ejercicio01_p2;

import java.util.Arrays;

public class Tiendacrud {

	
	private Producto []listaP;
	
	

	public Tiendacrud(Producto[] listaP) {
		super();
		this.listaP = listaP;
	}

	public Producto[] getListaP() {
		return listaP;
	}

	public void setListaP(Producto[] listaP) {
		this.listaP = listaP;
	}

	@Override
	public String toString() {
		return "Tiendacrud [listaP=" + Arrays.toString(listaP) + "]";
	}
	
	
	public void mostrarProductos() {
		for (int i = 0; i < listaP.length; i++) {
			System.out.println(listaP[i]);
		}
	}
	
	public boolean comprobarResistencia(Producto p) {
		if(p.isFragil()) {
			return true;
		}
		return false;
	}
	
	public void anadirProducto(String nombreP, boolean fragil,double precioFab,double pVp,boolean activo) {
		Producto p = new Producto(nombreP, fragil, precioFab, pVp, activo);
	}
	
}
