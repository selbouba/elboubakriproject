package com.app.dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateSession {
	
	private static SessionFactory sessionFactory = buildSessionFactory();
	 
    @SuppressWarnings("deprecation")
	private static SessionFactory buildSessionFactory() {
        try {
            
            return new Configuration().configure().buildSessionFactory();
        }
        catch (Throwable ex) {

            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
 
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
 
    public void shutdown() {
    	getSessionFactory().close();
	
	
	
	
	

}

	 }
