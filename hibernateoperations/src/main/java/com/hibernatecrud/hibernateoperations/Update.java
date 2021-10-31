package com.hibernatecrud.hibernateoperations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Update {

	public static void main(String[] args) {
		Book book = null;
		Configuration conf = new Configuration().configure().addAnnotatedClass(Book.class);
		SessionFactory sf = conf.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		book = (Book) session.get(Book.class, 102);
		book.setBookName("A Beautiful Life");
		session.save(book);
		tx.commit();
	}
}
