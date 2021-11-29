package com.proyecto.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.demo.entity.Usuario;
import com.proyecto.demo.repository.UsuarioRepository;

@Service
public class UsuarioService {
	@Autowired
	private UsuarioRepository repo;
	
	public Usuario iniciaSesion(String vLogin) {
		return repo.iniciarSesion(vLogin);
	}
}
