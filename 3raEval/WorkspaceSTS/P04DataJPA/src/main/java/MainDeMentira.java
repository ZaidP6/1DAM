import java.util.function.Consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import model.Alumno;
import repository.StudentRepository;
	
@Component
public class MainDeMentira {

	

		@Autowired
		private StudentRepository repositorio;
		
		@PostConstruct
		void ejecutar() {
			
			repositorio.save(new Alumno("Pilar", "Aguilar", "aguilar.dimar@gmail.com"));
			
			/*
			 * repositorio.findAll().forEach(new Consumer <Alumno>() {
			
				public void accept(Alumno a) {
					System.out.println();
				}
			});	
			 */
			
			//repositorio.findAll().forEach(a -> System.out.println(a));
			repositorio.findAll().forEach(System.out::println);
		}
	
}
