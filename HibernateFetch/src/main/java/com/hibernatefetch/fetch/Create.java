package com.hibernatefetch.fetch;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class Create 
{
    public static void main( String[] args )
    {
        
        Alien alien = new Alien();
        alien.setAid(3);

        
        Laptop laptop = new Laptop();
        laptop.setLid(105);
        laptop.setLbrand("ACER");
        laptop.setLprice(19070);
        laptop.setAlien(alien);
               
        Configuration conf = new Configuration().configure().addAnnotatedClass(Alien.class).addAnnotatedClass(Laptop.class);
        SessionFactory sf = conf.buildSessionFactory();
        Session session = sf.openSession();
        
        Transaction tx = session.beginTransaction();
        
        session.save(laptop);
        //session.save(alien);        
        tx.commit();
    }
}
