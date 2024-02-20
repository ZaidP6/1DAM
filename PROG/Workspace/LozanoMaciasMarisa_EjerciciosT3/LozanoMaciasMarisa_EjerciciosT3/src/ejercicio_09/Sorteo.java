package ejercicio_09;

import java.util.Random;

public class Sorteo {
	
	/*Crear un programa que gestione un sorteo de lotería. La lotería de Navidad se realiza sobre números que van desde el 00001 al 99999 
	 *(no tendremos en cuenta series). Para facilitar, tendremos solo la clase Sorteo y la principal para probar todo. El programa debe hacer lo siguiente:
		•Comprar un décimo (eligiendo el número por teclado).
		•Comprar un décimo generado por la máquina (aleatorio).
		•Hacer sorteo (generará aleatoriamente el número premiado).
		•Comprobar si nuestro décimo está premiado devolviendo un boolean.
		•Mostrar si eres ganador o no.*/
	
	public void imprimirDecimoElegido (double precio, double dinero, int numDecimo) {
			
			if(precio<=dinero){
				
				System.out.println("Aquí tiene su décimo "+numDecimo);
				
			}
			else {
				System.out.println("Lo sentimos, es usted un tieso vuelve con mas dinero");
			}
			
		}
	public int generarDecimo(int desde, int hasta){
		Random rnd=new Random (System.nanoTime());
		
		
		return rnd.nextInt(hasta-desde+1)+desde;
	}
	
	public int generarNumAleatorio(int hasta, int desde) {
		return generarDecimo(desde, hasta);
	}
	
	public void imprimirGenerado (int desde, int hasta) {
		
		System.out.println("Su décimo es "+generarDecimo(desde, hasta));
	}
	
	public boolean comprobarNum(int num1, int num2) {
		boolean resultado=true;
		
		if(num1==num2) {
			resultado=true;

		}
		else {
			resultado=false;
		}
		
		return resultado;
	}
	
	public void imprimirResultado(boolean resultado) {
		
		if(resultado==true) {
			System.out.println("Enhorabuena, ha resultado usted ganado");
		}
		else {
			System.out.println("Ohh no ha habido suerte..... pruebe de nuevo");
		}
	}
	
	


}
