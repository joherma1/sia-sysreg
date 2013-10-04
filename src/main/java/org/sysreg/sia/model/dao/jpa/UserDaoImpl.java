package org.sysreg.sia.model.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.sysreg.sia.model.User;
import org.sysreg.sia.model.dao.UserDao;

@Repository
public class UserDaoImpl implements UserDao {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public User getUserById(Integer id) {

		return entityManager.find(User.class, id);
	}

	@Override
	public List<User> getAllUsers() {

		return entityManager.createQuery("from User", User.class).getResultList();
	}

	@Override
	@Transactional
	public void persist(User user) {
		// TODO Auto-generated method stub
		entityManager.persist(user);
	}

}
