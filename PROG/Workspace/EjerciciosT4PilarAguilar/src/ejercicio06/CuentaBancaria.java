package ejercicio06;

import java.util.Objects;

public abstract class CuentaBancaria{

	private int numCuenta;
	private double saldo;
	public CuentaBancaria(int numCuenta, double saldo) {
		super();
		this.numCuenta = numCuenta;
		this.saldo = saldo;
	}
	public int getNumCuenta() {
		return numCuenta;
	}
	public void setNumCuenta(int numCuenta) {
		this.numCuenta = numCuenta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	@Override
	public String toString() {
		return "CuentaBancaria [numCuenta=" + numCuenta + ", saldo=" + saldo + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(numCuenta, saldo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CuentaBancaria other = (CuentaBancaria) obj;
		return numCuenta == other.numCuenta && Double.doubleToLongBits(saldo) == Double.doubleToLongBits(other.saldo);
	}
	
	public abstract double ingresarDinero(double cantIngreso);
	public abstract double retirarDinero(double cantRetirada);
	public abstract void consultarSaldo();
	
}
