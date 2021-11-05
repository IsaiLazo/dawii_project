package com.proyecto.demo.entity;


import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Table(name = "tb_profesor")
@Data
@PrimaryKeyJoinColumn(name = "cod_profesor")
public class Profesor extends Persona implements Serializable{
	
	
	@Column(name = "sue_emp")
	private double sueldo;
	
	@JsonIgnore
	@OneToMany(mappedBy = "profesor")
	private List<Curso> listaCursos;
	
	public Profesor(int codigoPersona, String nombrePersona, String paternoPersona, String maternoPersona,
			String sexoPersona, Date fechaNacimiento, int celularPersona, int dniPersona, String correoPersona,
			String direccionPersona, Distrito distrito,double sueldo) {
		super(codigoPersona, nombrePersona, paternoPersona, maternoPersona, sexoPersona, fechaNacimiento, celularPersona,
				dniPersona, correoPersona, direccionPersona, distrito);
		this.sueldo=sueldo;
	}

	public Profesor() {
		super();
	}
	
}
