package com.proyecto.demo.controller;

import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.proyecto.demo.entity.Profesor;
import com.proyecto.demo.service.DistritoService;
import com.proyecto.demo.service.ProfesorService;

@Controller
@RequestMapping(value = "/profesor")
public class ProfesorController {

	@Autowired
	private ProfesorService profesorService;
	
	@Autowired
	private DistritoService distritoService;
	
	@RequestMapping(value = "/intranet-profesor")
	public String intranet() {
		
		return "profesores/intranetProfesores";
	}
	
	@RequestMapping(value = "/expediente-profesor")
	public String expediente(Model model) {
		model.addAttribute("profesores",profesorService.listAll());
		model.addAttribute("distritos",distritoService.listAll());
		model.addAttribute("profesor",new Profesor());
		return "profesores/expedientesProfesores";
	}
	
	@RequestMapping(value = "/guardar-profesor")
	public String guardarProfesor(@ModelAttribute("profesor") Profesor bean, 
			@RequestParam("fecha") String fec,@RequestParam("distrito") int codDis,RedirectAttributes redirect) {
		try {
			bean.setFechaNacimiento(new SimpleDateFormat("yyyy-MM-dd").parse(fec));
			profesorService.save(bean);
			redirect.addFlashAttribute("MENSAJE","Postulante guardado...");
		} catch (Exception e) {
			redirect.addFlashAttribute("MENSAJE","Error al guardar datos del postulante...");
			e.printStackTrace();
		}
		return "redirect:/profesor/expediente-profesor";
	}
	
	@RequestMapping(value = "/buscar-profesor")
	@ResponseBody
	public Profesor buscarProfesor(@RequestParam("codigo") int codPos) {
		return profesorService.findById(codPos);
	}
	
	@RequestMapping(value = "/eliminar-profesor")
	public String eliminarProfesor(@RequestParam("codigo") int codPos,RedirectAttributes redirect) {
		try {
			profesorService.delete(codPos);
			redirect.addFlashAttribute("MENSAJE","Registro eliminado...");
			
		} catch (Exception e) {
			redirect.addFlashAttribute("MENSAJE","Error en la eliminacion...");
			e.printStackTrace();
		}
		
		return "redirect:/profesor/expediente-profesor"; 
	}
}
