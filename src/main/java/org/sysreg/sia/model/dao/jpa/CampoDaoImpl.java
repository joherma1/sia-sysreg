package org.sysreg.sia.model.dao.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.sysreg.sia.model.Campo;
import org.sysreg.sia.model.dao.CampoDao;

@Repository
public class CampoDaoImpl implements CampoDao {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	@Transactional
	public void persist(Campo campo) {
		entityManager.persist(campo);
	}

}
