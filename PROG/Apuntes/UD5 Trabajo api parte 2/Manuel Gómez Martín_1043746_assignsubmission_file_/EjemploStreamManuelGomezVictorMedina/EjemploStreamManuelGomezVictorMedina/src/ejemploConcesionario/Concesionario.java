package ejemploConcesionario;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Concesionario {

	private CrudCoche crudCoche;

	public Concesionario(CrudCoche crudCoche) {
		super();
		this.crudCoche = crudCoche;
	}

	public CrudCoche getCrudCoche() {
		return crudCoche;
	}

	public void setCrudCoche(CrudCoche crudCoche) {
		this.crudCoche = crudCoche;
	}

	// Contar vehículos vendidos (Count)
	public long contarCocheVendidos() {

		return crudCoche.buscarVendidos().stream().count();
	}

	// Calcular ganancias si se venden todos (Map)

	public double calcularGanancias() {

		return crudCoche.getListaCoche().stream().mapToDouble(t -> t.getPrecio()).sum();
	}

	// Calcular media de precio de coches (Map x2)

	public double calcularMediaPrecioCoches(String marca) {

		return crudCoche.buscarPorMarca(marca).stream().mapToDouble(t -> t.getPrecio()).average().getAsDouble();
	}

	// Método para conocer los extras de un coche

	public void queExtraTieneCadaCoche() {
		crudCoche.getListaCoche().stream().map(coche -> coche.getListaExtra()).flatMap(vi -> vi.stream())
				.forEach((Consumer<? super Extras>) new Consumer<Extras>() {
					public void accept(Extras e) {
						System.out.println(e.getTipoExtras());
					}
				});
	}

	// Método para ordenar la lista de coches dada por el precio.

	public List<Coche> ordenarPorPrecioMayorAMenor() {
		Comparator<Coche> compararPrecios = Comparator.comparing(Coche::getPrecio);

		return crudCoche.getListaCoche().stream().sorted(compararPrecios).toList();
	}

	// Método para ordenar la lista de coches dadapor la marca y el modelo

	public List<Coche> ordenarPorOrdenAlfabeticoMarcaYModelo() {
		Comparator<Coche> compararMarcaYModelo = Comparator.comparing(Coche::getMarca)
				.thenComparing(Comparator.comparing(Coche::getModelo));

		return crudCoche.getListaCoche().stream().sorted(compararMarcaYModelo).toList();

	}

}
