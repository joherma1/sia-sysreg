package org.sysreg.sia.model.dao.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

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

}
