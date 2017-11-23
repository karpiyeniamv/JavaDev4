package com.assignstudent.etalon.dao.daoImpl;

import com.assignstudent.etalon.dao.GenericDao;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.io.Serializable;
import java.util.List;


public class GenericDaoImpl<E,PK extends Serializable> implements GenericDao<E, PK> {

    private Class<E> type;

    @Autowired
    @Qualifier("sessionFactory")
    private SessionFactory sessionFactory;

    public GenericDaoImpl(Class<E> type) {
        this.type = type;
    }

    @Override
    public void update(E obj) {
        getCurrentSession().update(obj);
    }

    @Override
    public PK save(E obj) {
        return (PK)getCurrentSession().save(obj);
    }

    @Override
    public void delete(E obj) {
        getCurrentSession().delete(obj);
    }

    @Override
    public E load(PK index) {
        return (E)getCurrentSession().load(type,index);
    }

    @Override
    public E get(PK index) {
        return (E)getCurrentSession().get(type,index);
    }

    protected Session getCurrentSession(){
        return sessionFactory.getCurrentSession();
    }

    @Override
    public List<E> getAll() {
        Criteria crit = getCurrentSession().createCriteria(type);
        return crit.list();
    }

    @Override
    public E merge(E obj) {
        return (E)getCurrentSession().merge(obj);
    }

    public GenericDaoImpl() {
    }
}
