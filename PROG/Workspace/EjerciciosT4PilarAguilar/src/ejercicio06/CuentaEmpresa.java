package ejercicio06;

import java.util.Objects;

public class CuentaEmpresa extends CuentaBancaria{

	private double impuestoCajero;

	public CuentaEmpresa(int numCuenta, double saldo, double impuestoCajero) {
		super(numCuenta, saldo);
		this.impuestoCajero = impuestoCajero;
	}

	public double getImpuestoCajero() {
		return impuestoCajero;
	}

	public void setImpuestoCajero(int impuestoCajero) {
		this.impuestoCajero = impuestoCajero;
	}

	@Override
	public String toString() {
		return "CuentaEmpresa [impuestoCajero=" + impuestoCajero + ", toString()=" + super.toString() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(impuestoCajero);
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
		CuentaEmpresa other = (CuentaEmpresa) obj;
		return impuestoCajero == other.impuestoCajero;
	}

	@Override
	public double ingresarDinero(double cantIngreso) {
		double saldo;
		saldo = super.getSaldo() + cantIngreso;
		return saldo;
	}

	@Override
	public double retirarDinero(double cantRetirada) {
		double saldo = 0;
		if ((cantRetirada+impuestoCajero)<=super.getSaldo()) {
			saldo = super.getSaldo() - cantRetirada -impuestoCajero;
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
