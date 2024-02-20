package ejercicio01_interface;

import java.util.Iterator;

public abstract class Publicacion implements IBiblioteca{

	
	private String titulo;
	private String autor;
	private int anioPublicacion;
	private boolean prestado;
	
	public Publicacion(String titulo, String autor, int anioPublicacion, boolean prestado) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.anioPublicacion = anioPublicacion;
		this.prestado = prestado;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getAnioPublicacion() {
		return anioPublicacion;
	}
	public void setAnioPublicacion(int anioPublicacion) {
		this.anioPublicacion = anioPublicacion;
	}
	public boolean isPrestado() {
		return prestado;
	}
	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}
	@Override
	public String toString() {
		return "Publicacion [titulo=" + titulo + ", autor=" + autor + ", anioPublicacion=" + anioPublicacion
				+ ", prestado=" + prestado + "]";
	}

	
	
	//Métodos
	
		@Override
	public int cuentaPrestados(Publicacion[] lista) {
			for
			return 0;
		}
	public int publicacionesAnterioresA(Publicacion[] lista, int anio) {
		
	}
	
}
