package com.informatica.lasin.system.dtos;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonaDTO {

	private String ci;

	private String nombres;

	private String apellido1;

	private String apellido2;

	private String correo;

	private String telefono;

	private Date fechNac;

	private String direccion;

	private String password;

}
