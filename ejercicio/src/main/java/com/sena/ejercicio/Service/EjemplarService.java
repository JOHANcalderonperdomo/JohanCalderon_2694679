package com.sena.ejercicio.Service;

import org.springframework.stereotype.Service;

import com.sena.ejercicio.Entity.Ejemplar;
import com.sena.ejercicio.IRepository.IBaseRepository;
import com.sena.ejercicio.IRepository.IEjemplarRepository;
import com.sena.ejercicio.IService.IEjemplarService;

@Service
public class EjemplarService extends ABaseService<Ejemplar> implements IEjemplarService{

	@Override
	protected IBaseRepository<Ejemplar, Long> getRepository() {
		return repository;
	}
	
	private IEjemplarRepository repository;

}
