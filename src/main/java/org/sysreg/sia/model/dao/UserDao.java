package org.sysreg.sia.model.dao;

import java.util.List;

import org.sysreg.sia.model.User;

public interface UserDao {
	void persist(User user);

	User findById(int id);

	List<User> findAll();
	
	User findByUser(String user);

}
