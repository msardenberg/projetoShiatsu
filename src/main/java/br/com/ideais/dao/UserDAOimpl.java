package br.com.ideais.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public abstract class UserDAOimpl<T> extends HibernateDaoSupport implements DAOBase<T>{
	
//	@Autowired
//	private SessionFactory sessionFactory;
	
	protected abstract Class getClazz();
	
//	public SessionFactory getSessionFactory() {
//		return sessionFactory;
//	}
	
//	public void setSessionFactory(SessionFactory sf) {
//		sessionFactory = sf;
//	}
	
//	protected Session getSession() {
//		return getSessionFactory().getCurrentSession();
//	}
	
	public void persistir(T objeto) {
		getSession().saveOrUpdate(objeto);
	}
	
	public void excluir(T objeto) {
		getSession().delete(objeto);
	}
	
	public T get(Long id) {
		return (T) getSession().get(getClazz(), id);
	}
	
	public List<T> list(int offset, int max) {
		return (List<T>) getSession().createCriteria(getClazz())
						   .setMaxResults(max)
						   .setFirstResult(offset).list();
	}
	
}

