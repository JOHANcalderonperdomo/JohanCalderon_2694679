package com.sena.ejercicio.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.ejercicio.Entity.Prestamo;
import com.sena.ejercicio.IService.IPrestamoService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/prestamo")
public class PrestamoController extends ABaseController<Prestamo, IPrestamoService>{

	public PrestamoController(IPrestamoService service) {
		super(service, "Prestamo");
	}

}
