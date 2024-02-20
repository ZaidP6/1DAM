package ejercicio06;

import java.util.Arrays;
import java.util.Objects;

public class Cliente {

	private String dni;
	private String nombre;
	private CuentaBancaria []cuentas;
	
	
	public Cliente(String dni, String nombre, CuentaBancaria[] cuentas) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.cuentas = cuentas;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public CuentaBancaria[] getCuentas() {
		return cuentas;
	}


	public void setCuentas(CuentaBancaria[] cuentas) {
		this.cuentas = cuentas;
	}


	@Override
	public String toString() {
		return "Cliente [dni=" + dni + ", nombre=" + nombre + ", cuentas=" + Arrays.toString(cuentas) + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(cuentas);
		result = prime * result + Objects.hash(dni, nombre);
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Arrays.equals(cuentas, other.cuentas) && Objects.equals(dni, other.dni)
				&& Objects.equals(nombre, other.nombre);
	}
	
	
	
}
