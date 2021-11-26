package com.restapi.RESTCRUD;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class BookResource
{
    Configuration conf = new Configuration().configure().addAnnotatedClass(Book.class);
    SessionFactory sf = conf.buildSessionFactory();
    Session session ;

    @GetMapping("books")
    public List<Book> getBooks(@PathVariable String bookName)
    {
        session = sf.openSession();
        session.beginTransaction();
        List<Book> listBooks = new ArrayList<>();
        listBooks = session.createQuery("FROM book").getResultList();
        session.getTransaction().commit();
        session.close();
        return listBooks;
    }
    @GetMapping("book/{bookName}")
    public List<Book> getBook(@PathVariable String bookName)
    {
        session = sf.openSession();
        session.beginTransaction();
        List<Book> listBooks = new ArrayList<>();
        listBooks = session.createQuery("FROM book where book_name=:bookName",Book.class)
        .setParameter("bookName",bookName)
        .getResultList();
        session.getTransaction().commit();
        session.close();
        return listBooks;
    }
    
}
