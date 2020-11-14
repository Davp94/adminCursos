package com.informatica.lasin.system.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.informatica.lasin.system.dao.IPersonaDao;
import com.informatica.lasin.system.models.Persona;
import com.informatica.lasin.system.services.IPersonaService;


@Controller
public class PersonasController {
	
	@Autowired
	private IPersonaDao personaDao;
	
	@Autowired
	private IPersonaService personaService;
	
	@GetMapping({"/",""})
	public String index(Model model) {
		model.addAttribute("titulo","hola spring boot");
		return "index";
	}
	
	@GetMapping("/personas")
	public String listaPersonas(Model model) {
		List<Persona> personas=(List<Persona>) personaDao.findAll();
		model.addAttribute("personas", personas);
		return "personas";
	}
	
//	@GetMapping("/cursos")
//	public String listaCursos(Model model) {
//		List<Persona> c=(List<Persona>) personaDao.findAll();
//		model.addAttribute("personas", personas);
//		return "cursos";
//	}

}
