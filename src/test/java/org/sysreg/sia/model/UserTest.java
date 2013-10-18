package org.sysreg.sia.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;
import org.sysreg.sia.model.dao.UserDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/applicationContext.xml")
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
@Transactional
public class UserTest {
	@Autowired
	private UserDao userDao;
	
	@Test
	public void testCreation() {
		User u = new User();
		u.setPassword("Test Password");
		u.setUsername("Test User");
		userDao.persist(u);
		User v = userDao.findById(1);
		assertEquals(u.getPassword(), v.getPassword());
		assertEquals(u.getUsername(), v.getUsername());
	}

}
