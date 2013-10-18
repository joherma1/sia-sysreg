package org.sysreg.sia.model.dao;

import java.util.List;

import org.sysreg.sia.model.User;

public interface UserDao {

	User getUserById(Integer id);

	List<User> getAllUsers();

	void persist(User user);
	
	User findById(Integer id);
	
	User findByName(String name);
	
	void tearDown();

}
