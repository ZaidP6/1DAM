package ejemplo03_polimorfismo;

public class OperacionesFigura {

	public double calcularAreaUnaFigura (Figura f) {
		return f.calcularArea();
	}
	
	public double sumarArea(Figura[] listaFiguras) {
		double suma = 0.0;
		
		for (int i = 0; i < listaFiguras.length; i++) {
			suma += calcularAreaUnaFigura(listaFiguras[i]);
		}
		return suma;
	}
	public double sumarAreaV2(Figura[] listaFiguras) {
		double suma = 0.0;
		
		for (int i = 0; i < listaFiguras.length; i++) {
			suma += calcularAreaUnaFigura(listaFiguras[i]);
			if(listaFiguras[i] instanceof Circulo) {
				
			}
		}
		return suma;
	}
	
	
}
