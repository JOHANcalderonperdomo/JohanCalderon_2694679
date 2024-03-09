package com.sena.ejercicio.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.ejercicio.Entity.Categoria;
import com.sena.ejercicio.IService.ICategoriaService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/categoria")
public class CategoriaController extends ABaseController<Categoria, ICategoriaService>{

	public CategoriaController(ICategoriaService service) {
		super(service, "Categoria");
	}

}
