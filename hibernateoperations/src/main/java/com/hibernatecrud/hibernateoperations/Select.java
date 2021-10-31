package com.hibernatecrud.hibernateoperations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Select {
	public static void main( String[] args )
    {   
		Book book = null;
		Configuration con = new Configuration().configure().addAnnotatedClass(Book.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		book = (Book)session.get(Book.class,102);
     	System.out.print(book);	
    }
}
