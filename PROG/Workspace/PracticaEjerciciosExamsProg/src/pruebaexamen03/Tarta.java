package pruebaexamen03;


public class Tarta {

	private int num;
	private String sabor;
	private double volumenLitros;
	private boolean extra;
	
	


	public Tarta(int num, String sabor, double volumenLitros, boolean extra) {
		super();
		this.num = num;
		this.sabor = sabor;
		this.volumenLitros = volumenLitros;
		this.extra = extra;
	}


	public String getSabor() {
		return sabor;
	}


	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public double getVolumenLitros() {
		return volumenLitros;
	}


	public void setVolumenLitros(double volumenLitros) {
		this.volumenLitros = volumenLitros;
	}


	public boolean isExtra() {
		return extra;
	}


	public void setExtra(boolean extra) {
		this.extra = extra;
	}


	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}


	@Override
	public String toString() {
		return "Tarta [num=" + num + ", sabor=" + sabor + ", volumenLitros=" + volumenLitros + ", extra=" + extra + "]";
	}



	
	
	
}
