package org.sysreg.sia.model.dao.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.sysreg.sia.model.Uso;
import org.sysreg.sia.model.dao.UsoDao;

@Repository
public class UsoDaoImpl implements UsoDao {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	@Transactional
	public void persist(Uso uso) {
		entityManager.persist(uso);
	}

}
