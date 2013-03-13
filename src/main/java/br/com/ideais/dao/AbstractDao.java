package br.com.ideais.dao;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

public abstract class AbstractDao<T> {
	@Autowired
	protected HibernateTemplate hibernateTemplate;
	
	@Transactional
	public void saveOrUpdate(T t) {
		hibernateTemplate.saveOrUpdate(t);
	}
	
	@Transactional(readOnly = false)
	public void remove(T t) {
		hibernateTemplate.delete(t);
	}

	public List<T> findAll() {
		return hibernateTemplate.loadAll(getPersistentClass());
	}

	public T findById(Long id) {
		return hibernateTemplate.get(getPersistentClass(), id);
	}	

    @SuppressWarnings("unchecked")
	public Class<T> getPersistentClass() {
        return (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }
}
