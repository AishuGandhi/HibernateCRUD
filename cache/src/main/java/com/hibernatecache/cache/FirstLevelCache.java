package com.hibernatecache.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FirstLevelCache
{

    public static void main(String[] args)
    {
        Book b = null;
        Configuration conf = new Configuration().configure().addAnnotatedClass(Book.class);
        SessionFactory sf = conf.buildSessionFactory();

        System.out.println("***********First Level Cache in Same session***********");
        Session session = sf.openSession();
        session.beginTransaction();

        // Tycasting as Hibernate return Object of Object class
        b = (Book) session.get(Book.class, 101);
        System.out.println(b);

        // No Call to Database.Data fetched from level 1 cache
        b = (Book) session.get(Book.class, 101);
        System.out.println(b);
        session.getTransaction().commit();
        session.close();
    }

}
