package ejemplo02;

public class Rectangulo extends Figura{
    
    private double altura;
    private double base;
    
    
    public Rectangulo(double x, double y, double altura, double base) {
        super(x, y);
        this.altura = altura;
        this.base = base;
    }
    
    public double calcularArea() {
        
        return base*altura;
    }
    
    

}
