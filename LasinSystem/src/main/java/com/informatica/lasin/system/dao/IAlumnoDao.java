package com.informatica.lasin.system.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.informatica.lasin.system.models.Alumno;

public interface IAlumnoDao extends CrudRepository<Alumno, Long>{

	List<Alumno> findByPersona_Ci(String ci);
}
