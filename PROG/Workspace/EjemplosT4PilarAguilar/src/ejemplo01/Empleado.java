package ejemplo01;

public class Empleado extends Trabajador{
	private double sueldo;
	private double impuestos;
	private int pagas= 14;//le damos un valor solo para el ejemplo académico, no se hace aquí
	//Constructor
	public Empleado (String nombre, String nSS, double sueldo){
		super (nombre, nSS);
		this.sueldo= sueldo;
		this.impuestos= 0.3*sueldo;/*NO es buena idea hacer cálculos en el constructor, solo está puesto aquí
		para hacer el ejemplo más sencillo*/
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	public double getImpuestos() {
		return impuestos;
	}
	public void setImpuestos(double impuestos) {
		this.impuestos = impuestos;
	}
	public int getPagas() {
		return pagas;
	}
	//Para la nómina de un Empleado
	public double calcularPaga(){
		return (sueldo-impuestos)/pagas;
	}
	public String toString (){
		return "Empleado "+super.toString();
	}
	
	
	public double calcularPagaV2(double fijo) {
		double cien= 100;
		double total = 0;
		total = super.calcularPagaV2(fijo)+sueldo-sueldo*impuestos/cien;
		return total;
	}
}