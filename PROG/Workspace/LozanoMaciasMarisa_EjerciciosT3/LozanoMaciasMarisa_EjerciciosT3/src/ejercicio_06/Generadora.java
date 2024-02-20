package ejercicio_06;

import java.util.Random;

public class Generadora {
	
	/*Crear una clase llamada Generadora sin atributos, pero con varios métodos que generen aleatoriamente distintos números o resultados según las características
	 *  del sorteo o para qué se vaya a usar, por ejemplo, generar 1, x, 2 para una quiniela, generar par o impar para jugar a pares o nones, generar 1, 2 o 3 para 
	 *  jugar a los "chinos", del 1 al 49 para el sorteo de primitiva... Crear una clase principal donde se prueben todos los métodos pidiendo los datos necesarios
	 *   para cada generación.
	 */

	
	public int generarNum(int desde,int hasta) {
		
		Random rnd= new Random (System.nanoTime());
		
		
		return rnd.nextInt(hasta-desde+1)+desde;
	}
	
	public int generarPrimitiva (int desde, int hasta) {
		
		int num=0;
		num=generarNum(desde,hasta);
		return num;
	}
	
	public boolean generarParImpar(int desde, int hasta, int num1) {
		int dos=2,num2;
		boolean resultado;
		
		num2=generarNum(desde, hasta);
		
		
		if((num1+num2)%dos==0) {
			
			resultado=true;
		}
		
		else {
			resultado=false;
		}
		
		return resultado;
	}
	
	public void imprimirParImpar(boolean resultado){
		
		if(resultado==true) {
			System.out.println("El número es par");
		}
		else {
			System.out.println("El número es impar");
		}
		
	}
	
	public int generarQuiniela(int desde, int hasta) {
		
		return generarNum(desde, hasta);
		
	}
	
	public void imprimirQuiniela(int desde,int hasta, int num) {
		
		if(generarNum(desde, hasta)==1) {
			System.out.println("1");
		}
		else if (generarNum(desde, hasta)==2) {
			System.out.println("2");
		}
		else {
			System.out.println("X");
		}
	}
	
	

	public int generarChino(int desde, int hasta) {
		
		return generarNum(desde, hasta);
	}
	
	public boolean comprobarChino(int desde, int hasta,int num) {
		boolean resultado;
		if(generarChino(desde, hasta)+num==num) {
			
			resultado=true;
			
		}
		else {
			resultado=false;
		}
		return resultado;
	}
	
	public void imprimirChino(int desde, int hasta, boolean resultado) {
		if(resultado==true) {
			
			System.out.println("Ha ganado");
			
		}
		else {
			System.out.println("Ha perdido.... siga intentándolo");
		}
	}
}
