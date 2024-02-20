package ejercicio06_v2;

import java.util.Arrays;

public class Oficina {

	private CuentaBancaria []listaCuentas;
	private int cantCuentas;
	public Oficina(CuentaBancaria[] listaCuentas, int cantCuentas) {
		super();
		this.listaCuentas = listaCuentas;
		this.cantCuentas = cantCuentas;
	}
	public CuentaBancaria[] getListaCuentas() {
		return listaCuentas;
	}
	public void setListaCuentas(CuentaBancaria[] listaCuentas) {
		this.listaCuentas = listaCuentas;
	}
	public int getCantCuentas() {
		return cantCuentas;
	}
	public void setCantCuentas(int cantCuentas) {
		this.cantCuentas = cantCuentas;
	}
	@Override
	public String toString() {
		return "Oficina [listaCuentas=" + Arrays.toString(listaCuentas) + ", cantCuentas=" + cantCuentas + "]";
	}
	
	public double calcularTotalCuentas() {
		double totalOfi=0;
		for (int i = 0; i < cantCuentas; i++) {
			totalOfi +=listaCuentas[i].getSaldo();
		}
		return totalOfi;
	}
	
	public double calcularGanancia () {
		double gananciaOfi = 0;
		for (int i = 0; i < cantCuentas; i++) {
			if (listaCuentas[i]instanceof CuentaCorriente) {
				gananciaOfi += ((CuentaCorriente)listaCuentas[i]).getMantenimientoFijo();
			} else if(listaCuentas[i]instanceof CuentaEmpresa){
				gananciaOfi += ((CuentaEmpresa)listaCuentas[i]).getImpuestoCajero();
			} 
		}
		return gananciaOfi;
	}
	
	public double calcularPerdida() {
		double perdidaOfi = 0;
		for (int i = 0; i < cantCuentas; i++) {
			if (listaCuentas[i]instanceof CuentaJoven) {
				perdidaOfi += ((CuentaJoven)listaCuentas[i]).getRegaloIngreso();
			}
		}
		return perdidaOfi;
	}
	
	public int buscarNCuenta(int numBuscador) {
		int i=0;
		boolean encontrado = false;
		while (i<listaCuentas.length && !encontrado) {
			CuentaBancaria cB1 = listaCuentas[i];
			if(numBuscador == cB1.getNumCuenta()) {
				encontrado = true;
			}else
				i++;	
		}
		if(encontrado == true) {
			return i;
		} else
			return -1;
	}
	
	public void mostrarCuenta(CuentaBancaria cB) {
		System.out.printf("La cuenta número %d tiene %.2f€ de saldo.\n", cB.getNumCuenta(), cB.getSaldo());
	}
	
}
