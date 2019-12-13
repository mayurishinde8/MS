package com.scp.java.Demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainProduct {
	
	static SessionFactory sfactory =null;
	public static SessionFactory getSessionFactory() {
		if(sfactory==null) {
			sfactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		}
		return sfactory;
	}
	public static void main(String[] args) {
		System.out.println("hi..............");
		Product p1= new Product(4);
		SessionFactory sfactory = getSessionFactory();
		Session session = sfactory.openSession();
		Transaction tr = session.beginTransaction();
		session.save(p1);
		session.flush();
		tr.commit();
		System.out.println(p1);
		
	}

}
