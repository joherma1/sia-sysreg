package org.sysreg.sia.model.dao.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.sysreg.sia.model.Comarca;
import org.sysreg.sia.model.dao.ComarcaDao;

@Repository
public class ComarcaDaoImpl implements ComarcaDao {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	@Transactional
	public void persist(Comarca camarca) {
		entityManager.persist(camarca);
	}

}
