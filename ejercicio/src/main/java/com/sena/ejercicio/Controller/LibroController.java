package com.sena.ejercicio.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.ejercicio.Entity.Libro;
import com.sena.ejercicio.IService.ILibroService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/libro")
public class LibroController extends ABaseController<Libro, ILibroService>{

	public LibroController(ILibroService service) {
		super(service, "Libro");
	}

}
