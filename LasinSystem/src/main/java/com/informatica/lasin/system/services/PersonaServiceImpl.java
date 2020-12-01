package com.informatica.lasin.system.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.informatica.lasin.system.dao.IAlumnoDao;
import com.informatica.lasin.system.dao.IPersonaDao;
import com.informatica.lasin.system.dtos.AlumnoCursoDTO;
import com.informatica.lasin.system.dtos.AlumnoDTO;
import com.informatica.lasin.system.dtos.PersonaDTO;
import com.informatica.lasin.system.models.Admin;
import com.informatica.lasin.system.models.Alumno;
import com.informatica.lasin.system.models.Docente;
import com.informatica.lasin.system.models.Persona;

@Service
public class PersonaServiceImpl implements IPersonaService{

	@Autowired
	private IPersonaDao personaDAo;
	
	@Autowired
	private IAlumnoDao alumnoDao;
	
	@Override
	public Persona registrarPersona(PersonaDTO persona) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Persona> buscarPersonaPorCI(String ci) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Docente registrarDocente(Docente docente) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Alumno registrarAlumno(Alumno alumno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Admin registrarAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AlumnoCursoDTO> alumnosPorCurso(Long idCurso) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AlumnoDTO> listaDeAlumnos() {
		// TODO Auto-generated method stub
		List<AlumnoDTO> alumnosDTO=new ArrayList<AlumnoDTO>();
		List<Alumno> alumnos=(List<Alumno>) alumnoDao.findAll();
		for(Alumno al:alumnos) {
			AlumnoDTO alumnoDTO=new AlumnoDTO();
			alumnoDTO.setCi(al.getPersona().getCi());
			alumnoDTO.setTipo("alumno");
			alumnoDTO.setNombre(al.getPersona().getApellido1()+" "+al.getPersona().getApellido2()+" "+al.getPersona().getNombres());
			alumnosDTO.add(alumnoDTO);
		}
		return alumnosDTO;
	}

}
