package com.app.service;


import java.util.List;

import org.hibernate.Session;

import com.app.dao.HibernateSession;
import com.app.iservice.iEtat;
import com.app.model.Etat;


public class MetierEtat implements iEtat{
	
	HibernateSession MT = new HibernateSession();
	@Override
	public void add(Etat M) {
		@SuppressWarnings("static-access")
		Session session = MT.getSessionFactory().openSession();
        session.beginTransaction();
        session.persist(M);
        session.getTransaction().commit();
        session.close();
		
		
	}

	@Override
	public void upd(Etat M) {
		@SuppressWarnings("static-access")
		Session session = MT.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(M);
        session.getTransaction().commit();
        session.close();
		
	}

	@Override
	public void del(Etat M) {
		@SuppressWarnings("static-access")
		Session session = MT.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(M);
        session.getTransaction().commit();
        session.close();
		
	}

	@Override
	public List<Etat> getList() {
		
		@SuppressWarnings("static-access")
		Session session = MT.getSessionFactory().openSession();
		@SuppressWarnings("unchecked")
		List<Etat> L = session.createQuery("from Etat").list();
		session.close(); return L;
	}
	

	


}
