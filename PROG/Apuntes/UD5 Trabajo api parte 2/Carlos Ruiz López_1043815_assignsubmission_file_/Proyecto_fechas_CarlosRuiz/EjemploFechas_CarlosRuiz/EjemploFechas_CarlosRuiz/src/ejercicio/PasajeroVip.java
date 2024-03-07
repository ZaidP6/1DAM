package ejercicio;

import java.time.LocalDate;
import java.time.LocalTime;

public class PasajeroVip extends Pasajero{

	private double descuento;
	private LocalTime llegadaAntelacion;

	public PasajeroVip(LocalDate fechaNacimiento, String nombre, String dni, double precioTicket,
			LocalDate fechaReserva, double descuento, LocalTime llegadaAntelacion) {
		super(fechaNacimiento, nombre, dni, precioTicket, fechaReserva);
		this.descuento = descuento;
		this.llegadaAntelacion = llegadaAntelacion;
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	public LocalTime getLlegadaAntelacion() {
		return llegadaAntelacion;
	}

	public void setLlegadaAntelacion(LocalTime llegadaAntelacion) {
		this.llegadaAntelacion = llegadaAntelacion;
	}

	@Override
	public String toString() {
		return "PasajeroVip [fechaNacimiento="+getFechaNacimiento()+
				", nombre=" + getNombre() + ", dni=" + getDni() + ", precioTicket=" + getPrecioTicket()+
				", fechaReserva=" + getFechaReserva() + ", descuento=" + descuento + 
				", llegadaAntelacion=" + llegadaAntelacion + "]";
	}

	public double calcularPrecioTicket(double iva, double porcentaje) {
		return super.calcularPrecioTicket(iva, porcentaje) - super.calcularPrecioTicket(iva, porcentaje)*descuento/100;
	}
	
	public void imprimirMensaje() {
		System.out.println("Podrá entrar al tren "+llegadaAntelacion.getMinute()+ " minutos antes");
	}
	
}
