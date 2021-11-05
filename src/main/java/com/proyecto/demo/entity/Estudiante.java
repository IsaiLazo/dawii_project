package com.proyecto.demo.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "tb_estudiante")
@Data
@PrimaryKeyJoinColumn(name = "cod_postulante")
public class Estudiante extends Persona implements Serializable{
	
	@Column(name = "estado_estudiantee")
	private String estado;
	
	@OneToMany(mappedBy = "estudiante")
	private List<Matricula> listaMatriculas;
	
	
	public Estudiante(int codigoPersona, String nombrePersona, String paternoPersona, String maternoPersona,
			String sexoPersona, Date fechaNacimiento, int celularPersona, int dniPersona, String correoPersona,
			String direccionPersona, Distrito distrito,String nombreArchivo,String estado) {
		super(codigoPersona, nombrePersona, paternoPersona, maternoPersona, sexoPersona, fechaNacimiento, celularPersona,
				dniPersona, correoPersona, direccionPersona, distrito);
		this.estado=estado;
	}

	public Estudiante() {
		
	}
	
	
}
