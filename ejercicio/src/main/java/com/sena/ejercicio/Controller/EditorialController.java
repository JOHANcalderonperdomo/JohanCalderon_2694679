package com.sena.ejercicio.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.ejercicio.Entity.Editorial;
import com.sena.ejercicio.IService.IEditorialService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/editorial")
public class EditorialController extends ABaseController<Editorial, IEditorialService>{

	public EditorialController(IEditorialService service) {
		super(service, "Editorial");
	}

}
