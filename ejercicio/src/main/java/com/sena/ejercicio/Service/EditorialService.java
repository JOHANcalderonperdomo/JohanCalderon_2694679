package com.sena.ejercicio.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.ejercicio.Entity.Editorial;
import com.sena.ejercicio.IRepository.IBaseRepository;
import com.sena.ejercicio.IRepository.IEditorialRepository;
import com.sena.ejercicio.IService.IEditorialService;

@Service
public class EditorialService extends ABaseService<Editorial> implements IEditorialService{

	@Override
	protected IBaseRepository<Editorial, Long> getRepository() {
		return repository;
	}
	
	@Autowired
	private IEditorialRepository repository;

}
