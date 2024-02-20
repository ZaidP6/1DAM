package ejemplo04_interfaces;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal a = new Animal ("Programador", 2);
		Persona p = new Persona("Luismi", 34);
		
		
		a.localizar(a);
		a.cazar(a);
		
		p.localizar(a);
		p.cazar(a);
		
		a.huir();
		
	}

}
