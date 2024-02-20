package ejemplo09_pasodeargumentosydevoluciondearrays;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int desde, hasta, tam;
		int [] lista;
		Listas listado = new Listas();
		
		
		System.out.println("Diga el tamaño");
		tam= Leer.datoInt();
		
		lista = new int [tam];
		System.out.println("Diga desde");
		desde = Leer.datoInt();
		System.out.println("Diga hasta");
		hasta = Leer.datoInt();
		
		listado.rellenarAleatorio(desde, hasta, lista);
		listado.mostrarLista(lista);
		
		System.out.println();
		listado.mostrarLista(listado.trucarLista(lista));
		
	}

}
