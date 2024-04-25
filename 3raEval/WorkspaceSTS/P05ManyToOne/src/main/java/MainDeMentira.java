import org.springframework.stereotype.Component;

import com.salesianostriana.dam.model.Alumno;
import com.salesianostriana.dam.model.Curso;
import com.salesianostriana.dam.repository.AlumnoRepositorio;
import com.salesianostriana.dam.repository.CursoRepositorio;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class MainDeMentira {
	
	private final AlumnoRepositorio alumnoRepositorio;
	private final CursoRepositorio cursoRepositorio;
	
	@PostConstruct
	public void ejecutar() {
		
		/*
		 * Alumno a1 = new Alumno();
		a1.setNombre("Pepe");
		a1.setApellidos("Pérez Pérez");
		a1.setEmail("pepe@gmail.com");
		
		Alumno a2 = new Alumno();
		a2.setNombre("María");
		a2.setApellidos("Ruiz Hidalgo");
		a2.setEmail("lamari14@msn.com");
		 */
		Alumno a = Alumno.builder()
		.nombre("Luis Miguel")
		.apellidos("Lçopez")
		.email("luismi@gmail.com")
		.build();
		
		alumnoRepositorio.save(a);
		alumnoRepositorio.save(a);
		
		Curso c = new Curso();
		c.setNombre("1º DAM");
		c.setTutor("Miguel");
		
		cursoRepositorio.save(c);
		/*
		a1.setCurso(c);
		a2.setCurso(c);
		
		c.getAlumnos().add(a1);
		c.getAlumnos().add(a2);
		*/
		
		//a1.addToCurso(c);
		//a2.addToCurso(c);

		//alumnoRepositorio.save(a1);
		//alumnoRepositorio.save(a2);

		
		/*List<Curso> cursos = 
				cursoRepositorio.findAll();
		
		for(Curso curso : cursos) {
			System.out.println(curso);
			for(Alumno a : curso.getAlumnos()) {
				System.out.println(a);
			}
		}*/
		
		System.out.println(c);
		for(Alumno al : c.getAlumnos()) {
			System.out.println(al);
		}
		
	}

}