package org.sysreg.sia.model.dao.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.sysreg.sia.model.Parcela;
import org.sysreg.sia.model.dao.ParcelaDao;

@Repository
public class ParcleaDaoImpl implements ParcelaDao {
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	@Transactional
	public void persist(Parcela parcela) {
		entityManager.persist(parcela);
	}

}
