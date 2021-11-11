package com.hibernatecache.cache;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class SecondLevelCache
{
    public static void main(String[] args)
    {
        Book b = null;
        Configuration conf = new Configuration().configure().addAnnotatedClass(Book.class);
        SessionFactory sf = conf.buildSessionFactory();
        // First Level Cache in different session
        System.out.println("***********Second Level Cache***********");
        Session session1 = sf.openSession();
        session1.beginTransaction();

        // Tycasting as Hibernate return Object of Object class
        b = (Book) session1.get(Book.class, 101);
        System.out.println(b);

        session1.getTransaction().commit();
        session1.close();

        Session session2 = sf.openSession();
        session2.beginTransaction();

        // Tycasting as Hibernate return Object of Object class
        b = (Book) session2.get(Book.class, 101);
        System.out.println(b);

        session2.getTransaction().commit();
        session2.close();
    }
}
