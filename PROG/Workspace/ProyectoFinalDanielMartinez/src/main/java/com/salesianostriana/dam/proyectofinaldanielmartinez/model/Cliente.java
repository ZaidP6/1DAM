package com.salesianostriana.dam.proyectofinaldanielmartinez.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString(exclude = "ventas")
@EqualsAndHashCode(exclude = "ventas")
@DiscriminatorValue("USER")
public class Cliente extends Usuario {

    @OneToMany(mappedBy = "cliente", fetch = FetchType.EAGER)
    private List<Venta> ventas = new ArrayList<>();
	
    private static final long serialVersionUID = 1L;

    public void addVenta(Venta lv) {
		this.ventas.add(lv);
		lv.setCliente(this);
	}
	
	public void removeVenta(Venta lv) {
		this.ventas.remove(lv);
		lv.setCliente(null);
	}
}
