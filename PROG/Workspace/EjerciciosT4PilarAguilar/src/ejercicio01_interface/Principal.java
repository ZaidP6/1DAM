package ejercicio01_interface;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Escribe una aplicación en la que se implementen los dos métodossiguientes que deben estar en una interface:
			a) cuentaPrestados(): recibe por parámetro un array de objetos, y devuelve cuántos de ellos están
			prestados.
			b) publicacionesAnterioresA(): recibe por parámetro un array de Publicaciones y un año, y devuelve
			cuántas publicaciones tienen fecha anterior al año recibido por parámetro.
			c) En el método main(), crear un array de Publicaciones, con 2 libros y 2 revistas, prestar uno de los
			libros, mostrar por pantalla los datos almacenados en el array y mostrar por pantalla cuántas hay
			prestadas y cuantas hay anteriores a un año dado por teclado por el usuario.
		 */
		
		Publicacion []listaPublicaiones;
		Publicacion publicaion1 = new Libro("Poliedrum", "Rafael Ábalos", 2004, true);
		Publicacion publicaion2 = new Libro("La canción del héroe", "Rafael Ábalos", 2006, false);
		Publicacion publicaion3 = new Revista("Motos del 2023", "Fulanito", 2023, false);
		Publicacion publicaion4 = new Revista("Motos del 2024", "Benganito", 2024, true);

		listaPublicaiones = new Publicacion[4];
		listaPublicaiones[0] = publicaion1;
		listaPublicaiones[1] = publicaion2;
		listaPublicaiones[2] = publicaion3;
		listaPublicaiones[3] = publicaion4;
		
		
		
		

		
	}

}
