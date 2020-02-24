package com.modelo.cursomc.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/Categorias")
public class CategoriaResouces {
	
	@RequestMapping(method = RequestMethod.GET)
	public String Lista() {
		
		return "Funcionando";
		
	}
	

}
