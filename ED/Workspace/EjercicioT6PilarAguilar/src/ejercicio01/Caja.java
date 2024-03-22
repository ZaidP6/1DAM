package ejercicio01;

public class Caja {

	private double totalRecaudado;

	public Caja(double totalRecaudado) {
		super();
		this.totalRecaudado = totalRecaudado;
	}

	public double getTotalRecaudado() {
		return totalRecaudado;
	}

	public void setTotalRecaudado(double totalRecaudado) {
		this.totalRecaudado = totalRecaudado;
	}

	@Override
	public String toString() {
		return "Caja [totalRecaudado=" + totalRecaudado + "]";
	}
	
	
	public boolean comprobarCodigo(String codigo) {
		
		if (codigo.length() == 5 && !codigo.isBlank() && (codigo.substring(0).matches("[A-Z]*")) 
				&& (codigo.substring(1, 4).matches("[0-9]*"))) {
			return true;
		}else {
			return false;
		}
	}
	
	
	public double hacerCaja(double cantidadRecuento) {
		if(cantidadRecuento == totalRecaudado) {
			return totalRecaudado;
		}else {
			return cantidadRecuento - totalRecaudado;
		}
		
	}
	
	public int calcularTotalOperaciones(int numOp) {
		if(numOp < 0) {
			//Excepcion
			return numOp;
		}else
			return numOp;
		
		
	}
	
}
