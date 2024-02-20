package ejemplo02;

public class Cuadrado extends Figura{
    
    private double lado;

    public Cuadrado(double x, double y, double lado) {
        super(x, y);
        this.lado = lado;
    }
    
    
   


	public double getLado() {
		return lado;
	}


	public void setLado(double lado) {
		this.lado = lado;
	}


	@Override
	public String toString() {
		return "Cuadrado [lado=" + lado + ", toString()=" + super.toString() + "]";
	}
    
	 public double calcularArea() {
	        //IMPLEMENTACION DEL MÉTODO
	        
	        return lado*lado;
	    }
	 
	 public double calcularPerimetro() {
		 return lado*4;
	 }
	 
	 public void mostrarLados (){
		 System.out.println("Solo estoy en la clase Cuadrado porque los demás no tienen lados, en concreto tengo 4 lados ");
	}

}
