package ejemplo_while;

import utilidades.Leer;

public class Principal{
	
	
	public static void main(String[] args) {
		
		int num=1, cero=0;
        
        System.out.println("Por favor indique un numero, o cero para salir ");
        
        num=Leer.datoInt();
        
        while(num!=cero) {
            
            System.out.println(num);
            
            System.out.println("Indique número");
            
            num=Leer.datoInt();
            
            
        }
	}
}