package ejercicio_05;

public class Copiado {
	
	private String frase;

	public Copiado(String frase) {
		super();
		this.frase = frase;
	}

	public String getFrase() {
		return frase;
	}

	public void setFrase(String frase) {
		this.frase = frase;
	}

	@Override
	public String toString() {
		return "Copiado [frase=" + frase + "]";
	}
	
	

	public void copiarfrase(int num) {
		
		for (int i = 0; i < num; i++) {
			
			System.out.println(frase);	
		}
	}

}
