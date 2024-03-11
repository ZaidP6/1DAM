package ejemploConcesionario;

public class Extras {

	private String tipoExtras;

	public Extras(String tipoExtras) {
		super();
		this.tipoExtras = tipoExtras;
	}

	public String getTipoExtras() {
		return tipoExtras;
	}

	public void setTipoExtras(String tipoExtras) {
		this.tipoExtras = tipoExtras;
	}

	@Override
	public String toString() {
		return "Extras [tipoExtras=" + tipoExtras + "]";
	}

}
