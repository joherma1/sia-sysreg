package org.sysreg.sia.model.dao.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.sysreg.sia.model.Provincia;
import org.sysreg.sia.model.dao.ProvinciaDao;

@Repository
public class ProvinciaDaoImpl implements ProvinciaDao {
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	@Transactional
	public void persist(Provincia provincia) {
		entityManager.persist(provincia);
	}

}
