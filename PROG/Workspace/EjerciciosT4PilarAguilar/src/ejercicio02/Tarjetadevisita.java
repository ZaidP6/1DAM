package ejercicio02;

public class Tarjetadevisita extends Documento{

	private String nombre;
	private int movil;
	
	
	public Tarjetadevisita(int cif, String nombreEmpresa, String direccion, String nombre, int movil) {
		super(cif, nombreEmpresa, direccion);
		this.nombre = nombre;
		this.movil = movil;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getMovil() {
		return movil;
	}


	public void setMovil(int movil) {
		this.movil = movil;
	}


	@Override
	public String toString() {
		return "Tarjetadevisita [nombre=" + nombre + ", movil=" + movil + ", toString()=" + super.toString() + "]";
	}
	
	public void generarEncabezado() {
		super.generarEncabezado();
		System.out.printf("%s\n%d\n",nombre, movil);
	}
	
	
}
