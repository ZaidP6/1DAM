package ejercicio01_interface;

public class Revista extends Publicacion{

	public Revista(String titulo, String autor, int anioPublicacion, boolean prestado) {
		super(titulo, autor, anioPublicacion, prestado);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int cuentaPrestados(Publicacion[] lista) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int publicacionesAnterioresA(Publicacion[] lista, int anio) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
}
