package ejercicio01_interface;

public interface IBiblioteca {

	//No hace falta poner ni public ni abstract porque esta clase ya lo es.
	int cuentaPrestados(Publicacion[]lista);
	int publicacionesAnterioresA(Publicacion []lista, int anio);
	
}
