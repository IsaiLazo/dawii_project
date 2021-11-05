package com.proyecto.demo.entity;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "tb_curso")
@Data
public class Curso implements Serializable{
	@Id
	@Column(name = "cod_cur")
	private int codigoCurso;
	@Column(name = "nom_cur")	
	private String nombre;
	@Column(name = "pre_cur")
	private double precio;
	
	@ManyToOne
	@JoinColumn(name = "cod_profesor")
	private Profesor profesor;
	
	public Curso(int codigoCurso) {
		this.codigoCurso=codigoCurso;
	}
	
	public Curso() {
		
	}
}
