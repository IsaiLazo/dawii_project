package com.proyecto.demo.entity;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Table(name = "tb_distrito")
@Data
public class Distrito implements Serializable{
	@Id
	@Column(name = "cod_dis")
	private int idDist;
	@Column(name="distrito")
	private String distrito;
	
	//relación uno a muchos con Postulante
	@JsonIgnore
	@OneToMany(mappedBy = "distrito")
	private List<Persona> listaPersona;
}
