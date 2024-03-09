package com.sena.ejercicio.IRepository;

import org.springframework.stereotype.Repository;

import com.sena.ejercicio.Entity.Libro;
@Repository
public interface ILibroRepository extends IBaseRepository<Libro, Long>{

}
