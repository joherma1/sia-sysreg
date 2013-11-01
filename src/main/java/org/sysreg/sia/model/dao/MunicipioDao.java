package org.sysreg.sia.model.dao;

import java.util.List;

import org.sysreg.sia.model.Municipio;

public interface MunicipioDao {
	void persist(Municipio municipio);

	Municipio findById(int id);
	
	List<Municipio> findAll();

	Municipio findByNombre(String nombre);
}
