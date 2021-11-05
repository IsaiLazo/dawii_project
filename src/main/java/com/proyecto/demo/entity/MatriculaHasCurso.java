package com.proyecto.demo.entity;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.ManyToAny;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "tb_matricula_has_curso")
@IdClass(value = MatriculaHasCursoPK.class)
@Data
public class MatriculaHasCurso implements Serializable{
	
	@Id
	@ManyToOne		 //FK								 PK
	@JoinColumn(name="num_matri",referencedColumnName = "num_matri")
	private Matricula matricula;
	
	@Id
	@ManyToOne		//FK								PK	
	@JoinColumn(name="cod_cur",referencedColumnName = "cod_cur")
	private Curso curso;
	
	
	
	
}
