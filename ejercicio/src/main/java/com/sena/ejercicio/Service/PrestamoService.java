package com.sena.ejercicio.Service;

import org.springframework.stereotype.Service;

import com.sena.ejercicio.Entity.Prestamo;
import com.sena.ejercicio.IRepository.IBaseRepository;
import com.sena.ejercicio.IRepository.IPrestamoRepository;
import com.sena.ejercicio.IService.IPrestamoService;

@Service
public class PrestamoService extends ABaseService<Prestamo> implements IPrestamoService{

	@Override
	protected IBaseRepository<Prestamo, Long> getRepository() {
		return repository;
	}
	
	private IPrestamoRepository repository;

}
