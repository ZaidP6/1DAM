package ejercicio;

import java.time.LocalDate;
import java.util.List;

public class Estacion {
	
	private List<Tren> listaTrenes;

	public Estacion(List<Tren> listaTrenes) {
		super();
		this.listaTrenes = listaTrenes;
	}

	public List<Tren> getListaTrenes() {
		return listaTrenes;
	}

	public void setListaTrenes(List<Tren> listaTrenes) {
		this.listaTrenes = listaTrenes;
	}

	@Override
	public String toString() {
		return "Estacion [listaTrenes=" + listaTrenes + "]";
	}

	public void add(Tren t, LocalDate fechaParaAgregar) {
		if (t.getFecha().isAfter(fechaParaAgregar)) {
			listaTrenes.add(t);
		}
	}
	
	public void mostrarTrenes() {
		for (Tren tren : listaTrenes) {
			System.out.println(tren);
		}
	}

	public boolean cambiarHorario(int opcion) {
		if (opcion == 1) {
			return true;
		} else {
			return false;
		}
	}
	
	public Tren buscarTrenPorId(int id) {
		boolean encontrado = false;
		int i = 0;

		while (i < listaTrenes.size() && !encontrado) {
			Tren deLista = listaTrenes.get(i);
			if (deLista.getId()==id) {
				encontrado = true;
			} else {
				i++;
			}
		}

		if (encontrado) {
			return listaTrenes.get(i);
		} else {
			return null;
		}
	}
	
	public void modificarHorarioTren(int opcion, int dias, int id, int opcion2) {
	    if (cambiarHorario(opcion)) {
	        if (buscarTrenPorId(id) != null) {
	        	if (opcion2 == 1) {
	        		LocalDate nuevaFecha = buscarTrenPorId(id).getFecha().plusDays(dias);
		            buscarTrenPorId(id).setFecha(nuevaFecha);
		            System.out.println("La nueva fecha es: "+nuevaFecha);
				}else if(opcion2 == 2) {
					LocalDate nuevaFecha = buscarTrenPorId(id).getFecha().minusDays(dias);
		            buscarTrenPorId(id).setFecha(nuevaFecha);
		            System.out.println("La nueva fecha es: "+nuevaFecha);
				}
	          
	        }
	    }
	}
	
}
