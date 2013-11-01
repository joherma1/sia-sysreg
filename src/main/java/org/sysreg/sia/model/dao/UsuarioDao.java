package org.sysreg.sia.model.dao;

import java.util.List;

import org.sysreg.sia.model.Usuario;

public interface UsuarioDao {
	void persist(Usuario usuario);

	Usuario findById(int id);

	List<Usuario> findAll();
	
	Usuario findByUsuario(String usuario);

}
