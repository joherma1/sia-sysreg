package org.sysreg.sia.model.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.sysreg.sia.model.Municipio;
import org.sysreg.sia.model.dao.MunicipioDao;

@Repository
public class MunicipioDaoImpl implements MunicipioDao {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	@Transactional
	public void persist(Municipio municipio) {
		entityManager.persist(municipio);
	}

	@Override
	@Transactional
	public Municipio findById(int id) {
		return entityManager.find(Municipio.class, id);
	}

	@Override
	@Transactional
	public List<Municipio> findAll() {
		return entityManager.createQuery("from Municipio", Municipio.class).getResultList();
	}

	@Override
	@Transactional
	public Municipio findByNombre(String nombre) {
		Query query = entityManager.createQuery("from Municipio where nombre = ?1", Municipio.class);
		query.setParameter(1, nombre);
		@SuppressWarnings("unchecked")
		List<Municipio> result = query.getResultList();
		if (result.size() > 0)
			return result.get(0);
		else
			return null;
	}
}
