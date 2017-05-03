package com.app.service;

import java.util.List;

import org.hibernate.Session;

import com.app.dao.HibernateSession;
import com.app.iservice.iPole;
import com.app.model.Pole;

public class MetierPole implements iPole{
	
	HibernateSession MT = new HibernateSession();
	@Override
	public void add(Pole M) {
		@SuppressWarnings("static-access")
		Session session = MT.getSessionFactory().openSession();
        session.beginTransaction();
        session.persist(M);
        session.getTransaction().commit();
        session.close();
		
		
	}

	@Override
	public void upd(Pole M) {
		@SuppressWarnings("static-access")
		Session session = MT.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(M);
        session.getTransaction().commit();
        session.close();
		
	}

	@Override
	public void del(Pole M) {
		@SuppressWarnings("static-access")
		Session session = MT.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(M);
        session.getTransaction().commit();
        session.close();
		
	}

	@Override
	public List<Pole> getList() {
		
		@SuppressWarnings("static-access")
		Session session = MT.getSessionFactory().openSession();
		@SuppressWarnings("unchecked")
		List<Pole> L = session.createQuery("from Pole").list();
		session.close(); return L;
	}
	

	


}
