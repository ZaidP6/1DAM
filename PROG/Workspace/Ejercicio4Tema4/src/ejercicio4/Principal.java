package ejercicio4;


public class Principal {

	
	public static void main(String []args) {
		
		Producto p1 = new Alimentacion( "Lechuga",0, 0.64, 5.25,true);
		Producto p2 = new Electronica("PS4",1, 250.78,21);
		Producto p3 = new Alimentacion("Zanahorias",2, 1.24, 0, false);
		Producto p4 = new Electronica("Juego Howarts Legacy",3, 28.76, 21);
		
		Lineadeventa lv1 = new Lineadeventa(p1, 4);

		Lineadeventa lv2 = new Lineadeventa(p2, 2);

		Lineadeventa lv3 = new Lineadeventa(p3, 20);

		Lineadeventa lv4 = new Lineadeventa(p4, 5);
	}
}
