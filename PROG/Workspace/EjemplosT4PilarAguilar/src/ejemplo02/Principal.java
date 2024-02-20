package ejemplo02;

public class Principal {

	 public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        
		 Figura cuadrado = new Cuadrado (1,2,2);//No da error
		 
		 //No se puede instanciar una Figura porque es abstracta.
		 //Figura f = new Figura();
		 
		 //Se puede instanciar porque no es abstracto
		 Cuadrado c = new Cuadrado(2,3,4);
		 
		 System.out.printf("El área del cuadrado es %.2f \n",cuadrado.calcularArea());
	    }

}
