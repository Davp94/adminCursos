package com.informatica.lasin.system.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Persona implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String ci;
	
	private String nombres;
	
	private String apellido1;
	
	private String apellido2;
	
	private String correo;
	
	private String telefono;
	
	private Date fechNac;
	
	private String direccion;
	
	private String password;
	
	private Date createdAt;
	
	@PrePersist
	public void prePersist() {
		createdAt=new Date();
	}
	
	private static final long serialVersionUID = 1L;

}
