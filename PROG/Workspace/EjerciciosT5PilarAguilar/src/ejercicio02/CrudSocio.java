package ejercicio02;

import java.util.List;

public class CrudSocio {

	List<Socio> listaSocios;

	public CrudSocio(List<Socio> listaSocios) {
		super();
		this.listaSocios = listaSocios;
	}

	public List<Socio> getListaSocios() {
		return listaSocios;
	}

	public void setListaSocios(List<Socio> listaSocios) {
		this.listaSocios = listaSocios;
	}

	@Override
	public String toString() {
		return "CrudSocio [listaSocios=" + listaSocios + "]";
	}
	
	
	public void addSocio(Socio soc) {
		listaSocios.add(soc);
	}
	
	public Socio findById(int num) {
		var encontrado = false;
		var i = 0;
		while(i<listaSocios.size() && !encontrado) {
			Socio soc = listaSocios.get(i);
			if (listaSocios.get(i).getnSocio() == num) {
				encontrado = true;
			}else
				i++;
			
		}
		if(encontrado == true) {
			return listaSocios.get(i);
		}else
			return null;
	}
	
	public void mostrarSocio(int num) {
		System.out.println(findById(num));
	}
	
	public void modificarNombreSocio(int num, String nuevoNombre) {
		findById(num).setNombre(nuevoNombre);
	}
	public void modificarEdadSocio(int num, int nuevaEdad) {
		findById(num).setEdad(nuevaEdad);
	}
	
	public void removeSocio(int num) {
		listaSocios.remove(findById(num));
	}
	
	public void mostrarListaSocios() {
		for (Socio socio : listaSocios) {
			System.out.println(socio);
		}
	}
	
	
}
