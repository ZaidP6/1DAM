package ejercicio;

public class Admin {

	private String contrasenya;

	public Admin(String contrasenya) {
		super();
		this.contrasenya = contrasenya;
	}

	public String getContrasenya() {
		return contrasenya;
	}

	public void setContrasenya(String contrasenya) {
		this.contrasenya = contrasenya;
	}

	@Override
	public String toString() {
		return "Admin [contrasenya=" + contrasenya + "]";
	}
	
	public boolean comprobarContrasenya(String contrasenyaV2) {
		if (contrasenya.equalsIgnoreCase(contrasenyaV2)) {
			return true;
		}else {
			return false;
		}
	}
}
