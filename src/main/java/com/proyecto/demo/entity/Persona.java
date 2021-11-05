package com.proyecto.demo.entity;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "tb_persona")
@Inheritance(strategy = InheritanceType.JOINED)
//herencia de tipo JOINED donde cada clase que herede de persona será una tabla independiente
@Data
@RequiredArgsConstructor
public class Persona implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod_persona")
	private int codigoPersona;
	@Column(name = "nom_persona")
	private String nombrePersona;
	@Column(name = "pat_persona")
	private String paternoPersona;
	@Column(name = "mat_persona")
	private String maternoPersona;
	@Column(name = "sex_persona")
	private String sexoPersona;
	@Temporal(TemporalType.DATE)
	@Column(name = "fec_nac_persona")
	private Date fechaNacimiento;
	@Column(name = "cel_persona")
	private int celularPersona;
	@Column(name = "dni_persona")
	private int dniPersona;
	@Column(name = "correo_persona")
	private String correoPersona;
	@Column(name = "dir_persona")
	private String direccionPersona;
	//relación muchos a uno  con Distrito
	@ManyToOne
	@JoinColumn(name = "cod_dis")
	private Distrito distrito;//ASOC
	
	
	public Persona(int codigoPersona, String nombrePersona, String paternoPersona, String maternoPersona,
			String sexoPersona, Date fechaNacimiento, int celularPersona, int dniPersona, String correoPersona,
			String direccionPersona, Distrito distrito) {
		super();
		this.codigoPersona = codigoPersona;
		this.nombrePersona = nombrePersona;
		this.paternoPersona = paternoPersona;
		this.maternoPersona = maternoPersona;
		this.sexoPersona = sexoPersona;
		this.fechaNacimiento = fechaNacimiento;
		this.celularPersona = celularPersona;
		this.dniPersona = dniPersona;
		this.correoPersona = correoPersona;
		this.direccionPersona = direccionPersona;
		this.distrito = distrito;
	}
	
	
	
	
}
