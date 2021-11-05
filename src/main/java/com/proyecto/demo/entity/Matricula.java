package com.proyecto.demo.entity;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GeneratorType;

import lombok.Data;

@Entity
@Table(name = "tb_matricula")
@Data
public class Matricula implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "num_matri")
	private int numeroMatricula;
	@Temporal(TemporalType.DATE)
	@Column(name = "fec_emi")
	private Date fechaEmision;
	private String estado;
	
	@ManyToOne
	@JoinColumn(name = "cod_pos")
	private Estudiante estudiante;
	
	
	@OneToMany(mappedBy = "matricula")
	private List<MatriculaHasCurso> listaMatriculaHasCurso;
	
}
