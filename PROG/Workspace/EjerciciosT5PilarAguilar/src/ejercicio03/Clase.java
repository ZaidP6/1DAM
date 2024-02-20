package ejercicio03;

import java.util.Iterator;
import java.util.Set;

public class Clase {
	
	private Set<Alumno> listaAlumnos;

	public Clase(Set<Alumno> listaAlumnos) {
		super();
		this.listaAlumnos = listaAlumnos;
	}

	public Set<Alumno> getListaAlumnos() {
		return listaAlumnos;
	}

	public void setListaAlumnos(Set<Alumno> listaAlumnos) {
		this.listaAlumnos = listaAlumnos;
	}

	@Override
	public String toString() {
		return "Clase [listaAlumnos=" + listaAlumnos + "]";
	}
	
	
	public void addAlumno(Alumno a) {
		listaAlumnos.add(a);
		
	}
	
	public void modificarAlumno(Alumno a,String nombre, String Apellido, int anio) {
		a.setNombre(nombre);
		a.setApellido(Apellido);
		a.setAnio(anio);
	}
	
	public void mostrarLista() {
		for (Alumno alumno : listaAlumnos) {
			System.out.println(alumno);
		}
	}
	
	public void borrarAlumno(Alumno a) {
		listaAlumnos.remove(a);
	}
	//No se puede hacer un buscar v2 con un índice porque no es una lista ordenada, no hay índices.
	public Alumno findByNombre(String nombre) {
		boolean encontrado = false;
		Iterator <Alumno> it = listaAlumnos.iterator();
		Alumno a = null;
		while (it.hasNext() &&  !encontrado) {
			a = it.next();
			if (a.getNombre().equalsIgnoreCase(nombre)) {
				encontrado = true;
			}
		}
		if (encontrado) {
			return a;
		}else
			return null;
		
	}
	
	public Alumno findById(int id) {
		if (listaAlumnos.size() !=0) {
			for (Alumno alumno : listaAlumnos) {
				if (alumno.getId() == id) {
					return alumno; 
					//No hace falta el encontrado porque el return 
					//sale del método directamente. Es una forma de parar drásticamente.
				}
			}
		}
		return null;
	}

}
