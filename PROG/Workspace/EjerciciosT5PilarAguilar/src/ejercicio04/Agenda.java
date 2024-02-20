package ejercicio04;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

public class Agenda {

	Map<Contacto, String> lista;

	public Agenda(Map<Contacto, String> lista) {
		super();
		this.lista = lista;
	}

	public Map<Contacto, String> getLista() {
		return lista;
	}

	public void setLista(Map<Contacto, String> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Agenda [lista=" + lista + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(lista);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Agenda other = (Agenda) obj;
		return Objects.equals(lista, other.lista);
	}
	
	
	public Contacto findByName(String nombre) {
		boolean encontrado = false;
		Contacto a = null;
		Iterator<Contacto> it = (Iterator<Contacto>) lista;
		
		
		
		return null;
		
	}
	
	
}
