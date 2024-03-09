package com.sena.ejercicio.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.ejercicio.Entity.Categoria;
import com.sena.ejercicio.IRepository.IBaseRepository;
import com.sena.ejercicio.IRepository.ICategoriaRepository;
import com.sena.ejercicio.IService.ICategoriaService;

@Service
public class CategoriaService extends ABaseService<Categoria> implements ICategoriaService{

	@Override
	protected IBaseRepository<Categoria, Long> getRepository() {
		return repository;
	}

	@Autowired
	private ICategoriaRepository repository;
}
