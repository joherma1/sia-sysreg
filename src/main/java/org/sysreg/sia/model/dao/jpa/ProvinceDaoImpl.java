package org.sysreg.sia.model.dao.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.sysreg.sia.model.Province;
import org.sysreg.sia.model.dao.ProvinceDao;

@Repository
public class ProvinceDaoImpl implements ProvinceDao {
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	@Transactional
	public void persist(Province province) {
		entityManager.persist(province);
	}

}
