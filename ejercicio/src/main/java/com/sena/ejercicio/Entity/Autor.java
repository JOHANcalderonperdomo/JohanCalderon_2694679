package com.sena.ejercicio.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "autor")
public class Autor extends ABaseEntity{

	@Column(name = "nombre_autor", length = 50, nullable = false)
    private String nombreAutor;
	
	@Column(name = "pais", length = 50, nullable = false)
    private String pais;
	
	@Column(name = "fecha_nacimiento", length = 50, nullable = false)
    private String fechaNacimiento;

	public String getNombreAutor() {
		return nombreAutor;
	}

	public void setNombreAutor(String nombreAutor) {
		this.nombreAutor = nombreAutor;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
}
