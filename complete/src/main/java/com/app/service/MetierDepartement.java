package com.app.service;

import java.util.List;

import org.hibernate.Session;

import com.app.dao.HibernateSession;
import com.app.iservice.iDepartement;
import com.app.model.Departement;


public class MetierDepartement implements iDepartement{
	HibernateSession MT = new HibernateSession();
	@Override
	public void add(Departement M) {
		@SuppressWarnings("static-access")
		Session session = MT.getSessionFactory().openSession();
        session.beginTransaction();
        session.persist(M);
        session.getTransaction().commit();
        session.close();
		
		
	}

	@Override
	public void upd(Departement M) {
		@SuppressWarnings("static-access")
		Session session = MT.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(M);
        session.getTransaction().commit();
        session.close();
		
	}

	@Override
	public void del(Departement M) {
		@SuppressWarnings("static-access")
		Session session = MT.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(M);
        session.getTransaction().commit();
        session.close();
		
	}

	@Override
	public List<Departement> getList() {
		
		@SuppressWarnings("static-access")
		Session session = MT.getSessionFactory().openSession();
		@SuppressWarnings("unchecked")
		List<Departement> L = session.createQuery("from Departement").list();
		session.close(); return L;
	}
	

}
