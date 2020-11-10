package com.informatica.lasin.system.models;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class UsuarioRol implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@MapsId("id")
	private Persona persona;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@MapsId("id")
	private Rol rol;
	
	private static final long serialVersionUID = 1L;

}
