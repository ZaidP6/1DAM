package ejercicio;

import java.util.Arrays;

public class Plataforma {

	private Deposito []listaDepositos;
	private int posicionDep;
	private int capacidadTotalL;
	
	
	public Plataforma(Deposito[] listaDepositos, int posicionDep, int capacidadTotalL) {
		super();
		this.listaDepositos = listaDepositos;
		this.posicionDep = posicionDep;
		this.capacidadTotalL = capacidadTotalL;
	}
	public Deposito[] getListaDepositos() {
		return listaDepositos;
	}
	public void setListaDepositos(Deposito[] listaDepositos) {
		this.listaDepositos = listaDepositos;
	}
	public int getPosicionDep() {
		return posicionDep;
	}
	public void setPosicionDep(int posicionDep) {
		this.posicionDep = posicionDep;
	}
	public int getCapacidadTotalL() {
		return capacidadTotalL;
	}
	public void setCapacidadTotalL(int capacidadTotalL) {
		this.capacidadTotalL = capacidadTotalL;
	}
	@Override
	public String toString() {
		return "Plataforma [listaDepositos=" + Arrays.toString(listaDepositos) + ", posicionDep=" + posicionDep
				+ ", capacidadTotalL=" + capacidadTotalL + "]";
	}
	
	
	public void AgregarDeposito(Deposito deposito) {
		listaDepositos[posicionDep] = deposito;
		capacidadTotalL += capacidadTotalL;
	}
	
	public void MostrarDeposito(Deposito deposito) {
		System.out.println(listaDepositos[posicionDep]);
	}
	
	public double CalcularPrecioVenta(Deposito listaDeposito, int porcentajeGanancia) {
		
		double pvp;
		int cien=100;
		
		
		pvp = listaDepositos[posicionDep].getCosteProd() + (porcentajeGanancia/cien * listaDepositos[posicionDep].getCosteProd());
		
		return pvp;
		
	}
	
	public int CalcularLitrosTotales() {
		
		for (int i = 0; i < listaDepositos.length; i++) {
			if(listaDepositos[i].getLitrosCapacidad() == 0) {
				i++;
			}else
				capacidadTotalL += listaDepositos[i].getLitrosCapacidad();
		}
		return capacidadTotalL;
	}
	
	public void MostrarLitrosTotales() {
		System.out.printf("La plataforma tiene un total de %d litros.\n", CalcularLitrosTotales());
	}
	
	public int findByPosicion(int posicionDep) {
		int i = 0;
		boolean encontrado = false;
		
		while (i<listaDepositos.length && !encontrado) {
			if(posicionDep == i) {
				encontrado = true;
			}else 
				i++;
		}if(encontrado) {
			return posicionDep;
		}else
			return -1;
	}
	
	public double calcularGananciaRepsol(double precioL) {
		
		double gananciaRepsol;
		gananciaRepsol = CalcularLitrosTotales()*precioL;
		
		return gananciaRepsol;
	}
	
}
