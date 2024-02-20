package ejercicio06_v2;

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
		saldo = getSaldo() + cantIngreso + regaloIngreso;
		setSaldo(saldo);
		return saldo;
	}

	@Override
	public double retirarDinero(double cantRetirada) {
		double saldo = 0;
		if (cantRetirada<=super.getSaldo()) {
			saldo = getSaldo() - cantRetirada;
		/*
		 * } else {
			System.out.println("Lo sentimos, no puede retirar más dinero del que tiene.");
		 */
		}
		setSaldo(saldo);
		return saldo;
	}

	@Override
	public void consultarSaldo() {
		System.out.printf("Actualmente hay %.2f€ en la cuenta del banco.\n", super.getSaldo());
		
	}
	
	
	
}
