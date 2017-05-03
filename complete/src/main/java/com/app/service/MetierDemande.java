package com.app.service;

import java.util.List;

import org.hibernate.Session;

import com.app.dao.HibernateSession;
import com.app.iservice.iDemande;
import com.app.model.Demande;


public class MetierDemande implements iDemande{
	
	HibernateSession MT = new HibernateSession();
	@Override
	public void add(Demande M) {
		@SuppressWarnings("static-access")
		Session session = MT.getSessionFactory().openSession();
        session.beginTransaction();
        session.persist(M);
        session.getTransaction().commit();
        session.close();
		
		
	}

	@Override
	public void upd(Demande M) {
		@SuppressWarnings("static-access")
		Session session = MT.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(M);
        session.getTransaction().commit();
        session.close();
		
	}

	@Override
	public void del(Demande M) {
		@SuppressWarnings("static-access")
		Session session = MT.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(M);
        session.getTransaction().commit();
        session.close();
		
	}

	@Override
	public List<Demande> getList() {
		
		@SuppressWarnings("static-access")
		Session session = MT.getSessionFactory().openSession();
		@SuppressWarnings("unchecked")
		List<Demande> L = session.createQuery("from Demande").list();
		session.close(); return L;
	}
	

	

}
