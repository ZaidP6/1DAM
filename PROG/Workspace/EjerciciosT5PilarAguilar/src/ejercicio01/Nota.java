package ejercicio01;

public class Nota{

	private int id;
	private String titulo;
	private String texto;
	
	public Nota(int id, String titulo, String texto) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.texto = texto;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Nota [id=" + id + ", titulo=" + titulo + ", texto=" + texto + "]";
	}


	
	
}
