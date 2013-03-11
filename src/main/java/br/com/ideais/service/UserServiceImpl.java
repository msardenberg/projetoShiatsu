package br.com.ideais.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.ideais.dao.UserDAO;
import br.com.ideais.model.User;

@Service
@Transactional
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDAO userDao;
	
	
	public List<User> listUsers() {
		return userDao.findAll();
	}

	
	public User find(Long id) {
		return userDao.findById( id );
	}

	public void save(User user) {	
		userDao.saveOrUpdate( user );
	}

	public void setUserDao(UserDAO User) {
		this.userDao = User;
	}


	public void remove(User user) {
		userDao.remove( user );
	}
	
}
