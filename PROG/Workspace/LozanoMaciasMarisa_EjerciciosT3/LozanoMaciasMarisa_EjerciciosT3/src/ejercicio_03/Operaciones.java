package ejercicio_03;

public class Operaciones {

	
	public Operaciones() {
		
		
	}
	
	public boolean comprobarNegativo(int num) {
		
		boolean negativo=false;
		int cero=0;
		
		if(num<cero){
			negativo=true;
		}
		else {
			negativo=false;
		}
		
		return negativo;
	}
	
	public boolean comprobarPar(int num) {
		
		boolean par=false;
		int resultado, dos=2;
		
		resultado=num%dos;
		
		if(resultado==0) {
			par=true;
		}
		else {
			par=false;
		}
		
		
		return par;
	}

	//crear metodo void if negativo= true syso(el numero es negativo)
	
		
	
}
