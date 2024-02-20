package ejemplo03_polimorfismo;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OperacionesFigura op = new OperacionesFigura();
		Cuadrado cu = new Cuadrado("Cuadrado1", "rojo", 2.48);
		Figura f1 = new Circulo("Circulo2","verde", 4.5);
		Circulo cir = new Circulo("Circulo1", "rojo", 2.48);
		Figura f2 = new Cuadrado("Cuadrao2","verde", 4.5);
		
		
		Figura [] listaFiguras = new Figura[4];
		listaFiguras[0]=cir;
		listaFiguras[0]=cu;
		listaFiguras[0]=f1;
		listaFiguras[0]=f2;

		
		System.out.println(op.calcularAreaUnaFigura(f1));
		System.out.println(op.calcularAreaUnaFigura(f2));
		System.out.println(op.calcularAreaUnaFigura(cir));
		System.out.println(op.calcularAreaUnaFigura(cu));
		
		//Métodos no reescritos
		
		cir.mostrarRadianes();
		f1.metodoSoloDeFigura();
		f2.metodoSoloDeFigura();
		cu.mostrarLados();
		
		System.out.println(op.sumarArea(listaFiguras));
		
	}

}
