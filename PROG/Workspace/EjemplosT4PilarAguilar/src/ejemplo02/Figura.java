package ejemplo02;

public abstract class Figura {
    //PUNTOS PARA GRAFICAR
    private double x;
    
    private double y;

  //EL CONSTRUCTOR NO LO USAMOS PARA INSTANCIAR SINO PARA DEFINIRLA EN LA SUBCLASE
    public Figura(double x, double y) {
        super();
        this.x = x;
        this.y = y;
    }
    
    public abstract double calcularArea();
    

}
