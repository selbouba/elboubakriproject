package com.app.service;

import java.util.List;

import org.hibernate.Session;


import com.app.dao.HibernateSession;

import com.app.iservice.iUser;
import com.app.model.User;


public class MetierUser implements iUser {
	
	HibernateSession MTE = new HibernateSession();

	@Override
	public void add(User M) {
		@SuppressWarnings("static-access")
		Session session = MTE.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(M);
        session.getTransaction().commit();
        session.close();
        
       
	}

	@Override
	public void upd(User M) {
		@SuppressWarnings("static-access")
		Session session = MTE.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(M);
        session.getTransaction().commit();
        session.close();
	}

	@Override
	public void del(User M) {
		@SuppressWarnings("static-access")
		Session session = MTE.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(M);
        session.getTransaction().commit();
        session.close();
	}

	@Override
	public List<User> getList() {
		@SuppressWarnings("static-access")
		Session session = MTE.getSessionFactory().openSession();
		@SuppressWarnings("unchecked")
		List<User> LM = session.createQuery("from User").list();
		session.close(); return LM;
	}

	


}
