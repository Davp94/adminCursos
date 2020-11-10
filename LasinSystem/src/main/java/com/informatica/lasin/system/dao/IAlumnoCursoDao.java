package com.informatica.lasin.system.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.informatica.lasin.system.models.AlumnoCurso;

public interface IAlumnoCursoDao extends CrudRepository<AlumnoCurso, Long>{
	
	List<AlumnoCurso> findByCurso_Id(Long idCurso);
}
