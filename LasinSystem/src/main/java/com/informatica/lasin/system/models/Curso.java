package com.informatica.lasin.system.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Curso implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nombre;
	
	@Temporal(TemporalType.DATE)
	private Date fechaInicio;
	
	@Temporal(TemporalType.DATE)
	private Date fechaFin;
	
	private String banner;
	
	@Temporal(TemporalType.TIME)
	private Date horaInicio;
	
	@Temporal(TemporalType.TIME)
	private Date horaFin;
	
	private Long cupo;
	
	private Long costo;
	
	private String modalidad;
	
	private Date createdAt;
	
	@PrePersist
	public void prePersist() {
		createdAt=new Date();
	}
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Docente docente;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Laboratorio laboratorio;
	
	private static final long serialVersionUID = 1L;

}
