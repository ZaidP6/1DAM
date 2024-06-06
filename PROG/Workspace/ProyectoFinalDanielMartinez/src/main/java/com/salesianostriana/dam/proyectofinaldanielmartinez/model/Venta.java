package com.salesianostriana.dam.proyectofinaldanielmartinez.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Venta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate fecha;
	
	private double importeTotal;
	
	private double gastosEnvio;
	
	private boolean abierta;
	
	@ToString.Exclude
	@EqualsAndHashCode.Exclude
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "cliente_id")
	private Cliente cliente;
	
	@ToString.Exclude
	@EqualsAndHashCode.Exclude
	@OneToMany(mappedBy = "venta", cascade=CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
	@Builder.Default
	private List<LineaVenta> lineas = new ArrayList<>();
	
	public void addVentaCliente(Cliente cliente) {
		this.cliente = cliente;
		cliente.getVentas().add(this);
	}
	
	public void removeLineaVenta(Cliente cliente) {
		this.cliente = null;
		cliente.getVentas().remove(this);
	}
	
	public void addLineaVenta(LineaVenta lineaVenta) {
	    if (lineas == null) {
	        lineas = new ArrayList<>();
	    }
	    lineas.add(lineaVenta);
	    lineaVenta.setVenta(this);
	}

	
	public void removeLineaVenta(LineaVenta lineaVenta) {
		lineaVenta.setVenta(null);
		this.getLineas().remove(lineaVenta);
	}
	
	public void removeLineaVenta(long lineaVenta_id) {
		Optional<LineaVenta> lv = lineas.stream()
				.filter(x -> x.getId()==this.id && 
				x.getId()==lineaVenta_id)
				.findFirst();
		if(lv.isPresent()) {
			removeLineaVenta(lv.get());
		}
	}
	
}
