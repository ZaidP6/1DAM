package ejercicio02;

public class Documento {

	private int cif;
	private String nombreEmpresa;
	private String direccion;
	
	
	public Documento(int cif, String nombreEmpresa, String direccion) {
		super();
		this.cif = cif;
		this.nombreEmpresa = nombreEmpresa;
		this.direccion = direccion;
	}


	public int getCif() {
		return cif;
	}


	public void setCif(int cif) {
		this.cif = cif;
	}


	public String getNombreEmpresa() {
		return nombreEmpresa;
	}


	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	@Override
	public String toString() {
		return "Documento [cif=" + cif + ", nombreEmpresa=" + nombreEmpresa + ", direccion=" + direccion + "]";
	}
	
	
	public void generarEncabezado() {
		System.out.printf("cif: %d\n%s\n%s\n",cif,nombreEmpresa,direccion);
	}
	
	
	
	
	
}
