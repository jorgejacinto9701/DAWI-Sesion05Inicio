package com.empresa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AlumnoController {


	@RequestMapping("/")
	public String verInicio() {
		return "crudAlumno";
	}


}
