package br.com.ideais.dao;

import java.util.List;

import br.com.ideais.model.User;


public interface UserDAO
{	
	List<User> findAll();

	User findById(Long id);

	void saveOrUpdate(User user);

	void remove(User user);

}
