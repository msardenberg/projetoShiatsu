package br.com.ideais.service;

import java.util.List;

import br.com.ideais.model.User;


public interface UserService {

	List<User> listUsers();

	User find(Long id);

	void save(User user);

	void remove(User user);

}
