package com.sena.ejercicio.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.ejercicio.Entity.Autor;
import com.sena.ejercicio.IRepository.IAutorRepository;
import com.sena.ejercicio.IRepository.IBaseRepository;
import com.sena.ejercicio.IService.IAutorService;

@Service
public class AutorService extends ABaseService<Autor> implements IAutorService{

	@Override
	protected IBaseRepository<Autor, Long> getRepository() {
		return repository;
	}
	
	@Autowired
	private IAutorRepository repository;
	
}
