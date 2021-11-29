package com.proyecto.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.proyecto.demo.service.UsuarioService;
import com.proyecto.demo.entity.Usuario;

@SessionAttributes("usuario")

@Controller
public class UsuarioController {
	@Autowired
	private UsuarioService usuarioService;
	
	
	
	@RequestMapping("/login")
	public String index() {
		
		return "login";
	}
	
	@RequestMapping("/menu")
	public String menu(Authentication auth, Model model) {
		Usuario u=usuarioService.iniciaSesion(auth.getName());
		
		//atributo
		model.addAttribute("usuario",u);
		
		return "postulantes/intranetPostulantes";
	}
	
	
}
