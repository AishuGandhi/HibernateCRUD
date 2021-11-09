package com.hibernatefetch.fetch;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Fetch
{

    public static void main(String args[])
    {
        Configuration conf = new Configuration().configure().addAnnotatedClass(Alien.class).addAnnotatedClass(Laptop.class);
        SessionFactory sf = conf.buildSessionFactory();
        Session session = sf.openSession();

        Transaction tx = session.beginTransaction();

        Alien a = session.get(Alien.class, 1);
        System.out.println(a);

        //Need to seperately get laptops and then print it is lazy fetch
        List<Laptop> laps = a.getLaps();
        for (Laptop l : laps)
        {
            System.out.println(l);
        }
        //To fetch laptops without asking seperately
        Alien a1 = session.get(Alien.class, 2);
        System.out.println(a1);
        tx.commit();

    }
}
