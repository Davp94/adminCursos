package com.informatica.lasin.system.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.informatica.lasin.system.models.Curso;

public interface ICursoDao extends CrudRepository<Curso, Long>{
	
	List<Curso> findByDocente_Id(Long id);

}
