package ejercicio_01;

public class Cabecera {
	
	private String asignatura;
	private String aula;
	private String fecha;
	
	
	public Cabecera(String asignatura, String aula, String fecha) {
		super();
		this.asignatura = asignatura;
		this.aula = aula;
		this.fecha = fecha;
	}
	
	public void imprimirCabecera() {
		
		System.out.println("****************************************************************************************************************");
		System.out.println("*                                                                                                              *");
		System.out.println("*                                                                                                              *");
		System.out.println("      \t\t"+asignatura+"\t\t\t"+aula+"\t\t\t"+fecha+"\t\t\t");
		System.out.println("*                                                                                                              *");
		System.out.println("*                                                                                                              *");
		System.out.println("****************************************************************************************************************");
	}
	
	
	

}
