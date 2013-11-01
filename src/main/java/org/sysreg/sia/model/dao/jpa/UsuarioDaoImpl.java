package org.sysreg.sia.model.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.sysreg.sia.model.Usuario;
import org.sysreg.sia.model.dao.UsuarioDao;

@Repository
public class UsuarioDaoImpl implements UsuarioDao {
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	@Transactional
	public void persist(Usuario usuario) {
		entityManager.persist(usuario);
	}

	@Override
	@Transactional
	public Usuario findById(int id) {
		return entityManager.find(Usuario.class, id);
	}

	@Override
	@Transactional
	public List<Usuario> findAll() {
		return entityManager.createQuery("from Usuario",Usuario.class).getResultList();
	}

	@Override
	@Transactional
	public Usuario findByUsuario(String usuario) {
		Query q = entityManager.createQuery("from Usuario where usuario = ?1", Usuario.class);
		q.setParameter(1, usuario);
		List<Usuario> results = q.getResultList();
		if(results.size()>0)
			return results.get(0);
		else
			return null;
	}
	
	
	

}
