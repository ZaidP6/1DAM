package ejercicio01_p2;

public class Producto {

	
	private String nombreP;
	private boolean fragil;
	private double precioFab;
	private double pVp;
	private boolean activo;
	
	
	
	
	@Override
	public String toString() {
		return "Producto [nombreP=" + nombreP + ", fragil=" + fragil + ", precioFab=" + precioFab + ", pVp=" + pVp
				+ ", activo=" + activo + "]";
	}

	public String getNombreP() {
		return nombreP;
	}

	public void setNombreP(String nombreP) {
		this.nombreP = nombreP;
	}

	public boolean isFragil() {
		return fragil;
	}

	public void setFragil(boolean fragil) {
		this.fragil = fragil;
	}

	public double getPrecioFab() {
		return precioFab;
	}

	public void setPrecioFab(double precioFab) {
		this.precioFab = precioFab;
	}

	public double getpVp() {
		return pVp;
	}

	public void setpVp(double pVp) {
		this.pVp = pVp;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public Producto(String nombreP, boolean fragil, double precioFab, double pVp, boolean activo) {
		super();
		this.nombreP = nombreP;
		this.fragil = fragil;
		this.precioFab = precioFab;
		this.pVp = pVp;
		this.activo = activo;
	}


	
	public double calcularCosteTransporte(double porcentajeTransporte) {
		double costeTransporte = 0;
		
		costeTransporte = precioFab + precioFab*porcentajeTransporte;
		
		return costeTransporte;
		
	}
	
	
	
}
