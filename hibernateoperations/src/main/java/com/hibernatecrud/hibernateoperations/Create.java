package com.hibernatecrud.hibernateoperations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



/**
 * @author: Aishwarya Gandhi
 *
 */
public class Create 
{
    public static void main( String[] args )
    {
      BookAuthorName bun = new BookAuthorName();
      bun.setFname("Aishwarya");
      bun.setLname("Gandhi");
      
      Book book = new Book();
      book.setBookId(101);
      book.setBookName("Life is Always Beautiful");    
      book.setBookAuthorName(bun);
      book.setBookPrice(120.8);

      //Mention hibernate configure file name in configure()method if it is not default name
      Configuration conf = new Configuration().configure().addAnnotatedClass(Book.class);
      SessionFactory sf = conf.buildSessionFactory();
      Session session = sf.openSession();
      //Following ACID
      Transaction tx = session.beginTransaction();
      session.save(book);
      tx.commit();
    
    }
}
