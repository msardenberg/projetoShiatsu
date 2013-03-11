package br.com.ideais.dao;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.ideais.model.User;

@Repository
public class UserDaoImpl implements UserDAO{
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		hibernateTemplate = new HibernateTemplate(sessionFactory);
	}

	
	@Transactional
	 public void saveOrUpdate(User person) {
	        hibernateTemplate.saveOrUpdate(person);
	    }
	
	@Transactional(readOnly = false)
	public void remove(User user) {
		hibernateTemplate.delete(user);

	}

	@SuppressWarnings("unchecked")
	public List<User> findAll() {
		return (List<User>) hibernateTemplate.find("from "
				+ User.class.getName());
	}

	public User findById(Long userId) {
		return hibernateTemplate.get(User.class, userId);
	}

}
