package ejemplo01;

public class Trabajador {
	private String nombre;
	private String puesto;
	private String direccion;
	private String telefono;
	private String nSS; //Número Seguridad Social
	
	
	public Trabajador (String nombre, String puesto, String direccion, String telefono, String nSS) {
		this.nombre = nombre;
		this.puesto = puesto;
		this.direccion = direccion;
		this.telefono = telefono;
		this.nSS = nSS;
	}


	public Trabajador(String nombre, String nSS) {
		super();
		this.nombre = nombre;
		this.nSS = nSS;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getPuesto() {
		return puesto;
	}


	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getnSS() {
		return nSS;
	}


	public void setnSS(String nSS) {
		this.nSS = nSS;
	}

	
	
	public boolean equals (Trabajador t) {
		return this.nSS.equals(t.nSS);
	}
	
	public String toString ( ) {
		return nombre+" (NSS "+nSS+")";
	}
	
	public double calcularPaga ( ){
		return 0.0;
		}
	
}
