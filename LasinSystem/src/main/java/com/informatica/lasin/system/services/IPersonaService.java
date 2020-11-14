package com.informatica.lasin.system.services;

import java.util.List;

import com.informatica.lasin.system.dtos.AlumnoCursoDTO;
import com.informatica.lasin.system.dtos.PersonaDTO;
import com.informatica.lasin.system.models.Admin;
import com.informatica.lasin.system.models.Alumno;
import com.informatica.lasin.system.models.Docente;
import com.informatica.lasin.system.models.Persona;

public interface IPersonaService {
	
	public Persona registrarPersona(PersonaDTO persona);
	
	public List<Persona> buscarPersonaPorCI(String ci);
	
	public Docente registrarDocente(Docente docente);
	
	public Alumno registrarAlumno(Alumno alumno);
	
	public Admin registrarAdmin(Admin admin);
	
	public List<AlumnoCursoDTO> alumnosPorCurso(Long idCurso);

}
