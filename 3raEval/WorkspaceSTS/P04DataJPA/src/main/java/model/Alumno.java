package model;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor 
@Entity @Table(name="alumnado")
public class Alumno {

	@Id @GeneratedValue 
	private Long alumnoId;
	
	@Column(columnDefinition = "Varchar 100")
	private String alumnoNombre;
	private String alumnoApellidos;
	private String alumnoEmail;
	
	
	public Alumno(String alumnoNombre, String alumnoApellidos, String alumnoEmail) {
		super();
		this.alumnoNombre = alumnoNombre;
		this.alumnoApellidos = alumnoApellidos;
		this.alumnoEmail = alumnoEmail;
	}

	
	
}
