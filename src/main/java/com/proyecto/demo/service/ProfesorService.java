package com.proyecto.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.demo.entity.Profesor;
import com.proyecto.demo.repository.ProfesorRepository;

@Service
public class ProfesorService {
	@Autowired
	private ProfesorRepository profesorDAO;
	
	public void save(Profesor bean) {
		profesorDAO.save(bean);
	}
	
	public void delete(int cod) {
		profesorDAO.deleteById(cod);
	}
	
	public Profesor findById(int cod) {
		return profesorDAO.buscar(cod);
	}
	
	public List<Profesor> listAll(){
		return profesorDAO.findAll();
	}
}
