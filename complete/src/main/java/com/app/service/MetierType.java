package com.app.service;

import java.util.List;

import org.hibernate.Session;

import com.app.dao.HibernateSession;
import com.app.iservice.iType;
import com.app.model.Type;

public class MetierType implements iType{
	
	HibernateSession MT = new HibernateSession();
	@Override
	public void add(Type M) {
		@SuppressWarnings("static-access")
		Session session = MT.getSessionFactory().openSession();
        session.beginTransaction();
        session.persist(M);
        session.getTransaction().commit();
        session.close();
		
		
	}

	@Override
	public void upd(Type M) {
		@SuppressWarnings("static-access")
		Session session = MT.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(M);
        session.getTransaction().commit();
        session.close();
		
	}

	@Override
	public void del(Type M) {
		@SuppressWarnings("static-access")
		Session session = MT.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(M);
        session.getTransaction().commit();
        session.close();
		
	}

	@Override
	public List<Type> getList() {
		
		@SuppressWarnings("static-access")
		Session session = MT.getSessionFactory().openSession();
		@SuppressWarnings("unchecked")
		List<Type> L = session.createQuery("from Type").list();
		session.close(); return L;
	}
	

	


}

