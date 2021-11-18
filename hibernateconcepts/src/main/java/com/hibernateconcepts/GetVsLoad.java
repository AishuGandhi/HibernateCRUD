package com.hibernateconcepts;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetVsLoad
{
    public static void main(String a[])
    {
        Configuration conf = new Configuration().configure().addAnnotatedClass(Book.class);
        SessionFactory sf = conf.buildSessionFactory();      
        Session session = sf.openSession();
        
        session.beginTransaction();
        
        Book b = (Book)session.get(Book.class, 101);
        System.out.print(b);
        //Query Fired and Returned Null as no entry in databse
        b = (Book)session.get(Book.class, 108);
        System.out.print(b);
        
        //No call to database as no further use after fetching
        b = (Book)session.get(Book.class, 101);
        
        //Throws objectNotFoundException
        b = (Book)session.load(Book.class, 108);
        System.out.print(b);
        /*Gives Proxy Object 
        If object is not used further 
        it will not got to database
        Used when saving Alien in Laptop mapping
        Exception Differences
        Useful in Performance
        */
        session.getTransaction().commit();
        
    }
}
