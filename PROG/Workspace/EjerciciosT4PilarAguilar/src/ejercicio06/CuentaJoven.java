package ejercicio06;

import java.util.Objects;

public class CuentaJoven extends CuentaBancaria{
		
	private double regaloIngreso;

	public CuentaJoven(int numCuenta, double saldo, double regaloIngreso) {
		super(numCuenta, saldo);
		this.regaloIngreso = regaloIngreso;
	}

	public double getRegaloIngreso() {
		return regaloIngreso;
	}

	public void setRegaloIngreso(int regaloIngreso) {
		this.regaloIngreso = regaloIngreso;
	}

	@Override
	public String toString() {
		return "CuentaJoven [regaloIngreso=" + regaloIngreso + ", toString()=" + super.toString() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(regaloIngreso);
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
		CuentaJoven other = (CuentaJoven) obj;
		return regaloIngreso == other.regaloIngreso;
	}

	@Override
	public double ingresarDinero(double cantIngreso) {
		double saldo;
		saldo = super.getSaldo() + cantIngreso + regaloIngreso;
		return saldo;
	}

	@Override
	public double retirarDinero(double cantRetirada) {
		double saldo = 0;
		if (cantRetirada<=super.getSaldo()) {
			saldo = super.getSaldo() - cantRetirada;
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
