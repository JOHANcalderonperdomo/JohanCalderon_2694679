package com.sena.ejercicio.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="libro")
public class Libro extends ABaseEntity{
	
	@Column(name = "titulo", length = 50, nullable = false)
    private String titulo;
	
	@Column(name = "autor", length = 50, nullable = false)
    private String autor;
	
	@Column(name = "anio_publicacion", length = 50, nullable = false)
    private String anioPublicacion;
	
	@Column(name = "genero", length = 50, nullable = false)
    private String genero;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getAnioPublicacion() {
		return anioPublicacion;
	}

	public void setAnioPublicacion(String anioPublicacion) {
		this.anioPublicacion = anioPublicacion;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

}
