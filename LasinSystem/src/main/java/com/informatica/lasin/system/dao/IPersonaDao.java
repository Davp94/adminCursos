package com.informatica.lasin.system.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.informatica.lasin.system.models.Persona;

public interface IPersonaDao extends CrudRepository<Persona, Long>{

	List<Persona> findByCiContaining(String ci);
	
}
