package com.sena.ejercicio.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.ejercicio.Entity.Libro;
import com.sena.ejercicio.IRepository.IBaseRepository;
import com.sena.ejercicio.IRepository.ILibroRepository;
import com.sena.ejercicio.IService.ILibroService;

@Service
public class LibroService extends ABaseService<Libro> implements ILibroService{

	@Override
	protected IBaseRepository<Libro, Long> getRepository() {
		return repository;
	}

	@Autowired
	private ILibroRepository repository;
}
