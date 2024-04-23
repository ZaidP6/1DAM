package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Alumno;

public interface StudentRepository extends JpaRepository<Alumno, Long>{

	
	
}
