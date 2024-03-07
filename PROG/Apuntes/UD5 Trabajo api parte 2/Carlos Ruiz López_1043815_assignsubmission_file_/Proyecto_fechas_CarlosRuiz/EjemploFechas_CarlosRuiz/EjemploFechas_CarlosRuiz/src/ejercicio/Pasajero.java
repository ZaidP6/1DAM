package ejercicio;

import java.time.LocalDate;

public class Pasajero implements Comparable<Pasajero>{

	private LocalDate fechaNacimiento;
	private String nombre;
	private String dni;
	private double precioTicket;
	private LocalDate fechaReserva;

	public Pasajero(LocalDate fechaNacimiento, String nombre, String dni, double precioTicket, LocalDate fechaReserva) {
		super();
		this.fechaNacimiento = fechaNacimiento;
		this.nombre = nombre;
		this.dni = dni;
		this.precioTicket = precioTicket;
		this.fechaReserva = fechaReserva;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public double getPrecioTicket() {
		return precioTicket;
	}

	public void setPrecioTicket(double precioTicket) {
		this.precioTicket = precioTicket;
	}

	public LocalDate getFechaReserva() {
		return fechaReserva;
	}

	public void setFechaReserva(LocalDate fechaReserva) {
		this.fechaReserva = fechaReserva;
	}

	@Override
	public String toString() {
		return "Pasajero [fechaNacimiento=" + fechaNacimiento + ", nombre=" + nombre + ", dni=" + dni
				+ ", precioTicket=" + precioTicket + ", fechaReserva=" + fechaReserva + "]";
	}
	
	public boolean comprobarFechaNacimiento() {
		if (fechaNacimiento.getDayOfMonth()==fechaReserva.getDayOfMonth()
				&&fechaNacimiento.getMonth()==fechaReserva.getMonth()) {
			return true;
		}else{
			return false;
		}
	}

	public double calcularPrecioTicket(double iva, double descuento) {
		if (comprobarFechaNacimiento()) {
			return precioTicket + precioTicket*iva/100 - precioTicket*descuento/100;
		}else {
			return precioTicket + precioTicket*iva/100;
		} 
	}

	@Override
	public int compareTo(Pasajero o) {
		return this.fechaNacimiento.compareTo(o.fechaNacimiento);
	}

}
