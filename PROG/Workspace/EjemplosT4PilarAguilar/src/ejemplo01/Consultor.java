package ejemplo01;

public class Consultor extends Trabajador {
	private int horas;
	private double tarifa;
	
	
	//Constructor
	public Consultor (String nombre, String nSS, int horas, double tarifa){
		super (nombre, nSS);
		this.horas=horas;
		this.tarifa=tarifa;
	}
	public int getHoras () {
		return horas;
	}
	public void setHoras (int horas) {
		this.horas = horas;
	}
	public double getTarifa () {
		return tarifa;
	}
	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}
	//Ahora la forma de calcular lo que hay que pagar es por horas
	public double calcularPaga (){
		return horas*tarifa;
	}
	public String toString (){
		return "Consultor "+super.toString();
	}
	
	public void avisarExtras() {
		if(horas>40) {
			System.out.println("Te has colado un total de " + (horas-40)+" horas.");
		}
	}
}
