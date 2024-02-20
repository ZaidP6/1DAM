package ejercicio06;

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
	
}
