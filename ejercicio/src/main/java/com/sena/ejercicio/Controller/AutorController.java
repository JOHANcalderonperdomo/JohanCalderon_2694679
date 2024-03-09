package com.sena.ejercicio.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.ejercicio.Entity.Autor;
import com.sena.ejercicio.IService.IAutorService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/autor")
public class AutorController extends ABaseController<Autor, IAutorService>{

	public AutorController(IAutorService service) {
		super(service, "Autor");
	}

}
