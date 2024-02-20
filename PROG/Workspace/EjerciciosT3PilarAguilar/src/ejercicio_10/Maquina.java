package ejercicio_10;

public class Maquina {
	/*Este programa tendría otra serie de clases, pero por simplificar lo haremos solo con 3 clases. Crear un programa que simule una máquina vendedora de tickets de metro. 
	 * Tendremos que crear la clase Ticket (Clase POJO), la clase Maquina (donde estarán todos los métodos con funcionalidad) y la clase principal de prueba. Tendrá un menú donde se pueda:
					•Comprar uno o varios billetes.
					•Calcular el cambio a devolver.
					•Imprimir por pantalla el billete. Solo uno. Si se han comprado “x” debemos mostrar en el ticket el mensaje “válido para x personas”.
					•Opciones de operario: el operario que lleva el mantenimiento de la máquina, debe tener disponible un método que le ofrezca el saldo
					 total de la recaudación de la máquina en ese día (no es necesario usar fechas) y otro método que pueda poner a cero el contador de saldo total.
					•Dentro de la opción de operario, también debe contar con la posibilidad de cambiar el precio de los billetes ya que estos suelen subir todos los años.
					•Las operaciones para el operario se harán solo si se introduce la contraseña adecuada antes de cualquier otra cosa, por lo que se debe tener el método comprobar contraseña.*/
	
			Ticket t1;
			
			
			//constructor
			public Maquina(Ticket t1) {
				super();
				this.t1 = t1;
			}
			

			//getters and setters
			public Ticket getTick1() {
				return t1;
			}



			public void setTick1(Ticket t1) {
				this.t1 = t1;
			}
			
			



			@Override
			public String toString() {
				return "Maquina [tick1=" + t1 + "]";
			}


			public boolean comprobarDinero (double dinero) {
				boolean puedeComprar=false;
				if(dinero>=t1.getPrecio()) {
					 puedeComprar=true;
				}
				
				return puedeComprar;
					
			}
			
			public double calcularCambio(int cantidad, double dinero) {
		
			
				return dinero-comprarBilletes(cantidad, dinero);
			}
			
			public double comprarBilletes(int cantidad, double dinero) {
				double precioTotal=0;
				
			
					precioTotal=cantidad*t1.getPrecio();
				
				
				
				return precioTotal;
			}
			
			public void imprimirBillete(int cantidad) {
				System.out.println("El trayecto de su billete es: "+t1.getTrayecto());
				System.out.println("El billete es válido para "+cantidad+" personas.");
			}
			
			public double sumarecaudado (double suma,int cantidad,double dinero) {
				suma = comprarBilletes(cantidad,dinero);
				
				return suma;
			}
			
			public double resetearSuma (double suma) {
				
				suma=0;
				
				return suma;
			}
			
			public boolean comprobarContraseña (int contraseña2, int contraseña1) {
				boolean comprobacionContraseña=false;
				if(contraseña1==contraseña2) {
					comprobacionContraseña=true;
				}
				return comprobacionContraseña;
				
			}
			
			
}
