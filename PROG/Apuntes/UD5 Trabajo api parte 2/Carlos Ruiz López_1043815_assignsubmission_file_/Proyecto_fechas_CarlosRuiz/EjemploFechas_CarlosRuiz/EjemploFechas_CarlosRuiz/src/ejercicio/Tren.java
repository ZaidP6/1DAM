package ejercicio;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

public class Tren {

	private LocalDate fecha;
	private int id;
	private int numPasajeros;
	private List<Pasajero> lista;

	public Tren(LocalDate fecha, int id, int numPasajeros, List<Pasajero> lista) {
		super();
		this.fecha = fecha;
		this.id = id;
		this.numPasajeros = numPasajeros;
		this.lista = lista;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumPasajeros() {
		return numPasajeros;
	}

	public void setNumPasajeros(int numPasajeros) {
		this.numPasajeros = numPasajeros;
	}

	public List<Pasajero> getLista() {
		return lista;
	}

	public void setLista(List<Pasajero> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Tren [fecha=" + fecha + ", id=" + id + ", numPasajeros=" + numPasajeros + ", lista=" + lista + "]";
	}

	public double calcularPrecioTicketUnPasajero(Pasajero p, double iva, double porcentaje) {
		return p.calcularPrecioTicket(iva, porcentaje);
	}

	public double calcularTotal(double iva, double porcentaje)  {
		double suma = 0;
		for (Pasajero pasajero : lista) {
			suma += calcularPrecioTicketUnPasajero(pasajero, iva, porcentaje);
		}
		return suma;
	}

	public void imprimirPasajeros() {
		for (Pasajero pasajero : lista) {
			System.out.println(pasajero);
		}
	}

	public void add(Pasajero p, LocalDate fechaASuperar) {
		if (p.getFechaNacimiento().isBefore(fechaASuperar)&&p.getFechaReserva().isBefore(fecha)
				&& numPasajeros < 3) {
			lista.add(p);
			numPasajeros++;
		}
	}

	public void delete(String dni) {
		if (findByDni(dni) != null) {
			lista.remove(findByDni(dni));
		}
	}

	public Pasajero findByDni(String dni) {
		for (Pasajero pasajero : lista) {
			if (pasajero.getDni().equalsIgnoreCase(dni)) {
				return pasajero;
			}
		}
		return null;
	}

	public boolean hacerReserva(Pasajero p) {
		if (p != null && p.getFechaReserva().isBefore(fecha)) {
			return true;
		} else {
			return false;
		}
	}

	public void mostrarReserva(Pasajero p, double iva, double porcentaje) {
		System.out.println("-------------------------------------------------------");
		System.out.println("El nombre del pasajero es: " + p.getNombre());
		System.out.println("El dni del pasajero es: " + p.getDni());
		System.out.println("La fecha de nacimiento del pasajero es: " + p.getFechaNacimiento());
		System.out.println("La fecha de reserva del pasajero es: " + p.getFechaReserva());
		System.out.println("El precio del ticket es: " + calcularPrecioTicketUnPasajero(p, iva, porcentaje));
		System.out.println("-------------------------------------------------------");

		if (p instanceof PasajeroVip) {
			((PasajeroVip) p).imprimirMensaje();
			System.out.println("-------------------------------------------------------");

		}

	}
	
	public boolean verificarDisponibilidad(LocalDate fechaReserva) {
	    return (numPasajeros < numPasajeros && !existeReservaEnFecha(fechaReserva));
	}
	
	public boolean existeReservaEnFecha(LocalDate fechaReserva) {
	    for (Pasajero pasajero : lista) {
	        if (pasajero.getFechaReserva().equals(fechaReserva)) {
	            return true;
	        }
	    }
	    return false;
	}
	
	public void ordenar() {
		Collections.sort(lista);
		for (Pasajero pasajero : lista) {
			System.out.println(pasajero);
		}
	}
}
