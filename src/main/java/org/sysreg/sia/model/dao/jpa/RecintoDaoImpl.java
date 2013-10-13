package org.sysreg.sia.model.dao.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.sysreg.sia.model.Recinto;
import org.sysreg.sia.model.dao.RecintoDao;

@Repository
public class RecintoDaoImpl implements RecintoDao{
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	@Transactional
	public void persist(Recinto recinto) {
		entityManager.persist(recinto);
	}

}
