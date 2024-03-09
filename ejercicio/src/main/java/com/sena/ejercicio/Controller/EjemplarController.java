package com.sena.ejercicio.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.ejercicio.Entity.Ejemplar;
import com.sena.ejercicio.IService.IEjemplarService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/ejemplar")
public class EjemplarController extends ABaseController<Ejemplar, IEjemplarService>{

	public EjemplarController(IEjemplarService service) {
		super(service, "Ejemplar");
	}

}
