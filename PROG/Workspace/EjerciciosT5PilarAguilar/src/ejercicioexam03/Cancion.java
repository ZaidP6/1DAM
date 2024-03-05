package ejercicioexam03;

import java.util.Comparator;

public class Cancion implements Comparable<Cancion>{

	
	private int id;
	private String titulo;
	private String interprete;
	private int numReproducciones;
	private boolean gratis;
	private double duracion;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getInterprete() {
		return interprete;
	}
	public void setInterprete(String interprete) {
		this.interprete = interprete;
	}
	public int getNumReproducciones() {
		return numReproducciones;
	}
	public void setNumReproducciones(int numReproducciones) {
		this.numReproducciones = numReproducciones;
	}
	public boolean isGratis() {
		return gratis;
	}
	public void setGratis(boolean gratis) {
		this.gratis = gratis;
	}
	public double getDuracion() {
		return duracion;
	}
	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}
	public Cancion(int id, String titulo, String interprete, int numReproducciones, boolean gratis, double duracion) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.interprete = interprete;
		this.numReproducciones = numReproducciones;
		this.gratis = gratis;
		this.duracion = duracion;
	}
	@Override
	public String toString() {
		return "Cancion [id=" + id + ", titulo=" + titulo + ", interprete=" + interprete + ", numReproducciones="
				+ numReproducciones + ", gratis=" + gratis + ", duracion=" + duracion + "]";
	}
	
	
	@Override
	public int compareTo(Cancion c) {
		// TODO Auto-generated method stub
		return this.interprete.compareTo(c.interprete);
	}
	
	
	
	
}
