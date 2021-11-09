package com.hibernatemapping.HibernateMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Laptop laptop = new Laptop();
       laptop.setLid(101);
       laptop.setLname("DELL");
       
       Student student = new Student();
       student.setRollNo(3);
       student.setSname("Sanjana");
       student.setMarks(88);
       student.getLaptopList().add(laptop);
       
       Configuration conf = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
       SessionFactory sf = conf.buildSessionFactory();
       Session session = sf.openSession();
       
       Transaction tx = session.beginTransaction();
       
       session.save(laptop);
       session.save(student);
       
      tx.commit();
    }
}
