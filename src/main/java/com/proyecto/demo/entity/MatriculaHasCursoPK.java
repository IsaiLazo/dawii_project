package com.proyecto.demo.entity;

import java.io.Serializable;
import java.util.Objects;

import lombok.Data;


public class MatriculaHasCursoPK implements Serializable{
	
	private int matricula;
	private int curso;
	
	
	@Override
	public int hashCode() {
		return Objects.hash(curso, matricula);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MatriculaHasCursoPK other = (MatriculaHasCursoPK) obj;
		return curso == other.curso && matricula == other.matricula;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public int getCurso() {
		return curso;
	}
	public void setCurso(int curso) {
		this.curso = curso;
	}
	
	
	
	
	
	
	
}
