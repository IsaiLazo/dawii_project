package com.proyecto.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.proyecto.demo.entity.Profesor;

public interface ProfesorRepository extends JpaRepository<Profesor, Integer>{
	@Query("select p from Profesor p where p.codigoPersona=?1")
	public Profesor buscar(int cod);
}
