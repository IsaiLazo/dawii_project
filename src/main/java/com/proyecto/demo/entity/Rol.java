package com.proyecto.demo.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="tb_rol")
public class Rol implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "cod_rol")
	private int codigo;

	private String descripcion;

	@OneToMany(mappedBy="rol")
	private List<Usuario> usuarios;
	

	
	public Rol() {
		
	}



	public int getCodigo() {
		return codigo;
	}



	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}



	public String getDescripcion() {
		return descripcion;
	}



	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}



	public List<Usuario> getUsuarios() {
		return usuarios;
	}



	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	
	

	

}