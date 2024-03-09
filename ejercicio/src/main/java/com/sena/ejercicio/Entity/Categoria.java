package com.sena.ejercicio.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="categoria")
public class Categoria extends ABaseEntity{

	@Column(name = "nombre", length = 50, nullable = false)
    private String nombre;
	
	@Column(name = "descripcion", length = 50, nullable = false)
    private String descripcion;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
