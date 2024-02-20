package ejemplo03_list;

import java.util.List;


public class CrudPersona {

	
	private List<Persona>listaPersonas;

	public CrudPersona(List<Persona> listaPersonas) {
		super();
		this.listaPersonas = listaPersonas;
	}

	public List<Persona> getListaPersonas() {
		return listaPersonas;
	}

	public void setListaPersonas(List<Persona> listaPersonas) {
		this.listaPersonas = listaPersonas;
	}

	@Override
	public String toString() {
		return "CrudPersona [listaPersonas=" + listaPersonas + "]";
	}
	
	public Persona findByDni(String dni) {
		boolean encontrado = false;
		int i = 0;
		while (i<listaPersonas.size() && !encontrado) {
			Persona p = listaPersonas[i];
			if (p.getDni().equalsIgnoreCase(dni)) {
				encontrado = true;
			}else
				i++;
		}
		if(encontrado == true) {
			return listaPersonas.get(i);
		}else 
			return null;
		
	}
	//Nunca creamos los parametros con atributos suelos de los metodos.
	//tampoco se imprime con syso dentro del metodo.
	//No se guarda e imprime a la vez
	public boolean agregarPersonaV2(Persona p){
		return listaPersonas.add(p);
	}
	
	
	public void agregarPersona(Persona p) {
		listaPersonas.add(p);
	}
	
	public void imprimirLista() {
		for (Persona p : listaPersonas) {
			System.out.println(p);
		}
	}
	
	public void eliminarPersona(Persona p) {
		listaPersonas.remove(p);
	}
	public void borrar(String dni) {
		if(findByDni(dni)) {
			
		}
	}
	
}
