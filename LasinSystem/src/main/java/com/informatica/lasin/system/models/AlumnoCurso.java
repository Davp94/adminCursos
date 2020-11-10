package com.informatica.lasin.system.models;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class AlumnoCurso implements Serializable{

	@Id
	private Long id;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Alumno alumno;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Curso curso;
	
	private String nroDeposito;
	
	private Double nota;
	
	private static final long serialVersionUID = 1L;

}
