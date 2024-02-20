package ejercicio06;

import java.util.Objects;

public class CuentaCorriente extends CuentaBancaria{

	private double mantenimientoFijo;
	private int puntosCajero;
	
	
	public CuentaCorriente(int numCuenta, double saldo, double mantenimientoFijo, int puntosCajero) {
		super(numCuenta, saldo);
		this.mantenimientoFijo = mantenimientoFijo;
		this.puntosCajero = puntosCajero;
	}


	public double getMantenimientoFijo() {
		return mantenimientoFijo;
	}


	public void setMantenimientoFijo(double mantenimientoFijo) {
		this.mantenimientoFijo = mantenimientoFijo;
	}


	public int getPuntosCajero() {
		return puntosCajero;
	}


	public void setPuntosCajero(int puntosCajero) {
		this.puntosCajero = puntosCajero;
	}


	@Override
	public String toString() {
		return "CuentaCorriente [mantenimientoFijo=" + mantenimientoFijo + ", puntosCajero=" + puntosCajero
				+ ", toString()=" + super.toString() + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(mantenimientoFijo, puntosCajero);
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		CuentaCorriente other = (CuentaCorriente) obj;
		return Double.doubleToLongBits(mantenimientoFijo) == Double.doubleToLongBits(other.mantenimientoFijo)
				&& puntosCajero == other.puntosCajero;
	}


	@Override
	public double ingresarDinero(double cantIngreso) {
		double result = 0;
		result = super.getSaldo()+ cantIngreso;
		puntosCajero++;
		super.setSaldo(result);
		return result;
	}


	@Override
	public double retirarDinero(double cantRetirada) {
		double saldo = 0;
		if (cantRetirada<=super.getSaldo()) {
			saldo = super.getSaldo() - cantRetirada;
			puntosCajero++;
		} else {
			System.out.println("Lo sentimos, no puede retirar más dinero del que tiene.");
		}
		return saldo;
		
	}


	@Override
	public void consultarSaldo() {
		System.out.printf("Actualmente hay %.2f€ en la cuenta del banco.\n", super.getSaldo());
		
	}
	
	
	
	
}
