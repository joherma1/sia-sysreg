package org.sysreg.sia.model.dao.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.sysreg.sia.model.Parcel;
import org.sysreg.sia.model.dao.ParcelDao;

@Repository
public class ParcelDaoImpl implements ParcelDao {
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	@Transactional
	public void persist(Parcel parcel) {
		entityManager.persist(parcel);
	}

}
