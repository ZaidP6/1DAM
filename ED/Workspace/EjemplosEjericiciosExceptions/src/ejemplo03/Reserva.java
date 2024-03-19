package ejemplo03;

import java.time.LocalDate;

public class Reserva {

	private LocalDate hoy;
	private LocalDate fechaReserva;
	
	public Reserva(LocalDate hoy, LocalDate fechaReserva) {
		super();
		this.hoy = hoy;
		this.fechaReserva = fechaReserva;
	}

	public LocalDate getHoy() {
		return hoy;
	}

	public void setHoy(LocalDate hoy) {
		this.hoy = hoy;
	}

	public LocalDate getFechaReserva() {
		return fechaReserva;
	}

	public void setFechaReserva(LocalDate fechaReserva) {
		this.fechaReserva = fechaReserva;
	}

	@Override
	public String toString() {
		return "Reserva [hoy=" + hoy + ", fechaReserva=" + fechaReserva + "]";
	}
	
	
	public boolean hacerReserva() {
		if (fechaReserva.isBefore(hoy)) {
			
			return false;
			
		}else
			return true;
	}
	
}
