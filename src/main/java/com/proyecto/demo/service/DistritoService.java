package com.proyecto.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.demo.entity.Distrito;
import com.proyecto.demo.repository.DistritoRepository;

@Service
public class DistritoService {
	@Autowired
	private DistritoRepository distritoDAO;
	
	public List<Distrito> listAll(){
		return distritoDAO.findAll();
	}
}
